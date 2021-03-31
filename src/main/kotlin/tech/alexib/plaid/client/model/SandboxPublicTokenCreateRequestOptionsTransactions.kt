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
 * SandboxPublicTokenCreateRequestOptionsTransactions is an optional set of corresponding to
 * transactions options.
 * @param startDate The earliest date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 * @param endDate The most recent date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 */
@Serializable
data class SandboxPublicTokenCreateRequestOptionsTransactions(
    @SerialName("start_date")
    val startDate: String? = null,
    @SerialName("end_date")
    val endDate: String? = null
)
