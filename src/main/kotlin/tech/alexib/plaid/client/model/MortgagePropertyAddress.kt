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
 * Object containing fields describing property address.
 * @param city The city name.
 * @param country The ISO 3166-1 alpha-2 country code.
 * @param postalCode The five or nine digit postal code.
 * @param region The region or state (example "NC").
 * @param street The full street address (example "564 Main Street, Apt 15").
 */
@Serializable
data class MortgagePropertyAddress(
    @SerialName("city")
    val city: String? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("region")
    val region: String? = null,
    @SerialName("street")
    val street: String? = null
)
