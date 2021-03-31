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
 * PaymentInitiationRecipientGetResponse defines the response schema for
 * `/payment_initiation/recipient/get`
 * @param recipientId The ID of the recipient.
 * @param name The name of the recipient.
 * @param address The optional address of the payment recipient. This object is not currently
 * required to make payments from UK institutions and should not be populated, though may be necessary
 * for future European expansion.
 * @param iban The International Bank Account Number (IBAN) for the recipient.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class PaymentInitiationRecipientGetResponse(
    @SerialName("recipient_id")
    val recipientId: String,
    @SerialName("name")
    val name: String,
    @SerialName("address")
    val address: PaymentInitiationAddress? = null,
    @SerialName("iban")
    val iban: String? = null,
    @SerialName("bacs")
    val bacs: NullableRecipientBACS? = null,
    @SerialName("request_id")
    val requestId: RequestID
)
