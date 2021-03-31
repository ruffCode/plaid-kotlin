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
 * ProcessorAuthGetResponse defines the response schema for `/processor/auth/get`
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 * @param numbers An object containing identifying numbers used for making electronic transfers to
 * and from the `account`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on
 * the country of the account. An account may have more than one number type. If a particular
 * identifying number type is not used by the `account` for which auth data has been requested, a null
 * value will be returned.
 * @param account A single account at a financial institution.
 */
@Serializable
data class ProcessorAuthGetResponse(
    @SerialName("request_id")
    val requestId: RequestID,
    @SerialName("numbers")
    val numbers: ProcessorNumber,
    @SerialName("account")
    val account: Account
)
