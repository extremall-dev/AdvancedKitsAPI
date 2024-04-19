package me.extremall.advancedkits.api.event.user;

import lombok.Getter;
import lombok.Setter;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class UpgradeKitEvent extends BaseUserEvent implements Cancellable
{
    @Getter
    @Setter
    private boolean cancelled;
    @Getter
    private final KitLevel oldKitLevel, newKitLevel;

    public UpgradeKitEvent(@NotNull User user, @NotNull KitLevel oldKitLevel, @NotNull KitLevel newKitLevel)
    {
        super(user);
        this.oldKitLevel = oldKitLevel;
        this.newKitLevel = newKitLevel;
    }
}
