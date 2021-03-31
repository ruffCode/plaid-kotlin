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
 * Transaction information specific to inter-bank transfers. If the transaction was not an
 * inter-bank transfer, all fields will be `null`.
 *
 * If the `transaction` object was returned by a Transactions endpoint such as `/transactions/get`,
 * the `payment_meta` key will always appear, but no data elements are guaranteed. If the `transaction`
 * object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`,
 * this field will only appear in an Asset Report with Insights.
 * @param referenceNumber The transaction reference number supplied by the financial institution.
 * @param ppdId The ACH PPD ID for the payer.
 * @param payee For transfers, the party that is receiving the transaction.
 * @param byOrderOf The party initiating a wire transfer. Will be `null` if the transaction is not a
 * wire transfer.
 * @param payer For transfers, the party that is paying the transaction.
 * @param paymentMethod The type of transfer, e.g. 'ACH'
 * @param paymentProcessor The name of the payment processor
 * @param reason The payer-supplied description of the transfer.
 */
@Serializable
data class PaymentMeta(
    @SerialName("reference_number")
    val referenceNumber: String? = null,
    @SerialName("ppd_id")
    val ppdId: String? = null,
    @SerialName("payee")
    val payee: String? = null,
    @SerialName("by_order_of")
    val byOrderOf: String? = null,
    @SerialName("payer")
    val payer: String? = null,
    @SerialName("payment_method")
    val paymentMethod: String? = null,
    @SerialName("payment_processor")
    val paymentProcessor: String? = null,
    @SerialName("reason")
    val reason: String? = null
)
