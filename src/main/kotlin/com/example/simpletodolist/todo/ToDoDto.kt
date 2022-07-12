package com.example.simpletodolist.todo

import java.util.*

data class ToDoDto(var title: String, var detail: String, var deadline: Date?, var complete: Boolean = false)