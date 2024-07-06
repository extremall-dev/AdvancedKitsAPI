package me.extremall.advancedkits.api.kit;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public interface KitManager
{
    @NotNull Set<Kit> getRegisteredKits();

    @Nullable Kit getKitByName(@NotNull String name);

    @ApiStatus.Internal
    int getEmptySlots(@NotNull Player player, @NotNull KitLevel kitLevel);

    void giveKit(@NotNull Player player, @NotNull KitLevel kitLevel, boolean forced);

    void giveKitItems(@NotNull Player player, @NotNull KitLevel kitLevel);

    void editKitItems(@NotNull KitLevel kitLevel, @Nullable ItemStack @NotNull [] contents);

    @ApiStatus.Internal
    boolean deleteKit(@NotNull Kit kit);

    @ApiStatus.Internal
    boolean createKit(@NotNull String kitIdentifier);

    @ApiStatus.Internal
    boolean renameKit(@NotNull Kit kit, @NotNull String kitIdentifier);

    void reload();
}
