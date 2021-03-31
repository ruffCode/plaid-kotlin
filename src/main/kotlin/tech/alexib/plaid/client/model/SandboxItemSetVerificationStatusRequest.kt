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
