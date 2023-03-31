package me.extremall.advancedkits.api.user.data;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public interface Cooldown
{
    long getCooldown(@NotNull TimeUnit timeUnit);

    long getCooldownTimestamp();

    void setCooldown(@NotNull TimeUnit timeUnit, long delay);

    void setCooldownTimestamp(long timestamp);

    void resetCooldown();

    boolean hasCooldown();
}