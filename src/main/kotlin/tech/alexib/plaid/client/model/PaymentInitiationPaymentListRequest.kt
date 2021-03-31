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
 * PaymentInitiationPaymentListRequest defines the request schema for
 * `/payment_initiation/payment/list`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param count The maximum number of payments to return. If `count` is not specified, a maximum of
 * 10 payments will be returned, beginning with the most recent payment before the cursor (if
 * specified).
 * @param cursor A string in RFC 3339 format (i.e. "2019-12-06T22:35:49Z"). Only payments created
 * before the cursor will be returned.
 */
@Serializable
data class PaymentInitiationPaymentListRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("cursor")
    val cursor: String? = null
)
