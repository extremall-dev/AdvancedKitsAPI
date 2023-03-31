package me.extremall.advancedkits.api;

import me.extremall.advancedkits.api.kit.KitManager;
import me.extremall.advancedkits.api.user.UserManager;
import org.jetbrains.annotations.NotNull;

public class AdvancedKitsAPI
{
    private static UserManager userManager;
    private static KitManager kitManager;

    @NotNull
    public static UserManager getUserManager()
    {
        return AdvancedKitsAPI.userManager;
    }

    @NotNull
    public static KitManager getKitManager()
    {
        return AdvancedKitsAPI.kitManager;
    }
}