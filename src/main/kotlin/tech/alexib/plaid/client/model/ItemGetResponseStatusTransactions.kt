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
 * Information about the last successful and failed transactions update for the Item.
 * @param lastSuccessfulUpdate ISO 8601 timestamp of the last successful transactions update for the
 * Item. The status will update each time Plaid successfully connects with the institution, regardless
 * of whether any new data is available in the update.
 * @param lastFailedUpdate ISO 8601 timestamp of the last failed transactions update for the Item.
 * The status will update each time Plaid fails an attempt to connect with the institution, regardless
 * of whether any new data is available in the update.
 */
@Serializable
data class ItemGetResponseStatusTransactions(
    @SerialName("last_successful_update")
    val lastSuccessfulUpdate: String? = null,
    @SerialName("last_failed_update")
    val lastFailedUpdate: String? = null
)
