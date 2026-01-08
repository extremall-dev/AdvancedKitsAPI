package me.extremall.advancedkits.api.kit;

import dev.dejvokep.boostedyaml.YamlDocument;
import me.extremall.advancedkits.api.requirement.Requirement;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface Kit
{
    @NotNull String getIdentifier();

    @ApiStatus.Internal
    @Nullable String getDisplayName();

    @ApiStatus.Internal
    void setDisplayName(@NotNull String displayName);

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
}