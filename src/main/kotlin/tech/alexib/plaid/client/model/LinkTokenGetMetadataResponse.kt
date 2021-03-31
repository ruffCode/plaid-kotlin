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
 * An object specifying the arguments originally provided to the `/link/token/create` call.
 * @param initialProducts The `products` specified in the `/link/token/create` call.
 * @param webhook The `webhook` specified in the `/link/token/create` call.
 * @param countryCodes The `country_codes` specified in the `/link/token/create` call.
 * @param language The `language` specified in the `/link/token/create` call.
 * @param accountFilters The `account_filters` specified in the original call to
 * `/link/token/create`.
 *
 * @param redirectUri The `redirect_uri` specified in the `/link/token/create` call.
 * @param clientName The `client_name` specified in the `/link/token/create` call.
 */
@Serializable
data class LinkTokenGetMetadataResponse(
    @SerialName("initial_products")
    val initialProducts: List<Products>? = null,
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>? = null,
    @SerialName("language")
    val language: String? = null,
    @SerialName("account_filters")
    val accountFilters: AccountFiltersResponse? = null,
    @SerialName("redirect_uri")
    val redirectUri: String? = null,
    @SerialName("client_name")
    val clientName: String? = null
)
