buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath(kotlin("gradle-plugin", version = "1.8.20"))
    }
}

plugins {
    id("com.lagradost.cloudstream3.gradle")
}

cloudstream {
    language = "en"
    description = "Toonstream Plugin"
    authors = listOf("Sunil")

    status = 1

    tvTypes = listOf(
        "Anime",
        "Cartoon"
    )

    iconUrl = "https://www.google.com/favicon.ico"
}
