package com.example.coroutinessample.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.coroutinessample.room.dao.UserDao
import com.example.coroutinessample.room.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

}