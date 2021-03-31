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
 * An optional object to filter `/institutions/search` results.
 * @param oauth Limit results to institutions with or without OAuth login flows. This is primarily
 * relevant to institutions with European country codes
 * @param includeOptionalMetadata When true, return the institution's homepage URL, logo and primary
 * brand color. Learn more
 */
@Serializable
data class InstitutionsSearchRequestOptions(
    @SerialName("oauth")
    val oauth: Boolean? = null,
    @SerialName("include_optional_metadata")
    val includeOptionalMetadata: Boolean? = null,
    @SerialName("account_filter")
    val accountFilter: InstitutionsSearchAccountFilter? = null
)
