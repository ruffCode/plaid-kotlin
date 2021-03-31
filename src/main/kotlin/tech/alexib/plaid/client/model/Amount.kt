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
 * A payment amount.
 * @param currency The ISO-4217 currency code of the payment. For standing orders, `"GBP"` must be
 * used.
 * @param value The amount of the payment. Must contain at most two digits of precision e.g. `1.23`.
 * Minimum accepted value is `1`.
 */
@Serializable
data class Amount(
    @SerialName("currency")
    val currency: Currency,
    @SerialName("value")
    val value: Double
)

@Serializable
enum class Currency {
    @SerialName("GBP")
    GBP,

    @SerialName("EUR")
    EUR
}
