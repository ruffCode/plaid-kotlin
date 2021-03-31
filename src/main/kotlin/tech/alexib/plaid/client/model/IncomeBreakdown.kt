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
 * @param type The type of income. Possible values include `"regular"`, `"overtime"`, and `"bonus"`.
 * @param rate The hourly rate at which the income is paid.
 * @param hours The number of hours logged for this income for this pay period.
 * @param total The total pay for this pay period.
 */
@Serializable
data class IncomeBreakdown(
    @SerialName("type")
    val type: String? = null,
    @SerialName("rate")
    val rate: Double? = null,
    @SerialName("hours")
    val hours: Double? = null,
    @SerialName("total")
    val total: Double? = null
)
