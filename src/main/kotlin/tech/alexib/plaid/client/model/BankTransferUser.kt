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
 * The legal name and other information for the account holder.
 * @param legalName The account holder’s full legal name.
 * @param emailAddress The account holder’s email.
 * @param routingNumber The account holder's routing number. This field is only used for response
 * data. Do not provide this field when making requests.
 */
@Serializable
data class BankTransferUser(
    @SerialName("legal_name")
    val legalName: String,
    @SerialName("email_address")
    val emailAddress: String? = null,
    @SerialName("routing_number")
    val routingNumber: String? = null
)
