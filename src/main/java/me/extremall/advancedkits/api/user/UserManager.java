package me.extremall.advancedkits.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.UUID;

public interface UserManager
{
    @NotNull Map<UUID, User> getRegisteredUsers();

    @Nullable User getUser(@NotNull UUID uniqueId);

    void loadUser(@NotNull UUID uniqueId, boolean asyncLoad);

    void unloadUser(@NotNull User user, boolean asyncSave);

    void loadOnlineUsers();

    void saveOnlineUsers();
}
