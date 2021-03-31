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
 * AssetReportAuditCopyRemoveRequest defines the request schema for
 * `/asset_report/audit_copy/remove`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param auditCopyToken The `audit_copy_token` granting access to the Audit Copy you would like to
 * revoke.
 */
@Serializable
data class AssetReportAuditCopyRemoveRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("audit_copy_token")
    val auditCopyToken: String
)
