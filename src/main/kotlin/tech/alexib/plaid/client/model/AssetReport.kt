/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
