package net.thisisz.upi.bungee;


import net.md_5.bungee.config.Configuration;
import net.thisisz.upi.common.config.UniversalConfig;

import java.util.Collection;

public class ConfigWrapper implements UniversalConfig {

    private Configuration config;

    public ConfigWrapper(Configuration config) {
        this.config = config;
    }

    @Override
    public Collection<String> getKeys() {
        return config.getKeys();
    }

    @Override
    public String getString(String path) {
        return config.getString(path);
    }

    @Override
    public int getInt(String path) {
        return config.getInt(path);
    }

    @Override
    public boolean getBoolean(String path) {
        return config.getBoolean(path);
    }

    @Override
    public UniversalConfig getSection(String path) {
        return getSection(path);
    }


}
