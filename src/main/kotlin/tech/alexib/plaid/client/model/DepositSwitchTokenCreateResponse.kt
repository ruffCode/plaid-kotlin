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
 * DepositSwitchTokenCreateResponse defines the response schema for `/deposit_switch/token/create`
 * @param depositSwitchToken Deposit switch token, used to initialize Link for the Deposit Switch
 * product
 * @param depositSwitchTokenExpirationTime Expiration time of the token, in ISO8601 format
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class DepositSwitchTokenCreateResponse(
    @SerialName("deposit_switch_token")
    val depositSwitchToken: String,
    @SerialName("deposit_switch_token_expiration_time")
    val depositSwitchTokenExpirationTime: String,
    @SerialName("request_id")
    val requestId: RequestID
)
