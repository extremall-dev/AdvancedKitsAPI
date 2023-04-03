package me.extremall.advancedkits.api.user.data;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public interface Cooldown
{
    long getTimestamp();

    void setTimestamp(long timestamp);

    long getCooldown(@NotNull TimeUnit timeUnit);

    void setCooldown(@NotNull TimeUnit timeUnit, long delay);

    void resetCooldown();

    boolean hasCooldown();
}