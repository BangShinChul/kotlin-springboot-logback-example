package com.example.api

import mu.NamedKLogging
import org.springframework.stereotype.Service

@Service
class HelloService {

    // 특정 Appender를 지정하여 로거를 선언
    companion object : NamedKLogging("SERVICE")

    fun sayHi(name: String?): String {
        logger.info("say $name")
        return "Hello, ${name ?: "Friend"}!"
    }
}
