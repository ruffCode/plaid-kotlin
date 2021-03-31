package tech.alexib.plaid.client.infrastructure

enum class BaseUrl(val url: String) {
    Production("https://production.plaid.com"),
    Development("https://development.plaid.com"),
    Sandbox("https://sandbox.plaid.com")
}
