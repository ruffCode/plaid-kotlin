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
 * Data about the components comprising an address.
 * @param city The full city name
 * @param region The region or state
 * Example: `"NC"`
 * @param street The full street address
 * Example: `"564 Main Street, APT 15"`
 * @param postalCode The postal code
 * @param country The ISO 3166-1 alpha-2 country code
 */
@Serializable
data class AddressData(
    @SerialName("city")
    val city: String,
    @SerialName("region")
    val region: String? = null,
    @SerialName("street")
    val street: String,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("country")
    val country: String
)
