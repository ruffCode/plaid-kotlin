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
 * LinkTokenGetResponse defines the response schema for `/link/token/get`
 * @param linkToken A `link_token`, which can be supplied to Link in order to initialize it and
 * receive a `public_token`, which can be exchanged for an `access_token`.
 * @param createdAt The creation timestamp for the `link_token`, in ISO 8601 format.
 * @param expiration The expiration timestamp for the `link_token`, in ISO 8601 format.
 * @param metadata An object specifying the arguments originally provided to the
 * `/link/token/create` call.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class LinkTokenGetResponse(
    @SerialName("link_token")
    val linkToken: String? = null,
    @SerialName("created_at")
    val createdAt: Instant? = null,
    @SerialName("expiration")
    val expiration: Instant? = null,
    @SerialName("metadata")
    val metadata: LinkTokenGetMetadataResponse? = null,
    @SerialName("request_id")
    val requestId: RequestID
)
