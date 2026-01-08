package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.user.data.DataSave;
import org.jetbrains.annotations.NotNull;

public interface UserDatabase
{
    @NotNull DataSave getDataSave();

    //boolean exists();

    boolean load();

    void save();
}
