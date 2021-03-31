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
 * @param description The content of the update.
 * @param status The status of the incident.
 * @param updatedDate The date when the update was published, in ISO 8601 format, e.g.
 * `"2020-10-30T15:26:48Z"`.
 */
@Serializable
data class IncidentUpdate(
    @SerialName("description")
    val description: String? = null,
    @SerialName("status")
    val status: Status? = null,
    @SerialName("updated_date")
    val updatedDate: String? = null
) {
    @Serializable
    enum class Status {
        @SerialName("INVESTIGATING")
        INVESTIGATING,

        @SerialName("IDENTIFIED")
        IDENTIFIED,

        @SerialName("RESOLVED")
        RESOLVED,

        @SerialName("UNKNOWN")
        UNKNOWN
    }
}
