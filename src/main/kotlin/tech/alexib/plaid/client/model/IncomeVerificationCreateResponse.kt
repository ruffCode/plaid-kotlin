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
 * IncomeVerificationCreateResponse defines the response schema for `/income/verification/create`.
 * @param incomeVerificationId ID of the verification. This ID is persisted throughout the lifetime
 * of the verification.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class IncomeVerificationCreateResponse(
    @SerialName("income_verification_id")
    val incomeVerificationId: String,
    @SerialName("request_id")
    val requestId: RequestID
)
