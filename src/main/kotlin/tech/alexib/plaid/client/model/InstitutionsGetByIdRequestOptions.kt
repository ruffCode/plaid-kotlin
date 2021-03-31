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
 * Specifies optional parameters for `/institutions/get_by_id`. If provided, must not be `null`.
 * @param includeOptionalMetadata When `true`, return an institution's logo, brand color, and URL.
 * When available, the bank's logo is returned as a base64 encoded 152x152 PNG, the brand color is in
 * hexadecimal format. The default value is `false`.
 *
 * Note that Plaid does not own any of the logos shared by the API and that by accessing or using
 * these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all
 * required permissions from the appropriate rights holders and adhere to any applicable usage
 * guidelines. Plaid disclaims all express or implied warranties with respect to the logos.
 * @param includeStatus If `true`, the response will include status information about the
 * institution. Default value is `false`.
 */
@Serializable
data class InstitutionsGetByIdRequestOptions(
    @SerialName("include_optional_metadata")
    val includeOptionalMetadata: Boolean? = null,
    @SerialName("include_status")
    val includeStatus: Boolean? = null
)
