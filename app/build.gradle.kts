plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ostanets.ratchat"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.ostanets.ratchat"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


//    //omega recycler view
//    implementation ("com.github.Omega-R.OmegaRecyclerView:omegarecyclerview:$omegaRecyclerView_version")
//
//    // omega click
//    implementation "com.github.Omega-R:OmegaClicks:$omegaClick_version@aar"
//
//    //omega type
//    implementation "com.github.Omega-R.OmegaTypes:omegatypes:$omegaTypes_version"
//    implementation "com.github.Omega-R.OmegaTypes:glide:$omegaTypes_version"
//
//    //omega intent builder
//    implementation "com.github.Omega-R.OmegaIntentBuilder:core:$omegaIntentBuilder_version"
//    implementation "com.github.Omega-R.OmegaIntentBuilder:annotations:$omegaIntentBuilder_version"
//
//    //omega base
//    implementation "com.github.Omega-R.OmegaBase:core:$omegaBase_version@aar"
//
//    //moxy omega
//    implementation "com.github.Omega-R.OmegaMoxy:moxy:$omegaMoxy_version"
//    kapt "com.github.Omega-R.OmegaMoxy:moxy-compiler:$omegaMoxy_version"
//    implementation "com.github.Omega-R.OmegaMoxy:moxy-androidx:$omegaMoxy_version"
//
//    implementation "com.github.Omega-R:OmegaExtensions:$omegaExtensions_version"
//    implementation ("com.github.bumptech.glide:glide:4.15.0")
//
//    //omega bind
//    implementation "com.github.Omega-R:OmegaBind:$omegaBind_version@aar"
//
//    // omega launcher
//    implementation "com.github.Omega-R.OmegaLaunchers:omegalauncherslib:$omegaLaunchers_version"
//
//    //omega lint
//    implementation "com.github.omega-r:omegalint:$omegaLint_version"
//
//    implementation "com.github.Omega-R:OmegaViews:$omegaViews_version"
//
//    //coroutines
//    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotinCorutines_version"
//
//    implementation "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1"
//
//    // Retrofit & OkHttp
//    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
//    implementation "com.squareup.okhttp3:okhttp:5.0.0-alpha.3"
//    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
//
//    // MOSHI Converter
//    implementation "com.squareup.retrofit2:converter-moshi:2.9.0"
//    implementation 'com.squareup.moshi:moshi-adapters:1.14.0'
//
//    //OmegaAdapters
//    implementation "com.github.Omega-R:OmegaAdapters:$omegaAdapters_version@aar"
//
//    implementation "com.squareup.moshi:moshi-kotlin:$moshi_kotlin_version"
//    kapt "com.squareup.moshi:moshi-kotlin-codegen:$moshi_kotlin_version"
//    implementation "com.squareup.moshi:moshi-adapters:$moshi_kotlin_version"
//    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.21")
//
//    //swipe refresh layout
//    implementation "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
//
//    //TextEditor
//    implementation 'com.github.onecode369:WYSIWYG:4.0'
//    implementation 'com.github.zack-zjc:RichEditText:1.0.2'
//
//    //BlurView
//    implementation 'com.github.Dimezis:BlurView:version-2.0.3'

}