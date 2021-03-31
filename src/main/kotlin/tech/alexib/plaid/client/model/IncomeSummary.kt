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
 * The verified fields from a paystub verification. All fields are provided as reported on the
 * paystub.
 * @param verifiedTransaction Information about the matched direct deposit transaction used to
 * verify a user's payroll information.
 */
@Serializable
data class IncomeSummary(
    @SerialName("employer_name")
    val employerName: EmployerIncomeSummaryFieldString? = null,
    @SerialName("employee_name")
    val employeeName: EmployeeIncomeSummaryFieldString? = null,
    @SerialName("ytd_gross_income")
    val ytdGrossIncome: YTDGrossIncomeSummaryFieldNumber? = null,
    @SerialName("ytd_net_income")
    val ytdNetIncome: YTDNetIncomeSummaryFieldNumber? = null,
    @SerialName("pay_frequency")
    val payFrequency: PayFrequency? = null,
    @SerialName("projected_wage")
    val projectedWage: ProjectedIncomeSummaryFieldNumber? = null,
    @SerialName("verified_transaction")
    val verifiedTransaction: TransactionData? = null
)
