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
 * @param investments Information about the last successful and failed investments update for the
 * Item.
 * @param transactions Information about the last successful and failed transactions update for the
 * Item.
 * @param lastWebhook Information about the last webhook fired for the Item.
 */
@Serializable
data class NullableItemStatus(
    @SerialName("investments")
    val investments: ItemGetResponseStatusInvestments? = null,
    @SerialName("transactions")
    val transactions: ItemGetResponseStatusTransactions? = null,
    @SerialName("last_webhook")
    val lastWebhook: ItemGetResponseStatusLastWebhook? = null
)
