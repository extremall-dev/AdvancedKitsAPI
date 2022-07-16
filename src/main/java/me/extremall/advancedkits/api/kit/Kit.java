package me.extremall.advancedkits.api.kit;

import me.extremall.advancedkits.menu.preview.PreviewMenu;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface Kit
{
    @NotNull String getIdentifier();

    @NotNull String getPermission();

    @NotNull Map<Integer, KitLevel> getLevels();

    @NotNull KitLevel getLevel(int level);

    boolean isUpgradable();

    boolean isPurchasable();

    boolean isValidLevel(int level);

    PreviewMenu getPreviewMenu();
}