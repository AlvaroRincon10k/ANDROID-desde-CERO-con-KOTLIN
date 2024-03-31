package com.example.androidmaster.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal :TaskCategory()
    object Businnes :TaskCategory()
    object Other :TaskCategory()
}