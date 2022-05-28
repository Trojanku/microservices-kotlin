plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.0-RC"
}

repositories {
    mavenCentral()
    jcenter()
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }
    group = "com.kuba"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        jcenter()
    }

    val implementation by configurations

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.3")
    }

    tasks {
        compileKotlin {
            kotlinOptions.jvmTarget = "15"
        }
        compileTestKotlin {
            kotlinOptions.jvmTarget = "15"
        }
    }
}
