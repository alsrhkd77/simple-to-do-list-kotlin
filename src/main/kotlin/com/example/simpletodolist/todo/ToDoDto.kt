package com.example.simpletodolist.todo

import java.time.LocalDateTime

data class ToDoDto(
    var toDoId: Int? = null,
    var title: String,
    var detail: String,
    var deadline: LocalDateTime? = null,
    var completion: Boolean = false
) {
    constructor(entity: ToDoEntity) : this(entity.toDoId, entity.title, entity.detail, entity.deadline, entity.completion)
}