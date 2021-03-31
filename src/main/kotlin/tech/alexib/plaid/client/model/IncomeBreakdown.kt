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
 * @param type The type of income. Possible values include `"regular"`, `"overtime"`, and `"bonus"`.
 * @param rate The hourly rate at which the income is paid.
 * @param hours The number of hours logged for this income for this pay period.
 * @param total The total pay for this pay period.
 */
@Serializable
data class IncomeBreakdown(
    @SerialName("type")
    val type: String? = null,
    @SerialName("rate")
    val rate: Double? = null,
    @SerialName("hours")
    val hours: Double? = null,
    @SerialName("total")
    val total: Double? = null
)
