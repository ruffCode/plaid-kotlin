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
 * An optional object to filter `/institutions/get` results.
 * @param products Filter the Institutions based on which products they support.
 * @param routingNumbers Specify an array of routing numbers to filter institutions.
 * @param oauth Limit results to institutions with or without OAuth login flows. This is primarily
 * relevant to institutions with European country codes.
 * @param includeOptionalMetadata When `true`, return the institution's homepage URL, logo and
 * primary brand color.
 *
 * Note that Plaid does not own any of the logos shared by the API, and that by accessing or using
 * these logos, you agree that you are doing so at your own risk and will, if necessary, obtain all
 * required permissions from the appropriate rights holders and adhere to any applicable usage
 * guidelines. Plaid disclaims all express or implied warranties with respect to the logos.
 */
@Serializable
data class InstitutionsGetRequestOptions(
    @SerialName("products")
    val products: List<Products>? = null,
    @SerialName("routing_numbers")
    val routingNumbers: List<String>? = null,
    @SerialName("oauth")
    val oauth: Boolean? = null,
    @SerialName("include_optional_metadata")
    val includeOptionalMetadata: Boolean? = null
)
