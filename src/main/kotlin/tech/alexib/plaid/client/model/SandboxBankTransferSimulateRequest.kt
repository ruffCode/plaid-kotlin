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
 * SandboxBankTransferSimulateRequest defines the request schema for
 * `/sandbox/bank_transfer/simulate`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param bankTransferId Plaid’s unique identifier for a bank transfer.
 * @param eventType The asynchronous event to be simulated. May be: `posted`, `failed`, or
 * `reversed`.
 *
 * An error will be returned if the event type is incompatible with the current transfer status.
 * Compatible status --> event type transitions include:
 *
 * `pending` --> `failed`
 *
 * `pending` --> `posted`
 *
 * `posted` --> `reversed`
 *
 * @param failureReason The failure reason if the type of this transfer is `"failed"` or
 * `"reversed"`. Null value otherwise.
 */
@Serializable
data class SandboxBankTransferSimulateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("bank_transfer_id")
    val bankTransferId: BankTransferID,
    @SerialName("event_type")
    val eventType: String,
    @SerialName("failure_reason")
    val failureReason: BankTransferFailure? = null
)
