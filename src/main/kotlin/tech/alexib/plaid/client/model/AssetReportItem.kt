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
 * A representation of an Item within an Asset Report.
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param institutionName The full financial institution name associated with the Item.
 * @param institutionId The id of the financial institution associated with the Item.
 * @param dateLastUpdated The date and time when this Item’s data was last retrieved from the
 * financial institution, in ISO 8601 format.
 * @param accounts Data about each of the accounts open on the Item.
 */
@Serializable
data class AssetReportItem(
    @SerialName("item_id")
    val itemId: ItemId,
    @SerialName("institution_name")
    val institutionName: String,
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("date_last_updated")
    val dateLastUpdated: String,
    @SerialName("accounts")
    val accounts: List<AccountAssets>
)
