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
 * Information about the APR on the account.
 * @param aprPercentage Annual Percentage Rate applied.
 *
 * @param aprType The type of balance to which the APR applies.
 * @param balanceSubjectToApr Amount of money that is subjected to the APR if a balance was carried
 * beyond payment due date. How it is calculated can vary by card issuer. It is often calculated as an
 * average daily balance.
 * @param interestChargeAmount Amount of money charged due to interest from last statement.
 */
@Serializable
data class APR(
    @SerialName("apr_percentage")
    val aprPercentage: Double,
    @SerialName("apr_type")
    val aprType: AprType,
    @SerialName("balance_subject_to_apr")
    val balanceSubjectToApr: Double? = null,
    @SerialName("interest_charge_amount")
    val interestChargeAmount: Double? = null
) {
    @Serializable
    enum class AprType {
        @SerialName("balance_transfer_apr")
        BALANCE_TRANSFER_APR,

        @SerialName("cash_apr")
        CASH_APR,

        @SerialName("purchase_apr")
        PURCHASE_APR,

        @SerialName("special")
        SPECIAL
    }
}
