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
 * AssetReportGetResponse defines the response schema for `/asset_report/get`
 * @param report An object representing an Asset Report
 * @param warnings If the Asset Report generation was successful but identity information cannot be
 * returned, this array will contain information about the errors causing identity information to be
 * missing
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AssetReportGetResponse(
    @SerialName("report")
    val report: AssetReport,
    @SerialName("warnings")
    val warnings: List<Warning>,
    @SerialName("request_id")
    val requestId: RequestID
)
