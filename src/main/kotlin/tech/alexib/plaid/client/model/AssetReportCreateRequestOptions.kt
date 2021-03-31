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
