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
 * PaymentInitiationPaymentTokenCreateRequest defines the request schema for
 * `/payment_initiation/payment/token/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param paymentId The `payment_id` returned from `/payment_initiation/payment/create`.
 */
@Serializable
data class PaymentInitiationPaymentTokenCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("payment_id")
    val paymentId: String
)
