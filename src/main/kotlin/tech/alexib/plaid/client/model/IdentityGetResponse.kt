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
 * IdentityGetResponse defines the response schema for `/identity/get`
 * @param accounts The accounts for which Identity data has been requested
 * @param item Metadata about the Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class IdentityGetResponse(
    @SerialName("accounts")
    val accounts: List<AccountIdentity>,
    @SerialName("item")
    val item: Item,
    @SerialName("request_id")
    val requestId: RequestID
)
