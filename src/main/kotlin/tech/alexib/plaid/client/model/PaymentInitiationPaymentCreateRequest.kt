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
 * PaymentInitiationPaymentCreateRequest defines the request schema for
 * `/payment_initiation/payment/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param recipientId The ID of the recipient the payment is for.
 * @param reference A reference for the payment. This must be an alphanumeric string with at most 18
 * characters and must not contain any special characters (since not all institutions support them).
 * @param amount A payment amount.
 * @param schedule The schedule that the payment will be executed on. If a schedule is provided, the
 * payment is automatically set up as a standing order. If no schedule is specified, the payment will
 * be executed only once.
 */
@Serializable
data class PaymentInitiationPaymentCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("recipient_id")
    val recipientId: String,
    @SerialName("reference")
    val reference: String,
    @SerialName("amount")
    val amount: Amount,
    @SerialName("schedule")
    val schedule: ExternalPaymentSchedule? = null
)
