package me.extremall.advancedkits.api.user.data;

import org.jetbrains.annotations.NotNull;

public interface KitData
{
    @NotNull Cooldown getClaimCooldown();

    @NotNull Cooldown getBuyCooldown();

    int getLevel();

    void setLevel(int level);

    void resetLevel();

    int getUsages();

    void setUsages(int usages);

    void resetUsages();
}
