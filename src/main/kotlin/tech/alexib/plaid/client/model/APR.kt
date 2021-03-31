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
