import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            api("org.jetbrains.kotlinx:kotlinx-serialization-core:1.3.0")

            api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

            implementation("io.ktor:ktor-client-core:2.1.0")
            implementation("io.ktor:ktor-client-json:2.1.0")
            implementation("io.ktor:ktor-client-serialization:2.1.0")
            implementation("io.ktor:ktor-client-content-negotiation:2.1.0")
            implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.0")
            implementation("io.ktor:ktor-client-logging:2.1.0")

            implementation("com.russhwolf:multiplatform-settings:1.0.0-RC")
            implementation( "com.russhwolf:multiplatform-settings-no-arg:1.0.0-RC")

            api(libs.kodein.di)
        }
        androidMain {
            dependencies {
                implementation("io.ktor:ktor-client-android:2.1.0")
            }
        }

        iosMain {
            dependencies {
                implementation("io.ktor:ktor-client-ios:2.1.0")
            }
        }

    }
}

android {
    namespace = "dev.lkeeeey.receipe.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
