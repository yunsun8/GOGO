package com.example.gogo.data.source.local

import androidx.room.Database
import androidx.room.TypeConverters
import com.example.gogo.data.model.entity.ContentEntity
import com.example.gogo.data.source.local.dao.ContentDao

@Database(entities = [ContentEntity::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase {

    abstract fun contentDao() : ContentDao
}