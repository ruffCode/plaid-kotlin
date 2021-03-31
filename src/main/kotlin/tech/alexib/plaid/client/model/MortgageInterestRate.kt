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
 * Object containing metadata about the interest rate for the mortgage.
 * @param percentage Percentage value (interest rate of current mortgage, not APR) of interest
 * payable on a loan.
 * @param type The type of interest charged (fixed or variable).
 */
@Serializable
data class MortgageInterestRate(
    @SerialName("percentage")
    val percentage: Double? = null,
    @SerialName("type")
    val type: String? = null
)
