package com.example.simpletodolist.todo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
@CrossOrigin("*")
class ToDoController {

    @GetMapping("/get-all-todo")
    fun getAllToDo(): ResponseEntity<Any> {
        return ResponseEntity.ok().body("hello")
    }

    @PostMapping("/add-todo")
    fun addToDo(@RequestBody toDo: Map<String, String>): ResponseEntity<Void>{
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