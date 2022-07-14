package com.example.simpletodolist.todo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ToDoService {
    @Autowired
    private var toDoRepository:ToDoRepository? = null

    fun getAllToDo():List<ToDoDto>{
        return toDoRepository!!.findAll().map { ToDoDto(it) }
    }

    fun createToDo(data:ToDoDto):ToDoDto?{
        var toDo:ToDoEntity = ToDoEntity()
        toDo.create(data)
        toDoRepository!!.save(toDo)
        return null
    }
}