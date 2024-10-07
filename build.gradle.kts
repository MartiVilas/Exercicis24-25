plugins {
    kotlin("jvm") version "1.9.10"
    application
    id("org.jetbrains.dokka") version "1.9.10"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.dokkaHtml.configure {
    outputDirectory.set(project.layout.buildDirectory.dir("dokka"))
}

dependencies {
    testImplementation(kotlin("test"))
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.9.10")
}

tasks.test {
    useJUnitPlatform()
}