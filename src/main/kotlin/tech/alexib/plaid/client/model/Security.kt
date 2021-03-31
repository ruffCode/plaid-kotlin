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
 * Contains details about a security
 * @param securityId A unique, Plaid-specific identifier for the security, used to associate
 * securities with holdings. Like all Plaid identifiers, the `security_id` is case sensitive.
 * @param isin 12-character ISIN, a globally unique securities identifier.
 * @param cusip 9-character CUSIP, an identifier assigned to North American securities.
 * @param sedol 7-character SEDOL, an identifier assigned to securities in the UK.
 * @param institutionSecurityId An identifier given to the security by the institution
 * @param institutionId If `institution_security_id` is present, this field indicates the Plaid
 * `institution_id` of the institution to whom the identifier belongs.
 * @param proxySecurityId In certain cases, Plaid will provide the ID of another security whose
 * performance resembles this security, typically when the original security has low volume, or when a
 * private security can be modeled with a publicly traded security.
 * @param name A descriptive name for the security, suitable for display.
 * @param tickerSymbol The security’s trading symbol for publicly traded securities, and otherwise a
 * short identifier if available.
 * @param isCashEquivalent Indicates that a security is a highly liquid asset and can be treated
 * like cash.
 * @param type The security type of the holding. Valid security types are:
 *
 * `cash`: Cash, currency, and money market funds
 *
 * `derivative`: Options, warrants, and other derivative instruments
 *
 * `equity`: Domestic and foreign equities
 *
 * `etf`: Multi-asset exchange-traded investment funds
 *
 * `fixed income`: Bonds and certificates of deposit (CDs)
 *
 * `loan`: Loans and loan receivables.
 *
 * `mutual fund`: Open- and closed-end vehicles pooling funds of multiple investors.
 *
 * `other`: Unknown or other investment types
 * @param closePrice Price of the security at the close of the previous trading session. `null` for
 * non-public securities.
 * @param closePriceAsOf Date for which `close_price` is accurate. Always `null` if `close_price` is
 * `null`.
 * @param isoCurrencyCode The ISO-4217 currency code of the price given. Always `null` if
 * `unofficial_currency_code` is non-`null`.
 * @param unofficialCurrencyCode The unofficial currency code associated with the security. Always
 * `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that
 * do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain
 * countries.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `iso_currency_code`s.
 */
@Serializable
data class Security(
    @SerialName("security_id")
    val securityId: String,
    @SerialName("isin")
    val isin: String? = null,
    @SerialName("cusip")
    val cusip: String? = null,
    @SerialName("sedol")
    val sedol: String? = null,
    @SerialName("institution_security_id")
    val institutionSecurityId: String? = null,
    @SerialName("institution_id")
    val institutionId: String? = null,
    @SerialName("proxy_security_id")
    val proxySecurityId: String? = null,
    @SerialName("name")
    val name: String? = null,
    @SerialName("ticker_symbol")
    val tickerSymbol: String? = null,
    @SerialName("is_cash_equivalent")
    val isCashEquivalent: Boolean? = null,
    @SerialName("type")
    val type: String,
    @SerialName("close_price")
    val closePrice: Double? = null,
    @SerialName("close_price_as_of")
    val closePriceAsOf: String? = null,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null
)
