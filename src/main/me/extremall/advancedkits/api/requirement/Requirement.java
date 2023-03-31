package me.extremall.advancedkits.api.requirement;

import org.jetbrains.annotations.NotNull;

import java.util.Set;

public interface Requirement
{
    @NotNull Set<String> getPermissions();
    @NotNull Set<String> getPlaceholders();
}
