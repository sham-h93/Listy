plugins {
    alias(libs.plugins.listy.androidApp)
}

android {
    namespace = "org.hotaku.listy"
    defaultConfig {
        applicationId = "org.hotaku.listy"
        versionCode = 1
        versionName = "1.0"
    }

    dependencies {
        implementation(libs.koin.android)
        implementation(libs.koin.compose.androidx)
    }
}

