package me.extremall.advancedkits.api.trigger;

import me.extremall.advancedkits.api.kit.KitLevel;
import org.jetbrains.annotations.Nullable;

public interface KitGrantTrigger extends GrantTrigger
{
    @Nullable KitLevel getKitLevel();
}
