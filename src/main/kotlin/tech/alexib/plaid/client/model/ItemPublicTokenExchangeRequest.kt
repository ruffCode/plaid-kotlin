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
 * ItemPublicTokenExchangeRequest defines the request schema for `/item/public_token/exchange`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param publicToken Your `public_token`, obtained from the Link `onSuccess` callback or
 * `/sandbox/item/public_token/create`.
 */
@Serializable
data class ItemPublicTokenExchangeRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("public_token")
    val publicToken: String
)
