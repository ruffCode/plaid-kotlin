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
 * The failure reason if the type of this transfer is `"failed"` or `"reversed"`. Null value
 * otherwise.
 * @param achReturnCode The ACH return code, e.g. `R01`.  A return code will be provided if and only
 * if the transfer status is `reversed`. For a full listing of ACH return codes, see [Bank Transfers
 * errors](/docs/errors/bank-transfers/#ach-return-codes).
 * @param description A human-readable description of the reason for the failure or reversal.
 */
@Serializable
data class BankTransferFailure(
    @SerialName("ach_return_code")
    val achReturnCode: String? = null,
    @SerialName("description")
    val description: String? = null
)
