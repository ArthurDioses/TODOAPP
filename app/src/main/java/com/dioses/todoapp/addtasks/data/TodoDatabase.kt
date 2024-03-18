package com.dioses.todoapp.addtasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.data
 * Created by Arthur Dioses Reto on 18/03/24 at 2:03 PM
 * All rights reserved 2024.
 ****/
@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}