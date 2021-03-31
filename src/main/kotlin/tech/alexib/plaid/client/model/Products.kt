package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Products {
    @SerialName("assets")
    ASSETS,

    @SerialName("auth")
    AUTH,

    @SerialName("balance")
    BALANCE,

    @SerialName("identity")
    IDENTITY,

    @SerialName("investments")
    INVESTMENTS,

    @SerialName("liabilities")
    LIABILITIES,

    @SerialName("payment_initiation")
    PAYMENT_INITIATION,

    @SerialName("transactions")
    TRANSACTIONS,

    @SerialName("credit_details")
    CREDIT_DETAILS,

    @SerialName("income")
    INCOME,

    @SerialName("deposit_switch")
    DEPOSIT_SWITCH
}
