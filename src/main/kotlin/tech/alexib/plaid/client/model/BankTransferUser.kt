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
 * The legal name and other information for the account holder.
 * @param legalName The account holder’s full legal name.
 * @param emailAddress The account holder’s email.
 * @param routingNumber The account holder's routing number. This field is only used for response
 * data. Do not provide this field when making requests.
 */
@Serializable
data class BankTransferUser(
    @SerialName("legal_name")
    val legalName: String,
    @SerialName("email_address")
    val emailAddress: String? = null,
    @SerialName("routing_number")
    val routingNumber: String? = null
)
