package me.extremall.advancedkits.api;

import me.extremall.advancedkits.api.kit.KitManager;
import me.extremall.advancedkits.api.user.UserManager;
import org.jetbrains.annotations.NotNull;

public interface AdvancedKitsAPI
{
    @NotNull UserManager getUserManager();

    @NotNull KitManager getKitManager();

    void reload();

    @NotNull
    static AdvancedKitsAPI getInstance()
    {
        if (InstanceHolder.INSTANCE == null)
        {
            throw new IllegalStateException("AdvancedKitsAPI has not been initialized!");
        }
        return InstanceHolder.INSTANCE;
    }

    class InstanceHolder
    {
        private static AdvancedKitsAPI INSTANCE;
    }
}