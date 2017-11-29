package net.thisisz.upi.bungee;

import net.md_5.bungee.api.plugin.Plugin;

public class UPIBungeePlugin extends Plugin {

    private static UPIBungeePlugin instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static UPIBungeePlugin getInstance() {
        return instance;
    }

}
