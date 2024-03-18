package com.dioses.todoapp.addtasks.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

/****
 * Project: TodoApp
 * From: com.dioses.todoapp.addtasks.ui
 * Created by Arthur Dioses Reto on 18/03/24 at 9:22 AM
 * All rights reserved 2024.
 ****/
class TaskViewModel @Inject constructor() : ViewModel() {

    private val _showDialog = MutableLiveData<Boolean>()
    val showDialog: LiveData<Boolean> = _showDialog

    fun onDialogClose() {
        _showDialog.value = false
    }

    fun onTaskCreated(task: String) {
        _showDialog.value = false
        Log.i("Arthur", "onTaskCreated: $task")
    }

    fun onShowDialogClick() {
        _showDialog.value = true
    }

}