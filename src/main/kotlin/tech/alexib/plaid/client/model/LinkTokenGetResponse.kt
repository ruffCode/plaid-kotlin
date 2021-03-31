/*
 * Copyright 2020 Alexi Bre
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
