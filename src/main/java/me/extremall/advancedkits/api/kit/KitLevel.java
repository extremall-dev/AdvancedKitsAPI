package me.extremall.advancedkits.api.kit;

import me.extremall.advancedkits.kits.items.ItemSlotType;
import me.extremall.advancedkits.kits.upgrades.CurrencyType;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface KitLevel
{
    @NotNull String getIdentifier();

    int getLevel();

    int getCooldown();

    int getBuyDelay();

    int getMaximumUsages();

    int getNumberOfItems();

    @NotNull CurrencyType getCurrencyType();

    @NotNull String getCost();

    boolean isGiveItems();

    @Nullable ItemStack[] getKitItems();

    @Nullable List<ItemStack> getKitPreviewMenuItems();

    @Nullable List<ItemSlotType> getItemSlotTypes();

    @NotNull RedeemAction getRedeemAction(KitStatus kitStatus);
}
