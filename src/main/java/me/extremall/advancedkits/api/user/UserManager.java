package me.extremall.advancedkits.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

public interface UserManager
{
    @NotNull Set<User> getOnlineUsers();

    @Nullable User getUser(@NotNull UUID uniqueId);

    void saveUserSync(@NotNull User user);

    void saveUserAsync(@NotNull User user, @NotNull Consumer<Boolean> saved);

    void saveOnlineUsers(boolean async);

    void giveFirstJoinKits(@NotNull User user);

    void giveFirstJoinVouchers(@NotNull User user);
}
