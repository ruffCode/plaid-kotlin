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
 * InvestmentsTransactionsGetRequest defines the request schema for `/investments/transactions/get`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param accessToken The access token associated with the Item data is being requested for.
 * @param startDate The earliest date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 * @param endDate The most recent date for which to fetch transaction history. Dates should be
 * formatted as YYYY-MM-DD.
 * @param options An optional object to filter `/investments/transactions/get` results. If provided,
 * must be non-`null`.
 */
@Serializable
data class InvestmentsTransactionsGetRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("start_date")
    val startDate: LocalDate,
    @SerialName("end_date")
    val endDate: LocalDate,
    @SerialName("options")
    val options: InvestmentsTransactionsGetRequestOptions? = null
)
