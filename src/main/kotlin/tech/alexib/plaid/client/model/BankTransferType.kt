package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class BankTransferType {
    @SerialName("debit")
    DEBIT,

    @SerialName("credit")
    CREDIT
}
