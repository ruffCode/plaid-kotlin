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
