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
 * An optional object to be used with the request. If specified, `options` must not be `null`.
 * @param accountIds A list of `account_ids` to retrieve for the Item
 *
 * Note: An error will be returned if a provided `account_id` is not associated with the Item.
 * @param count The number of transactions to fetch.
 * @param offset The number of transactions to skip. The default value is 0.
 */
@Serializable
data class TransactionsGetRequestOptions(
    @SerialName("account_ids")
    val accountIds: List<String>? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("offset")
    val offset: Int? = null
)
