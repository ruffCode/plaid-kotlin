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
