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
 * CategoriesGetResponse defines the response schema for `/categories/get`
 * @param categories An array of all of the transaction categories used by Plaid.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class CategoriesGetResponse(
    @SerialName("categories")
    val categories: List<Category>,
    @SerialName("request_id")
    val requestId: RequestID
)
