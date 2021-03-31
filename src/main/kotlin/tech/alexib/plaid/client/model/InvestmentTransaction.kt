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
 * A transaction within an investment account.
 * @param investmentTransactionId The ID of the Investment transaction, unique across all Plaid
 * transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive.
 * @param accountId The `account_id` of the account against which this transaction posted.
 * @param securityId The `security_id` to which this transaction is related.
 * @param date The ISO-8601 posting date for the transaction, or transacted date for pending
 * transactions.
 * @param name The institution’s description of the transaction.
 * @param quantity The number of units of the security involved in this transactions
 * @param amount The complete value of the transaction. Positive values when cash is debited, e.g.
 * purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains
 * the same for cash-only movements unassociated with securities.
 * @param price The price of the security at which this transaction occurred.
 * @param fees The combined value of all fees applied to this transaction
 * @param type Value is one of the following:
 * `buy`: Buying an investment
 * `sell`: Selling an investment
 * `cancel`: A cancellation of a pending transaction
 *  `cash`: Activity that modifies a cash position
 * `fee`: A fee on the account
 * `transfer`: Activity which modifies a position, but not through buy/sell activity e.g. options
 * exercise, portfolio transfer
 * @param subtype For descriptions of possible transaction subtypes, see [Investment transaction
 * subtypes schema](/docs/api/accounts/#investment-transaction-subtypes-schema).
 * @param isoCurrencyCode The ISO-4217 currency code of the transaction. Always `null` if
 * `unofficial_currency_code` is non-`null`.
 * @param unofficialCurrencyCode The unofficial currency code associated with the holding. Always
 * `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that
 * do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain
 * countries.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `iso_currency_code`s.
 */
@Serializable
data class InvestmentTransaction(
    @SerialName("investment_transaction_id")
    val investmentTransactionId: String,
    @SerialName("cancel_transaction_id")
    val cancelTransactionId: String? = null,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("security_id")
    val securityId: String? = null,
    @SerialName("date")
    val date: String,
    @SerialName("name")
    val name: String,
    @SerialName("quantity")
    val quantity: Double,
    @SerialName("amount")
    val amount: Double,
    @SerialName("price")
    val price: Double,
    @SerialName("fees")
    val fees: Double? = null,
    @SerialName("type")
    val type: Type,
    @SerialName("subtype")
    val subtype: Subtype,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null
) {
    @Serializable
    enum class Type {
        @SerialName("buy")
        BUY,

        @SerialName("sell")
        SELL,

        @SerialName("cancel")
        CANCEL,

        @SerialName("cash")
        CASH,

        @SerialName("fee")
        FEE,

        @SerialName("transfer")
        TRANSFER
    }

    @Serializable
    enum class Subtype {
        @SerialName("account fee")
        ACCOUNT_FEE,

        @SerialName("assignment")
        ASSIGNMENT,

        @SerialName("buy")
        BUY,

        @SerialName("buy to cover")
        BUY_TO_COVER,

        @SerialName("contribution")
        CONTRIBUTION,

        @SerialName("deposit")
        DEPOSIT,

        @SerialName("distribution")
        DISTRIBUTION,

        @SerialName("dividend")
        DIVIDEND,

        @SerialName("dividend reinvestment")
        DIVIDEND_REINVESTMENT,

        @SerialName("exercise")
        EXERCISE,

        @SerialName("expire")
        EXPIRE,

        @SerialName("fund fee")
        FUND_FEE,

        @SerialName("interest")
        INTEREST,

        @SerialName("interest receivable")
        INTEREST_RECEIVABLE,

        @SerialName("interest reinvestment")
        INTEREST_REINVESTMENT,

        @SerialName("legal fee")
        LEGAL_FEE,

        @SerialName("loan payment")
        LOAN_PAYMENT,

        @SerialName("long-term capital gain")
        LONG_TERM_CAPITAL_GAIN,

        @SerialName("long-term capital gain reinvestment")
        LONG_TERM_CAPITAL_GAIN_REINVESTMENT,

        @SerialName("management fee")
        MANAGEMENT_FEE,

        @SerialName("margin expense")
        MARGIN_EXPENSE,

        @SerialName("merger")
        MERGER,

        @SerialName("miscellaneous fee")
        MISCELLANEOUS_FEE,

        @SerialName("non-qualified dividend")
        NON_QUALIFIED_DIVIDEND,

        @SerialName("non-resident tax")
        NON_RESIDENT_TAX,

        @SerialName("pending credit")
        PENDING_CREDIT,

        @SerialName("pending debit")
        PENDING_DEBIT,

        @SerialName("qualified dividend")
        QUALIFIED_DIVIDEND,

        @SerialName("rebalance")
        REBALANCE,

        @SerialName("return of principal")
        RETURN_OF_PRINCIPAL,

        @SerialName("sell")
        SELL,

        @SerialName("sell short")
        SELL_SHORT,

        @SerialName("short-term capital gain")
        SHORT_TERM_CAPITAL_GAIN,

        @SerialName("short-term capital gain reinvestment")
        SHORT_TERM_CAPITAL_GAIN_REINVESTMENT,

        @SerialName("spin off")
        SPIN_OFF,

        @SerialName("split")
        SPLIT,

        @SerialName("stock distribution")
        STOCK_DISTRIBUTION,

        @SerialName("tax")
        TAX,

        @SerialName("tax withheld")
        TAX_WITHHELD,

        @SerialName("transfer")
        TRANSFER,

        @SerialName("transfer fee")
        TRANSFER_FEE,

        @SerialName("trust fee")
        TRUST_FEE,

        @SerialName("unqualified gain")
        UNQUALIFIED_GAIN,

        @SerialName("withdrawal")
        WITHDRAWAL
    }
}
