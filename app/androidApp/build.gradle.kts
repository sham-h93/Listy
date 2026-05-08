plugins {
//    alias(libs.plugins.kotlinAndroid)
//    alias(libs.plugins.androidApplication)
    alias(libs.plugins.listy.android.application)
}

android {
    namespace = "org.hotaku.listy"
//    compileSdk = 36
    defaultConfig {
        applicationId = "org.hotaku.listy"
//        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}
