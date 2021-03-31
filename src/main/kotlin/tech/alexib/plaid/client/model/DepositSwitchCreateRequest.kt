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
 * DepositSwitchCreateRequest defines the request schema for `/deposit_switch/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param targetAccessToken Access token for the target Item, typically provided in the Import Item
 * response.
 * @param targetAccountId Plaid Account ID that specifies the target bank account. This account will
 * become the recipient for a user's direct deposit.
 */
@Serializable
data class DepositSwitchCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("target_access_token")
    val targetAccessToken: String,
    @SerialName("target_account_id")
    val targetAccountId: String
)
