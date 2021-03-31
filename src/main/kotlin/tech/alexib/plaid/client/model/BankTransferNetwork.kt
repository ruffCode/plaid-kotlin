package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BankTransferNetwork {
    @SerialName("ach")
    ACH,

    @SerialName("same-day-ach")
    SAME_DAY_ACH,

    @SerialName("wire")
    WIRE
}
