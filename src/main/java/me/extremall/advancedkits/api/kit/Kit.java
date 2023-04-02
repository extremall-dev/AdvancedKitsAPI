package me.extremall.advancedkits.api.kit;

import dev.dejvokep.boostedyaml.YamlDocument;
import me.extremall.advancedkits.api.requirement.Requirement;
import me.extremall.advancedkits.menu.preview.PreviewMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface Kit
{
    @NotNull String getIdentifier();

    @NotNull Requirement getRequirements();

    @NotNull Map<Integer, KitLevel> getLevels();

    @Nullable KitLevel getLevel(int level);

    @NotNull KitLevel getDefaultKitLevel();

    boolean isUpgradable();

    boolean isPurchasable();

    @NotNull YamlDocument getDataFile();
}
