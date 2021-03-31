/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents an event in the Bank Transfers API.
 * @param eventId Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit
 * integers.
 * @param timestamp The datetime when this event occurred. This will be of the form
 * `2006-01-02T15:04:05Z`.
 * @param eventType `pending`: A new transfer was created; it is in the pending state.
 *
 * `cancelled`: The transfer was cancelled by the tech.alexib.plaid.client.
 *
 * `failed`: The transfer failed, no funds were moved.
 *
 * `posted`: The transfer has been successfully submitted to the payment network.
 *
 * `reversed`: A posted transfer was reversed.
 *
 * `receiver_pending`: The matching transfer was found as a pending transaction in the receiver's
 * account
 *
 * `receiver_posted`: The matching transfer was found as a posted transaction in the receiver's
 * account
 * @param accountId The account ID associated with the bank transfer.
 * @param bankTransferId Plaid’s unique identifier for a bank transfer.
 * @param originationAccountId The ID of the origination account that this balance belongs to.
 * @param bankTransferType The type of bank transfer. This will be either `debit` or `credit`.  A
 * `debit` indicates a transfer of money into your origination account; a `credit` indicates a transfer
 * of money out of your origination account.
 * @param bankTransferAmount The bank transfer amount.
 * @param bankTransferIsoCurrencyCode The currency of the bank transfer amount.
 * @param failureReason The failure reason if the type of this transfer is `"failed"` or
 * `"reversed"`. Null value otherwise.
 * @param direction Indicates the direction of the transfer: `outbound` for API-initiated transfers,
 * or `inbound` for payments received by the FBO account.
 * @param receiverDetails The receiver details if the type of this event is `reciever_pending` or
 * `reciever_posted`. Null value otherwise.
 */
@Serializable
data class BankTransferEvent(
    @SerialName("event_id")
    val eventId: Int,
    @SerialName("timestamp")
    val timestamp: String,
    @SerialName("event_type")
    val eventType: BankTransferEventType,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("bank_transfer_id")
    val bankTransferId: BankTransferID,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null,
    @SerialName("bank_transfer_type")
    val bankTransferType: BankTransferType,
    @SerialName("bank_transfer_amount")
    val bankTransferAmount: String,
    @SerialName("bank_transfer_iso_currency_code")
    val bankTransferIsoCurrencyCode: String,
    @SerialName("failure_reason")
    val failureReason: BankTransferFailure? = null,
    @SerialName("direction")
    val direction: BankTransferDirection? = null,
    @SerialName("receiver_details")
    val receiverDetails: BankTransferReceiverDetails? = null
)
