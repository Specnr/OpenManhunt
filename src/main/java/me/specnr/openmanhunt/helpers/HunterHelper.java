package me.specnr.openmanhunt.helpers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class HunterHelper {
    public static UUID Runner = null;
    public static Location LatestPortal = null;

    public static void giveCompass(Player p) {
        p.getInventory().addItem(new ItemStack(Material.COMPASS, 1));
    }
    public static void giveAllCompass() {
        for (Player p: Bukkit.getOnlinePlayers()) {
            if (p.getUniqueId() != Runner) {
                giveCompass(p);
            }
        }
    }
}