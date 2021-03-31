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
 * AssetReportCreateRequest defines the request schema for `/asset_report/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param accessTokens An array of access tokens corresponding to the Items that will be included in
 * the report. The `assets` product must have been initialized for the Items during link; the Assets
 * product cannot be added after initialization.
 * @param daysRequested The maximum integer number of days of history to include in the Asset
 * Report. If using Fannie Mae Day 1 Certainty, `days_requested` must be at least 61 for new
 * originations or at least 31 for refinancings.
 * @param options An optional object to filter `/asset_report/create` results. If provided, must be
 * non-`null`. The optional `user` object is required for the report to be eligible for Fannie Mae's
 * Day 1 Certainty program.
 */
@Serializable
data class AssetReportCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("access_tokens")
    val accessTokens: List<AccessToken>,
    @SerialName("days_requested")
    val daysRequested: Int,
    @SerialName("options")
    val options: AssetReportCreateRequestOptions? = null
)
