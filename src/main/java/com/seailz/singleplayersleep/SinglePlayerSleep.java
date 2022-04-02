package com.seailz.singleplayersleep;

import com.seailz.singleplayersleep.listeners.PlayerBed;
import org.bukkit.plugin.java.JavaPlugin;

public final class SinglePlayerSleep extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerBed(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
