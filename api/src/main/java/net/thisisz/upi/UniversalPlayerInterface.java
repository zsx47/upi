package net.thisisz.upi;

import net.thisisz.upi.api.UniversalPlayerInterfaceApi;

import java.util.Optional;

import javax.annotation.Nonnull;

public final class UniversalPlayerInterface {

    private static UniversalPlayerInterfaceApi instance = null;

    @Nonnull
    public static Optional<UniversalPlayerInterfaceApi> getApi() {
        return Optional.ofNullable(instance);
    }

    static void registerProvider(UniversalPlayerInterfaceApi instance) {
        UniversalPlayerInterface.instance = instance;
    }

    static void unregisterProvider() {
        UniversalPlayerInterface.instance = null;
    }

    private UniversalPlayerInterface() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

}
