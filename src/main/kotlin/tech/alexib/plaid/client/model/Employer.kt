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
 * Data about the employer.
 * @param employerId Plaid's unique identifier for the employer.
 * @param name The name of the employer
 * @param confidenceScore A number from 0 to 1 indicating Plaid's level of confidence in the pairing
 * between the employer and the institution (not yet implemented).
 */
@Serializable
data class Employer(
    @SerialName("employer_id")
    val employerId: String,
    @SerialName("name")
    val name: String,
    @SerialName("address")
    val address: NullableAddressData? = null,
    @SerialName("confidence_score")
    val confidenceScore: Double? = null
)
