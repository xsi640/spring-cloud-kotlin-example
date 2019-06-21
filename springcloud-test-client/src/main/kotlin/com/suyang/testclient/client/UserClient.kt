package com.suyang.testclient.client

import com.suyang.testclient.domain.User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "test-server", fallback = UserClientFallback::class)
interface UserClient {
    @GetMapping("/api/v1/test-server/user/{id}")
    fun findById(@PathVariable("id") id: Long): User?
}

@Component
class UserClientFallback : UserClient {
    override fun findById(id: Long): User {
        return User(id, "默认用户", 0)
    }
}