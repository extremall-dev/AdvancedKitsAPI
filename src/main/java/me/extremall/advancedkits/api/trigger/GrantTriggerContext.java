package me.extremall.advancedkits.api.trigger;

import me.extremall.advancedkits.api.requirement.Requirement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface GrantTriggerContext
{
    @NotNull
    List<GrantTrigger> getTriggers();

    @NotNull
    Requirement getRequirement();
}