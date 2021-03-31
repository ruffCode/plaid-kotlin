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
 * EmployersSearchRequest defines the request schema for `/employers/search`.
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param query The employer name to be searched for.
 * @param products The Plaid products the returned employers should support. Currently, this field
 * must be set to `"deposit_switch"`.
 */
@Serializable
data class EmployersSearchRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("query")
    val query: String,
    @SerialName("products")
    val products: List<String>
)
