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
 * AssetReportAuditCopyCreateResponse defines the response schema for `/asset_report/audit_copy/get`
 * @param auditCopyToken A token that can be shared with a third party auditor to allow them to
 * obtain access to the Asset Report. This token should be stored securely.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AssetReportAuditCopyCreateResponse(
    @SerialName("audit_copy_token")
    val auditCopyToken: String,
    @SerialName("request_id")
    val requestId: RequestID
)
