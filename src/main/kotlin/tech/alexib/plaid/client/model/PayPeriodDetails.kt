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
 * Details about the pay period.
 * @param startDate The pay period start date, in ISO 8601 format: "yyyy-mm-dd".
 * @param endDate The pay period end date, in ISO 8601 format: "yyyy-mm-dd".
 * @param payDay The date on which the paystub was issued, in ISO 8601 format ("yyyy-mm-dd").
 * @param grossEarnings Total earnings before tax.
 * @param checkAmount The net amount of the paycheck.
 */
@Serializable
data class PayPeriodDetails(
    @SerialName("start_date")
    val startDate: String? = null,
    @SerialName("end_date")
    val endDate: String? = null,
    @SerialName("pay_day")
    val payDay: String? = null,
    @SerialName("gross_earnings")
    val grossEarnings: Double? = null,
    @SerialName("check_amount")
    val checkAmount: Double? = null
)
