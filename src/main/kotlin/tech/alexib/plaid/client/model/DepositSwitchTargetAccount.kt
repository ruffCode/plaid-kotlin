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
 * @param accountNumber Account number for deposit switch destination
 * @param routingNumber Routing number for deposit switch destination
 * @param accountName The name of the deposit switch destination account, as it will be displayed to
 * the end user in the Deposit Switch interface. It is not required to match the name used in online
 * banking.
 * @param accountSubtype The account subtype of the account, either `checking` or `savings`.
 */
@Serializable
data class DepositSwitchTargetAccount(
    @SerialName("account_number")
    val accountNumber: String,
    @SerialName("routing_number")
    val routingNumber: String,
    @SerialName("account_name")
    val accountName: String,
    @SerialName("account_subtype")
    val accountSubtype: AccountSubtype
) {
    @Serializable
    enum class AccountSubtype {
        @SerialName("checking")
        CHECKING,

        @SerialName("savings")
        SAVINGS
    }
}
