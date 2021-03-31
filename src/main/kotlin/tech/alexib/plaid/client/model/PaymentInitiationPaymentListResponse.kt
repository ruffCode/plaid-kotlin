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
 * PaymentInitiationPaymentListResponse defines the response schema for
 * `/payment_initiation/payment/list`
 * @param payments An array of payments that have been created, associated with the given
 * `client_id`.
 * @param nextCursor The value that, when used as the optional `cursor` parameter to
 * `/payment_initiation/payment/list`, will return the next unreturned payment as its first payment.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class PaymentInitiationPaymentListResponse(
    @SerialName("payments")
    val payments: List<PaymentInitiationPaymentGetResponse>,
    @SerialName("next_cursor")
    val nextCursor: String,
    @SerialName("request_id")
    val requestId: RequestID
)
