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
 * BankTransferBalanceGetResponse defines the response schema for `/bank_transfer/balance/get`
 * @param originationAccountId The ID of the origination account that this balance belongs to.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class BankTransferBalanceGetResponse(
    @SerialName("balance")
    val balance: BankTransferBalance,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null,
    @SerialName("request_id")
    val requestId: RequestID
)
