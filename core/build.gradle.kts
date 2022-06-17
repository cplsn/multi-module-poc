plugins {
    id("java")
}

dependencies {
    val jupiterVersion: String by project

    testImplementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jupiterVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
