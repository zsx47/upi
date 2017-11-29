package net.thisisz.upi.common.messaging.object;

import com.google.gson.Gson;

public class PlayerInit implements MessageObject {

    public PlayerInit() {

    }

    @Override
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
