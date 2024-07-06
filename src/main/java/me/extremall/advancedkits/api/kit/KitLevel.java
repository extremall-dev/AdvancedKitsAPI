package me.extremall.advancedkits.api.kit;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.List;

public interface KitLevel extends Cloneable
{
    @NotNull String getIdentifier();

    @ApiStatus.Internal
    @Nullable String getLevelFormat();

    @ApiStatus.Internal
    void setLevelFormat(@Nullable String levelFormat);

    @NotNull Kit getKit();

    void setKit(@NotNull Kit kit);

    int getLevel();

    void setLevel(int level);

    long getClaimDelay();

    void setClaimDelay(long claimDelay);

    double getChance();

    void setChance(double chance);

    long getBuyDelay();

    void setBuyDelay(long buyDelay);

    int getMaximumUses();

    void setMaximumUses(int maximumUses);

    int getNumberOfItems();

    @NotNull String getCurrency();

    void setCurrency(@NotNull String currency);

    @NotNull BigDecimal getCost();

    void setCost(@NotNull BigDecimal cost);

    boolean isGiveItems();

    void setGiveItems(boolean giveItems);

    @Nullable ItemStack[] getKitItems();

    void setKitItems(@Nullable ItemStack[] kitItems);

    @Nullable List<ItemStack> getPreviewItems();

    void setPreviewItems(@Nullable List<ItemStack> previewItems);

    @NotNull RedeemAction getRedeemAction(@NotNull KitStatus kitStatus);

    void setRedeemAction(@NotNull KitStatus kitStatus, @NotNull RedeemAction redeemAction);

    //@NotNull KitLevel clone();
}
