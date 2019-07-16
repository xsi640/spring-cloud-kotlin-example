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
    implementation("mysql:mysql-connector-java")

    implementation("com.ctrip.framework.apollo:apollo-client:${rootProject.extra.get("apollo")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-sentinel")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery")
}