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
 * ProcessorTokenCreateRequest defines the request schema for `/processor/token/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param accountId The `account_id` value obtained from the `onSuccess` callback in Link
 * @param processor The processor you are integrating with. Valid values are `"achq"`, `"check"`,
 * `"checkbook"`, `"circle"`, `"drivewealth"`, `"dwolla"`, `"galileo"`, "`interactive_brokers`",
 * `"modern_treasury"`, `"ocrolus"`, `"prime_trust"`, `"rize"`, `"sila_money"`, `"unit"`, `"velox"`,
 * `"vesta"`, `"vopay"`, `"wyre"`
 */
@Serializable
data class ProcessorTokenCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("processor")
    val processor: String
)
