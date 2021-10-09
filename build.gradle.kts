import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.5.31"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
    id("io.gitlab.arturbosch.detekt") version "1.18.1"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
    id("org.jlleitschuh.gradle.ktlint-idea").version("10.2.0")
    id("org.jetbrains.dokka") version "1.4.30"
    id("com.diffplug.spotless") version "5.15.0"
    // id("com.vanniktech.maven.publish") version "0.13.0"
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    signing
    `maven-publish`
    `java-library`
}

group = "tech.alexib"

repositories {
    mavenCentral()
    // jcenter {
    //     content {
    //         // Only download the 'kotlinx-html-jvm' module from JCenter, but nothing else.
    //         // detekt needs 'kotlinx-html-jvm' for the HTML report.
    //         includeModule("org.jetbrains.kotlinx", "kotlinx-html-jvm")
    //     }
    // }
}

dependencies {
    compileOnly(Dependencies.KotlinX.serializationJson)
    compileOnly(Dependencies.KotlinX.datetime)
    implementation(Dependencies.KotlinX.coroutinesCore)
    implementation(Dependencies.Ktor.clientCore)
    implementation(Dependencies.Ktor.serialization)
    implementation(Dependencies.Ktor.clientApache)
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.18.1")
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("app.cash.turbine:turbine:0.6.1")
}

ktlint {
    debug.set(true)
    version.set("0.42.1")
    verbose.set(true)
    android.set(false)
    outputToConsole.set(true)
    outputColorName.set("BLUE")
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

    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = freeCompilerArgs + listOf(
                "-Xjsr305=strict",
                "-Xopt-in=kotlin.Experimental",
                "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                "-Xjvm-default=enable",
                "-Xopt-in=kotlin.time.ExperimentalTime",
                "-Xopt-in=io.ktor.utils.io.core.ExperimentalIoApi"
            )
        }
    }
}

afterEvaluate {

    tasks["clean"].dependsOn(tasks.getByName("addKtlintFormatGitPreCommitHook"))

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                defaultPom()
            }
        }
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(8))
        }
        withJavadocJar()
        withSourcesJar()
    }

    signing {
        sign(publishing.publications["mavenJava"])

        val signingKeyId = getProperty("signing.keyId")
        val signingKey = getProperty("signing.key")
        val signingPassword = getProperty("signing.password")
        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
    }
}
spotless {
    isEnforceCheck = false
    kotlin {
        target("src/**/*.kt")
        targetExclude("$buildDir/**/*.kt")
        targetExclude("spotless/copyright.kt")
        targetExclude("**/generated/**")
        targetExclude("buildSrc/buildSrc/**/*.kt")

        licenseHeaderFile {
            rootProject.file("spotless/copyright.kt")
        }
        trimTrailingWhitespace()
        endWithNewline()
    }
}

nexusPublishing.repositories.sonatype {
    nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
    snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
}
