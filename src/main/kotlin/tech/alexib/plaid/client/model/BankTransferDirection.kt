package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BankTransferDirection {
    @SerialName("outbound")
    OUTBOUND,

    @SerialName("inbound")
    INBOUND
}
