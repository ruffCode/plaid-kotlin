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
 * An object representing the status of the student loan
 * @param endDate The date until which the loan will be in its current status. Dates are returned in
 * an ISO 8601 format (YYYY-MM-DD).
 *
 * @param type The status type of the student loan
 */
@Serializable
data class StudentLoanStatus(
    @SerialName("end_date")
    val endDate: String? = null,
    @SerialName("type")
    val type: Type? = null
) {
    @Serializable
    enum class Type {
        @SerialName("cancelled")
        CANCELLED,

        @SerialName("charged off")
        CHARGED_OFF,

        @SerialName("claim")
        CLAIM,

        @SerialName("consolidated")
        CONSOLIDATED,

        @SerialName("deferment")
        DEFERMENT,

        @SerialName("delinquent")
        DELINQUENT,

        @SerialName("discharged")
        DISCHARGED,

        @SerialName("extension")
        EXTENSION,

        @SerialName("forbearance")
        FORBEARANCE,

        @SerialName("in grace")
        IN_GRACE,

        @SerialName("in military")
        IN_MILITARY,

        @SerialName("in school")
        IN_SCHOOL,

        @SerialName("not fully disbursed")
        NOT_FULLY_DISBURSED,

        @SerialName("other")
        OTHER,

        @SerialName("paid in full")
        PAID_IN_FULL,

        @SerialName("refunded")
        REFUNDED,

        @SerialName("repayment")
        REPAYMENT,

        @SerialName("transferred")
        TRANSFERRED
    }
}
