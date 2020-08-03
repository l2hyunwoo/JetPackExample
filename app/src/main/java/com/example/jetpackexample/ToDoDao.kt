package com.example.jetpackexample

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ToDoDao {
//    @Query("SELECT * FROM todo")
//    fun getAll() : List<ToDo>

    @Query("SELECT * FROM todo")
    fun getAll() : LiveData<List<ToDo>>

    @Insert
    fun insertTodo(toDo: ToDo)

    @Update
    fun updateTodo(toDo: ToDo)

    @Delete
    fun deleteTodo(toDo: ToDo)
}