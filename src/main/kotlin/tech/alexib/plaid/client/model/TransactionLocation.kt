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
 * A representation of where a transaction took place
 * @param address The street address where the transaction occurred.
 * @param city The city where the transaction occurred.
 * @param region The region or state where the transaction occurred.
 * @param postalCode The postal code where the transaction occurred.
 * @param country The ISO 3166-1 alpha-2 country code where the transaction occurred.
 * @param lat The latitude where the transaction occurred.
 * @param lon The longitude where the transaction occurred.
 * @param storeNumber The merchant defined store number where the transaction occurred.
 */
@Serializable
data class TransactionLocation(
    @SerialName("address")
    val address: String? = null,
    @SerialName("city")
    val city: String? = null,
    @SerialName("region")
    val region: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("lat")
    val lat: Double? = null,
    @SerialName("lon")
    val lon: Double? = null,
    @SerialName("store_number")
    val storeNumber: String? = null
)
