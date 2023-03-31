package me.extremall.advancedkits.api.kit;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KitManager
{
    @Nullable Kit getKitByName(@NotNull String name);

    void giveKit(@NotNull Player player, @NotNull KitLevel kitLevel, boolean forced);

    void giveKitItems(@NotNull Player player, @NotNull KitLevel kitLevel);

    void editKitItems(@NotNull KitLevel kitLevel, @NotNull Player editor);
}
