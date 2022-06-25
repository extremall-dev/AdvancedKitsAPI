package me.extremall.advancedkits.api.event;

import me.extremall.advancedkits.api.kit.Kit;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

public class PlayerPreReceiveKitEvent extends BaseUserEvent implements Cancellable
{
    private final boolean requirements;
    private final Kit kit;
    private final KitLevel kitLevel;
    private boolean cancelled;

    public PlayerPreReceiveKitEvent(@NotNull User user, @NotNull Kit kit, @NotNull KitLevel kitLevel, boolean requirements)
    {
        super(user);
        this.kit = kit;
        this.kitLevel = kitLevel;
        this.requirements = requirements;
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
    public KitLevel getKitLevel()
    {
        return this.kitLevel;
    }

    public boolean hasRequirements()
    {
        return this.requirements;
    }

    @Override
    public void setCancelled(boolean cancel)
    {
        this.cancelled = cancel;
    }
}