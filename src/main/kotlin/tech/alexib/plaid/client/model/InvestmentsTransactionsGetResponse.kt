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
 * InvestmentsTransactionsGetResponse defines the response schema for
 * `/investments/transactions/get`
 * @param item Metadata about the Item.
 * @param accounts The accounts for which transaction history is being fetched.
 * @param securities All securities for which there is a corresponding transaction being fetched.
 * @param investmentTransactions The transactions being fetched
 * @param totalInvestmentTransactions The total number of transactions available within the date
 * range specified. If `total_investment_transactions` is larger than the size of the `transactions`
 * array, more transactions are available and can be fetched via manipulating the `offset` parameter.'
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class InvestmentsTransactionsGetResponse(
    @SerialName("item")
    val item: Item,
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("securities")
    val securities: List<Security>,
    @SerialName("investment_transactions")
    val investmentTransactions: List<InvestmentTransaction>,
    @SerialName("total_investment_transactions")
    val totalInvestmentTransactions: Int,
    @SerialName("request_id")
    val requestId: RequestID
)
