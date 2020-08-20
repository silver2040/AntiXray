package com.silver2040.anti_xray;

import net.minecraft.server.v1_16_R2.Blocks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Objects;

public class Events implements Listener {
    String player;
    @EventHandler
    public void breakEvent(BlockBreakEvent event){
        if(event.getBlock().getType() == Material.IRON_ORE){
            player = event.getPlayer().getName();
            Bukkit.getLogger().warning( player + " has found Iron Ore");
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("FracturX")).sendMessage(ChatColor.BLUE + player + " has found Iron Ore");
            } catch (Exception e) {
                Bukkit.getLogger().warning("FracturX isn't online");
            }
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("Silver2040")).sendMessage(ChatColor.BLUE + player + " has found Iron Ore");

            }catch (Exception e){
                Bukkit.getLogger().warning("Silver2040 isn't online");
            }
        }
        else if(event.getBlock().getType() == Material.GOLD_ORE){
            player = event.getPlayer().getName();
            Bukkit.getLogger().warning( player + " has found Gold Ore");
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("FracturX")).sendMessage(ChatColor.BLUE + player + " has found Gold Ore");
            } catch (Exception e) {
                Bukkit.getLogger().warning("FracturX isn't online");
            }
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("Silver2040")).sendMessage(ChatColor.BLUE + player + " has found Gold Ore");

            }catch (Exception e){
                Bukkit.getLogger().warning("Silver2040 isn't online");
            }
        }
        else if(event.getBlock().getType() == Material.DIAMOND_ORE){
            player = event.getPlayer().getName();
            Bukkit.getLogger().warning( player + " has found Diamond Ore");
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("FracturX")).sendMessage(ChatColor.BLUE + player + " has found Diamonds");
            } catch (Exception e) {
                Bukkit.getLogger().warning("FracturX isn't online");
            }
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("Silver2040")).sendMessage(ChatColor.BLUE + player + " has found Diamonds");

            }catch (Exception e){
                Bukkit.getLogger().warning("Silver2040 isn't online");
            }
        }
        else if(event.getBlock().getType() == Material.EMERALD_ORE){
            player = event.getPlayer().getName();
            Bukkit.getLogger().warning( player + " has found Emerald Ore");
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("FracturX")).sendMessage(ChatColor.BLUE + player + " has found Emerald Ore");
            } catch (Exception e) {
                Bukkit.getLogger().warning("FracturX isn't online");
            }
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("Silver2040")).sendMessage(ChatColor.BLUE + player + " has found Emerald Ore");

            }catch (Exception e){
                Bukkit.getLogger().warning("Silver2040 isn't online");
            }
        }
        else if (event.getBlock().getType() == Material.ANCIENT_DEBRIS) {
            player = event.getPlayer().getName();
            Bukkit.getLogger().warning(player + " has found Ancient Debris");
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("FracturX")).sendMessage(ChatColor.BLUE + player + " has found Ancient Debris");
            } catch (Exception e) {
                Bukkit.getLogger().warning("FracturX isn't online");
            }
            try {
                Objects.requireNonNull(Bukkit.getServer().getPlayer("Silver2040")).sendMessage(ChatColor.BLUE + player + " has found Ancient Debris");

            }catch (Exception e){
                Bukkit.getLogger().warning("Silver2040 isn't online");
            }

        }

    }
}
