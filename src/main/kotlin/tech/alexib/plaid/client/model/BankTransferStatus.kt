package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BankTransferStatus {
    @SerialName("pending")
    PENDING,

    @SerialName("posted")
    POSTED,

    @SerialName("cancelled")
    CANCELLED,

    @SerialName("failed")
    FAILED,

    @SerialName("reversed")
    REVERSED
}
