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
 * Specifies options for initializing Link for use with the Payment Initiation (Europe) product.
 * This field is required if `payment_initiation` is included in the `products` array.
 * @param paymentId The `payment_id` provided by the `/payment_initiation/payment/create` endpoint.
 */
@Serializable
data class LinkTokenCreateRequestPaymentInitiation(
    @SerialName("payment_id")
    val paymentId: String
)
