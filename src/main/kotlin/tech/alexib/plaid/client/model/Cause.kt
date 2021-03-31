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
 * An error object and associated `item_id` used to identify a specific Item and error when a batch
 * operation operating on multiple Items has encountered an error in one of the Items.
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param error We use standard HTTP response codes for success and failure notifications, and our
 * errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X
 * codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.
 * Error fields will be `null` if no error has occurred.
 */
@Serializable
data class Cause(
    @SerialName("item_id")
    val itemId: ItemId,
    @SerialName("error")
    val error: PlaidError? = null
)
