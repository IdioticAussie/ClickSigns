package me.IdioticAussie;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectListener
        implements Listener {

    public static Permission perms = null;
    public ClickSigns plugin;

    public EffectListener(ClickSigns instance) {
        this.plugin = instance;

    }
    ArrayList<Player> NoFallDamage = new ArrayList<>();

    @EventHandler
    public void onPlayerInteract(final PlayerInteractEvent event) {
        Player p = event.getPlayer();
        Action action = event.getAction();
        World w = p.getWorld();
        // First check if a block is clicked and if it is a sign
        if (action == Action.RIGHT_CLICK_BLOCK && event.getClickedBlock().getState() instanceof Sign) {
            Sign sign = null;
            int level = 0;
            int duration = 0;
            try {
                // Then cast
                sign = (Sign) event.getClickedBlock().getState();
                // get the 3'rd line of the sign.
// get the 2nd line of the sign.
                String signDuration = sign.getLine(1);
//The regex will replace all non-digit characters with an empty character therefore removing them
                String durationString = signDuration.replaceAll("[\\D]", "");
//Parse the int and convert to ticks
                duration = Integer.parseInt(durationString) * 20;

// get the 3rd line of the sign.
                String signlevel = sign.getLine(2);
//The regex will replace all non-digit characters with an empty character therefore removing them
                String levelString = signlevel.replaceAll("[\\D]", "");
//Parse the int and convert to ticks
                level = Integer.parseInt(levelString) - 1;
            } catch (NumberFormatException e) {
            }



            // Then check the line
            if (!plugin.getConfig().getBoolean("Economy-Support-Enabled") || plugin.getEconomy() == null) { //Add code to determine whether player has enough funds
                if (sign.getLine(0).equals(ChatColor.GOLD + "Speed") && p.hasPermission("clicksigns.signs.speed.use")) {
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Haste") && p.hasPermission("clicksigns.signs.haste.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Strength") && p.hasPermission("clicksigns.signs.strength.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Health") && p.hasPermission("clicksigns.signs.health.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Jump") && p.hasPermission("clicksigns.signs.jump.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Regen") && p.hasPermission("clicksigns.signs.regen.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Resistance") && p.hasPermission("clicksigns.signs.resistance.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "FireProof") && p.hasPermission("clicksigns.signs.fireproof.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "WaterBreath") && p.hasPermission("clicksigns.signs.waterbreath.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Invisibility") && p.hasPermission("clicksigns.signs.invisibility.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, level), true);
                    event.setCancelled(true);


                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Saturation") && p.hasPermission("clicksigns.signs.saturation.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "NightVision") && p.hasPermission("clicksigns.signs.nightvision.use")) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Explosion") && p.hasPermission("clicksigns.signs.explosion.use")) {
                    //Then execute code
                    //((CraftPlayer)event.getPlayer()).getHandle().playerConnection.checkMovement = false;
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel like you are flying");
                    w.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                    w.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    //p.setVelocity(new Vector (level, duration / 20, 0));
                    p.setVelocity(p.getVelocity().setY(duration / 20));
                    w.createExplosion(p.getLocation(), 0.0f);
                    NoFallDamage.add(p);

                }

            }
            if (plugin.getConfig().getBoolean("Effect-On-Sign-Activated")) {
                w.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1);
            }
            if (plugin.getConfig().getBoolean("Sound-On-Sign-Activated")) {
                w.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
            }

            if (plugin.getEconomy() != null && plugin.getConfig().getBoolean("Economy-Support-Enabled")) {
                if (sign.getLine(0).equals(ChatColor.GOLD + "Speed") && p.hasPermission("clicksigns.signs.speed.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Speed-Sign-Cost"))) {
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Haste") && p.hasPermission("clicksigns.signs.haste.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Haste-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Strength") && p.hasPermission("clicksigns.signs.strength.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Strength-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Health") && p.hasPermission("clicksigns.signs.health.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Health-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Jump") && p.hasPermission("clicksigns.signs.jump.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Jump-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Regen") && p.hasPermission("clicksigns.signs.regen.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Regen-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Resistance") && p.hasPermission("clicksigns.signs.resistance.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Resistance-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "FireProof") && p.hasPermission("clicksigns.signs.fireproof.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("FireProof-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "WaterBreath") && p.hasPermission("clicksigns.signs.waterbreath.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("WaterBreathing-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Invisibility") && p.hasPermission("clicksigns.signs.invisibility.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Invisibility-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, level), true);
                    event.setCancelled(true);


                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Saturation") && p.hasPermission("clicksigns.signs.saturation.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Saturation-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "NightVision") && p.hasPermission("clicksigns.signs.nightvision.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("NightVision-Sign-Cost"))) {
                    // Then execute code
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel a mysterious magic washing over you");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, duration, level), true);
                    event.setCancelled(true);

                } else if (sign.getLine(0).equals(ChatColor.GOLD + "Explosion") && p.hasPermission("clicksigns.signs.explosion.use") && plugin.getEconomy().has(p.getName(), plugin.getConfig().getInt("Explosion-Sign-Cost"))) {
                    //Then execute code
                    //((CraftPlayer)event.getPlayer()).getHandle().playerConnection.checkMovement = false;
                    p.sendMessage(ChatColor.DARK_AQUA + "You feel like you are flying");
                    w.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 1);
                    w.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
                    //p.setVelocity(new Vector (level, duration / 20, 0));
                    p.setVelocity(p.getVelocity().setY(duration / 20));
                    w.createExplosion(p.getLocation(), 0.0f);
                    NoFallDamage.add(p);

                } else {
                    p.sendMessage(ChatColor.RED + "You do not have enough funds to use this ClickSign");
                }
            }
        }
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            if (event.getCause().equals(DamageCause.FALL)) {
                if (NoFallDamage.contains((Player) event.getEntity())) {
                    event.setCancelled(true);
                    while (NoFallDamage.contains((Player) event.getEntity())) {
                        NoFallDamage.remove((Player) event.getEntity());
                    }
                }
            }
        }
    }
}
