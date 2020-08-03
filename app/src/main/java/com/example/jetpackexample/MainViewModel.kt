package com.example.jetpackexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Room

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val db = Room.databaseBuilder(
        application,
        AppDatabase::class.java,
        "todo"
    ).allowMainThreadQueries().build()

    fun getAll() : LiveData<List<ToDo>>{
        return db.toDoDao().getAll()
    }

    suspend fun insertToDo(toDo: ToDo){
        db.toDoDao().insertTodo(toDo)
    }
}