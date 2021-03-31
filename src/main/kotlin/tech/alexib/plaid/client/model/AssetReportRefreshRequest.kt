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
 * AssetReportRefreshRequest defines the request schema for `/asset_report/refresh`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param assetReportToken The `asset_report_token` returned by the original call to
 * `/asset_report/create`
 * @param daysRequested The maximum number of days of history to include in the Asset Report. Must
 * be an integer. If not specified, the value from the original call to `/asset_report/create` will be
 * used.
 * @param options An optional object to filter `/asset_report/refresh` results. If provided, cannot
 * be `null`. If not specified, the `options` from the original call to `/asset_report/create` will be
 * used.
 */
@Serializable
data class AssetReportRefreshRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("asset_report_token")
    val assetReportToken: AssetReportRefreshAssetReportToken,
    @SerialName("days_requested")
    val daysRequested: Int? = null,
    @SerialName("options")
    val options: AssetReportRefreshRequestOptions? = null
)
