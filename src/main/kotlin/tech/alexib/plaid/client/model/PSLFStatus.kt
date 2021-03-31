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
 * Information about the student's eligibility in the Public Service Loan Forgiveness program. This
 * is only returned if the institution is Fedloan (`ins_116527`).
 * @param estimatedEligibilityDate The estimated date borrower will have completed 120 qualifying
 * monthly payments. Returned in ISO 8601 format (YYYY-MM-DD).
 * @param paymentsMade The number of qualifying payments that have been made.
 * @param paymentsRemaining The number of qualifying payments remaining.
 */
@Serializable
data class PSLFStatus(
    @SerialName("estimated_eligibility_date")
    val estimatedEligibilityDate: String? = null,
    @SerialName("payments_made")
    val paymentsMade: Double? = null,
    @SerialName("payments_remaining")
    val paymentsRemaining: Double? = null
)
