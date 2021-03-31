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
 * Object containing fields describing property address.
 * @param city The city name.
 * @param country The ISO 3166-1 alpha-2 country code.
 * @param postalCode The five or nine digit postal code.
 * @param region The region or state (example "NC").
 * @param street The full street address (example "564 Main Street, Apt 15").
 */
@Serializable
data class MortgagePropertyAddress(
    @SerialName("city")
    val city: String? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("region")
    val region: String? = null,
    @SerialName("street")
    val street: String? = null
)
