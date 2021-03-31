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
 * An object representing the repayment plan for the student loan
 * @param description The description of the repayment plan as provided by the servicer.
 * @param type The type of the repayment plan.
 */
@Serializable
data class StudentRepaymentPlan(
    @SerialName("description")
    val description: String? = null,
    @SerialName("type")
    val type: Type? = null
) {
    @Serializable
    enum class Type {
        @SerialName("extended graduated")
        EXTENDED_GRADUATED,

        @SerialName("extended standard")
        EXTENDED_STANDARD,

        @SerialName("graduated")
        GRADUATED,

        @SerialName("income-contingent repayment")
        INCOME_CONTINGENT_REPAYMENT,

        @SerialName("income-based repayment")
        INCOME_BASED_REPAYMENT,

        @SerialName("interest-only")
        INTEREST_ONLY,

        @SerialName("other")
        OTHER,

        @SerialName("pay as you earn")
        PAY_AS_YOU_EARN,

        @SerialName("revised pay as you earn")
        REVISED_PAY_AS_YOU_EARN,

        @SerialName("standard")
        STANDARD
    }
}
