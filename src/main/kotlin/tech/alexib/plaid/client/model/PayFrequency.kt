// NOTE: This file is auto generated. Do not edit the file manually!
//
// The Plaid API
// The Plaid REST API. Please see https://plaid.com/docs/api for more details.
// Version 2020-09-14_1.8.0
//
// Contact
//   Plaid Developer Team
//   URL: https://plaid.com
//

package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param value The frequency of the pay period.
 * @param verificationStatus The verification status. One of the following:
 *
 * `"VERIFIED"`: The information was successfully verified.
 *
 * `"UNVERIFIED"`: The verification has not yet been performed.
 *
 * `"NEEDS_INFO"`: The verification was attempted but could not be completed due to missing
 * information.
 *
 * "`UNABLE_TO_VERIFY`": The verification was performed and the information could not be verified.
 *
 * `"UNKNOWN"`: The verification status is unknown.
 */
@Serializable
data class PayFrequency(
    @SerialName("value")
    val value: Value,
    @SerialName("verification_status")
    val verificationStatus: VerificationStatus
) {
    @Serializable
    enum class Value {
        @SerialName("monthly")
        MONTHLY,

        @SerialName("semimonthly")
        SEMIMONTHLY,

        @SerialName("weekly")
        WEEKLY,

        @SerialName("biweekly")
        BIWEEKLY,

        @SerialName("unknown")
        UNKNOWN,

        @SerialName("null")
        NULL
    }
}
