package me.extremall.advancedkits.api.economy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

public interface EconomyManager
{
    boolean register(@NotNull String identifier, @NotNull Economy economy);

    boolean unregister(@NotNull String identifier);

    boolean isRegistered(@NotNull String identifier);

    @Nullable Economy getByIdentifier(@NotNull String identifier);

    @NotNull String getFormattedAmount(@Nullable Economy economy, @NotNull BigDecimal amount);
}
