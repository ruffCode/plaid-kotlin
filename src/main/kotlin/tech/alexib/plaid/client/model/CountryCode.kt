package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class CountryCode {
    @SerialName("US")
    US,

    @SerialName("GB")
    GB,

    @SerialName("ES")
    ES,

    @SerialName("NL")
    NL,

    @SerialName("FR")
    FR,

    @SerialName("IE")
    IE,

    @SerialName("CA")
    CA
}
