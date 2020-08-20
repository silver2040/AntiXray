package com.silver2040.anti_xray;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("this works");
        getCommand("xray");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        getServer().getPluginManager().registerEvents(new Events(), this);
        sender.sendMessage("Activated");
        return true;
    }
}
