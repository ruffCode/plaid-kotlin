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
 * InstitutionsGetByIdRequest defines the request schema for `/institutions/get_by_id`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param institutionId The ID of the institution to get details about
 * @param countryCodes Specify an array of Plaid-supported country codes this institution supports,
 * using the ISO-3166-1 alpha-2 country code standard.
 *
 * @param options Specifies optional parameters for `/institutions/get_by_id`. If provided, must not
 * be `null`.
 */
@Serializable
data class InstitutionsGetByIdRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>,
    @SerialName("options")
    val options: InstitutionsGetByIdRequestOptions? = null
)
