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
 * A representation of the status health of a request type. Auth requests, Balance requests,
 * Identity requests, Transactions updates, Investments updates, and Item logins each have their own
 * status object.
 * @param status `HEALTHY`: the majority of requests are successful
 * `DEGRADED`: only some requests are successful
 * `DOWN`: all requests are failing
 * @param lastStatusChange ISO 8601 formatted timestamp of the last status change for the
 * institution.
 * @param breakdown A detailed breakdown of the institution's performance for a request type. The
 * values for `success`, `error_plaid`, and `error_institution` sum to 1.
 */
@Serializable
data class ProductStatus(
    @SerialName("status")
    val status: Status,
    @SerialName("last_status_change")
    val lastStatusChange: String,
    @SerialName("breakdown")
    val breakdown: StatusBreakdown
) {
    @Serializable
    enum class Status {
        @SerialName("HEALTHY")
        HEALTHY,

        @SerialName("DEGRADED")
        DEGRADED,

        @SerialName("DOWN")
        DOWN
    }
}
