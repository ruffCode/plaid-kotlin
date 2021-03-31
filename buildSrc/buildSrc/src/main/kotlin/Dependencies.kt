@file:JvmName("Deps")

object Dependencies {
    object Kotlin {
        private const val version = "1.5.0-M2"
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

        val coroutinesCore = item("coroutines-core", "1.4.3")
        val serializationJson = item("serialization-json", "1.1.0-RC")
        val datetime = item("datetime", "0.1.1")
    }


    object Ktor {
        private const val version = "1.5.2"
        private fun item(library: String) = "io.ktor:ktor-$library:$version"
        val clientCore = item("client-core")
        val clientApache = item("client-apache")
        val serialization = item("client-serialization-jvm")

        val http = item("http")
        val io = item("io")
    }



    const val detektVersion = "1.14.2"
    const val nexusPublishPluginVersion = "1.0.0"
    const val dokkaVersion = "1.4.30"
}



val compilerArgs = listOf(
    "-Xjsr305=strict", "-Xuse-experimental=kotlin.Experimental",
    "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi",
    "-Xinline-classes",
    "-Xjvm-default=enable",
    "-Xuse-experimental=kotlin.time.ExperimentalTime"
)
