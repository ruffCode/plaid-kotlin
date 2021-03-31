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
 * A filter to apply to `depository`-type accounts
 * @param accountSubtypes An array of account subtypes to display in Link. If not specified, all
 * account subtypes will be shown. For a full list of valid types and subtypes, see the [Account
 * schema](/docs/api/accounts#accounts-schema).
 */
@Serializable
data class DepositoryFilter(
    @SerialName("account_subtypes")
    val accountSubtypes: AccountSubtypes
)
