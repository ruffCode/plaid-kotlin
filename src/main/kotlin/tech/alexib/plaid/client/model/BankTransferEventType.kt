package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BankTransferEventType {
    @SerialName("pending")
    PENDING,

    @SerialName("cancelled")
    CANCELLED,

    @SerialName("failed")
    FAILED,

    @SerialName("posted")
    POSTED,

    @SerialName("reversed")
    REVERSED,

    @SerialName("receiver_pending")
    RECEIVER_PENDING,

    @SerialName("receiver_posted")
    RECEIVER_POSTED
}
