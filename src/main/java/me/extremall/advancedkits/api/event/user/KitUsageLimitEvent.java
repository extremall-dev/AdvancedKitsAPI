package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public class KitUsageLimitEvent extends BaseUserEvent implements Cancellable
{
    private boolean cancelled;
    private KitLevel kitLevel;
    public KitUsageLimitEvent(@NotNull User user)
    {
        super(user);
    }

    @NotNull
    public KitLevel getKitLevel()
    {
        return this.kitLevel;
    }

    public void setKitLevel(@NotNull KitLevel kitLevel)
    {
        this.kitLevel = kitLevel;
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
