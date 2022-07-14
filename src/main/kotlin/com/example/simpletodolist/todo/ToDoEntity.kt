package com.example.simpletodolist.todo

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class ToDoEntity {
    @Id
    @Column(name = "todo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var toDoId: Int = 0

    lateinit var title: String

    lateinit var detail: String

    var deadline: LocalDateTime? = null

    var completion: Boolean = false

    fun create(toDoDto: ToDoDto){
        this.title = toDoDto.title
        this.detail = toDoDto.detail
        this.deadline = toDoDto.deadline
        this.completion = toDoDto.completion
    }
}