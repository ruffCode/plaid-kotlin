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
 * AccountsBalanceGetRequest defines the request schema for `/accounts/balance/get`
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param secret Your Plaid API `secret`.
 * @param clientId Your Plaid API `client_id`.
 * @param options An optional object to filter `/accounts/balance/get` results.
 */
@Serializable
data class AccountsBalanceGetRequest(
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("options")
    val options: AccountsBalanceGetRequestOptions? = null
)
