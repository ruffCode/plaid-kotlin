package tech.alexib.plaid.client

import tech.alexib.plaid.client.infrastructure.PlaidApiConfiguration
import tech.alexib.plaid.client.model.PlaidError
import io.ktor.client.HttpClient
import io.ktor.client.call.receive
import io.ktor.client.features.ClientRequestException
import io.ktor.client.features.HttpResponseValidator
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.defaultSerializer
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.request.request
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.encodeURLQueryComponent
import io.ktor.http.takeFrom
import kotlinx.serialization.json.Json
import tech.alexib.plaid.client.infrastructure.RequestConfig
import tech.alexib.plaid.client.infrastructure.RequestMethod

internal class ApiClient(val plaidApiConfiguration: PlaidApiConfiguration) {

    private val json = Json {
        isLenient = false
        ignoreUnknownKeys = true
        allowSpecialFloatingPointValues = true
        useArrayPolymorphism = false
    }
    private val kotlinxSerializer = KotlinxSerializer(json)

    val client: HttpClient by lazy {

        HttpClient {
            expectSuccess = true
            install(JsonFeature) {
                serializer = kotlinxSerializer
            }
            HttpResponseValidator {

                handleResponseException { cause: Throwable ->
                    when (cause) {
                        is ClientRequestException -> throw cause.response.receive<PlaidError>()
                        else -> throw cause
                    }
                }
            }
        }
    }
    val authentications: Map<String, String> by lazy {
        mapOf(
            "PLAID-CLIENT-ID" to plaidApiConfiguration.clientId.value,
            "Plaid-Version" to plaidApiConfiguration.plaidVersion.value,
            "PLAID-SECRET" to plaidApiConfiguration.secret.value
        )
    }

    companion object {
        val UNSAFE_HEADERS = listOf(HttpHeaders.ContentType)
    }

    fun URLBuilder.appendPath(components: List<String>): URLBuilder = apply {
        encodedPath =
            encodedPath.trimEnd('/') + components.joinToString("/", prefix = "/") { it.encodeURLQueryComponent() }
    }

    val RequestMethod.httpMethod: HttpMethod
        get() = when (this) {
            RequestMethod.DELETE -> HttpMethod.Delete
            RequestMethod.GET -> HttpMethod.Get
            RequestMethod.HEAD -> HttpMethod.Head
            RequestMethod.PATCH -> HttpMethod.Patch
            RequestMethod.PUT -> HttpMethod.Put
            RequestMethod.POST -> HttpMethod.Post
            RequestMethod.OPTIONS -> HttpMethod.Options
        }

    suspend inline fun <reified T> request(requestConfig: RequestConfig, body: Any?): T {
        val response = client.request<HttpResponse> {
            this.method = requestConfig.method.httpMethod

            url {
                takeFrom(URLBuilder(plaidApiConfiguration.baseUrl.url))
                appendPath(requestConfig.path.trimStart('/').split('/'))
                requestConfig.query.forEach { query ->
                    query.value.forEach { value ->
                        parameter(query.key, value)
                    }
                }
            }
            requestConfig.headers.filter { header -> !UNSAFE_HEADERS.contains(header.key) }
                .forEach { header -> this.header(header.key, header.value) }

            authentications.forEach { (name, value) -> this.header(name, value) }
            if (requestConfig.method in listOf(
                    RequestMethod.PUT,
                    RequestMethod.POST,
                    RequestMethod.PATCH
                )
            ) {
                if (body != null) {
                    this.body = defaultSerializer().write(body)
                }
            }
        }

        return response.receive()
    }
}
