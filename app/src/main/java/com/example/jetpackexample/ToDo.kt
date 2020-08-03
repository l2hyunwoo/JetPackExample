package com.example.jetpackexample

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ToDo (
    val title : String
){
    @PrimaryKey(autoGenerate = true) var uid : Int = 0
}