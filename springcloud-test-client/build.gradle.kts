springBoot {
    mainClassName = "com.suyang.testclient.TestClientApplicationKt"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")

    implementation("com.ctrip.framework.apollo:apollo-client:${rootProject.extra.get("apollo")}")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-sentinel")
    implementation("org.springframework.cloud:spring-cloud-starter-alibaba-nacos-discovery")
}