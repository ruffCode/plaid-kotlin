/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
