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
 * The user's address.
 * @param city The full city name
 * @param region The region or state
 * Example: `"NC"`
 * @param street The full street address
 * Example: `"564 Main Street, APT 15"`
 * @param postalCode The postal code
 * @param country The ISO 3166-1 alpha-2 country code
 */
@Serializable
data class DepositSwitchAddressData(
    @SerialName("city")
    val city: String,
    @SerialName("region")
    val region: String,
    @SerialName("street")
    val street: String,
    @SerialName("postal_code")
    val postalCode: String,
    @SerialName("country")
    val country: String
)
