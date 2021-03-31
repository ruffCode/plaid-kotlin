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
