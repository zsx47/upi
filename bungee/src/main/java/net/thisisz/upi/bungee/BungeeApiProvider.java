package net.thisisz.upi.bungee;

import net.thisisz.upi.api.UPIPlayer;
import net.thisisz.upi.api.UniversalPlayerInterfaceApi;
import net.thisisz.upi.bungee.UPIBungeePlugin;

import java.util.UUID;

public class BungeeApiProvider implements UniversalPlayerInterfaceApi {

    public BungeeApiProvider() {

    }

    private UPIBungeePlugin getPlugin() {
        return UPIBungeePlugin.getPlugin();
    }

    @Override
    public UPIPlayer getPlayer(UUID uuid) {
        return null;
    }

}
