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
 * SandboxItemSetVerificationStatusRequest defines the request schema for
 * `/sandbox/item/set_verification_status`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param accountId The `account_id` of the account whose verification status is to be modified
 * @param verificationStatus The verification status to set the account to.
 */
@Serializable
data class SandboxItemSetVerificationStatusRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("verification_status")
    val verificationStatus: VerificationStatus
) {
    @Serializable
    enum class VerificationStatus {
        @SerialName("automatically_verified")
        AUTOMATICALLY_VERIFIED,

        @SerialName("verification_expired")
        VERIFICATION_EXPIRED
    }
}
