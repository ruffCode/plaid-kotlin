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
 * An optional object to filter `/asset_report/create` results. If provided, must be non-`null`. The
 * optional `user` object is required for the report to be eligible for Fannie Mae's Day 1 Certainty
 * program.
 * @param clientReportId Client-generated identifier, which can be used by lenders to track loan
 * applications.
 * @param webhook URL to which Plaid will send Assets webhooks, for example when the requested Asset
 * Report is ready.
 * @param user The user object allows you to provide additional information about the user to be
 * appended to the Asset Report. All fields are optional. The `first_name`, `last_name`, and `ssn`
 * fields are required if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™
 * program.
 */
@Serializable
data class AssetReportCreateRequestOptions(
    @SerialName("client_report_id")
    val clientReportId: String? = null,
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("user")
    val user: AssetReportUser? = null
)
