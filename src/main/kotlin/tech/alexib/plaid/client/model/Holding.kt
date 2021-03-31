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
 * A securities holding at an institution.
 * @param accountId The Plaid `account_id` associated with the holding.
 * @param securityId The Plaid `security_id` associated with the holding.
 * @param institutionPrice The last price given by the institution for this security.
 * @param institutionPriceAsOf The date at which `institution_price` was current.
 * @param institutionValue The value of the holding, as reported by the institution.
 * @param costBasis The cost basis of the holding.
 * @param quantity The total quantity of the asset held, as reported by the financial institution.
 * @param isoCurrencyCode The ISO-4217 currency code of the holding. Always `null` if
 * `unofficial_currency_code` is non-`null`.
 * @param unofficialCurrencyCode The unofficial currency code associated with the holding. Always
 * `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that
 * do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain
 * countries.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `iso_currency_code`s.
 *
 */
@Serializable
data class Holding(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("security_id")
    val securityId: String,
    @SerialName("institution_price")
    val institutionPrice: Double,
    @SerialName("institution_price_as_of")
    val institutionPriceAsOf: String? = null,
    @SerialName("institution_value")
    val institutionValue: Double,
    @SerialName("cost_basis")
    val costBasis: Double? = null,
    @SerialName("quantity")
    val quantity: Double,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null
)
