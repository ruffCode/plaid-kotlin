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
 * Object containing metadata about the interest rate for the mortgage.
 * @param percentage Percentage value (interest rate of current mortgage, not APR) of interest
 * payable on a loan.
 * @param type The type of interest charged (fixed or variable).
 */
@Serializable
data class MortgageInterestRate(
    @SerialName("percentage")
    val percentage: Double? = null,
    @SerialName("type")
    val type: String? = null
)
