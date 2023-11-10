package me.extremall.advancedkits.api.kit;

import dev.dejvokep.boostedyaml.YamlDocument;
import me.extremall.advancedkits.api.requirement.Requirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface Kit extends Cloneable
{
    @NotNull String getIdentifier();

    @NotNull Requirement getRequirement();

    void setRequirement(@NotNull Requirement requirement);

    @NotNull Map<Integer, KitLevel> getLevels();

    void setLevels(Map<Integer, KitLevel> levels);

    @Nullable KitLevel getLevel(int level);

    @NotNull KitLevel getDefaultKitLevel();

    boolean isUpgradable();

    boolean isPurchasable();

    @NotNull String getPreviewMenu();

    void setPreviewMenu(@NotNull String previewMenu);

    @NotNull YamlDocument getDataFile();

    void setDataFile(@NotNull YamlDocument yamlDocument);

    @NotNull Kit clone();
}