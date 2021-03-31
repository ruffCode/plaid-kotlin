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
 * AssetReportAuditCopyCreateRequest defines the request schema for `/asset_report/audit_copy/get`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param assetReportToken A token that can be provided to endpoints such as `/asset_report/get` or
 * `/asset_report/pdf/get` to fetch or update an Asset Report.
 * @param auditorId The `auditor_id` of the third party with whom you would like to share the Asset
 * Report.
 */
@Serializable
data class AssetReportAuditCopyCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("asset_report_token")
    val assetReportToken: AssetReportToken,
    @SerialName("auditor_id")
    val auditorId: String
)
