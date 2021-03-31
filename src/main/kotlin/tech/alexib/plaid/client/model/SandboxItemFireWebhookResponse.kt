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
 * SandboxItemFireWebhookResponse defines the response schema for `/sandbox/item/fire_webhook`
 * @param webhookFired Value is `true`  if the test` webhook_code`  was successfully fired.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class SandboxItemFireWebhookResponse(
    @SerialName("webhook_fired")
    val webhookFired: Boolean,
    @SerialName("request_id")
    val requestId: RequestID
)
