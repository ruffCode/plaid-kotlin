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
