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
 * An object representing an Asset Report
 * @param assetReportId A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID
 * is case sensitive.
 * @param clientReportId An identifier you determine and submit for the Asset Report.
 * @param dateGenerated The date and time when the Asset Report was created, in ISO 8601 format
 * (e.g. "2018-04-12T03:32:11Z").
 * @param daysRequested The duration of transaction history you requested
 * @param user The user object allows you to provide additional information about the user to be
 * appended to the Asset Report. All fields are optional. The `first_name`, `last_name`, and `ssn`
 * fields are required if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™
 * program.
 * @param items Data returned by Plaid about each of the Items included in the Asset Report.
 */
@Serializable
data class AssetReport(
    @SerialName("asset_report_id")
    val assetReportId: AssetReportId,
    @SerialName("client_report_id")
    val clientReportId: String,
    @SerialName("date_generated")
    val dateGenerated: String,
    @SerialName("days_requested")
    val daysRequested: Double,
    @SerialName("user")
    val user: AssetReportUser,
    @SerialName("items")
    val items: List<AssetReportItem>
)
