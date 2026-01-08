package me.extremall.advancedkits.api.kit;

import me.extremall.advancedkits.api.exception.KitAlreadyExistsException;
import me.extremall.advancedkits.api.kit.status.ClaimStatus;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public interface KitManager
{
    @NotNull Set<Kit> getRegisteredKits();

    @NotNull
    Optional<Kit> getKitByName(@Nullable String name);

    @ApiStatus.Internal
    int getEmptySlots(@NotNull Player player, @NotNull KitLevel kitLevel);

    void giveKit(@NotNull Player player, @NotNull KitLevel kitLevel, @NotNull ClaimStatus claimStatus);

    void giveKitItems(@NotNull Player player, @NotNull KitLevel kitLevel);

    void editKitItems(@NotNull KitLevel kitLevel, @Nullable ItemStack @NotNull [] contents);

    @ApiStatus.Internal
    void deleteKit(@NotNull Kit kit) throws IOException, SecurityException;

    @ApiStatus.Internal
    @NotNull Kit createKit(@NotNull String kitIdentifier) throws IOException, KitAlreadyExistsException;

    @ApiStatus.Internal
    void renameKit(@NotNull Kit kit, @NotNull String kitIdentifier) throws IOException, KitAlreadyExistsException;

    @ApiStatus.Internal
    void saveKitToFile(@NotNull Kit kit) throws IOException;

    @ApiStatus.Internal
    @NotNull Kit loadKitFromFile(@NotNull String kitIdentifier) throws IOException;

    @ApiStatus.Experimental
    @NotNull Kit clone(@NotNull Kit kit, @NotNull String nameOfClone) throws IOException, KitAlreadyExistsException;

    void reload();
}
