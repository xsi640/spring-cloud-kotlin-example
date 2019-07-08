springBoot {
    mainClassName = "com.suyang.apigateway.ApiGatewayApplicationKt"
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")

    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-config:${rootProject.extra.get("nacos")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery:${rootProject.extra.get("nacos")}")

    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}