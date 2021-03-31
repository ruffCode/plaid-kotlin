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
 * An optional object to configure `/item/import` request.
 * @param webhook Specifies a webhook URL to associate with an Item. Plaid fires a webhook if
 * credentials fail.
 *
 */
@Serializable
data class ItemImportRequestOptions(
    @SerialName("webhook")
    val webhook: String? = null
)
