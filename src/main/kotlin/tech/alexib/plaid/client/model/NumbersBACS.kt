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
 * Identifying information for transferring money to or from a UK bank account via BACS.
 * @param accountId The Plaid account ID associated with the account numbers
 * @param account The BACS account number for the account
 * @param sortCode The BACS sort code for the account
 */
@Serializable
data class NumbersBACS(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("account")
    val account: String,
    @SerialName("sort_code")
    val sortCode: String
)
