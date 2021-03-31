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
 * @param accountId The Plaid account ID associated with the account numbers
 * @param account The ACH account number for the account
 * @param routing The ACH routing number for the account
 * @param wireRouting The wire transfer routing number for the account, if available
 */
@Serializable
data class NullableNumbersACH(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("account")
    val account: String,
    @SerialName("routing")
    val routing: String,
    @SerialName("wire_routing")
    val wireRouting: String? = null
)
