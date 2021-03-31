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
 * A detailed breakdown of the institution's performance for a request type. The values for
 * `success`, `error_plaid`, and `error_institution` sum to 1.
 * @param success The percentage of login attempts that are successful, expressed as a decimal.
 * @param errorPlaid The percentage of logins that are failing due to an internal Plaid issue,
 * expressed as a decimal.
 *
 * @param errorInstitution The percentage of logins that are failing due to an issue in the
 * institution's system, expressed as a decimal.
 * @param refreshInterval The `refresh_interval` may be `DELAYED` or `STOPPED` even when the success
 * rate is high. This value is only returned for Transactions status breakdowns.
 */
@Serializable
data class StatusBreakdown(
    @SerialName("success")
    val success: Double,
    @SerialName("error_plaid")
    val errorPlaid: Double,
    @SerialName("error_institution")
    val errorInstitution: Double,
    @SerialName("refresh_interval")
    val refreshInterval: RefreshInterval? = null
) {
    @Serializable
    enum class RefreshInterval {
        @SerialName("NORMAL")
        NORMAL,

        @SerialName("DELAYED")
        DELAYED,

        @SerialName("STOPPED")
        STOPPED
    }
}
