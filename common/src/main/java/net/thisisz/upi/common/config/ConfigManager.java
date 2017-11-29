package net.thisisz.upi.common.config;

public class ConfigManager {

    private UniversalConfig config;
    private static ConfigManager instance;
    private MessagingConfig messagingConfig;

    public ConfigManager(UniversalConfig config) {
        instance = this;
        this.config = config;
        messagingConfig = new MessagingConfig();
    }

    static ConfigManager getConfigManager() {
        return instance;
    }

    public MessagingConfig getMessagingConfig() {
        return messagingConfig;
    }
}
