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
 * Information about the last successful and failed investments update for the Item.
 * @param lastSuccessfulUpdate ISO 8601 timestamp of the last successful investments update for the
 * Item. The status will update each time Plaid successfully connects with the institution, regardless
 * of whether any new data is available in the update.
 * @param lastFailedUpdate ISO 8601 timestamp of the last failed investments update for the Item.
 * The status will update each time Plaid fails an attempt to connect with the institution, regardless
 * of whether any new data is available in the update.
 */
@Serializable
data class ItemGetResponseStatusInvestments(
    @SerialName("last_successful_update")
    val lastSuccessfulUpdate: String? = null,
    @SerialName("last_failed_update")
    val lastFailedUpdate: String? = null
)
