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
 * The schedule that the payment will be executed on. If a schedule is provided, the payment is
 * automatically set up as a standing order. If no schedule is specified, the payment will be executed
 * only once.
 * @param interval The frequency interval of the payment. Valid values are `"WEEKLY"` or
 * `"MONTHLY"`.
 * @param intervalExecutionDay The day of the interval on which to schedule the payment.
 *
 * If the payment interval is weekly, `interval_execution_day` should be an integer from 1 (Monday)
 * to 7 (Sunday).
 *
 * If the payment interval is monthly, `interval_execution_day` should be an integer indicating
 * which day of the month to make the payment on. Integers from 1 to 28 can be used to make a payment
 * on that day of the month. Negative integers from -1 to -5 can be used to make a payment relative to
 * the end of the month. To make a payment on the last day of the month, use -1; to make the payment on
 * the second-to-last day, use -2, and so on.
 * @param startDate A date in ISO 8601 format (YYYY-MM-DD). Standing order payments will begin on
 * the first `interval_execution_day` on or after the `start_date`.
 *
 * If the first `interval_execution_day` on or after the start date is also the same day that
 * `/payment_initiation/payment/create` was called, the bank *may* make the first payment on that day,
 * but it is not guaranteed to do so.
 * @param endDate A date in ISO 8601 format (YYYY-MM-DD). Standing order payments will end on the
 * last `interval_execution_day` on or before the `end_date`.
 *
 * If the only `interval_execution_day` between the start date and the end date (inclusive) is also
 * the same day that `/payment_initiation/payment/create` was called, the bank *may* make a payment on
 * that day, but it is not guaranteed to do so.
 */
@Serializable
data class ExternalPaymentSchedule(
    @SerialName("interval")
    val interval: String,
    @SerialName("interval_execution_day")
    val intervalExecutionDay: Double,
    @SerialName("start_date")
    val startDate: LocalDate,
    @SerialName("end_date")
    val endDate: LocalDate? = null
)
