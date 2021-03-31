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
 * A physical mailing address.
 * @param data Data about the components comprising an address.
 * @param primary When `true`, identifies the address as the primary address on an account.
 */
@Serializable
data class Address(
    @SerialName("data")
    val data: AddressData,
    @SerialName("primary")
    val primary: Boolean? = null
)
