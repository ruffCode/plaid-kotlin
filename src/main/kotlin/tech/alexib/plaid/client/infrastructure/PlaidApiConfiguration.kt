package tech.alexib.plaid.client.infrastructure

data class PlaidApiConfiguration(
    val clientId: ClientId,
    val secret: Secret,
    val baseUrl: BaseUrl = BaseUrl.Sandbox,
    val plaidVersion: PlaidVersion = PlaidVersion()
)

@JvmInline
value class ClientId(val value: String)

@JvmInline
value class Secret(val value: String)

@Suppress("MagicNumber")
@JvmInline
value class PlaidVersion(val value: String = "2020-09-14")
