package me.extremall.advancedkits.api.configuration;

import dev.dejvokep.boostedyaml.YamlDocument;
import org.jetbrains.annotations.NotNull;

public interface ConfigManager
{
    @NotNull YamlDocument getFile(@NotNull ConfigFile key);
}
