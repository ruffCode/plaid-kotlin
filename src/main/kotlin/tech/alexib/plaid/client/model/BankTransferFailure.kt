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
