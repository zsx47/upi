package net.thisisz.upi.common.api;

import java.lang.reflect.Method;

import net.thisisz.upi.UniversalPlayerInterface;

public class ApiSingletonUtils {
    private static final Method REGISTER;
    private static final Method UNREGISTER;
    static {
        Method register = null;
        Method unregister = null;
        try {
            register = UniversalPlayerInterface.class.getDeclaredMethod("registerProvider", UniversalPlayerInterfaceApi.class);
            register.setAccessible(true);

            unregister = UniversalPlayerInterface.class.getDeclaredMethod("unregisterProvider");
            unregister.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        REGISTER = register;
        UNREGISTER = unregister;
    }

    public static void registerProvider(UniversalPlayerInterfacermsApi universalPlayerInterfaceApi) {
        try {
            REGISTER.invoke(null, universalPlayerInterfaceApi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void unregisterProvider() {
        try {
            UNREGISTER.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
