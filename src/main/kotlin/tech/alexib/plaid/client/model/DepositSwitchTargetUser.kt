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
 * @param givenName The given name (first name) of the user.
 * @param familyName The family name (last name) of the user.
 * @param phone The phone number of the user. The endpoint can accept a variety of phone number
 * formats, including E.164.
 * @param email The email address of the user.
 * @param address The user's address.
 * @param taxPayerId The taxpayer ID of the user, generally their SSN, EIN, or TIN.
 */
@Serializable
data class DepositSwitchTargetUser(
    @SerialName("given_name")
    val givenName: String,
    @SerialName("family_name")
    val familyName: String,
    @SerialName("phone")
    val phone: String,
    @SerialName("email")
    val email: String,
    @SerialName("address")
    val address: DepositSwitchAddressData? = null,
    @SerialName("tax_payer_id")
    val taxPayerId: String? = null
)
