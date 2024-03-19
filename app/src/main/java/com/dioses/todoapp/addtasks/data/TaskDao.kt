package com.dioses.todoapp.addtasks.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.data
 * Created by Arthur Dioses Reto on 18/03/24 at 2:08 PM
 * All rights reserved 2024.
 ****/
@Dao
interface TaskDao {
    @Query("SELECT * From TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item: TaskEntity)

    @Update
    suspend fun updateTask(item: TaskEntity)

    @Delete
    suspend fun deleteTask(item: TaskEntity)
}