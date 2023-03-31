package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class UpgradeKitEvent extends BaseUserEvent implements Cancellable
{
    private final KitLevel newKitLevel;
    private boolean cancelled;

    public UpgradeKitEvent(@NotNull User user, @NotNull KitLevel newKitLevel)
    {
        super(user);
        this.newKitLevel = newKitLevel;
    }

    @NotNull
    public KitLevel getNewKitLevel()
    {
        return this.newKitLevel;
    }

    @Override
    public boolean isCancelled()
    {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel)
    {
        this.cancelled = cancel;
    }
}
