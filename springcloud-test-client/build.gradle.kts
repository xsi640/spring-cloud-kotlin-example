springBoot {
    mainClassName = "com.suyang.testserver.TestClientApplication"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")


    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-sentinel:${rootProject.extra.get("nacos")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-config:${rootProject.extra.get("nacos")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery:${rootProject.extra.get("nacos")}")
}