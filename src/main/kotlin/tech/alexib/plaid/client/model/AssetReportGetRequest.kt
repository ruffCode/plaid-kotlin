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
 * AssetReportGetRequest defines the request schema for `/asset_report/get`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param assetReportToken A token that can be provided to endpoints such as `/asset_report/get` or
 * `/asset_report/pdf/get` to fetch or update an Asset Report.
 * @param includeInsights `true` if you would like to retrieve the Asset Report with Insights,
 * `false` otherwise. This field defaults to `false` if omitted. [Contact Plaid
 * Support](https://dashboard.plaid.com/support) to get access to this feature.
 */
@Serializable
data class AssetReportGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("asset_report_token")
    val assetReportToken: AssetReportToken,
    @SerialName("include_insights")
    val includeInsights: Boolean? = null
)
