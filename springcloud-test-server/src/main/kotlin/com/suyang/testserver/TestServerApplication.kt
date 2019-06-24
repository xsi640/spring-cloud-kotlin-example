package com.suyang.testserver

import com.suyang.testserver.domain.User
import com.suyang.testserver.repository.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableDiscoveryClient
class TestServerApplication {
    @Bean
    internal fun init(repository: UserRepository): ApplicationRunner {
        return ApplicationRunner {
            val user1 = User(1L, "张三", 20)
            val user2 = User(2L, "李四", 28)
            val user3 = User(3L, "王五", 32)
            repository.save(user1)
            repository.save(user2)
            repository.save(user3)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<TestServerApplication>(*args)
}