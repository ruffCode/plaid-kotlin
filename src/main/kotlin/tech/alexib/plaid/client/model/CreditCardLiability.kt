/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
