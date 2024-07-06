package me.extremall.advancedkits.api.event.user;

import lombok.Getter;
import lombok.Setter;
import me.extremall.advancedkits.api.kit.KitLevel;
import me.extremall.advancedkits.api.kit.KitStatus;
import me.extremall.advancedkits.api.user.User;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.NotNull;

@Getter
public class ReceiveKitEvent extends BaseUserEvent implements Cancellable
{
    @Setter
    private boolean cancelled;
    private final KitLevel kitLevel;
    private final KitStatus kitStatus;

    public ReceiveKitEvent(@NotNull User user, @NotNull KitLevel kitLevel, @NotNull KitStatus kitStatus)
    {
        super(user);
        this.kitLevel = kitLevel;
        this.kitStatus = kitStatus;
    }
}
