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
 * InstitutionsGetResponse defines the response schema for `/institutions/get`
 * @param institutions A list of Plaid Institution
 * @param total The number of institutions returned
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class InstitutionsGetResponse(
    @SerialName("institutions")
    val institutions: List<Institution>,
    @SerialName("total")
    val total: Int,
    @SerialName("request_id")
    val requestId: RequestID
)
