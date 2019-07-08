package com.suyang.apigateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver
import reactor.core.publisher.Mono
import org.springframework.context.annotation.Bean


@EnableDiscoveryClient
@SpringBootApplication
class ApiGatewayApplication {
    @Bean
    fun ipKeyResolver(): KeyResolver {
        return KeyResolver { exchange -> Mono.just(exchange!!.request.remoteAddress!!.hostName) }
    }
}

fun main(args: Array<String>) {
    runApplication<ApiGatewayApplication>(*args)
}