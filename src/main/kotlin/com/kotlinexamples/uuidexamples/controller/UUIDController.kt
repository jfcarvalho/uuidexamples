package com.kotlinexamples.uuidexamples.controller

import com.kotlinexamples.uuidexamples.service.UUIDService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class UUIDController {

    @Autowired
    lateinit var uuidService: UUIDService

    @PostMapping
    fun saveUUID() {
        return uuidService.save()
    }

    @GetMapping
    fun getUUID() {
        return uuidService.get()
    }

}