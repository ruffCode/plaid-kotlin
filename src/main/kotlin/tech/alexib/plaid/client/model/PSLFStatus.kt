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
 * Information about the student's eligibility in the Public Service Loan Forgiveness program. This
 * is only returned if the institution is Fedloan (`ins_116527`).
 * @param estimatedEligibilityDate The estimated date borrower will have completed 120 qualifying
 * monthly payments. Returned in ISO 8601 format (YYYY-MM-DD).
 * @param paymentsMade The number of qualifying payments that have been made.
 * @param paymentsRemaining The number of qualifying payments remaining.
 */
@Serializable
data class PSLFStatus(
    @SerialName("estimated_eligibility_date")
    val estimatedEligibilityDate: String? = null,
    @SerialName("payments_made")
    val paymentsMade: Double? = null,
    @SerialName("payments_remaining")
    val paymentsRemaining: Double? = null
)
