package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class VerificationStatus {
    @SerialName("VERIFIED")
    VERIFIED,

    @SerialName("UNVERIFIED")
    UNVERIFIED,

    @SerialName("NEEDS_INFO")
    NEEDS_INFO,

    @SerialName("UNABLE_TO_VERIFY")
    UNABLE_TO_VERIFY,

    @SerialName("UNKNOWN")
    UNKNOWN
}
