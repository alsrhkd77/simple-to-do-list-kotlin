package com.example.simpletodolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleToDoListApplication

fun main(args: Array<String>) {
    runApplication<SimpleToDoListApplication>(*args)
}
