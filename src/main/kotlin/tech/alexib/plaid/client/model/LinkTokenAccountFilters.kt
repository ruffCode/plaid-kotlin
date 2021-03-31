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
 * By default, Link will only display account types that are compatible with all products supplied
 * in the `products` parameter of `/link/token/create`. You can further limit the accounts shown in
 * Link by using `account_filters` to specify the account subtypes to be shown in Link. Only the
 * specified subtypes will be shown. This filtering applies to both the Account Select view (if
 * enabled) and the Institution Select view. Institutions that do not support the selected subtypes
 * will be omitted from Link. To indicate that all subtypes should be shown, use the value `"all"`. If
 * the `account_filters` filter is used, any account type for which a filter is not specified will be
 * entirely omitted from Link. For a full list of valid types and subtypes, see the [Account
 * schema](/docs/api/accounts#accounts-schema).
 *
 * For institutions using OAuth, the filter will not affect the list of institutions or accounts
 * shown by the bank in the OAuth window.
 *
 * @param depository A filter to apply to `depository`-type accounts
 * @param credit A filter to apply to `credit`-type accounts
 * @param loan A filter to apply to `loan`-type accounts
 * @param investment A filter to apply to `investment`-type accounts
 */
@Serializable
data class LinkTokenAccountFilters(
    @SerialName("depository")
    val depository: DepositoryFilter? = null,
    @SerialName("credit")
    val credit: CreditFilter? = null,
    @SerialName("loan")
    val loan: LoanFilter? = null,
    @SerialName("investment")
    val investment: InvestmentFilter? = null
)
