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
 * @param grossEarnings Year-to-date gross earnings.
 * @param netEarnings Year-to-date net (take home) earnings.
 */
@Serializable
data class PaystubYTDDetails(
    @SerialName("gross_earnings")
    val grossEarnings: Double,
    @SerialName("net_earnings")
    val netEarnings: Double
)
