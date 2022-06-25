package me.extremall.advancedkits.api.kit;

import me.extremall.advancedkits.menu.preview.PreviewMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface Kit
{
    @NotNull String getIdentifier();

    @NotNull String getPermission();

    @NotNull Map<Integer, KitLevel> getLevels();

    @Nullable KitLevel getLevel(int level);

    boolean isUpgradeable();

    boolean isValidLevel(int level);

    PreviewMenu getPreviewMenu();
}
