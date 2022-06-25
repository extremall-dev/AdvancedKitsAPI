package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitStatus;
import me.extremall.advancedkits.file.YamlBuilder;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface User
{
    @NotNull UUID getUniqueId();

    @Nullable Player getPlayer();

    int getKitLevel(@NotNull Kit kit);

    long getKitCooldown(@NotNull Kit kit);

    long getLeftKitCooldown(@NotNull Kit kit);

    boolean hasKitCooldown(@NotNull Kit kit);

    void setKitCooldown(@NotNull Kit kit, long delay);

    void resetKitCooldown(@NotNull Kit kit);

    int getKitRedeemedTimes(@NotNull Kit kit);

    @NotNull KitStatus getKitStatus(@NotNull Kit kit);

    @Nullable YamlBuilder getYamlPlayerFile();

    void loadDatabase();

    void saveDatabase();

    void giveFirstJoinKits();

    void giveFirstJoinVouchers();
}
