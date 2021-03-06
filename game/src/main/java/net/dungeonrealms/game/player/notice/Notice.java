package net.dungeonrealms.game.player.notice;

import lombok.Getter;
import net.dungeonrealms.DungeonRealms;
import net.dungeonrealms.GameAPI;
import net.dungeonrealms.common.Constants;
import net.dungeonrealms.common.game.database.player.PlayerRank;
import net.dungeonrealms.common.game.database.player.Rank;
import net.dungeonrealms.database.PlayerWrapper;
import net.dungeonrealms.game.player.json.JSONMessage;
import net.dungeonrealms.tool.PatchTools;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

/**
 * Created by Nick on 10/11/2015.
 */
public class Notice {

    @Getter
    private static Notice instance = new Notice();

    public Notice() {
        Bukkit.getScheduler().runTaskTimerAsynchronously(DungeonRealms.getInstance(), () -> {
            Bukkit.getOnlinePlayers().forEach(this::executeVoteReminder);
        }, 0L, 6000L);

        Bukkit.getScheduler().runTaskTimerAsynchronously(DungeonRealms.getInstance(), () -> {
            Bukkit.getOnlinePlayers().forEach(GameAPI::sendStatNotification);
        }, 0, (20 * 60) * 10);
    }

    /**
     * This type handles notices per player.
     * E.g. A player logs in and has a guild invite,
     * or a player logs in and has pending friend request.
     *
     * @param player
     * @since 1.0
     */
    public void doLogin(Player player) {
        PlayerWrapper wrapper = PlayerWrapper.getPlayerWrapper(player);
        if (wrapper == null) return;

        String lastViewedBuild = wrapper.getLastViewedBuild();

        int lastSeenBuild = -1;
        int serverBuild = Integer.parseInt(Constants.BUILD_NUMBER.substring(1));
        if (lastViewedBuild != null && lastViewedBuild.length() > 1) {
            double last = 0;
            if (lastViewedBuild.contains("#")) {
                String build = lastViewedBuild.substring(1);
                last = Double.parseDouble(build);
            } else {
                try {
                    last = Double.parseDouble(lastViewedBuild);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            lastSeenBuild = (int) last;
        }
        int noteSize = wrapper.getLastNoteSize();

        if (lastViewedBuild == null || (serverBuild > lastSeenBuild || PatchTools.getSize() != noteSize))
            Bukkit.getScheduler().scheduleAsyncDelayedTask(DungeonRealms.getInstance(), () -> executeBuildNotice(player, wrapper), 150);

        Bukkit.getScheduler().scheduleAsyncDelayedTask(DungeonRealms.getInstance(), () -> executeVoteReminder(player), 300);
    }

    private void executeBuildNotice(Player p, PlayerWrapper wrapper) {
        final JSONMessage normal = new JSONMessage(ChatColor.GOLD + "  ❢ " + ChatColor.YELLOW + "Patch notes available for Build " + Constants.BUILD_NUMBER + " " + ChatColor.GRAY + "View notes ", ChatColor.WHITE);
        normal.addRunCommand(ChatColor.GOLD.toString() + ChatColor.BOLD + ChatColor.UNDERLINE + "HERE!", ChatColor.GREEN, "/patch", "");
        normal.addText(ChatColor.GOLD + " ❢ ");
        p.sendMessage(" ");
        normal.sendToPlayer(p);
        p.sendMessage(" ");

        p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0F, 0.5F);

        // UPDATE LAST VIEWED BUILD NUMBER //
        wrapper.setLastViewedBuild(Constants.BUILD_NUMBER);
        wrapper.setLastNoteSize(PatchTools.getSize());
    }

    private void executeVoteReminder(Player p) {
        // No vote reminder on the event shard or for Trial GM+.
        if (DungeonRealms.isEvent() || Rank.getRank(p).isAtLeast(PlayerRank.TRIALGM))
            return;

        PlayerWrapper wrapper = PlayerWrapper.getPlayerWrapper(p);
        if (wrapper == null) return;

        long vote = wrapper.getLastVote();

        if(wrapper.getEnjinId() <= 0) {
            p.sendMessage(" ");
            final JSONMessage message = new JSONMessage("Hey there! Link your Minecraft account to the website for a free Loot Aura, click ", ChatColor.GRAY);
            message.addURL(ChatColor.AQUA.toString() + ChatColor.BOLD + ChatColor.UNDERLINE + "HERE", ChatColor.AQUA, "http://www.dungeonrealms.net/link");
            message.sendToPlayer(p);
            p.sendMessage(" ");
        }

        if ((System.currentTimeMillis() - vote) >= 86_400_000) {
            p.sendMessage(" ");
            final JSONMessage message = new JSONMessage("Hey there! You have not voted for a day. Vote for a Mystery Chest & 5% EXP, click ", ChatColor.GRAY);
            message.addURL(ChatColor.AQUA.toString() + ChatColor.BOLD + ChatColor.UNDERLINE + "HERE", ChatColor.AQUA, "http://www.dungeonrealms.net/vote");
            message.sendToPlayer(p);
            p.sendMessage(" ");
        }
    }


}
