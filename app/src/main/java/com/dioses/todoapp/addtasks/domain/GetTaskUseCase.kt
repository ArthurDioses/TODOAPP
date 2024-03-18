package com.dioses.todoapp.addtasks.domain

import com.dioses.todoapp.addtasks.data.TaskRepository
import com.dioses.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.domain
 * Created by Arthur Dioses Reto on 18/03/24 at 2:32 PM
 * All rights reserved 2024.
 ****/

class GetTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    operator fun invoke(): Flow<List<TaskModel>> {
        return taskRepository.tasks
    }

}