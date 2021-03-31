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
