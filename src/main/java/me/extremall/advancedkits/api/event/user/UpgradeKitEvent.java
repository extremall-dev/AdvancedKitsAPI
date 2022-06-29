package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class UpgradeKitEvent extends BaseUserEvent implements Cancellable
{
    private final Kit kit;
    private final KitLevel newKitLevel;
    private boolean cancelled;

    public UpgradeKitEvent(@NotNull User user, @NotNull Kit kit, @NotNull KitLevel newKitLevel)
    {
        super(user);
        this.kit = kit;
        this.newKitLevel = newKitLevel;
    }

    @NotNull
    public Kit getKit()
    {
        return this.kit;
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
