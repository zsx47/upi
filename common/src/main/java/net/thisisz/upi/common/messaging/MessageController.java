package net.thisisz.upi.common.messaging;

public class MessageController {

    private ServiceProvider provider;

    public MessageController() {

    }

    private void SendMessage(PackagedMessage packagedMessage) {
        provider.sendMessage(packagedMessage);
    }

}
