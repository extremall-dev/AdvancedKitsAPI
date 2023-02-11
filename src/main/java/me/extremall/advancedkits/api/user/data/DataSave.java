package me.extremall.advancedkits.api.user.data;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface DataSave
{
    @NotNull
    Map<String, Integer> getKitLevels();
    @NotNull
    Map<String, Integer> getKitUsages();
    @NotNull
    Map<String, Long> getKitClaimCooldowns();
    @NotNull
    Map<String, Long> getKitBuyCooldowns();
}
