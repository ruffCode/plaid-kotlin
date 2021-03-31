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
 * ItemPublicTokenExchangeResponse defines the response schema for `/item/public_token/exchange`
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param itemId The `item_id` value of the Item associated with the returned `access_token`
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class ItemPublicTokenExchangeResponse(
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("item_id")
    val itemId: String,
    @SerialName("request_id")
    val requestId: RequestID
)
