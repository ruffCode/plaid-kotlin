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
 * AccountsGetResponse defines the response schema for `/accounts/get` and `/accounts/balance/get`.
 * @param accounts An array of financial institution accounts associated with the Item.
 * If `/accounts/balance/get` was called, each account will include real-time balance information.
 * @param item Metadata about the Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AccountsGetResponse(
    @SerialName("accounts")
    val accounts: List<AccountBase>,
    @SerialName("item")
    val item: Item,
    @SerialName("request_id")
    val requestId: RequestID
)
