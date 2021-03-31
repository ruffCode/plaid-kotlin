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
 * Object of user ID and auth token pair, permitting Plaid to aggregate a user’s accounts
 * @param userId Opaque user identifier
 * @param authToken Authorization token Plaid will use to aggregate this user’s accounts
 */
@Serializable
data class ItemImportRequestUserAuth(
    @SerialName("user_id")
    val userId: String,
    @SerialName("auth_token")
    val authToken: String
)
