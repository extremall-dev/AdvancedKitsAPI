package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class UpgradeKitEvent extends BaseUserEvent implements Cancellable
{
    private final Kit kit;
    private final KitLevel currentKitLevel;
    private final KitLevel nextKitLevel;
    private boolean cancelled;

    public UpgradeKitEvent(@NotNull User user, @NotNull Kit kit, @NotNull KitLevel currentKitLevel, @NotNull KitLevel nextKitLevel)
    {
        super(user);
        this.kit = kit;
        this.currentKitLevel = currentKitLevel;
        this.nextKitLevel = nextKitLevel;
    }

    @Override
    public boolean isCancelled()
    {
        return this.cancelled;
    }

    @NotNull
    public Kit getKit()
    {
        return this.kit;
    }

    @NotNull
    public KitLevel getCurrentKitLevel()
    {
        return this.currentKitLevel;
    }

    @NotNull
    public KitLevel getNextKitLevel()
    {
        return this.nextKitLevel;
    }

    @Override
    public void setCancelled(boolean cancel)
    {
        this.cancelled = cancel;
    }
}
