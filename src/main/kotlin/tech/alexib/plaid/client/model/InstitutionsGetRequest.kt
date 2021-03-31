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
 * InstitutionsGetRequest defines the request schema for `/institutions/get`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param count The total number of Institutions to return.
 * @param offset The number of Institutions to skip.
 * @param countryCodes Specify an array of Plaid-supported country codes this institution supports,
 * using the ISO-3166-1 alpha-2 country code standard.
 *
 * @param options An optional object to filter `/institutions/get` results.
 */
@Serializable
data class InstitutionsGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("count")
    val count: Int,
    @SerialName("offset")
    val offset: Int,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>,
    @SerialName("options")
    val options: InstitutionsGetRequestOptions? = null
)
