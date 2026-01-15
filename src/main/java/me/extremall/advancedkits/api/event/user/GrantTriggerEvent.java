package me.extremall.advancedkits.api.event.user;

import lombok.Getter;
import lombok.Setter;
import me.extremall.advancedkits.api.trigger.GrantTriggerContext;
import me.extremall.advancedkits.api.trigger.GrantTriggerType;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

@Getter
public class GrantTriggerEvent extends BaseUserEvent implements Cancellable
{
    @Setter
    private boolean cancelled;
    private final GrantTriggerType grantTriggerType;
    private final GrantTriggerContext grantTriggerContext;

    public GrantTriggerEvent(@NotNull User user, @NotNull GrantTriggerType grantTriggerType, @NotNull GrantTriggerContext grantTriggerContext)
    {
        super(user);
        this.grantTriggerType = grantTriggerType;
        this.grantTriggerContext = grantTriggerContext;
    }
}
