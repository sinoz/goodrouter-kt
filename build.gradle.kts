import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

allprojects {
    group = "com.github.sinoz.goodrouter"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_11.toString()
                freeCompilerArgs = listOf(
                    "-Xopt-in=kotlin.ExperimentalStdlibApi", "-XXLanguage:+InlineClasses"
                )
            }
        }

        withType<Test> {
            useJUnitPlatform()
        }

        // Force Gradle to use UTF-8 as character encoding to help Windows
        // systems with compiling strange characters.
        withType<JavaCompile> {
            options.encoding = "UTF-8"
            options.release.set(11)
        }
    }
}
