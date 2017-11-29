package net.thisisz.upi.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import net.thisisz.upi.common.api.ApiSingletonUtils;
import net.thisisz.upi.common.config.ConfigManager;

import java.io.File;
import java.io.IOException;

public class UPIBungeePlugin extends Plugin {

    private static UPIBungeePlugin instance;
    private BungeeApiProvider apiProvider;
    private Configuration configuration;
    private ConfigWrapper configWrapper;
    private ConfigManager configManager;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("Loading config.");
        try {
            this.configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(getDataFolder(), "config.yaml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        configWrapper = new ConfigWrapper(configuration);

        configManager = new ConfigManager(configWrapper);

        apiProvider = new BungeeApiProvider();

        ApiSingletonUtils.registerProvider(apiProvider);

    }

    public static UPIBungeePlugin getPlugin() {
        return instance;
    }

}
