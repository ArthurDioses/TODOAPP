package com.dioses.todoapp.addtasks.data.di

import android.content.Context
import androidx.room.Room
import com.dioses.todoapp.addtasks.data.TaskDao
import com.dioses.todoapp.addtasks.data.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.data.di
 * Created by Arthur Dioses Reto on 18/03/24 at 2:13 PM
 * All rights reserved 2024.
 ****/
@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun provideTaskDao(todoDatabase: TodoDatabase): TaskDao {
        return todoDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideTodoDatabase(@ApplicationContext appContext: Context): TodoDatabase {
        return Room.databaseBuilder(appContext, TodoDatabase::class.java, "TaskDatabase").build()
    }
}