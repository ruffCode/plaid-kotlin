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

@file:UseSerializers(LocalDateSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.LocalDateSerializer

/**
 * TransactionsGetRequest defines the request schema for `/transactions/get`
 * @param clientId Your Plaid API `client_id`.
 * @param options An optional object to be used with the request. If specified, `options` must not
 * be `null`.
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param secret Your Plaid API `secret`.
 * @param startDate The earliest date for which data should be returned. Dates should be formatted
 * as YYYY-MM-DD.
 * @param endDate The latest date for which data should be returned. Dates should be formatted as
 * YYYY-MM-DD.
 */
@Serializable
data class TransactionsGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("options")
    val options: TransactionsGetRequestOptions? = null,
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("start_date")
    val startDate: LocalDate,
    @SerialName("end_date")
    val endDate: LocalDate
)
