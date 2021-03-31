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
 * PaymentInitiationPaymentCreateResponse defines the response schema for
 * `/payment_initiation/payment/create`
 * @param paymentId A unique ID identifying the payment
 * @param status For a payment returned by this endpoint, there is only one possible value:
 *
 * `PAYMENT_STATUS_INPUT_NEEDED`: The initial phase of the payment
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class PaymentInitiationPaymentCreateResponse(
    @SerialName("payment_id")
    val paymentId: String,
    @SerialName("status")
    val status: String,
    @SerialName("request_id")
    val requestId: RequestID
)
