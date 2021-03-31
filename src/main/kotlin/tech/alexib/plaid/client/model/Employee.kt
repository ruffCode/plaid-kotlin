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
 * Data about the employee.
 * @param name The name of the employee.
 * @param ssnMasked The SSN of the employee, with all but the last 4 digits masked out. For example:
 * "XXX-XX-1111".
 */
@Serializable
data class Employee(
    @SerialName("name")
    val name: String? = null,
    @SerialName("address")
    val address: NullableAddressData? = null,
    @SerialName("ssn_masked")
    val ssnMasked: String? = null
)
