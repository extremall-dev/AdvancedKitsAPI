package me.extremall.advancedkits.api.exception;

import lombok.Getter;
import me.extremall.advancedkits.api.kit.Kit;
import org.jetbrains.annotations.NotNull;

@Getter
public class KitAlreadyExistsException extends Exception
{
    private final Kit kit;

    public KitAlreadyExistsException(@NotNull Kit kit)
    {
        super("A kit with the ID '" + kit.getIdentifier() + "' already exists.");
        this.kit = kit;
    }
}