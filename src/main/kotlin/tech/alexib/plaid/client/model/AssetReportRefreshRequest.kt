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
