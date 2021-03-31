// NOTE: This file is auto generated. Do not edit the file manually!
//
// The Plaid API
// The Plaid REST API. Please see https://plaid.com/docs/api for more details.
// Version 2020-09-14_1.8.0
//
// Contact
//   Plaid Developer Team
//   URL: https://plaid.com
//

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
