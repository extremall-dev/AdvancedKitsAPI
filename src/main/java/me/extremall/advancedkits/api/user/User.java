package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitStatus;
import me.extremall.advancedkits.api.requirement.Requirement;
import me.extremall.advancedkits.api.user.data.Cooldown;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;

public interface User
{
    @NotNull UUID getUniqueId();

    @Nullable Player getPlayer();

    @NotNull KitStatus getKitStatus(@NotNull Kit kit);

    @NotNull Set<Kit> getKitsByStatus(@NotNull KitStatus... kitStatus);

    @NotNull Set<Kit> getKitsByStatus(@NotNull String category, @NotNull KitStatus... kitStatus);

    void loadDatabase();

    boolean saveDatabase();

    @NotNull UserDatabase getUserDatabase();

    boolean hasRequirements(@NotNull Requirement requirement);

    @NotNull Cooldown getClaimCooldown(@NotNull Kit kit);

    @NotNull Cooldown getBuyCooldown(@NotNull Kit kit);
}
