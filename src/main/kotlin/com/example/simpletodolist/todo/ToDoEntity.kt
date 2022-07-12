package com.example.simpletodolist.todo

import java.util.*
import javax.persistence.*

@Entity
class ToDoEntity {
    @Id
    @Column(name = "todo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var toDoId: Int = 0

    lateinit var title: String

    lateinit var detail: String

    lateinit var deadline: Date

    var complete: Boolean = false
}