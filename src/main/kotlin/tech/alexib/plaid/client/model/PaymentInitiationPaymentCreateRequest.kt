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
