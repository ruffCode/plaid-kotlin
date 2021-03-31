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
 * A set of fields describing the balance for an account. Balance information may be cached unless
 * the balance object was returned by `/accounts/balance/get`.
 * @param available The amount of funds available to be withdrawn from the account, as determined by
 * the financial institution.
 *
 * For `credit`-type accounts, the `available` balance typically equals the `limit` less the
 * `current` balance, less any pending outflows plus any pending inflows.
 *
 * For `depository`-type accounts, the `available` balance typically equals the `current` balance
 * less any pending outflows plus any pending inflows. For `depository`-type accounts, the `available`
 * balance does not include the overdraft limit.
 *
 * For `investment`-type accounts, the `available` balance is the total cash available to withdraw
 * as presented by the institution.
 *
 * Note that not all institutions calculate the `available`  balance. In the event that `available`
 * balance is unavailable, Plaid will return an `available` balance value of `null`.
 *
 * Available balance may be cached and is not guaranteed to be up-to-date in realtime unless the
 * value was returned by `/accounts/balance/get`.
 * @param current The total amount of funds in or owed by the account.
 *
 * For `credit`-type accounts, a positive balance indicates the amount owed; a negative amount
 * indicates the lender owing the account holder.
 *
 * For `loan`-type accounts, the current balance is the principal remaining on the loan, except in
 * the case of student loan accounts at Sallie Mae (`ins_116944`). For Sallie Mae student loans, the
 * account's balance includes both principal and any outstanding interest.
 *
 * For `investment`-type accounts, the current balance is the total value of assets as presented by
 * the institution.
 *
 * Note that balance information may be cached unless the value was returned by
 * `/accounts/balance/get`, and current balance information is typically not updated intra-day. If you
 * require realtime balance information, use the `available` balance as provided by
 * `/accounts/balance/get`.
 * @param limit For `credit`-type accounts, this represents the credit limit.
 *
 * For `depository`-type accounts, this represents the pre-arranged overdraft limit, which is common
 * for current (checking) accounts in Europe.
 *
 * In North America, this field is typically only available for `credit`-type accounts.
 * @param isoCurrencyCode The ISO-4217 currency code of the balance. Always null if
 * `unofficial_currency_code` is non-null.
 * @param unofficialCurrencyCode The unofficial currency code associated with the balance. Always
 * null if `iso_currency_code` is non-null. Unofficial currency codes are used for currencies that do
 * not have official ISO currency codes, such as cryptocurrencies and the currencies of certain
 * countries.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `unofficial_currency_code`s.
 */
@Serializable
data class AccountBalance(
    @SerialName("available")
    val available: Double? = null,
    @SerialName("current")
    val current: Double,
    @SerialName("limit")
    val limit: Double? = null,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null
)
