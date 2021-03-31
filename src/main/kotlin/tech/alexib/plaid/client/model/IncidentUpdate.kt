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
