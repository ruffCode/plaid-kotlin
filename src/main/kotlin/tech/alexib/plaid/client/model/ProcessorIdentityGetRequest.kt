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
 * ProcessorIdentityGetRequest defines the request schema for `/processor/identity/get`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param processorToken The processor token obtained from the Plaid integration partner. Processor
 * tokens are in the format: `processor-<environment>-<identifier>`
 */
@Serializable
data class ProcessorIdentityGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("processor_token")
    val processorToken: ProcessorToken
)
