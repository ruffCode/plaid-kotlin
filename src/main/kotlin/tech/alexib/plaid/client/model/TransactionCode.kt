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

@Serializable
enum class TransactionCode {
    @SerialName("adjustment")
    ADJUSTMENT,

    @SerialName("atm")
    ATM,

    @SerialName("bank charge")
    BANK_CHARGE,

    @SerialName("bill payment")
    BILL_PAYMENT,

    @SerialName("cash")
    CASH,

    @SerialName("cashback")
    CASHBACK,

    @SerialName("cheque")
    CHEQUE,

    @SerialName("direct debit")
    DIRECT_DEBIT,

    @SerialName("interest")
    INTEREST,

    @SerialName("purchase")
    PURCHASE,

    @SerialName("standing order")
    STANDING_ORDER,

    @SerialName("transfer")
    TRANSFER
}
