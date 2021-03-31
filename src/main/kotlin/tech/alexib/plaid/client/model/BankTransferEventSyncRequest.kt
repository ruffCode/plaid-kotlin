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
 * BankTransferEventSyncRequest defines the request schema for `/bank_transfer/event/sync`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param afterId The latest (largest) `event_id` fetched via the sync endpoint, or 0 initially.
 * @param count The maximum number of bank transfer events to return.
 */
@Serializable
data class BankTransferEventSyncRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("after_id")
    val afterId: Int,
    @SerialName("count")
    val count: Int? = null
)
