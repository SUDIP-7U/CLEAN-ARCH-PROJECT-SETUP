 id("com.google.devtools.ksp")

 id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false

// Retrofit & Gson
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")


     //DAGGER -HILT
    implementation("com.google.dagger:hilt-android:2.57.2")

    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.3.0")

    // (Optional) For Navigation
    implementation("androidx.hilt:hilt-navigation-fragment:1.2.0")

    ksp("com.google.dagger:hilt-compiler:2.51.1")
