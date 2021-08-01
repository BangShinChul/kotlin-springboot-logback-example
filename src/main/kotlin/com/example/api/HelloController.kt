package com.example.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val helloService: HelloService
) {

    @GetMapping("/hello")
    fun sayHi(): String {
        return helloService.sayHi(null)
    }

    @GetMapping("/hello/{name}")
    fun sayHi(
        @PathVariable name: String?
    ): String {
        return helloService.sayHi(name)
    }
}
