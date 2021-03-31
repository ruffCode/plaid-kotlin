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
 * @param value The value of the field.
 * @param verificationStatus The verification status. One of the following:
 *
 * `"VERIFIED"`: The information was successfully verified.
 *
 * `"UNVERIFIED"`: The verification has not yet been performed.
 *
 * `"NEEDS_INFO"`: The verification was attempted but could not be completed due to missing
 * information.
 *
 * "`UNABLE_TO_VERIFY`": The verification was performed and the information could not be verified.
 *
 * `"UNKNOWN"`: The verification status is unknown.
 */
@Serializable
data class EmployerIncomeSummaryFieldString(
    @SerialName("value")
    val value: String,
    @SerialName("verification_status")
    val verificationStatus: VerificationStatus
)
