import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}

group = "me.krishna"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("com.github.kittinunf.fuel:fuel:1.4.10")
    implementation("com.github.kittinunf.fuel:fuel-json:1.4.10")
    implementation("io.ktor:ktor-server-core:1.5.4")
    implementation("io.ktor:ktor-server-netty:1.5.4")
    implementation("ch.qos.logback:logback-classic:1.2.3")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}