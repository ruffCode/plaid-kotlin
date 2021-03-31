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
 * The optional address of the payment recipient. This object is not currently required to make
 * payments from UK institutions and should not be populated, though may be necessary for future
 * European expansion.
 * @param street An array of length 1-2 representing the street address where the recipient is
 * located. Maximum of 70 characters.
 * @param city The city where the recipient is located. Maximum of 35 characters.
 * @param postalCode The postal code where the recipient is located. Maximum of 16 characters.
 * @param country The ISO 3166-1 alpha-2 country code where the recipient is located.
 */
@Serializable
data class PaymentInitiationAddress(
    @SerialName("street")
    val street: List<String>? = null,
    @SerialName("city")
    val city: String? = null,
    @SerialName("postal_code")
    val postalCode: String? = null,
    @SerialName("country")
    val country: String? = null
)
