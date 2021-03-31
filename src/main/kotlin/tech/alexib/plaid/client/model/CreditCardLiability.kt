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
 * An object representing a credit card account.
 * @param accountId The ID of the account that this liability belongs to.
 * @param aprs The various interest rates that apply to the account.
 * @param isOverdue true if a payment is currently overdue. Availability for this field is limited.
 * @param lastPaymentAmount The amount of the last payment.
 * @param lastPaymentDate The date of the last payment. Dates are returned in an ISO 8601 format
 * (YYYY-MM-DD). Availability for this field is limited.
 * @param lastStatementBalance The outstanding balance on the last statement. Availability for this
 * field is limited.
 * @param lastStatementIssueDate The date of the last statement. Dates are returned in an ISO 8601
 * format (YYYY-MM-DD).
 * @param minimumPaymentAmount The minimum payment due for the next billing cycle.
 * @param nextPaymentDueDate The due date for the next payment. The due date is `null` if a payment
 * is not expected. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
 */
@Serializable
data class CreditCardLiability(
    @SerialName("account_id")
    val accountId: String? = null,
    @SerialName("aprs")
    val aprs: List<APR>,
    @SerialName("is_overdue")
    val isOverdue: Boolean? = null,
    @SerialName("last_payment_amount")
    val lastPaymentAmount: Double,
    @SerialName("last_payment_date")
    val lastPaymentDate: String,
    @SerialName("last_statement_balance")
    val lastStatementBalance: Double,
    @SerialName("last_statement_issue_date")
    val lastStatementIssueDate: String,
    @SerialName("minimum_payment_amount")
    val minimumPaymentAmount: Double,
    @SerialName("next_payment_due_date")
    val nextPaymentDueDate: String
)
