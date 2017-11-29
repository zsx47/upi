package net.thisisz.upi.api;

import java.awt.*;

public interface UPIPlayer {

    void SendMessage(TextComponent message);

    void hasPermission(String node);

    String getSpigotServer();

    String getDisplayName();

    String getName();

    String getPrefix();


}
