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
 * @param accountId The Plaid account ID associated with the account numbers
 * @param account The ACH account number for the account
 * @param routing The ACH routing number for the account
 * @param wireRouting The wire transfer routing number for the account, if available
 */
@Serializable
data class NullableNumbersACH(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("account")
    val account: String,
    @SerialName("routing")
    val routing: String,
    @SerialName("wire_routing")
    val wireRouting: String? = null
)
