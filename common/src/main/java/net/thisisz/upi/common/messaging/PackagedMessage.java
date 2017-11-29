package net.thisisz.upi.common.messaging;

import com.google.gson.Gson;
import net.thisisz.upi.common.messaging.object.MessageObject;

import java.util.UUID;

public class PackagedMessage {

    private String sender, message;

    public PackagedMessage(UUID sender, MessageObject message) {
        this.sender = sender.toString();
        this.message = message.toJson();
    }

    public UUID getSender() {
        return UUID.fromString(sender);
    }

    public String getMessage() {
        return message;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static PackagedMessage fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, PackagedMessage.class);
    }

}
