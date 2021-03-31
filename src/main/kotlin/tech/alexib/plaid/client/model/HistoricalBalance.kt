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
 * An object representing a balance held by an account in the past
 * @param date The date of the calculated historical balance, in an ISO 8601 format (YYYY-MM-DD)
 * @param current The total amount of funds in the account, calculated from the `current` balance in
 * the `balance` object by subtracting inflows and adding back outflows according to the posted date of
 * each transaction.
 *
 * If the account has any pending transactions, historical balance amounts on or after the date of
 * the earliest pending transaction may differ if retrieved in subsequent Asset Reports as a result of
 * those pending transactions posting.
 * @param isoCurrencyCode The ISO-4217 currency code of the balance. Always `null` if
 * `unofficial_currency_code` is non-`null`.
 * @param unofficialCurrencyCode The unofficial currency code associated with the balance. Always
 * `null` if `iso_currency_code` is non-`null`.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `iso_currency_code`s.
 */
@Serializable
data class HistoricalBalance(
    @SerialName("date")
    val date: String,
    @SerialName("current")
    val current: Double,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null
)
