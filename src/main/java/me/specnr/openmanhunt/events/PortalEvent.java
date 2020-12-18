package me.specnr.openmanhunt.events;

import me.specnr.openmanhunt.helpers.HunterHelper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class PortalEvent implements Listener {
    @EventHandler
    /**
     * Sets the latest portal location when a runner changes dimensions
     */
    public void onPlayerEnterPortal(PlayerPortalEvent evt){
        HunterHelper.LatestPortal = evt.getFrom();
    }
}