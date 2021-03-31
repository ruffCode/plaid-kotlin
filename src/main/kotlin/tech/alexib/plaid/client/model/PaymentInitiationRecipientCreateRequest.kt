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
 * PaymentInitiationRecipientCreateRequest defines the request schema for
 * `/payment_initiation/recipient/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param name The name of the recipient
 * @param iban The International Bank Account Number (IBAN) for the recipient. If BACS data is not
 * provided, an IBAN is required.
 * @param address The optional address of the payment recipient. This object is not currently
 * required to make payments from UK institutions and should not be populated, though may be necessary
 * for future European expansion.
 */
@Serializable
data class PaymentInitiationRecipientCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("name")
    val name: String,
    @SerialName("iban")
    val iban: String? = null,
    @SerialName("bacs")
    val bacs: NullableRecipientBACS? = null,
    @SerialName("address")
    val address: PaymentInitiationAddress? = null
)
