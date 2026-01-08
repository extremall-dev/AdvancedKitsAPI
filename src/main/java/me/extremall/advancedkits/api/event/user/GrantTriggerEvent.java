package me.extremall.advancedkits.api.event.user;

import lombok.Getter;
import lombok.Setter;
import me.extremall.advancedkits.api.trigger.GrantTrigger;
import me.extremall.advancedkits.api.trigger.GrantTriggerType;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
public class GrantTriggerEvent extends BaseUserEvent implements Cancellable
{
    @Setter
    private boolean cancelled;
    private final GrantTriggerType grantTriggerType;
    private final List<GrantTrigger> grantTriggers;

    public GrantTriggerEvent(@NotNull User user, @NotNull GrantTriggerType grantTriggerType, @NotNull List<GrantTrigger> grantTriggers)
    {
        super(user);
        this.grantTriggerType = grantTriggerType;
        this.grantTriggers = grantTriggers;
    }
}
