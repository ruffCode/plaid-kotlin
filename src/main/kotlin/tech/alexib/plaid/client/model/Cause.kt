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
 * An error object and associated `item_id` used to identify a specific Item and error when a batch
 * operation operating on multiple Items has encountered an error in one of the Items.
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param error We use standard HTTP response codes for success and failure notifications, and our
 * errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X
 * codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.
 * Error fields will be `null` if no error has occurred.
 */
@Serializable
data class Cause(
    @SerialName("item_id")
    val itemId: ItemId,
    @SerialName("error")
    val error: PlaidError? = null
)
