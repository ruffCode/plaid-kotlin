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
 * An optional set of options to be used when configuring the Item. If specified, must not be
 * `null`.
 * @param webhook Specify a webhook to associate with the new Item.
 * @param overrideUsername Test username to use for the creation of the Sandbox Item. Default value
 * is `user_good`.
 * @param overridePassword Test password to use for the creation of the Sandbox Item. Default value
 * is `pass_good`.
 * @param transactions SandboxPublicTokenCreateRequestOptionsTransactions is an optional set of
 * corresponding to transactions options.
 */
@Serializable
data class SandboxPublicTokenCreateRequestOptions(
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("override_username")
    val overrideUsername: SandboxOverrideUsername? = null,
    @SerialName("override_password")
    val overridePassword: SandboxOverridePassword? = null,
    @SerialName("transactions")
    val transactions: SandboxPublicTokenCreateRequestOptionsTransactions? = null
)
