package com.dioses.todoapp.addtasks.ui.model

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.ui.model
 * Created by Arthur Dioses Reto on 18/03/24 at 12:20 PM
 * All rights reserved 2024.
 ****/
data class TaskModel(
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false,
)
