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
 * Information about the last webhook fired for the Item.
 * @param sentAt ISO 8601 timestamp of when the webhook was fired.
 * @param codeSent The last webhook code sent.
 */
@Serializable
data class ItemGetResponseStatusLastWebhook(
    @SerialName("sent_at")
    val sentAt: String? = null,
    @SerialName("code_sent")
    val codeSent: String? = null
)
