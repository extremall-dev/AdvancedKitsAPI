package me.extremall.advancedkits.api.kit;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface RedeemAction
{
    @NotNull List<String> getTitles();

    @NotNull List<String> getFireworks();

    @NotNull List<String> getSounds();

    @NotNull List<String> getParticles();

    @NotNull List<String> getConsoleCommands();

    @NotNull List<String> getMessages();

    void setTitles(@NotNull List<String> titles);

    void setFireworks(@NotNull List<String> fireworks);

    void setSounds(@NotNull List<String> sounds);

    void setParticles(@NotNull List<String> particles);

    void setConsoleCommands(@NotNull List<String> consoleCommands);

    void setMessages(@NotNull List<String> messages);
}
