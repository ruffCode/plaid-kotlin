package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AccountType {
    @SerialName("investment")
    INVESTMENT,

    @SerialName("credit")
    CREDIT,

    @SerialName("depository")
    DEPOSITORY,

    @SerialName("loan")
    LOAN,

    @SerialName("brokerage")
    BROKERAGE,

    @SerialName("other")
    OTHER
}
