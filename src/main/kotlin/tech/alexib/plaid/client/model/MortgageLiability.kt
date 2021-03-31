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
 * Contains details about a mortgage account.
 * @param accountId The ID of the account that this liability belongs to.
 * @param accountNumber The account number of the loan.
 * @param currentLateFee The current outstanding amount charged for late payment.
 * @param escrowBalance Total amount held in escrow to pay taxes and insurance on behalf of the
 * borrower.
 * @param hasPmi Indicates whether the borrower has private mortgage insurance in effect.
 * @param hasPrepaymentPenalty Indicates whether the borrower will pay a penalty for early payoff of
 * mortgage.
 * @param interestRate Object containing metadata about the interest rate for the mortgage.
 * @param lastPaymentAmount The amount of the last payment.
 * @param lastPaymentDate The date of the last payment. Dates are returned in an ISO 8601 format
 * (YYYY-MM-DD).
 * @param loanTypeDescription Description of the type of loan, for example `conventional`, `fixed`,
 * or `variable`. This field is provided directly from the loan servicer and does not have an
 * enumerated set of possible values.
 * @param loanTerm Full duration of mortgage as at origination (e.g. `10 year`).
 * @param maturityDate Original date on which mortgage is due in full. Dates are returned in an ISO
 * 8601 format (YYYY-MM-DD).
 * @param nextMonthlyPayment The amount of the next payment.
 * @param nextPaymentDueDate The due date for the next payment. Dates are returned in an ISO 8601
 * format (YYYY-MM-DD).
 * @param originationDate The date on which the loan was initially lent. Dates are returned in an
 * ISO 8601 format (YYYY-MM-DD).
 * @param originationPrincipalAmount The original principal balance of the mortgage.
 * @param pastDueAmount Amount of loan (principal + interest) past due for payment.
 * @param propertyAddress Object containing fields describing property address.
 * @param ytdInterestPaid The year to date (YTD) interest paid.
 * @param ytdPrincipalPaid The YTD principal paid.
 */
@Serializable
data class MortgageLiability(
    @SerialName("account_id")
    val accountId: String? = null,
    @SerialName("account_number")
    val accountNumber: String,
    @SerialName("current_late_fee")
    val currentLateFee: Double? = null,
    @SerialName("escrow_balance")
    val escrowBalance: Double? = null,
    @SerialName("has_pmi")
    val hasPmi: Boolean? = null,
    @SerialName("has_prepayment_penalty")
    val hasPrepaymentPenalty: Boolean? = null,
    @SerialName("interest_rate")
    val interestRate: MortgageInterestRate? = null,
    @SerialName("last_payment_amount")
    val lastPaymentAmount: Double? = null,
    @SerialName("last_payment_date")
    val lastPaymentDate: String? = null,
    @SerialName("loan_type_description")
    val loanTypeDescription: String? = null,
    @SerialName("loan_term")
    val loanTerm: String? = null,
    @SerialName("maturity_date")
    val maturityDate: String? = null,
    @SerialName("next_monthly_payment")
    val nextMonthlyPayment: Double? = null,
    @SerialName("next_payment_due_date")
    val nextPaymentDueDate: String? = null,
    @SerialName("origination_date")
    val originationDate: String? = null,
    @SerialName("origination_principal_amount")
    val originationPrincipalAmount: Double? = null,
    @SerialName("past_due_amount")
    val pastDueAmount: Double? = null,
    @SerialName("property_address")
    val propertyAddress: MortgagePropertyAddress? = null,
    @SerialName("ytd_interest_paid")
    val ytdInterestPaid: Double? = null,
    @SerialName("ytd_principal_paid")
    val ytdPrincipalPaid: Double? = null
)
