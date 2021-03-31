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
 * PaymentInitiationRecipientGetResponse defines the response schema for
 * `/payment_initiation/recipient/get`
 * @param recipientId The ID of the recipient.
 * @param name The name of the recipient.
 * @param address The optional address of the payment recipient. This object is not currently
 * required to make payments from UK institutions and should not be populated, though may be necessary
 * for future European expansion.
 * @param iban The International Bank Account Number (IBAN) for the recipient.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class PaymentInitiationRecipientGetResponse(
    @SerialName("recipient_id")
    val recipientId: String,
    @SerialName("name")
    val name: String,
    @SerialName("address")
    val address: PaymentInitiationAddress? = null,
    @SerialName("iban")
    val iban: String? = null,
    @SerialName("bacs")
    val bacs: NullableRecipientBACS? = null,
    @SerialName("request_id")
    val requestId: RequestID
)
