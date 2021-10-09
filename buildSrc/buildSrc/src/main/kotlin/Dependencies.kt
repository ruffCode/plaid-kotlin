
object Dependencies {
    object Kotlin {
        private const val version = "1.5.31"
        private fun item(library: String) = "org.jetbrains.kotlin:kotlin-$library:$version"

        val stdlib = item("stdlib")
        val gradlePlugin = item("gradle-plugin")

        object Test {
            private fun testItem(library: String) = item("test-$library")

            val junit = testItem("junit")
        }
    }

    object KotlinX {
        private fun item(module: String, version: String) = "org.jetbrains.kotlinx:kotlinx-${module}:${version}"

        val coroutinesCore = item("coroutines-core", "1.5.2")
        val serializationJson = item("serialization-json", "1.3.0")
        val datetime = item("datetime", "0.3.0")
    }


    object Ktor {
        private const val version = "1.6.4"
        private fun item(library: String) = "io.ktor:ktor-$library:$version"
        val clientCore = item("client-core")
        val clientApache = item("client-apache")
        val serialization = item("client-serialization-jvm")

        val http = item("http")
        val io = item("io")
    }



    const val detektVersion = "1.18.1"
    const val nexusPublishPluginVersion = "1.1.0"
    const val dokkaVersion = "1.4.30"
}




