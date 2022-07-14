package com.example.simpletodolist.todo

import org.springframework.data.jpa.repository.JpaRepository

interface ToDoRepository: JpaRepository<ToDoEntity, Int> {
}