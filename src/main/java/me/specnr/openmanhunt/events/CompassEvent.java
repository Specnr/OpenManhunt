package me.specnr.openmanhunt.events;

import me.specnr.openmanhunt.helpers.HunterHelper;
import me.specnr.openmanhunt.helpers.LocationHelper;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class CompassEvent implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent evt){
        Player player = evt.getPlayer();
        if(player.getEquipment() != null && player.getEquipment().getItemInMainHand().getType() == Material.COMPASS) {
            LocationHelper.updateCompass(player);
        }
    }

    @EventHandler
    /**
     * Gives a Compass to respawned Hunters
     */
    public void onPlayerRespawn(PlayerRespawnEvent evt){
        HunterHelper.giveCompass(evt.getPlayer());
    }
}