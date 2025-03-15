plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    compileSdkVersion 34

    defaultConfig {
        applicationId "com.example.flutterphotoapp"
        minSdkVersion 21
        targetSdkVersion 34
        versionCode flutterVersionCode.toInteger()
        versionName flutterVersionName
    }

    ndkVersion "27.0.12077973"  // ✅ Add this line clearly

    buildTypes {
        release {
            signingConfig signingConfigs.debug
        }
    }
}


flutter {
    source = "../.."
}
