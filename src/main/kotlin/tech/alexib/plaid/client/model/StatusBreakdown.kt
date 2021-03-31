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
