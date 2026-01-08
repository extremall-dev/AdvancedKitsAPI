package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.trigger.GrantTriggerType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Consumer;

public interface UserManager
{
    @Nullable User getUser(@NotNull UUID uniqueId);

    void saveUserSync(@NotNull User user);

    void saveUserAsync(@NotNull User user, @NotNull Consumer<Boolean> saved);

    void saveOnlineUsers();

    void processGrantTrigger(@NotNull User user, @NotNull GrantTriggerType grantTriggerType);

    void loadKit(@NotNull Kit kit);
}
