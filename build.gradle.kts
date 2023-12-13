// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
//    ext {
//        val kotlin_version = "1.9.0"
//
//        val kotinCorutines_version = "1.6.1"
//        val omegaBase_version = "8bc4dc54f0"
//        val omegaTypes_version = "449ca5d88d"
//        val omegaViews_version = "1.1.1"
//        val omegaBind_version = "9d145297ee"
//        val omegaLaunchers_version = "6b9213c264"
//        val omegaRecyclerView_version = "f04e3803d1"
//        val omegaLint_version = "0.2.3"
//        val omegaExtensions_version = "1.0.5"
//        val omegaAdapters_version = "28ef4d343f"
//        val omegaClick_version = "1.0.0"
//        val omegaLayouts_version = "0.0.2"
//        val omegaIntentBuilder_version = "8c26278f0c"
//        val appCenterSdk_version = "4.4.5"
//        val moshi_kotlin_version = "1.14.0"
//        val omegaMoxy_version = "ac9b694b"
//        val room_version = "2.4.3"
//        val downloader_version = "3.0.1"
//
//    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.4.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
        classpath ("com.google.gms:google-services:4.4.0")
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.9.0" apply false
    id("com.android.library") version "8.1.2" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
}