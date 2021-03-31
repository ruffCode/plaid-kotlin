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
 * BankTransferMigrateAccountRequest defines the request schema for `/bank_transfer/migrate_account`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param accountNumber The user's account number.
 * @param routingNumber The user's routing number.
 * @param accountType The type of the bank account (`checking` or `savings`).
 */
@Serializable
data class BankTransferMigrateAccountRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("account_number")
    val accountNumber: String,
    @SerialName("routing_number")
    val routingNumber: String,
    @SerialName("account_type")
    val accountType: String
)
