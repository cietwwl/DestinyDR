package net.dungeonrealms.game.player.inventory.menus;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import net.dungeonrealms.DungeonRealms;
import net.dungeonrealms.game.item.items.core.ShopItem;
import net.dungeonrealms.game.mechanic.ItemManager;
import net.dungeonrealms.game.miscellaneous.NBTWrapper;
import net.dungeonrealms.game.player.inventory.ShopMenu;
import net.dungeonrealms.game.player.inventory.ShopMenuListener;
import net.minecraft.server.v1_9_R2.ChatMessage;
import net.minecraft.server.v1_9_R2.EntityPlayer;
import net.minecraft.server.v1_9_R2.IChatBaseComponent;
import net.minecraft.server.v1_9_R2.PacketPlayOutOpenWindow;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public abstract class GUIMenu extends ShopMenu {

    @Getter
    @Setter
    private boolean shouldOpenPreviousOnClose;

    @Getter
    protected GUIMenu previousGUI = null;

    public static Set<String> alwaysCancelInventories = new HashSet<>();

    public GUIMenu(Player player, int size, String title) {
        super(player, size, title);
        shouldOpenPreviousOnClose = false;
        alwaysCancelInventories.add(title);
    }

    public GUIMenu(Player player, int size, String title, GUIMenu previous) {
        this(player, size, title);
        this.previousGUI = previous;
    }

    public GUIMenu setPreviousGUI(GUIMenu toSet) {
        this.previousGUI = toSet;
        return this;
    }


    public GUIMenu open() {
        open(player, null);
        return this;
    }

    @Override
    protected abstract void setItems();

    public void setItem(int index, @Nullable ShopItem shopItem) {
        this.items.put(index, shopItem);
        NBTWrapper wrapper = new NBTWrapper(shopItem.getItem());
        wrapper.setInt("disp", 1);
        this.inventory.setItem(index, wrapper.build());
    }

    public void setItem(int index, @NonNull ItemStack item) {
        GUIItem is = new GUIItem(item);
        this.items.put(index, is);
        this.inventory.setItem(index, is.getItem());
    }

    public GUIItem getItem(int slot) {
        return (GUIItem) this.items.get(slot);
    }

    public void removeItem(int slot) {
        this.items.remove(slot);
        this.inventory.setItem(slot, null);
    }

    public GUIMenu setCloseCallback(Consumer<Player> event) {
        this.closeCallback = event;
        return this;
    }

    public void clear() {
        this.inventory.clear();
        this.items.clear();
    }

    public void open(Player player, InventoryAction action) {
        if (player == null)
            return;
        this.player = player;


        ShopMenu menu = ShopMenuListener.getMenus().get(player);
        if (menu != null) {
            if (menu.getTitle() != null && menu.getTitle().equals(getTitle()) && menu.getSize() == getSize()) {
                setItems();
                return;
            }

            //Delay the next inventory click by 1.
            if (action != null && action.name().startsWith("PICKUP_")) {
                //CAnt close the inventory on a pickup_all action etc otherwise throws exceptions.
                Bukkit.getScheduler().scheduleSyncDelayedTask(DungeonRealms.getInstance(), () -> {
                    this.setItems();
                    player.closeInventory();
                    reopenWithDelay(player);
                });
                return;
            }
            this.setItems();
            reopenWithDelay(player);
            return;
        }

        this.setItems();
        player.openInventory(getInventory());
        ShopMenuListener.getMenus().put(player, this);
    }

    public GUIMenu getPreviousGUI() {
        return previousGUI;
    }

    public GUIItem getBackButton(String... lore) {
        return new GUIItem(ItemManager.createItem(Material.BARRIER, ChatColor.GREEN + "Back")).setLore(lore)
                .setClick(e -> {
                    if (getPreviousGUI() == null) {
                        player.closeInventory();
                        return;
                    }
                    setShouldOpenPreviousOnClose(false);
                    player.closeInventory();
                    getPreviousGUI().open(player, null);
                });
    }

    @Override
    public void onRemove() {
        if (isShouldOpenPreviousOnClose()) {
            Bukkit.getScheduler().scheduleSyncDelayedTask(DungeonRealms.getInstance(), () -> {
                getPreviousGUI().open(player, null);
            });
        }
    }

    public void updateWindowTitle(final Player player, String title) {
        final EntityPlayer entityPlayer = ((CraftPlayer) player).getHandle();
        final PacketPlayOutOpenWindow packet = new PacketPlayOutOpenWindow(entityPlayer.activeContainer.windowId, "minecraft:chest", (IChatBaseComponent) new ChatMessage(title, new Object[0]), getSize());
        entityPlayer.playerConnection.sendPacket(packet);
        entityPlayer.updateInventory(entityPlayer.activeContainer);
    }

}