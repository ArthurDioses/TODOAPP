package com.dioses.todoapp.addtasks.ui

import com.dioses.todoapp.addtasks.ui.model.TaskModel

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.ui
 * Created by Arthur Dioses Reto on 18/03/24 at 2:47 PM
 * All rights reserved 2024.
 ****/
sealed interface TaskUiState {
    object Loading : TaskUiState
    data class Error(val throwable: Throwable) : TaskUiState
    data class Success(val tasks: List<TaskModel>) : TaskUiState
}