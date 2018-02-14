package sample.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("")
    fun hello(): ResponseEntity<HelloMessage> {
        return ResponseEntity.ok(HelloMessage("hello"))
    }

}

data class HelloMessage(val message: String)