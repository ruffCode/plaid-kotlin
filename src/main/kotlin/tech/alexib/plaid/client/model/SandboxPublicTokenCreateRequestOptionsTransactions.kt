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
 * SandboxPublicTokenCreateRequestOptionsTransactions is an optional set of corresponding to
 * transactions options.
 * @param startDate The earliest date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 * @param endDate The most recent date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 */
@Serializable
data class SandboxPublicTokenCreateRequestOptionsTransactions(
    @SerialName("start_date")
    val startDate: String? = null,
    @SerialName("end_date")
    val endDate: String? = null
)
