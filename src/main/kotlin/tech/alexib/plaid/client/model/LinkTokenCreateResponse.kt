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
 * LinkTokenCreateResponse defines the response schema for `/link/token/create`
 * @param linkToken A `link_token`, which can be supplied to Link in order to initialize it and
 * receive a `public_token`, which can be exchanged for an `access_token`.
 * @param expiration The expiration date for the `link_token`, in ISO 8601 format. A `link_token`
 * created to generate a `public_token` that will be exchanged for a new `access_token` expires after 4
 * hours. A `link_token` created for an existing Item (such as when updating an existing `access_token`
 * by launching Link in update mode) expires after 30 minutes.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class LinkTokenCreateResponse(
    @SerialName("link_token")
    val linkToken: String,
    @SerialName("expiration")
    val expiration: Instant,
    @SerialName("request_id")
    val requestId: RequestID
)
