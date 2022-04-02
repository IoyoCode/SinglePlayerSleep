package com.seailz.singleplayersleep.listeners;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Bed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBed implements Listener {
    @EventHandler
    public void onPlayerSleep(PlayerBedEnterEvent e) {
        Block bed = e.getBed();
        e.getPlayer().teleport(bed.getLocation());
        e.getPlayer().getWorld().setTime(100);
        Bukkit.broadcastMessage("Single player sleep activated! " + e.getPlayer().getName() + " slept in a bed");
    }
}
