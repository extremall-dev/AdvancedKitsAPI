package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitStatus;
import me.extremall.advancedkits.api.user.data.DataSave;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface User
{
    @NotNull UUID getUniqueId();

    @Nullable Player getPlayer();

    @NotNull KitStatus getKitStatus(@NotNull Kit kit);

    void loadDatabase();

    void saveDatabase();

    @NotNull UserDatabase getUserDatabase();

    @NotNull DataSave getDataSave();
}
