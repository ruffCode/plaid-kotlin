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
 * The amount and currency of a payment
 * @param currency The ISO-4217 currency code of the payment amount
 * @param value The payment amount
 */
@Serializable
data class PaymentAmount(
    @SerialName("currency")
    val currency: String,
    @SerialName("value")
    val value: Double
)
