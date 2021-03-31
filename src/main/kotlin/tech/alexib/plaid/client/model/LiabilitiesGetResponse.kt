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
 * LiabilitiesGetResponse defines the response schema for `/liabilities/get`
 * @param accounts An array of accounts associated with the Item
 * @param item Metadata about the Item.
 * @param liabilities An object containing liability accounts
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class LiabilitiesGetResponse(
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("item")
    val item: Item,
    @SerialName("liabilities")
    val liabilities: LiabilitiesObject,
    @SerialName("request_id")
    val requestId: RequestID
)
