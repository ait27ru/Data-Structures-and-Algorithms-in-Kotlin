

plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "com.raywenderlich"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    jvmToolchain(21)
}

application {
    mainClassName = "MainKt"
}