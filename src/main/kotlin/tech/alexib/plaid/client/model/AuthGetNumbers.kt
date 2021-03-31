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
 * An object containing identifying numbers used for making electronic transfers to and from the
 * `accounts`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of
 * the account. An account may have more than one number type. If a particular identifying number type
 * is not used by any `accounts` for which data has been requested, the array for that type will be
 * empty.
 * @param ach An array of ACH numbers identifying accounts.
 * @param eft An array of EFT numbers identifying accounts.
 * @param international An array of IBAN numbers identifying accounts.
 * @param bacs An array of BACS numbers identifying accounts.
 */
@Serializable
data class AuthGetNumbers(
    @SerialName("ach")
    val ach: List<NumbersACH>? = null,
    @SerialName("eft")
    val eft: List<NumbersEFT>? = null,
    @SerialName("international")
    val international: List<NumbersInternational>? = null,
    @SerialName("bacs")
    val bacs: List<NumbersBACS>? = null
)
