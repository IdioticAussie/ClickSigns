package me.IdioticAussie;


import net.milkbowl.vault.economy.Economy;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import net.milkbowl.vault.permission.Permission;


public class ClickSigns extends JavaPlugin implements Listener
{

    public PlayerListener pl;
    public ClickSignsListener csl;
    public EffectListener el;
    public static Permission permission = null;
    private Economy economy;
    

    @Override
    public void onEnable()
    {
        PluginManager pm = getServer().getPluginManager();

        if (!setupPermissions())
        {
            getLogger().severe("Failed to initialize permissions");
            pm.disablePlugin(this);
            return;
        }
        if (!setupEconomy())
        {
            getLogger().severe("No economy plugins detected, economy support will not be enabled");

           
        }
        
        this.pl = new PlayerListener(this);
        this.csl = new ClickSignsListener(this);
        this.el = new EffectListener(this);
        this.saveDefaultConfig();
        getLogger().info("ClickSigns by IdioticAussie has been Enabled");
        pm.registerEvents(this, this);
        pm.registerEvents(this.csl, this);
        pm.registerEvents(this.pl, this);
        pm.registerEvents(this.el, this);
        
    }

    
    
    
    //Plugin Being Enabled

    @Override
    public void onDisable()
    {
        getLogger().info("ClickSigns by IdioticAussie has been Disabled");
        this.saveDefaultConfig();
        //Plugin Being Disabled
    }

private boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
            permission = permissionProvider.getProvider();
        }
        return (permission != null);
    }


    public boolean setupEconomy()
    {

        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null)
        {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }

    public Economy getEconomy()
    {
        return this.economy;
    }

}