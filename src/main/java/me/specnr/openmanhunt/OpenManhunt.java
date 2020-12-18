package me.specnr.openmanhunt;

import me.specnr.openmanhunt.commands.Start;
import me.specnr.openmanhunt.events.CompassEvent;
import me.specnr.openmanhunt.events.PortalEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpenManhunt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new CompassEvent(), this);
        getServer().getPluginManager().registerEvents(new PortalEvent(), this);
        getCommand("omh").setExecutor(new Start());
        System.out.println("OpenManhunt Loaded");
    }
}
