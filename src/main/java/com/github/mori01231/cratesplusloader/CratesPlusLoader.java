package com.github.mori01231.cratesplusloader;

import org.bukkit.plugin.java.JavaPlugin;

public final class CratesPlusLoader extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().dispatchCommand(getServer().getConsoleSender(), "plugman reload CratesPlus");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
