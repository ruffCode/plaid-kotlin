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
 * PaymentInitiationPaymentListRequest defines the request schema for
 * `/payment_initiation/payment/list`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param count The maximum number of payments to return. If `count` is not specified, a maximum of
 * 10 payments will be returned, beginning with the most recent payment before the cursor (if
 * specified).
 * @param cursor A string in RFC 3339 format (i.e. "2019-12-06T22:35:49Z"). Only payments created
 * before the cursor will be returned.
 */
@Serializable
data class PaymentInitiationPaymentListRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("cursor")
    val cursor: String? = null
)
