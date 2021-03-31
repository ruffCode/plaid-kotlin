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
 * Details relating to a specific financial institution
 * @param institutionId Unique identifier for the institution
 * @param name The official name of the institution
 * @param products A list of the Plaid products supported by the institution
 * @param countryCodes A list of the country codes supported by the institution.
 * @param url The URL for the institution's website
 * @param primaryColor Hexadecimal representation of the primary color used by the institution
 * @param logo Base64 encoded representation of the institution's logo
 * @param routingNumbers A partial list of routing numbers associated with the institution. This
 * list is provided for the purpose of looking up institutions by routing number. It is not
 * comprehensive and should never be used as a complete list of routing numbers for an institution.
 * @param oauth Indicates that the institution has an OAuth login flow. This is primarily relevant
 * to institutions with European country codes.
 * @param status The status of an institution is determined by the health of its Item logins,
 * Transactions updates, Investments updates, Auth requests, Balance requests, and Identity requests. A
 * login attempt is conducted during the initial Item add in Link. If there is not enough traffic to
 * accurately calculate an institution's status, Plaid will return null rather than potentially
 * inaccurate data.
 *
 * Institution status is accessible in the Dashboard and via the API using the
 * `/institutions/get_by_id` endpoint with the `include_status` option set to true. Note that
 * institution status is not available in the Sandbox environment.
 *
 */
@Serializable
data class Institution(
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("name")
    val name: String,
    @SerialName("products")
    val products: List<Products>,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>,
    @SerialName("url")
    val url: String? = null,
    @SerialName("primary_color")
    val primaryColor: String? = null,
    @SerialName("logo")
    val logo: String? = null,
    @SerialName("routing_numbers")
    val routingNumbers: List<String>? = null,
    @SerialName("oauth")
    val oauth: Boolean,
    @SerialName("status")
    val status: InstitutionStatus? = null
)
