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
 * A filter to apply to `credit`-type accounts
 * @param accountSubtypes An array of account subtypes to display in Link. If not specified, all
 * account subtypes will be shown. For a full list of valid types and subtypes, see the [Account
 * schema](/docs/api/accounts#accounts-schema).
 */
@Serializable
data class CreditFilter(
    @SerialName("account_subtypes")
    val accountSubtypes: AccountSubtypes
)
