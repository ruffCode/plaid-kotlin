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
 * InvestmentsHoldingsGetResponse defines the response schema for `/investments/holdings/get`
 * @param accounts The accounts associated with the Item
 * @param holdings The holdings belonging to investment accounts associated with the Item. Details
 * of the securities in the holdings are provided in the `securities` field.
 * @param securities Objects describing the securities held in the accounts associated with the
 * Item.
 * @param item Metadata about the Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class InvestmentsHoldingsGetResponse(
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("holdings")
    val holdings: List<Holding>,
    @SerialName("securities")
    val securities: List<Security>,
    @SerialName("item")
    val item: Item,
    @SerialName("request_id")
    val requestId: RequestID
)
