package me.extremall.advancedkits.api.event.user;

import lombok.Getter;
import me.extremall.advancedkits.api.event.BaseEvent;
import me.extremall.advancedkits.api.user.User;
import org.jetbrains.annotations.NotNull;

public class BaseUserEvent extends BaseEvent
{
    @Getter
    protected final User user;

    public BaseUserEvent(@NotNull User user)
    {
        this.user = user;
    }
}