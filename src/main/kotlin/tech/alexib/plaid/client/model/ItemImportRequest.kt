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
package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ItemImportRequest defines the request schema for `/item/import`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param products Array of product strings
 * @param userAuth Object of user ID and auth token pair, permitting Plaid to aggregate a user’s
 * accounts
 * @param options An optional object to configure `/item/import` request.
 */
@Serializable
data class ItemImportRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("products")
    val products: List<Products>,
    @SerialName("user_auth")
    val userAuth: ItemImportRequestUserAuth,
    @SerialName("options")
    val options: ItemImportRequestOptions? = null
)
