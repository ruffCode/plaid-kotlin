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
 * Contains details about a student loan account
 * @param accountId The ID of the account that this liability belongs to.
 * @param accountNumber The account number of the loan.
 * @param disbursementDates The dates on which loaned funds were disbursed or will be disbursed.
 * These are often in the past. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
 * @param expectedPayoffDate The date when the student loan is expected to be paid off. Availability
 * for this field is limited. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
 * @param guarantor The guarantor of the student loan.
 * @param interestRatePercentage The interest rate on the loan as a percentage.
 * @param isOverdue `true` if a payment is currently overdue. Availability for this field is
 * limited.
 * @param lastPaymentAmount The amount of the last payment.
 * @param lastPaymentDate The date of the last payment. Dates are returned in an ISO 8601 format
 * (YYYY-MM-DD).
 * @param lastStatementBalance The outstanding balance on the last statement. This field could also
 * be interpreted as the next payment due. Availability for this field is limited.
 * @param lastStatementIssueDate The date of the last statement. Dates are returned in an ISO 8601
 * format (YYYY-MM-DD).
 * @param loanName The type of loan, e.g., "Consolidation Loans".
 * @param loanStatus An object representing the status of the student loan
 * @param minimumPaymentAmount The minimum payment due for the next billing cycle. There are some
 * exceptions:
 * Some institutions require a minimum payment across all loans associated with an account number.
 * Our API presents that same minimum payment amount on each loan. The institutions that do this are:
 * Great Lakes ( `ins_116861`), Firstmark (`ins_116295`), Commonbond Firstmark Services (`ins_116950`),
 * Nelnet (`ins_116528`), EdFinancial Services (`ins_116304`), Granite State (`ins_116308`), and
 * Oklahoma Student Loan Authority (`ins_116945`).
 * Firstmark (`ins_116295` ) will display as $0 if there is an autopay program in effect.
 * @param nextPaymentDueDate The due date for the next payment. The due date is `null` if a payment
 * is not expected. A payment is not expected if `loan_status.type` is `deferment`, `in_school`,
 * `consolidated`, `paid in full`, or `transferred`. Dates are returned in an ISO 8601 format
 * (YYYY-MM-DD).
 * @param originationDate The date on which the loan was initially lent. Dates are returned in an
 * ISO 8601 format (YYYY-MM-DD).
 *
 * @param originationPrincipalAmount The original principal balance of the loan.
 * @param outstandingInterestAmount The total dollar amount of the accrued interest balance. For
 * Sallie Mae ( `ins_116944`), this amount is included in the current balance of the loan, so this
 * field will return as `null`.
 * @param paymentReferenceNumber The relevant account number that should be used to reference this
 * loan for payments. In the majority of cases, `payment_reference_number` will match a`ccount_number,`
 * but in some institutions, such as Great Lakes (`ins_116861`), it will be different.
 * @param pslfStatus Information about the student's eligibility in the Public Service Loan
 * Forgiveness program. This is only returned if the institution is Fedloan (`ins_116527`).
 * @param repaymentPlan An object representing the repayment plan for the student loan
 * @param sequenceNumber The sequence number of the student loan. Heartland ECSI (`ins_116948`) does
 * not make this field available.
 * @param servicerAddress The address of the student loan servicer. This is generally the remittance
 * address to which payments should be sent.
 * @param ytdInterestPaid The year to date (YTD) interest paid. Availability for this field is
 * limited.
 * @param ytdPrincipalPaid The year to date (YTD) principal paid. Availability for this field is
 * limited.
 */
@Serializable
data class StudentLoan(
    @SerialName("account_id")
    val accountId: String? = null,
    @SerialName("account_number")
    val accountNumber: String? = null,
    @SerialName("disbursement_dates")
    val disbursementDates: List<String>? = null,
    @SerialName("expected_payoff_date")
    val expectedPayoffDate: String? = null,
    @SerialName("guarantor")
    val guarantor: String? = null,
    @SerialName("interest_rate_percentage")
    val interestRatePercentage: Double,
    @SerialName("is_overdue")
    val isOverdue: Boolean? = null,
    @SerialName("last_payment_amount")
    val lastPaymentAmount: Double? = null,
    @SerialName("last_payment_date")
    val lastPaymentDate: String? = null,
    @SerialName("last_statement_balance")
    val lastStatementBalance: Double? = null,
    @SerialName("last_statement_issue_date")
    val lastStatementIssueDate: String? = null,
    @SerialName("loan_name")
    val loanName: String? = null,
    @SerialName("loan_status")
    val loanStatus: StudentLoanStatus? = null,
    @SerialName("minimum_payment_amount")
    val minimumPaymentAmount: Double? = null,
    @SerialName("next_payment_due_date")
    val nextPaymentDueDate: String? = null,
    @SerialName("origination_date")
    val originationDate: String? = null,
    @SerialName("origination_principal_amount")
    val originationPrincipalAmount: Double? = null,
    @SerialName("outstanding_interest_amount")
    val outstandingInterestAmount: Double? = null,
    @SerialName("payment_reference_number")
    val paymentReferenceNumber: String? = null,
    @SerialName("pslf_status")
    val pslfStatus: PSLFStatus? = null,
    @SerialName("repayment_plan")
    val repaymentPlan: StudentRepaymentPlan? = null,
    @SerialName("sequence_number")
    val sequenceNumber: String? = null,
    @SerialName("servicer_address")
    val servicerAddress: ServicerAddressData? = null,
    @SerialName("ytd_interest_paid")
    val ytdInterestPaid: Double? = null,
    @SerialName("ytd_principal_paid")
    val ytdPrincipalPaid: Double? = null
)
