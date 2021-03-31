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
 * The receiver details if the type of this event is `reciever_pending` or `reciever_posted`. Null
 * value otherwise.
 * @param availableBalance The sign of the available balance for the receiver bank account
 * associated with the receiver event at the time the matching transaction was found. Can be
 * `positive`, `negative`, or null if the balance was not available at the time.
 */
@Serializable
data class BankTransferReceiverDetails(
    @SerialName("available_balance")
    val availableBalance: AvailableBalance? = null
) {
    @Serializable
    enum class AvailableBalance {
        @SerialName("positive")
        POSITIVE,

        @SerialName("negative")
        NEGATIVE
    }
}
