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
 * Specifies options for initializing Link for use with the Deposit Switch (beta) product. This
 * field is required if `deposit_switch` is included in the `products` array.
 * @param depositSwitchId The `deposit_switch_id` provided by the `/deposit_switch/create` endpoint.
 */
@Serializable
data class LinkTokenCreateRequestDepositSwitch(
    @SerialName("deposit_switch_id")
    val depositSwitchId: String
)
