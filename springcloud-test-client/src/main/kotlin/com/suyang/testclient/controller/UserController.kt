package com.suyang.testclient.controller

import com.suyang.testclient.client.UserClient
import com.suyang.testclient.domain.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/test-client/user")
@RestController
class UserController(
        private var userService: UserClient
) {
    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): User? {
        return userService.findById(id)
    }
}