import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
    signing
    id("org.jetbrains.kotlin.jvm") version "1.5.0-M2"
    kotlin("plugin.serialization") version "1.5.0-M2"
    id("io.gitlab.arturbosch.detekt") version "1.16.0"
    id("org.jlleitschuh.gradle.ktlint") version "9.4.1"
    id("org.jlleitschuh.gradle.ktlint-idea").version("9.4.1")
    id("org.jetbrains.dokka") version "1.4.30"
    id("com.novoda.static-analysis") version "1.2"
    id("com.diffplug.spotless") version "5.7.0"
    id("io.github.gradle-nexus.publish-plugin") version "1.0.0"
}

group = "tech.alexib"
version = "0.0.1"

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
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

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
        this.jvmTarget = "11"
    }
    test {
        maxParallelForks = Runtime
            .getRuntime()
            .availableProcessors()
        useJUnitPlatform()
    }

    withType<KotlinCompile>() {
        kotlinOptions {
            jvmTarget = "11"
            useIR = true
            freeCompilerArgs = compilerArgs
            apiVersion = "1.5"
            languageVersion = "1.5"
        }
    }
}

afterEvaluate {
    // We install the hook at the first occasion
    tasks["clean"].dependsOn(tasks.getByName("addKtlintFormatGitPreCommitHook"))
}

spotless {
    kotlin {
        target("**/*.kt")
        targetExclude("$buildDir/**/*.kt", "spotless/copyright.kt", "buildSrc")

        licenseHeaderFile {
            rootProject.file("spotless/copyright.kt")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
    withJavadocJar()
    withSourcesJar()
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {

            from(components["java"])
            pom {
                name.set("plaid-kotlin")
                description.set("A Kotlin port of plaid-java")
                url.set("https://github.com/ruffcode/plaid-kotlin")
                artifactId = "plaid-kotlin"
                licenses {
                    license {
                        name.set("Apache 2.0 License")
                        url.set("https://opensource.org/licenses/Apache-2.0")
                    }
                }
                developers {
                    developer {
                        id.set("alexiBre")
                        name.set("Alexi Bre")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/ruffcode/plaid-kotlin.git")
                    developerConnection.set("scm:git:ssh://github.com/ruffcode/plaid-kotlin.git")
                    url.set("https://github.com/ruffcode/plaid-kotlin/tree/master")
                }
            }
        }
    }
}
