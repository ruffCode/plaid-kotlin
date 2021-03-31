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
 * It is possible for an Asset Report to be returned with missing account owner information. In such
 * cases, the Asset Report will contain warning data in the response, indicating why obtaining the
 * owner information failed.
 * @param warningType The warning type, which will always be `ASSET_REPORT_WARNING`
 * @param warningCode The warning code identifies a specific kind of warning. Currently, the only
 * possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not
 * available.
 * @param cause An error object and associated `item_id` used to identify a specific Item and error
 * when a batch operation operating on multiple Items has encountered an error in one of the Items.
 */
@Serializable
data class Warning(
    @SerialName("warning_type")
    val warningType: String,
    @SerialName("warning_code")
    val warningCode: String,
    @SerialName("cause")
    val cause: Cause
)
