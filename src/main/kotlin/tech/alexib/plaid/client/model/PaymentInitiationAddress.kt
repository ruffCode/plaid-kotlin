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
 * The optional address of the payment recipient. This object is not currently required to make
 * payments from UK institutions and should not be populated, though may be necessary for future
 * European expansion.
 * @param street An array of length 1-2 representing the street address where the recipient is
 * located. Maximum of 70 characters.
 * @param city The city where the recipient is located. Maximum of 35 characters.
 * @param postalCode The postal code where the recipient is located. Maximum of 16 characters.
 * @param country The ISO 3166-1 alpha-2 country code where the recipient is located.
 */
@Serializable
data class PaymentInitiationAddress(
    @SerialName("street")
    val street: List<String>? = null,
    @SerialName("city")
    val city: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("country")
    val country: String? = null
)
