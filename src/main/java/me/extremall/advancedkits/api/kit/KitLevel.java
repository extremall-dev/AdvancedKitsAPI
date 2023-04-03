package me.extremall.advancedkits.api.kit;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface KitLevel
{
    @NotNull String getIdentifier();

    @NotNull Kit getKit();

    int getLevel();

    long getClaimDelay();

    long getBuyDelay();

    int getMaximumUses();

    int getNumberOfItems();

    @NotNull String getCurrency();

    double getCost();

    boolean isGiveItems();

    @Nullable ItemStack[] getKitItems();

    @Nullable List<ItemStack> getPreviewItems();

    @NotNull RedeemAction getRedeemAction(@NotNull KitStatus kitStatus);
}
