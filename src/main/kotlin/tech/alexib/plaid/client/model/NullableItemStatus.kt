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
