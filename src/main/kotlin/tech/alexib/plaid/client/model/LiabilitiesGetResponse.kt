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
 * LiabilitiesGetResponse defines the response schema for `/liabilities/get`
 * @param accounts An array of accounts associated with the Item
 * @param item Metadata about the Item.
 * @param liabilities An object containing liability accounts
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class LiabilitiesGetResponse(
    @SerialName("accounts")
    val accounts: List<Account>,
    @SerialName("item")
    val item: Item,
    @SerialName("liabilities")
    val liabilities: LiabilitiesObject,
    @SerialName("request_id")
    val requestId: RequestID
)
