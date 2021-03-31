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
 * TransactionsGetResponse defines the response schema for `/transactions/get`
 * @param accounts An array containing the `accounts` associated with the Item for which
 * transactions are being returned. Each transaction can be mapped to its corresponding account via the
 * `account_id` field.
 * @param transactions An array containing transactions from the account. Transactions are returned
 * in reverse chronological order, with the most recent at the beginning of the array. The maximum
 * number of transactions returned is determined by the `count` parameter.
 * @param totalTransactions The total number of transactions available within the date range
 * specified. If `total_transactions` is larger than the size of the `transactions` array, more
 * transactions are available and can be fetched via manipulating the `offset` parameter.
 * @param item Metadata about the Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class TransactionsGetResponse(
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("transactions")
    val transactions: List<Transaction>,
    @SerialName("total_transactions")
    val totalTransactions: Int,
    @SerialName("item")
    val item: Item,
    @SerialName("request_id")
    val requestId: RequestID
)
