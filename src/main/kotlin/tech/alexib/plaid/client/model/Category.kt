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
 * Information describing a transaction category
 * @param categoryId An identifying number for the category. `category_id` is a Plaid-specific
 * identifier and does not necessarily correspond to merchant category codes.
 * @param group `place` for physical transactions or `special` for other transactions such as bank
 * charges.
 * @param hierarchy A hierarchical array of the categories to which this `category_id` belongs.
 */
@Serializable
data class Category(
    @SerialName("category_id")
    val categoryId: String,
    @SerialName("group")
    val group: String,
    @SerialName("hierarchy")
    val hierarchy: List<String>
)
