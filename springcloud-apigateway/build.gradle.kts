springBoot {
    mainClassName = "com.suyang.apigateway.ApiGatewayApplicationKt"
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")

    implementation("com.ctrip.framework.apollo:apollo-client:${rootProject.extra.get("apollo")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery")

    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}