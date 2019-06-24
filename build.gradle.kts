import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.1.5.RELEASE"
    id("io.spring.dependency-management") version "0.6.0.RELEASE"
    kotlin("jvm") version "1.3.31"
    kotlin("plugin.spring") version "1.3.31"
}

val bootJar: BootJar by tasks

bootJar.enabled = false

allprojects {
    apply {
        plugin("java")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
        plugin("kotlin")
        plugin("kotlin-spring")
    }

    ext {
        set("springCloud", "Greenwich.RELEASE")
        set("springBoot", "2.1.5.RELEASE")
        set("nacos", "0.9.0.RELEASE")
    }

    group = "com.suyang"
    version = "0.0.1-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_1_8
    java.targetCompatibility = JavaVersion.VERSION_1_8

    repositories {
        mavenLocal()
        maven { url = uri("http://maven.aliyun.com/nexus/content/groups/public/") }
        mavenCentral()
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${ext.get("springCloud")}")
        }
    }
}

subprojects {
    dependencies {
        implementation("org.springframework.cloud:spring-cloud-starter")

        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
        implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }

    val bootJar: BootJar by tasks

    bootJar.enabled = true
}
