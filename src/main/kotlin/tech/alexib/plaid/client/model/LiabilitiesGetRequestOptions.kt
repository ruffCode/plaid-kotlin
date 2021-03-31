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
 * An optional object to filter `/liabilities/get` results. If provided, `options` cannot be null.
 * @param accountIds A list of accounts to retrieve for the Item.
 *
 * An error will be returned if a provided `account_id` is not associated with the Item
 */
@Serializable
data class LiabilitiesGetRequestOptions(
    @SerialName("account_ids")
    val accountIds: List<String>? = null
)
