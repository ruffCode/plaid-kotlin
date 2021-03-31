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
 * The `account_filters` specified in the original call to `/link/token/create`.
 *
 * @param depository A filter to apply to `depository`-type accounts
 * @param credit A filter to apply to `credit`-type accounts
 * @param loan A filter to apply to `loan`-type accounts
 * @param investment A filter to apply to `investment`-type accounts
 */
@Serializable
data class AccountFiltersResponse(
    @SerialName("depository")
    val depository: DepositoryFilter? = null,
    @SerialName("credit")
    val credit: CreditFilter? = null,
    @SerialName("loan")
    val loan: LoanFilter? = null,
    @SerialName("investment")
    val investment: InvestmentFilter? = null
)
