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
 * InstitutionsSearchRequest defines the request schema for `/institutions/search`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param query The search query. Institutions with names matching the query are returned
 * @param products Filter the Institutions based on whether they support all products listed in
 * products. Provide `null` to get institutions regardless of supported products
 * @param countryCodes Specify an array of Plaid-supported country codes this institution supports,
 * using the ISO-3166-1 alpha-2 country code standard.
 *
 * @param options An optional object to filter `/institutions/search` results.
 */
@Serializable
data class InstitutionsSearchRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("query")
    val query: String,
    @SerialName("products")
    val products: List<Products>,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>,
    @SerialName("options")
    val options: InstitutionsSearchRequestOptions? = null
)
