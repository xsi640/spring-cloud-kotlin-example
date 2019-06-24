plugins {
    id("org.jetbrains.kotlin.plugin.jpa") version "1.3.31"
}

apply(plugin = "kotlin-jpa")

springBoot {
    mainClassName = "com.suyang.testserver.TestServerApplicationKt"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")


    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-sentinel:${rootProject.extra.get("nacos")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-config:${rootProject.extra.get("nacos")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery:${rootProject.extra.get("nacos")}")
}