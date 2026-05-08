import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "org.hotaku.listy.plugins"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
    }
}

dependencies {
    compileOnly(libs.plugins.kotlinMultiplatform.asDependency())
    compileOnly(libs.plugins.kotlinAndroid.asDependency())
    compileOnly(libs.plugins.androidApplication.asDependency())
    compileOnly(libs.plugins.androidLibrary.asDependency())
    compileOnly(libs.plugins.composeCompiler.asDependency())
    compileOnly(libs.plugins.composeMultiplatform.asDependency())
    compileOnly(libs.plugins.jetbrains.kotlin.serialization.asDependency())
    compileOnly(libs.plugins.room.asDependency())
    compileOnly(libs.plugins.ksp.asDependency())
}

gradlePlugin {
    plugins {
        register("aandroidApp") {
            id = "listy.aandroid.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}

private fun Provider<PluginDependency>.asDependency() = map {
    "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}"
}