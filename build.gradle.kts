buildscript {
    val composeVersion by extra("1.4.0-alpha01")
    val lifecycleVersion by extra("2.6.0-alpha03")
    val navigationVersion by extra("2.5.3")
    val roomVersion by extra("2.4.3")
    val accompanistVersion by extra("0.27.0")
    val composeMd3Version by extra("1.1.0-alpha01")
    val coilVersion by extra("2.2.2")
    val youtubedlAndroidVersion by extra("8bc8e77349")
    val okhttpVersion by extra("5.0.0-alpha.10")
    val kotlinVersion by extra("1.7.20")
    val hiltVersion by extra("2.44")

    repositories {
        mavenCentral()
    }
    dependencies {

        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.extra["kotlinVersion"]}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${project.extra["hiltVersion"]}")
    }
}
plugins {
    id("com.android.application") version "7.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

