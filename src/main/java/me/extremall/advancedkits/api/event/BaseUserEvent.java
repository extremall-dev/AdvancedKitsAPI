package me.extremall.advancedkits.api.event;

import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class BaseUserEvent extends UserEvent
{
    private static final HandlerList HANDLERS = new HandlerList();

    public BaseUserEvent(@NotNull User user)
    {
        super(user);
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        return BaseUserEvent.HANDLERS;
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        return BaseUserEvent.HANDLERS;
    }
}
