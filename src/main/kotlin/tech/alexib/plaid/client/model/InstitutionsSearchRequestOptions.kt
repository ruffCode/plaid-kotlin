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
 * An optional object to filter `/institutions/search` results.
 * @param oauth Limit results to institutions with or without OAuth login flows. This is primarily
 * relevant to institutions with European country codes
 * @param includeOptionalMetadata When true, return the institution's homepage URL, logo and primary
 * brand color. Learn more
 */
@Serializable
data class InstitutionsSearchRequestOptions(
    @SerialName("oauth")
    val oauth: Boolean? = null,
    @SerialName("include_optional_metadata")
    val includeOptionalMetadata: Boolean? = null,
    @SerialName("account_filter")
    val accountFilter: InstitutionsSearchAccountFilter? = null
)
