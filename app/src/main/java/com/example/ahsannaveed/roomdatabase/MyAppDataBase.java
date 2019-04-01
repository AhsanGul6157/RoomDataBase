package com.example.ahsannaveed.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.RoomDatabase;

@Database( entities={User.class},version = 1)
public abstract class MyAppDataBase extends RoomDatabase {

    public abstract MyDao myDao();
}
