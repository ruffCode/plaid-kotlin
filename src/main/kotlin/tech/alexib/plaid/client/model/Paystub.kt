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
 * An object representing data extracted from the end user's paystub.
 * @param paystubId The unique identifier for this paystub.
 * @param accountId The account identifier for the account associated with this paystub.
 * @param employer Data about the employer.
 * @param employee Data about the employee.
 * @param payPeriodDetails Details about the pay period.
 */
@Serializable
data class Paystub(
    @SerialName("paystub_id")
    val paystubId: String,
    @SerialName("account_id")
    val accountId: String? = null,
    @SerialName("employer")
    val employer: Employer,
    @SerialName("employee")
    val employee: Employee,
    @SerialName("pay_period_details")
    val payPeriodDetails: PayPeriodDetails,
    @SerialName("income_breakdown")
    val incomeBreakdown: IncomeBreakdown,
    @SerialName("ytd_earnings")
    val ytdEarnings: PaystubYTDDetails
)
