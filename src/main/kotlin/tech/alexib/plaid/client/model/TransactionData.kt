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
