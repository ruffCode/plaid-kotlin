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
 * AssetReportFilterRequest defines the request schema for `/asset_report/filter`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param assetReportToken A token that can be provided to endpoints such as `/asset_report/get` or
 * `/asset_report/pdf/get` to fetch or update an Asset Report.
 * @param accountIdsToExclude The accounts to exclude from the Asset Report, identified by
 * `account_id`.
 */
@Serializable
data class AssetReportFilterRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("asset_report_token")
    val assetReportToken: AssetReportToken,
    @SerialName("account_ids_to_exclude")
    val accountIdsToExclude: List<String>
)
