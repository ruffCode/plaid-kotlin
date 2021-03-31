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
 * PaymentInitiationPaymentGetResponse defines the response schema for
 * `/payment_initation/payment/get`
 * @param paymentId The ID of the payment. Like all Plaid identifiers, the `payment_id` is case
 * sensitive.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 * @param amount The amount and currency of a payment
 * @param status The status of the payment.
 *
 * `PAYMENT_STATUS_INPUT_NEEDED`: This is the initial state of all payments. It indicates that the
 * payment is waiting on user input to continue processing. A payment may re-enter this state later on
 * if further input is needed.
 *
 * `PAYMENT_STATUS_PROCESSING`: The payment is currently being processed. The payment will
 * automatically exit this state when processing is complete.
 *
 * `PAYMENT_STATUS_INITIATED`: The payment has been successfully initiated and is considered
 * complete.
 *
 * `PAYMENT_STATUS_COMPLETED`: Indicates that the standing order has been successfully established.
 * This state is only used for standing orders.
 *
 * `PAYMENT_STATUS_INSUFFICIENT_FUNDS`: The payment has failed due to insufficient funds.
 *
 * `PAYMENT_STATUS_FAILED`: The payment has failed to be initiated. This error is retryable once the
 * root cause is resolved.
 *
 * `PAYMENT_STATUS_BLOCKED`: The payment has been blocked. This is a retryable error.
 *
 * `PAYMENT_STATUS_UNKNOWN`: The payment status is unknown.
 * @param recipientId The ID of the recipient
 * @param reference A reference for the payment.
 * @param adjustedReference The value of the reference sent to the bank after adjustment to pass
 * bank validation rules.
 * @param lastStatusUpdate The date and time of the last time the `status` was updated, in IS0 8601
 * format
 */
@Serializable
data class PaymentInitiationPaymentGetResponse(
    @SerialName("payment_id")
    val paymentId: String,
    @SerialName("request_id")
    val requestId: RequestID? = null,
    @SerialName("amount")
    val amount: PaymentAmount,
    @SerialName("status")
    val status: Status,
    @SerialName("recipient_id")
    val recipientId: String,
    @SerialName("reference")
    val reference: String,
    @SerialName("adjusted_reference")
    val adjustedReference: String? = null,
    @SerialName("last_status_update")
    val lastStatusUpdate: String,
    @SerialName("schedule")
    val schedule: ExternalPaymentScheduleGet? = null
) {
    @Serializable
    enum class Status {
        @SerialName("PAYMENT_STATUS_INPUT_NEEDED")
        PAYMENT_STATUS_INPUT_NEEDED,

        @SerialName("PAYMENT_STATUS_PROCESSING")
        PAYMENT_STATUS_PROCESSING,

        @SerialName("PAYMENT_STATUS_INITIATED")
        PAYMENT_STATUS_INITIATED,

        @SerialName("PAYMENT_STATUS_COMPLETED")
        PAYMENT_STATUS_COMPLETED,

        @SerialName("PAYMENT_STATUS_INSUFFICIENT_FUNDS")
        PAYMENT_STATUS_INSUFFICIENT_FUNDS,

        @SerialName("PAYMENT_STATUS_FAILED")
        PAYMENT_STATUS_FAILED,

        @SerialName("PAYMENT_STATUS_BLOCKED")
        PAYMENT_STATUS_BLOCKED,

        @SerialName("PAYMENT_STATUS_UNKNOWN")
        PAYMENT_STATUS_UNKNOWN
    }
}
