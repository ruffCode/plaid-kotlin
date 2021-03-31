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
 * EmployersSearchResponse defines the response schema for `/employers/search`.
 * @param employers A list of employers matching the search criteria.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class EmployersSearchResponse(
    @SerialName("employers")
    val employers: List<Employer>,
    @SerialName("request_id")
    val requestId: RequestID
)
