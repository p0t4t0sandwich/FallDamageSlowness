package ca.sperrer.p0t4t0sandwich.falldamageslowness;

import org.bukkit.plugin.java.JavaPlugin;

public final class FallDamageSlowness extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
    }
}
