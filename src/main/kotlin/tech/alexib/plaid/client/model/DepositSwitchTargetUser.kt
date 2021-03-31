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
 * @param givenName The given name (first name) of the user.
 * @param familyName The family name (last name) of the user.
 * @param phone The phone number of the user. The endpoint can accept a variety of phone number
 * formats, including E.164.
 * @param email The email address of the user.
 * @param address The user's address.
 * @param taxPayerId The taxpayer ID of the user, generally their SSN, EIN, or TIN.
 */
@Serializable
data class DepositSwitchTargetUser(
    @SerialName("given_name")
    val givenName: String,
    @SerialName("family_name")
    val familyName: String,
    @SerialName("phone")
    val phone: String,
    @SerialName("email")
    val email: String,
    @SerialName("address")
    val address: DepositSwitchAddressData? = null,
    @SerialName("tax_payer_id")
    val taxPayerId: String? = null
)
