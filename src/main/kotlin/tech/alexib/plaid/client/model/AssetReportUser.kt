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
 * The user object allows you to provide additional information about the user to be appended to the
 * Asset Report. All fields are optional. The `first_name`, `last_name`, and `ssn` fields are required
 * if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™ program.
 * @param clientUserId An identifier you determine and submit for the user.
 * @param firstName The user's first name. Required for the Fannie Mae Day 1 Certainty™ program.
 * @param middleName The user's middle name
 * @param lastName The user's last name.  Required for the Fannie Mae Day 1 Certainty™ program.
 * @param ssn The user's Social Security Number. Required for the Fannie Mae Day 1 Certainty™
 * program.
 *
 * Format: "ddd-dd-dddd"
 * @param phoneNumber The user's phone number, in E.164 format: +{countrycode}{number}. For example:
 * "+14151234567"
 * @param email The user's email address.
 */
@Serializable
data class AssetReportUser(
    @SerialName("client_user_id")
    val clientUserId: String? = null,
    @SerialName("first_name")
    val firstName: String? = null,
    @SerialName("middle_name")
    val middleName: String? = null,
    @SerialName("last_name")
    val lastName: String? = null,
    @SerialName("ssn")
    val ssn: String? = null,
    @SerialName("phone_number")
    val phoneNumber: String? = null,
    @SerialName("email")
    val email: String? = null
)
