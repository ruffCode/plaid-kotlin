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
@file:UseSerializers(LocalDateSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.LocalDateSerializer

/**
 * TransactionsGetRequest defines the request schema for `/transactions/get`
 * @param clientId Your Plaid API `client_id`.
 * @param options An optional object to be used with the request. If specified, `options` must not
 * be `null`.
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param secret Your Plaid API `secret`.
 * @param startDate The earliest date for which data should be returned. Dates should be formatted
 * as YYYY-MM-DD.
 * @param endDate The latest date for which data should be returned. Dates should be formatted as
 * YYYY-MM-DD.
 */
@Serializable
data class TransactionsGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("options")
    val options: TransactionsGetRequestOptions? = null,
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("start_date")
    val startDate: LocalDate,
    @SerialName("end_date")
    val endDate: LocalDate
)
