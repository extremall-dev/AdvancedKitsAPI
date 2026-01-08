package me.extremall.advancedkits.api;

import me.extremall.advancedkits.api.configuration.ConfigManager;
import me.extremall.advancedkits.api.economy.EconomyManager;
import me.extremall.advancedkits.api.kit.KitManager;
import me.extremall.advancedkits.api.trigger.GrantTriggerManager;
import me.extremall.advancedkits.api.user.UserManager;
import org.jetbrains.annotations.NotNull;

public interface AdvancedKitsAPI
{
    @NotNull UserManager getUserManager();

    @NotNull KitManager getKitManager();

    @NotNull ConfigManager getConfigManager();

    @NotNull EconomyManager getEconomyManager();

    @NotNull GrantTriggerManager getGrantTriggerManager();

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