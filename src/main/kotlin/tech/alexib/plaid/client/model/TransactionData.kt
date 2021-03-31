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
 * Information about the matched direct deposit transaction used to verify a user's payroll
 * information.
 * @param description The description of the transaction.
 * @param amount The amount of the transaction.
 * @param date The date of the transaction, in ISO 8601 format ("yyyy-mm-dd").
 * @param accountId A unique identifier for the end user's account.
 * @param transactionId A unique identifier for the transaction.
 */
@Serializable
data class TransactionData(
    @SerialName("description")
    val description: String,
    @SerialName("amount")
    val amount: Double,
    @SerialName("date")
    val date: String,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("transaction_id")
    val transactionId: String
)
