package me.extremall.advancedkits.api.trigger;

import org.jetbrains.annotations.NotNull;

public interface GrantTriggerManager
{
    @NotNull
    GrantTriggerContext getContext(@NotNull GrantTriggerType grantTriggerType);
}