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
 * An optional object to filter `/investments/holdings/get` results. If provided, must not be
 * `null`.
 * @param accountIds An array of `account_id`s to retrieve for the Item. An error will be returned
 * if a provided `account_id` is not associated with the Item.
 */
@Serializable
data class InvestmentHoldingsGetRequestOptions(
    @SerialName("account_ids")
    val accountIds: List<String>? = null
)
