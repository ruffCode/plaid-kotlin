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
 * Identifying information for transferring money to or from a Canadian bank account via EFT.
 * @param accountId The Plaid account ID associated with the account numbers
 * @param account The EFT account number for the account
 * @param institution The EFT institution number for the account
 * @param branch The EFT branch number for the account
 */
@Serializable
data class NumbersEFT(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("account")
    val account: String,
    @SerialName("institution")
    val institution: String,
    @SerialName("branch")
    val branch: String
)
