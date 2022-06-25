package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

public abstract class UserEvent extends Event
{
    protected User user;

    public UserEvent(@NotNull User user)
    {
        this.user = user;
    }

    @NotNull
    public User getUser()
    {
        return this.user;
    }
}