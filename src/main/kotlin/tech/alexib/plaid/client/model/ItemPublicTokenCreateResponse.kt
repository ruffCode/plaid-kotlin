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
 * ItemPublicTokenCreateResponse defines the response schema for `/item/public_token/create`
 * @param publicToken A `public_token` for the particular Item corresponding to the specified
 * `access_token`
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class ItemPublicTokenCreateResponse(
    @SerialName("public_token")
    val publicToken: String,
    @SerialName("expiration")
    val expiration: Instant? = null,
    @SerialName("request_id")
    val requestId: RequestID
)
