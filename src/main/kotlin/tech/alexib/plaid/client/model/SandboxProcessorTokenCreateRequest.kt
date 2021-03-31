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
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param institutionId The ID of the institution the Item will be associated with
 * @param options An optional set of options to be used when configuring the Item. If specified,
 * must not be `null`.
 */
@Serializable
data class SandboxProcessorTokenCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("options")
    val options: SandboxProcessorTokenCreateRequestOptions? = null
)
