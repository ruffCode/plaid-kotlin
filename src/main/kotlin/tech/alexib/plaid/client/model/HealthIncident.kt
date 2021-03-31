// NOTE: This file is auto generated. Do not edit the file manually!
//
// The Plaid API
// The Plaid REST API. Please see https://plaid.com/docs/api for more details.
// Version 2020-09-14_1.8.0
//
// Contact
//   Plaid Developer Team
//   URL: https://plaid.com
//

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
