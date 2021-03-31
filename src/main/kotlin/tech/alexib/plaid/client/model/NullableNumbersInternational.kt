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
 * @param iban The International Bank Account Number (IBAN) for the account
 * @param bic The Bank Identifier Code (BIC) for the account
 */
@Serializable
data class NullableNumbersInternational(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("iban")
    val iban: String,
    @SerialName("bic")
    val bic: String
)
