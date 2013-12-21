package me.IdioticAussie;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerListener implements Listener {

    public ClickSigns plugin;

    public PlayerListener(ClickSigns instance) {
        this.plugin = instance;
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onCommand(PlayerCommandPreprocessEvent event) {
        Player p = event.getPlayer();
        if(event.getMessage().equalsIgnoreCase("/clickSigns")) {
            p.sendMessage(ChatColor.GOLD + "[ClickSigns V" + plugin.getDescription().getVersion() + "]"  + ChatColor.GREEN + " Developed by" + ChatColor.GOLD + " IdioticAussie" + ChatColor.GREEN + " allows you to get potion effects when clicking on special signs");
            event.setCancelled(true);
            
        } else if(event.getMessage().equalsIgnoreCase("/signsetup")) {
            
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " How to setup a normal ClickSign:");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " Line 1: [Potion Effect] (/effects)");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " Line 2: Duration");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " Line 3: Amplifier");
            p.sendMessage(ChatColor.DARK_RED + "|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " How to setup explosion ClickSigns");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " Line 1: [Explosion]");
            p.sendMessage(ChatColor.GOLD + "[ClickSigns]" + ChatColor.GREEN + " Line 2: Vertical Power");

            
        } else if(event.getMessage().equalsIgnoreCase("/effects")){
            
            p.sendMessage(ChatColor.GOLD + "[1]  " + ChatColor.AQUA + plugin.getConfig().getString("Speed-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[2]  " + ChatColor.AQUA + plugin.getConfig().getString("Haste-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[3]  " + ChatColor.AQUA + plugin.getConfig().getString("Strength-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[4]  " + ChatColor.AQUA + plugin.getConfig().getString("Health-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[5]  " + ChatColor.AQUA + plugin.getConfig().getString("Jump-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[6]  " + ChatColor.AQUA + plugin.getConfig().getString("Regen-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[7]  " + ChatColor.AQUA + plugin.getConfig().getString("Resistance-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[8]  " + ChatColor.AQUA + plugin.getConfig().getString("FireProof-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[9]  " + ChatColor.AQUA + plugin.getConfig().getString("WaterBreathing-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[10] " + ChatColor.AQUA + plugin.getConfig().getString("Invisibility-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[11] " + ChatColor.AQUA + plugin.getConfig().getString("Saturation-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[12] " + ChatColor.AQUA + plugin.getConfig().getString("NightVision-Sign-Message"));
            p.sendMessage(ChatColor.GOLD + "[13] " + ChatColor.AQUA + plugin.getConfig().getString("Explosion-Sign-Message"));
                }
}
    
    

    }
                        
        
    


