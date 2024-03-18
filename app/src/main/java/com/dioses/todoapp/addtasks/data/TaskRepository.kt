package com.dioses.todoapp.addtasks.data

import com.dioses.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.data
 * Created by Arthur Dioses Reto on 18/03/24 at 2:23 PM
 * All rights reserved 2024.
 ****/
@Singleton
class TaskRepository @Inject constructor(private val taskDao: TaskDao) {

    val tasks: Flow<List<TaskModel>> =
        taskDao.getTasks().map { items -> items.map { TaskModel(it.id, it.task, it.selected) } }

    suspend fun add(taskModel: TaskModel) {
        taskDao.addTask(TaskEntity(taskModel.id, taskModel.task, taskModel.selected))
    }
}