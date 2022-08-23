package me.extremall.advancedkits.api;

import me.extremall.advancedkits.api.user.UserManager;
import org.jetbrains.annotations.NotNull;

public class AdvancedKitsAPI
{
    private static UserManager userManager;

    @NotNull
    public static UserManager getUserManager()
    {
        return AdvancedKitsAPI.userManager;
    }
}
