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
 * AssetReportRefreshResponse defines the response schema for `/asset_report/refresh`
 * @param assetReportId A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID
 * is case sensitive.
 * @param assetReportToken A token that can be provided to endpoints such as `/asset_report/get` or
 * `/asset_report/pdf/get` to fetch or update an Asset Report.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AssetReportRefreshResponse(
    @SerialName("asset_report_id")
    val assetReportId: AssetReportId,
    @SerialName("asset_report_token")
    val assetReportToken: AssetReportToken,
    @SerialName("request_id")
    val requestId: RequestID
)
