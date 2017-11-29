package net.thisisz.upi.common.config;

import java.util.Collection;

public interface UniversalConfig {

    Collection<String> getKeys();

    String getString(String path);

    int getInt(String path);

    boolean getBoolean(String path);

    UniversalConfig getSection(String path);

}
