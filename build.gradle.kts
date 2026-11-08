plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.dlock"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dlock"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
}
