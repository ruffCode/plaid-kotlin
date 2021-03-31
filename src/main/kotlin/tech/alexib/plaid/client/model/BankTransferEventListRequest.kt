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
@file:UseSerializers(InstantSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.InstantSerializer

/**
 * BankTransferEventListRequest defines the request schema for `/bank_transfer/event/list`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param startDate The start datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param endDate The end datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param bankTransferId Plaid’s unique identifier for a bank transfer.
 * @param accountId The account ID to get events for all transactions to/from an account.
 * @param bankTransferType The type of bank transfer. This will be either `debit` or `credit`.  A
 * `debit` indicates a transfer of money into your origination account; a `credit` indicates a transfer
 * of money out of your origination account.
 * @param eventTypes Filter events by event type.
 * @param count The maximum number of bank transfer events to return. If the number of events
 * matching the above parameters is greater than `count`, the most recent events will be returned.
 * @param offset The offset into the list of bank transfer events. When `count`=25 and `offset`=0,
 * the first 25 events will be returned. When `count`=25 and `offset`=25, the next 25 bank transfer
 * events will be returned.
 * @param originationAccountId The origination account ID to get events for transfers from a
 * specific origination account.
 * @param direction Indicates the direction of the transfer: `outbound` for API-initiated transfers,
 * or `inbound` for payments received by the FBO account.
 */
@Serializable
data class BankTransferEventListRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("start_date")
    val startDate: Instant? = null,
    @SerialName("end_date")
    val endDate: Instant? = null,
    @SerialName("bank_transfer_id")
    val bankTransferId: String? = null,
    @SerialName("account_id")
    val accountId: String? = null,
    @SerialName("bank_transfer_type")
    val bankTransferType: String? = null,
    @SerialName("event_types")
    val eventTypes: List<BankTransferEventType>? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("offset")
    val offset: Int? = null,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null,
    @SerialName("direction")
    val direction: String? = null
)
