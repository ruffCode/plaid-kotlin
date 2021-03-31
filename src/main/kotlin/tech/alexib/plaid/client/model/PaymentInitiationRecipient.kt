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
 * Information about a payment recipient configured for the Payment Initiation product
 * @param recipientId The ID of the recipient. Like all Plaid identifiers, the `recipient_id` is
 * case sensitive.
 * @param name The name of the recipient
 * @param address The optional address of the payment recipient. This object is not currently
 * required to make payments from UK institutions and should not be populated, though may be necessary
 * for future European expansion.
 * @param iban The International Bank Account Number (IBAN) for the recipient.
 */
@Serializable
data class PaymentInitiationRecipient(
    @SerialName("recipient_id")
    val recipientId: String,
    @SerialName("name")
    val name: String,
    @SerialName("address")
    val address: PaymentInitiationAddress? = null,
    @SerialName("iban")
    val iban: String? = null,
    @SerialName("bacs")
    val bacs: Bacs? = null
) {
    @Serializable
    data class Bacs(
        @SerialName("account")
        val account: String,
        @SerialName("sort_code")
        val sortCode: String
    )
}
