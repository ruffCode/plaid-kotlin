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
 * BankTransferMigrateAccountResponse defines the response schema for
 * `/bank_transfer/migrate_account`
 * @param accessToken The Plaid `access_token` for the newly created Item.
 * @param accountId The Plaid `account_id` for the newly created Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class BankTransferMigrateAccountResponse(
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("request_id")
    val requestId: RequestID
)
