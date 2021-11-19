package com.example.f21g2_hackhunt.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.f21g2_hackhunt.interfaces.UserDao;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}