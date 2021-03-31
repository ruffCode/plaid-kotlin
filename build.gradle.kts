import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {

    id("org.jetbrains.kotlin.jvm") version "1.5.0-M2"
    kotlin("plugin.serialization") version "1.5.0-M2"
    id("io.gitlab.arturbosch.detekt") version "1.16.0"
    id("org.jlleitschuh.gradle.ktlint") version "9.4.1"
    id("org.jlleitschuh.gradle.ktlint-idea").version("9.4.1")
    id("org.jetbrains.dokka") version "1.4.30"
    id("com.novoda.static-analysis") version "1.2"
    id("com.diffplug.spotless") version "5.7.0"
    // id("io.github.gradle-nexus.publish-plugin") version "1.0.0"
    id("com.vanniktech.maven.publish") version "0.13.0"
    // id("com.github.ben-manes.versions")
    signing
    // `maven-publish`
}

group = "tech.alexib"
version = "0.0.2"

repositories {
    mavenCentral()
    jcenter {
        content {
            // Only download the 'kotlinx-html-jvm' module from JCenter, but nothing else.
            // detekt needs 'kotlinx-html-jvm' for the HTML report.
            includeModule("org.jetbrains.kotlinx", "kotlinx-html-jvm")
        }
    }
}

dependencies {
    compileOnly(Dependencies.KotlinX.serializationJson)
    compileOnly(Dependencies.KotlinX.datetime)
    implementation(Dependencies.KotlinX.coroutinesCore)
    implementation(Dependencies.Ktor.clientCore)
    implementation(Dependencies.Ktor.serialization)
    implementation(Dependencies.Ktor.clientApache)
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.15.0")
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

// nexusPublishing.repositories.sonatype {
//     nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
//     snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
//     // stagingProfileId.set(findProperty("SONATYPE_STAGING_PROFILE_ID") as String?)
//     username.set(getProperty("ossrhUsername"))
//     password.set(getProperty("ossrhPassword"))
// }
ktlint {
    debug.set(true)
    version.set("0.40.0")
    verbose.set(true)
    android.set(false)
    outputToConsole.set(true)
    ignoreFailures.set(true)
    enableExperimentalRules.set(true)
    filter {
        exclude("**/generated/**")
        include("**/kotlin/**")
    }

    reporters {
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.PLAIN)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
    }
    additionalEditorconfigFile.set(file("${project.projectDir}/.editorConfig"))
}

detekt {
    config = rootProject.files("config/detekt/detekt.yml")
    reports {
        html {
            enabled = true
            destination = file("build/reports/detekt.html")
        }
        autoCorrect = true
        parallel = true
    }
}

tasks {
    withType<io.gitlab.arturbosch.detekt.Detekt> {
        // Target version of the generated JVM bytecode. It is used for type resolution.
        this.jvmTarget = "1.8"
    }
    test {
        maxParallelForks = Runtime
            .getRuntime()
            .availableProcessors()
        useJUnitPlatform()
    }

    withType<KotlinCompile>() {
        kotlinOptions {
            jvmTarget = "1.8"
            useIR = true
            freeCompilerArgs = compilerArgs
            apiVersion = "1.5"
            languageVersion = "1.5"
        }
    }
}

afterEvaluate {

    tasks["clean"].dependsOn(tasks.getByName("addKtlintFormatGitPreCommitHook"))
}
spotless {
    isEnforceCheck = false
    kotlin {
        target("src/**/*.kt")
        targetExclude("$buildDir/**/*.kt")
        targetExclude("spotless/copyright.kt")
        targetExclude("buildSrc/buildSrc/**/*.kt")

        licenseHeaderFile {
            rootProject.file("spotless/copyright.kt")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
    // withJavadocJar()
    // withSourcesJar()
}
