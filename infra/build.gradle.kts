plugins {
    id("java")

    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    val jupiterVersion: String by project
    val h2Version: String by project

    implementation(project(":core"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jupiterVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
