package me.extremall.advancedkits.api.economy;

import me.extremall.advancedkits.api.user.User;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public interface Economy
{
    @NotNull String getIdentifier();

    @NotNull BigDecimal getBalance(@NotNull User user);

    boolean hasBalance(@NotNull User user, @NotNull BigDecimal amount);

    boolean withdrawBalance(@NotNull User user, @NotNull BigDecimal amount);

    boolean depositBalance(@NotNull User user, @NotNull BigDecimal amount);
}
