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
