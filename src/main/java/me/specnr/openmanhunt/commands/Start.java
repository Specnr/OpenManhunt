package me.specnr.openmanhunt.commands;

import me.specnr.openmanhunt.helpers.BroadcastHelper;
import me.specnr.openmanhunt.helpers.HunterHelper;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Start implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Add given player names to runners
        int numPlayers = Bukkit.getOnlinePlayers().size();
        if (numPlayers <= 1) {
            sender.sendMessage(BroadcastHelper.BroadcastPrefix + "Need at least 2 players.");
            return false;
        }
        if (args.length != 1) {
            sender.sendMessage(BroadcastHelper.BroadcastPrefix + "Include a player to run.");
            return false;
        }
        Player runner = Bukkit.getPlayer(args[0]);
        if (runner == null) {
            sender.sendMessage(BroadcastHelper.BroadcastPrefix + "Runner given was not found.");
            return false;
        }
        HunterHelper.Runner = runner.getUniqueId();
        BroadcastHelper.Broadcast("OpenManhunt Has Begun!");
        HunterHelper.giveAllCompass();
        return true;
    }
}