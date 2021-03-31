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
 * An optional object to filter `/institutions/get` results.
 * @param products Filter the Institutions based on which products they support.
 * @param routingNumbers Specify an array of routing numbers to filter institutions.
 * @param oauth Limit results to institutions with or without OAuth login flows. This is primarily
 * relevant to institutions with European country codes.
 * @param includeOptionalMetadata When `true`, return the institution's homepage URL, logo and
 * primary brand color.
 *
 * Note that Plaid does not own any of the logos shared by the API, and that by accessing or using
 * these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all
 * required permissions from the appropriate rights holders and adhere to any applicable usage
 * guidelines. Plaid disclaims all express or implied warranties with respect to the logos.
 */
@Serializable
data class InstitutionsGetRequestOptions(
    @SerialName("products")
    val products: List<Products>? = null,
    @SerialName("routing_numbers")
    val routingNumbers: List<String>? = null,
    @SerialName("oauth")
    val oauth: Boolean? = null,
    @SerialName("include_optional_metadata")
    val includeOptionalMetadata: Boolean? = null
)
