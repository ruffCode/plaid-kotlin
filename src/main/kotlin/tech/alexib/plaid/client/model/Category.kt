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
 * Information describing a transaction category
 * @param categoryId An identifying number for the category. `category_id` is a Plaid-specific
 * identifier and does not necessarily correspond to merchant category codes.
 * @param group `place` for physical transactions or `special` for other transactions such as bank
 * charges.
 * @param hierarchy A hierarchical array of the categories to which this `category_id` belongs.
 */
@Serializable
data class Category(
    @SerialName("category_id")
    val categoryId: String,
    @SerialName("group")
    val group: String,
    @SerialName("hierarchy")
    val hierarchy: List<String>
)
