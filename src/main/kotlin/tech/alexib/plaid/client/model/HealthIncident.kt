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
 * @param startDate The start date of the incident, in ISO 8601 format, e.g.
 * `"2020-10-30T15:26:48Z"`.
 * @param endDate The end date of the incident, in ISO 8601 format, e.g. `"2020-10-30T15:26:48Z"`.
 * @param title The title of the incident
 * @param incidentUpdates Updates on the health incident.
 */
@Serializable
data class HealthIncident(
    @SerialName("start_date")
    val startDate: String? = null,
    @SerialName("end_date")
    val endDate: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("incident_updates")
    val incidentUpdates: List<IncidentUpdate>? = null
)
