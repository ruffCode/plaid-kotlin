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
