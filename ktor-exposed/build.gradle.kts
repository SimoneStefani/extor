dependencies {
    api("org.postgresql:postgresql:42.3.1")
    api("org.jetbrains.exposed:exposed-core:0.37.3")
    api("org.jetbrains.exposed:exposed-dao:0.37.3")
    api("org.jetbrains.exposed:exposed-jdbc:0.37.3")
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    api(project(":ktor-sql"))
}
