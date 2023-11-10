package me.extremall.advancedkits.api.user;

import me.extremall.advancedkits.api.user.data.DataSave;
import org.jetbrains.annotations.Nullable;

public interface UserDatabase
{
    @Nullable DataSave getDataSave();

    boolean exists();

    void load();

    void save();
}
