package com.suyang.testserver.controller

import com.suyang.testserver.config.ConfigTest
import com.suyang.testserver.domain.User
import com.suyang.testserver.repository.UserRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/test-server/user/")
@RestController
@RefreshScope
class UserController(
        private val userRepository: UserRepository,
        @Value("\${hello.name}")
        private var name: String = "",
        private var config: ConfigTest
) {

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): User? {
        println("invoke me...")
        return this.userRepository.findByIdOrNull(id)
    }

    @GetMapping("hello")
    fun hello(): String {
        return name
    }

    @GetMapping("hello2")
    fun hello2(): String {
        return config.name1 + "," + config.name2 + "," + config.name3
    }

}