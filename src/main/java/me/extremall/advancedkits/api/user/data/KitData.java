package me.extremall.advancedkits.api.user.data;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public interface KitData
{
    long getCooldown(@NotNull TimeUnit timeUnit);

    void setCooldown(@NotNull TimeUnit timeUnit, long delay);

    void resetCooldown();

    boolean hasCooldown();

    long getBuyDelay(@NotNull TimeUnit timeUnit);

    void setBuyDelay(@NotNull TimeUnit timeUnit, long delay);

    void resetBuyDelay();

    boolean hasBuyDelay();

    int getLevel();

    void setLevel(int level);

    void resetLevel();

    int getUsages();

    void setUsages(int usages);

    void resetUsages();
}
