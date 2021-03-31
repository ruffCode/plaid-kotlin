/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
