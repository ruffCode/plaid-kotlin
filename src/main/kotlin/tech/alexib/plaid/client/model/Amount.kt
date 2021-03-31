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

/**
 * A payment amount.
 * @param currency The ISO-4217 currency code of the payment. For standing orders, `"GBP"` must be
 * used.
 * @param value The amount of the payment. Must contain at most two digits of precision e.g. `1.23`.
 * Minimum accepted value is `1`.
 */
@Serializable
data class Amount(
    @SerialName("currency")
    val currency: Currency,
    @SerialName("value")
    val value: Double
)

@Serializable
enum class Currency {
    @SerialName("GBP")
    GBP,

    @SerialName("EUR")
    EUR
}
