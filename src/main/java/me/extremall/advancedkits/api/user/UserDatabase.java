package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.kit.Kit;
import org.jetbrains.annotations.NotNull;

public interface UserDatabase
{
    int getKitLevel(@NotNull Kit kit);

    boolean isSetKitLevel(@NotNull Kit kit);

    void setKitLevel(@NotNull Kit kit, int level);

    long getKitCooldown(@NotNull Kit kit);

    boolean isSetKitCooldown(@NotNull Kit kit);

    void setKitCooldown(@NotNull Kit kit, long delay);

    long getKitBuyDelay(@NotNull Kit kit);

    boolean isSetKitBuyDelay(@NotNull Kit kit);

    void setKitBuyDelay(@NotNull Kit kit, long delay);

    int getKitUsages(@NotNull Kit kit);

    boolean isSetKitUsages(@NotNull Kit kit);

    void setKitUsages(@NotNull Kit kit, int usages);

    boolean exists();

    void load();

    void save();

    void reset();
}
