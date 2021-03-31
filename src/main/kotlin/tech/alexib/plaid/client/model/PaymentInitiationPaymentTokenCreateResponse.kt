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
 * PaymentInitiationPaymentTokenCreateResponse defines the response schema for
 * `/payment_initiation/payment/token/create`
 * @param paymentToken A `payment_token` that can be provided to Link initialization to enter the
 * payment initiation flow
 * @param paymentTokenExpirationTime The date and time at which the token will expire, in ISO 8601
 * format. A `payment_token` expires after 15 minutes.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class PaymentInitiationPaymentTokenCreateResponse(
    @SerialName("payment_token")
    val paymentToken: String,
    @SerialName("payment_token_expiration_time")
    val paymentTokenExpirationTime: String,
    @SerialName("request_id")
    val requestId: RequestID
)
