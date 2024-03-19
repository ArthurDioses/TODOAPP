package com.dioses.todoapp.addtasks.domain

import com.dioses.todoapp.addtasks.data.TaskRepository
import com.dioses.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.domain
 * Created by Arthur Dioses Reto on 18/03/24 at 2:35 PM
 * All rights reserved 2024.
 ****/
class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)
    }

}