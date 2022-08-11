package me.extremall.advancedkits.api.event.user;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.kit.KitStatus;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class ReceiveKitEvent extends BaseUserEvent implements Cancellable
{
    private boolean cancelled;
    private Kit kit;
    private KitLevel kitLevel;
    private KitStatus kitStatus;

    public ReceiveKitEvent(@NotNull User user)
    {
        super(user);
    }

    @NotNull
    public Kit getKit()
    {
        return this.kit;
    }

    public void setKit(@NotNull Kit kit)
    {
        this.kit = kit;
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

    @NotNull
    public KitStatus getKitStatus()
    {
        return this.kitStatus;
    }

    public void setKitStatus(@NotNull KitStatus kitStatus)
    {
        this.kitStatus = kitStatus;
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
