/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
