plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

dependencies {
    implementation(project(":clients"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql:42.3.3")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.projectlombok:lombok:1.18.24")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.1.51")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
}
