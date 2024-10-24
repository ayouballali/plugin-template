plugins {
    idea
    id("java")
//    id("org.jetbrains.intellij.platform") version "2.1.0"
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
    id("org.jetbrains.intellij") version "1.17.4"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
intellij {
    version.set("2022.2.5")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf(/* Plugin Dependencies */))
}
tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
}
//intellij {
//    pluginName.set(properties("pluginName"))
//    version.set(properties("platformVersion"))
//    type.set(properties("platformType"))
//    //downloadSources.set(!isCI)
//    updateSinceUntilBuild.set(false)
//    //instrumentCode.set(false)
//    //ideaDependencyCachePath.set(dependencyCachePath)
//    // Plugin Dependencies. Uses `platformPlugins` property from the gradle.properties file.
//    plugins.set(properties("platformPlugins").split(',').map(String::trim).filter(String::isNotEmpty))
//    //sandboxDir.set("$buildDir/$baseIDE-sandbox-$platformVersion")
//}

tasks.test {
    useJUnitPlatform()
}