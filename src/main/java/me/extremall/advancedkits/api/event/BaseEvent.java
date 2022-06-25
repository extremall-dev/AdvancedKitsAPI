package me.extremall.advancedkits.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class BaseEvent extends Event
{
    private static final HandlerList HANDLERS = new HandlerList();

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        return BaseEvent.HANDLERS;
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        return BaseEvent.HANDLERS;
    }
}
