package net.dungeonrealms.game.player.inventory.menus.guis.webstore;

import net.dungeonrealms.database.PlayerWrapper;
import net.dungeonrealms.game.mechanic.ItemManager;
import net.dungeonrealms.game.player.inventory.menus.GUIItem;
import net.dungeonrealms.game.player.inventory.menus.GUIMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


/**
 * Created by Rar349 on 5/10/2017.
 */
public class CategoryGUI extends GUIMenu {

    public CategoryGUI(Player player) {
        super(player, fitSize(WebstoreCategories.values().length + 1), "Purchaseable Categories");
    }

    @Override
    protected void setItems() {
        int slot = 0;
        PlayerWrapper wrapper = PlayerWrapper.getPlayerWrapper(player);
        if (wrapper == null) return;


        setItem(getSize() - 1, new GUIItem(ItemManager.createItem(Material.BARRIER, ChatColor.GREEN + "Back"))
                .setClick(e -> player.sendMessage("Back button click!")));

        for(WebstoreCategories cat : WebstoreCategories.values()) {
            setItem(slot++, new GUIItem(cat.getDisplayItem()).setName(cat.getName()).setLore(cat.getDescription()).setClick((evt) -> {
                if(evt.getClick() == ClickType.LEFT) {
                    WebstoreCategories.getGUI(cat,player).open(player,evt.getAction());
                }
            }));
        }

        setItem(slot++, new GUIItem(cat.getDisplayItem()).setName(cat.getName()).setLore(cat.getDescription()).setClick((evt) -> {
            if(evt.getClick() == ClickType.LEFT) {
                WebstoreCategories.getGUI(cat,player).open(player,evt.getAction());
            }
        }));

    }
}
