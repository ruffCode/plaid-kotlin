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
 * AuthGetResponse defines the response schema for `/auth/get`
 * @param accounts The `accounts` for which numbers are being retrieved.
 * @param numbers An object containing identifying numbers used for making electronic transfers to
 * and from the `accounts`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on
 * the country of the account. An account may have more than one number type. If a particular
 * identifying number type is not used by any `accounts` for which data has been requested, the array
 * for that type will be empty.
 * @param item Metadata about the Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AuthGetResponse(
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("numbers")
    val numbers: AuthGetNumbers,
    @SerialName("item")
    val item: Item,
    @SerialName("request_id")
    val requestId: RequestID
)
