package me.IdioticAussie;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.permissions.Permission;


public class ClickSignsListener 
    implements Listener 
{

    public static Permission perms = null;
    public ClickSigns plugin;
    
    public ClickSignsListener (ClickSigns instance)
    {
        this.plugin = instance;
 
  }
    
    
    //Magic Sign (Turns to a bunch of random digits and letters when activated)
    @EventHandler
    public void onSignChange (SignChangeEvent event) {
        if(event.getLine(0).equals("[Magic]") && (event.getPlayer().hasPermission("clicksigns.signs.magic.create"))) {
        event.setLine(0, ChatColor.MAGIC + "111111111111111");
        event.setLine(1, ChatColor.MAGIC + "111111111111111");
        event.setLine(2, ChatColor.MAGIC + "111111111111111");
        event.setLine(3, ChatColor.MAGIC + "111111111111111");
       
        
        
        
        
        
        
        //This is for creating the Speed ClickSign
        } else if(plugin.getConfig().getBoolean("Speed-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Speed]") && event.getPlayer().hasPermission("clicksigns.signs.speed.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
         }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Speed");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
         
         
       //This is for creating the Haste ClickSign  
       } else if(plugin.getConfig().getBoolean("Haste-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Haste]") && event.getPlayer().hasPermission("clicksigns.signs.haste.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
         }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Haste");
         event.setLine(2, "Level " + event.getLine(2));
      
         
         
         
         
         
         
         
         
       //This is for creating the Strength sign
        } else if(plugin.getConfig().getBoolean("Strength-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Strength]") && event.getPlayer().hasPermission("clicksigns.signs.strength.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Strength");
         event.setLine(2, "Level " + event.getLine(2));
        
            

         
         
       //This is for creating the Health sign
        } else if(plugin.getConfig().getBoolean("Health-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Health]") && event.getPlayer().hasPermission("clicksigns.signs.health.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Health");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
       //This is for creating the Jump sign
        } else if(plugin.getConfig().getBoolean("Jump-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Jump]") && event.getPlayer().hasPermission("clicksigns.signs.jump.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Jump");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
         
        //This is for creating the Regen sign
        } else if(plugin.getConfig().getBoolean("Regen-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Regen]") && event.getPlayer().hasPermission("clicksigns.signs.regen.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Regen");
         event.setLine(2, "Level " + event.getLine(2));


         
         
         
         
         
       //This is for creating the Resistance sign
        } else if(plugin.getConfig().getBoolean("Resistance-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Resistance]") && event.getPlayer().hasPermission("clicksigns.signs.resistance.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Resistance");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
         
                //This is for creating the FireProof sign
        } else if(plugin.getConfig().getBoolean("Fireproof-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Fireproof]") && event.getPlayer().hasPermission("clicksigns.signs.fireproof.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "FireProof");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
         
        //This is for creating the WaterBreathing sign
        } else if(plugin.getConfig().getBoolean("WaterBreathing-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[WaterBreath]") && event.getPlayer().hasPermission("clicksigns.signs.waterbreathing.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "WaterBreath");
         event.setLine(2, "Level " + event.getLine(2));

         
         
         
         
         
         
         
        //This is for creating the Invisibility sign
        } else if(plugin.getConfig().getBoolean("Invisibility-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Invisibility]") && event.getPlayer().hasPermission("clicksigns.signs.invisibility.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Invisibility");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
         
         
         
         
        //This is for creating the Saturation sign
        } else if(plugin.getConfig().getBoolean("Saturation-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Saturation]") && event.getPlayer().hasPermission("clicksigns.signs.saturation.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "Saturation");
         event.setLine(2, "Level " + event.getLine(2));
         
         
                 
                  
         
               
        
         //This is for creating the Explosion sign
        } else if(plugin.getConfig().getBoolean("NightVision-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[NightVision]") && event.getPlayer().hasPermission("clicksigns.signs.nightvision.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
                  }  try {  //If success on Line 2
            Integer.parseInt(event.getLine(2)); 
        } catch(NumberFormatException em) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 3"); // If no number on Line 3
         event.getBlock().breakNaturally();
         
        }  
         event.setLine(1, event.getLine(1) + "s");
         event.setLine(0, ChatColor.GOLD + "NightVision");
         event.setLine(2, "Level " + event.getLine(2));
         
         
         
                 //This is for creating the Explosion sign
        } else if(plugin.getConfig().getBoolean("Explosion-Sign-Enabled") && event.getLine(0).equalsIgnoreCase("[Explosion]") && event.getPlayer().hasPermission("clicksigns.signs.explosion.create")){
            
        try{
            Integer.parseInt(event.getLine(1));
        } catch(NumberFormatException e) {
         event.getPlayer().sendMessage(ChatColor.GOLD + "[ClickSigns] " + ChatColor.RED + "You need to use a number on line 2"); //If no number on Line 2  
         event.getBlock().breakNaturally();
         
       
        }  
         event.setLine(0, ChatColor.GOLD + "Explosion");
         event.setLine(1, "Height: " + event.getLine(1));
        }
}
}
        
     
