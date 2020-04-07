package com.heart.tower.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.heart.tower.entities.dbData.ProfileInfo;
import com.heart.tower.entities.dbData.UserInfo;

@Database(entities = {UserInfo.class, ProfileInfo.class}, version = 7)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}
