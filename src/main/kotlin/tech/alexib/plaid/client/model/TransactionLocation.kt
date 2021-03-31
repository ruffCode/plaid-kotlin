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
 * A representation of where a transaction took place
 * @param address The street address where the transaction occurred.
 * @param city The city where the transaction occurred.
 * @param region The region or state where the transaction occurred.
 * @param postalCode The postal code where the transaction occurred.
 * @param country The ISO 3166-1 alpha-2 country code where the transaction occurred.
 * @param lat The latitude where the transaction occurred.
 * @param lon The longitude where the transaction occurred.
 * @param storeNumber The merchant defined store number where the transaction occurred.
 */
@Serializable
data class TransactionLocation(
    @SerialName("address")
    val address: String? = null,
    @SerialName("city")
    val city: String? = null,
    @SerialName("region")
    val region: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("lat")
    val lat: Double? = null,
    @SerialName("lon")
    val lon: Double? = null,
    @SerialName("store_number")
    val storeNumber: String? = null
)
