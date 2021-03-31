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
 * The user object allows you to provide additional information about the user to be appended to the
 * Asset Report. All fields are optional. The `first_name`, `last_name`, and `ssn` fields are required
 * if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™ program.
 * @param clientUserId An identifier you determine and submit for the user.
 * @param firstName The user's first name. Required for the Fannie Mae Day 1 Certainty™ program.
 * @param middleName The user's middle name
 * @param lastName The user's last name.  Required for the Fannie Mae Day 1 Certainty™ program.
 * @param ssn The user's Social Security Number. Required for the Fannie Mae Day 1 Certainty™
 * program.
 *
 * Format: "ddd-dd-dddd"
 * @param phoneNumber The user's phone number, in E.164 format: +{countrycode}{number}. For example:
 * "+14151234567"
 * @param email The user's email address.
 */
@Serializable
data class AssetReportUser(
    @SerialName("client_user_id")
    val clientUserId: String? = null,
    @SerialName("first_name")
    val firstName: String? = null,
    @SerialName("middle_name")
    val middleName: String? = null,
    @SerialName("last_name")
    val lastName: String? = null,
    @SerialName("ssn")
    val ssn: String? = null,
    @SerialName("phone_number")
    val phoneNumber: String? = null,
    @SerialName("email")
    val email: String? = null
)
