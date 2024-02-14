

plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "com.raywenderlich"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}