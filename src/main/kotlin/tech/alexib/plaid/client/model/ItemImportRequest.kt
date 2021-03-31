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
 * ItemImportRequest defines the request schema for `/item/import`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param products Array of product strings
 * @param userAuth Object of user ID and auth token pair, permitting Plaid to aggregate a user’s
 * accounts
 * @param options An optional object to configure `/item/import` request.
 */
@Serializable
data class ItemImportRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("products")
    val products: List<Products>,
    @SerialName("user_auth")
    val userAuth: ItemImportRequestUserAuth,
    @SerialName("options")
    val options: ItemImportRequestOptions? = null
)
