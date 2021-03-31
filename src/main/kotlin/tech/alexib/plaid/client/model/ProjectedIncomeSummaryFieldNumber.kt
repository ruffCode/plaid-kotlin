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
 * @param value The value of the field.
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
data class ProjectedIncomeSummaryFieldNumber(
    @SerialName("value")
    val value: Double,
    @SerialName("verification_status")
    val verificationStatus: VerificationStatus
)
