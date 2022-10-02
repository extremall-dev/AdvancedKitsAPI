package me.extremall.advancedkits.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;

public interface UserManager
{
    @NotNull Set<User> getOnlineUsers();

    @Nullable User getUser(@NotNull UUID uniqueId);

    void saveUser(@NotNull User user);

    void saveOnlineUsers();

    void giveFirstJoinKits(@NotNull User user);

    void giveFirstJoinVouchers(@NotNull User user);
}
