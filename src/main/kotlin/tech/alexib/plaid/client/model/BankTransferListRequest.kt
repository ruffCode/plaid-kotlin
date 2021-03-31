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

@file:UseSerializers(InstantSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.InstantSerializer

/**
 * BankTransferListRequest defines the request schema for `/bank_transfer/list`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param startDate The start datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param endDate The end datetime of bank transfers to list. This should be in RFC 3339 format
 * (i.e. `2019-12-06T22:35:49Z`)
 * @param count The maximum number of bank transfers to return.
 * @param offset The number of bank transfers to skip before returning results.
 * @param originationAccountId Filter bank transfers to only those originated through the specified
 * origination account.
 * @param direction Indicates the direction of the transfer: `outbound` for API-initiated transfers,
 * or `inbound` for payments received by the FBO account.
 */
@Serializable
data class BankTransferListRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("start_date")
    val startDate: Instant? = null,
    @SerialName("end_date")
    val endDate: Instant? = null,
    @SerialName("count")
    val count: Int? = null,
    @SerialName("offset")
    val offset: Int? = null,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null,
    @SerialName("direction")
    val direction: BankTransferDirection? = null
)
