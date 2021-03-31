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
 * BankTransferListRequest defines the request schema for `/bank_transfer/list`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param startDate The start datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param endDate The end datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param count The maximum number of bank transfers to return.
 * @param offset The number of bank transfers to skip before returning results.
 * @param originationAccountId Filter bank transfers to only those originated through the specified
 * origination account.
 * @param direction Indicates the direction of the transfer: `outbound` for API-initiated transfers,
 * or `inbound` for payments received by the FBO account.
 */
@Serializable
data class BankTransferListRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("start_date")
    val startDate: Instant? = null,
    @SerialName("end_date")
    val endDate: Instant? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("offset")
    val offset: Int? = null,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null,
    @SerialName("direction")
    val direction: BankTransferDirection? = null
)
