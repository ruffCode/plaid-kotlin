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

@Serializable
data class InstitutionsSearchAccountFilter(
    @SerialName("loan")
    val loan: List<AccountSubtype>? = null,
    @SerialName("depository")
    val depository: List<AccountSubtype>? = null,
    @SerialName("credit")
    val credit: List<AccountSubtype>? = null,
    @SerialName("investment")
    val investment: List<AccountSubtype>? = null
)
