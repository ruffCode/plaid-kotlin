// NOTE: This file is auto generated. Do not edit the file manually!
//
// The Plaid API
// The Plaid REST API. Please see https://plaid.com/docs/api for more details.
// Version 2020-09-14_1.8.0
//
// Contact
//   Plaid Developer Team
//   URL: https://plaid.com
//

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
