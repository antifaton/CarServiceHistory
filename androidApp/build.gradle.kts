plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    val lifecycle_version = "2.2.0"
    val compose_version = "1.0.4"
    implementation(project(":shared"))

    implementation("androidx.activity:activity-compose:1.3.1")

    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.ui:ui-tooling:$compose_version")
    implementation("androidx.compose.foundation:foundation:$compose_version")
    implementation("androidx.compose.material:material:$compose_version")
    implementation("androidx.compose.animation:animation:$compose_version")
    implementation("androidx.compose.material:material-icons-core:$compose_version")
    implementation("androidx.compose.material:material-icons-extended:$compose_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-rc01")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.carservice.history.android"
        minSdkVersion(21)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.4"
    }
    packagingOptions {
        resources {
            exclude("META-INF/{AL2.0,LGPL2.1}")
        }
    }
}