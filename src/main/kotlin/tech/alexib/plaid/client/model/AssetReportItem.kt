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
 * A representation of an Item within an Asset Report.
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param institutionName The full financial institution name associated with the Item.
 * @param institutionId The id of the financial institution associated with the Item.
 * @param dateLastUpdated The date and time when this Item’s data was last retrieved from the
 * financial institution, in ISO 8601 format.
 * @param accounts Data about each of the accounts open on the Item.
 */
@Serializable
data class AssetReportItem(
    @SerialName("item_id")
    val itemId: ItemId,
    @SerialName("institution_name")
    val institutionName: String,
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("date_last_updated")
    val dateLastUpdated: String,
    @SerialName("accounts")
    val accounts: List<AccountAssets>
)
