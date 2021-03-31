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
 * Data about the employer.
 * @param employerId Plaid's unique identifier for the employer.
 * @param name The name of the employer
 * @param confidenceScore A number from 0 to 1 indicating Plaid's level of confidence in the pairing
 * between the employer and the institution (not yet implemented).
 */
@Serializable
data class Employer(
    @SerialName("employer_id")
    val employerId: String,
    @SerialName("name")
    val name: String,
    @SerialName("address")
    val address: NullableAddressData? = null,
    @SerialName("confidence_score")
    val confidenceScore: Double? = null
)
