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
 * The `account_filters` specified in the original call to `/link/token/create`.
 *
 * @param depository A filter to apply to `depository`-type accounts
 * @param credit A filter to apply to `credit`-type accounts
 * @param loan A filter to apply to `loan`-type accounts
 * @param investment A filter to apply to `investment`-type accounts
 */
@Serializable
data class AccountFiltersResponse(
    @SerialName("depository")
    val depository: DepositoryFilter? = null,
    @SerialName("credit")
    val credit: CreditFilter? = null,
    @SerialName("loan")
    val loan: LoanFilter? = null,
    @SerialName("investment")
    val investment: InvestmentFilter? = null
)
