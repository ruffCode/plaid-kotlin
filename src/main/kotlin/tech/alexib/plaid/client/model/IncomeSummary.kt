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
 * The verified fields from a paystub verification. All fields are provided as reported on the
 * paystub.
 * @param verifiedTransaction Information about the matched direct deposit transaction used to
 * verify a user's payroll information.
 */
@Serializable
data class IncomeSummary(
    @SerialName("employer_name")
    val employerName: EmployerIncomeSummaryFieldString? = null,
    @SerialName("employee_name")
    val employeeName: EmployeeIncomeSummaryFieldString? = null,
    @SerialName("ytd_gross_income")
    val ytdGrossIncome: YTDGrossIncomeSummaryFieldNumber? = null,
    @SerialName("ytd_net_income")
    val ytdNetIncome: YTDNetIncomeSummaryFieldNumber? = null,
    @SerialName("pay_frequency")
    val payFrequency: PayFrequency? = null,
    @SerialName("projected_wage")
    val projectedWage: ProjectedIncomeSummaryFieldNumber? = null,
    @SerialName("verified_transaction")
    val verifiedTransaction: TransactionData? = null
)
