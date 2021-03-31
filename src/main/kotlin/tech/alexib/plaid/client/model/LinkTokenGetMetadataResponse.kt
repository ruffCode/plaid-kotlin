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
 * An object specifying the arguments originally provided to the `/link/token/create` call.
 * @param initialProducts The `products` specified in the `/link/token/create` call.
 * @param webhook The `webhook` specified in the `/link/token/create` call.
 * @param countryCodes The `country_codes` specified in the `/link/token/create` call.
 * @param language The `language` specified in the `/link/token/create` call.
 * @param accountFilters The `account_filters` specified in the original call to
 * `/link/token/create`.
 *
 * @param redirectUri The `redirect_uri` specified in the `/link/token/create` call.
 * @param clientName The `client_name` specified in the `/link/token/create` call.
 */
@Serializable
data class LinkTokenGetMetadataResponse(
    @SerialName("initial_products")
    val initialProducts: List<Products>? = null,
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>? = null,
    @SerialName("language")
    val language: String? = null,
    @SerialName("account_filters")
    val accountFilters: AccountFiltersResponse? = null,
    @SerialName("redirect_uri")
    val redirectUri: String? = null,
    @SerialName("client_name")
    val clientName: String? = null
)
