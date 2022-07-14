package com.example.simpletodolist.todo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
@CrossOrigin("*")
class ToDoController {

    @Autowired
    val toDoService: ToDoService? = null

    @GetMapping("/get-all-todo")
    fun getAllToDo(): ResponseEntity<List<ToDoDto>> {
        return ResponseEntity.ok().body(toDoService!!.getAllToDo())
    }

    @PostMapping("/create-todo")
    fun createToDo(@RequestBody toDo: ToDoDto): ResponseEntity<ToDoDto?> {
        return ResponseEntity.ok().body(toDoService!!.createToDo(toDo))
    }

    fun setCompletion(@RequestBody toDoId: Int, complete: Boolean): ResponseEntity<Void>{

        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/delete-to-do")
    fun deleteToDo(key: String): ResponseEntity<Void>{
        return ResponseEntity.ok().build()
    }

    @GetMapping("/get-detail")
    fun getDetail(key:String):ResponseEntity<Any>{
        return ResponseEntity.ok().build()
    }
}