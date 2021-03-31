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
 * ProcessorAuthGetResponse defines the response schema for `/processor/auth/get`
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 * @param numbers An object containing identifying numbers used for making electronic transfers to
 * and from the `account`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on
 * the country of the account. An account may have more than one number type. If a particular
 * identifying number type is not used by the `account` for which auth data has been requested, a null
 * value will be returned.
 * @param account A single account at a financial institution.
 */
@Serializable
data class ProcessorAuthGetResponse(
    @SerialName("request_id")
    val requestId: RequestID,
    @SerialName("numbers")
    val numbers: ProcessorNumber,
    @SerialName("account")
    val account: Account
)
