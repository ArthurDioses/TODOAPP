package com.dioses.todoapp.addtasks.data

import androidx.room.PrimaryKey

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.data
 * Created by Arthur Dioses Reto on 18/03/24 at 2:06 PM
 * All rights reserved 2024.
 ****/
data class TaskEntity(
    @PrimaryKey
    val id: Int,
    val task: String,
    var selected: Boolean = false,
)