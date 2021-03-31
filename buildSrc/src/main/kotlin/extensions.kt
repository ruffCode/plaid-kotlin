import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication

fun Project.getProperty(name: String): String? {
    val environmentName = name.toUpperCase().replace(".", "_")
    val value = findProperty(name)?.toString() ?: System.getenv(environmentName) ?: null
    logger.info("getProperty($name): $environmentName - found=${!value.isNullOrBlank()}")
    return value
}

fun MavenPublication.defaultPom() = pom {
    name.set("${groupId}:${artifactId}")
    description.set("Plaid Kotlin Bindings")
    url.set("https://github.com/ruffcode/plaid-kotlin")

    scm {
        connection.set("scm:git:git://github.com/ruffcode/plaid-kotlin.git")
        developerConnection.set("scm:git:ssh://github.com/ruffcode/plaid-kotlin.git")
        url.set("https://github.com/ruffcode/plaid-kotlin/tree/master")
    }

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
            url.set("https://github.com/ruffcode")

        }
    }
}

