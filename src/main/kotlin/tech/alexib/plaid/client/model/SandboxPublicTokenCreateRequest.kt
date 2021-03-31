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
 * SandboxPublicTokenCreateRequest defines the request schema for `/sandbox/public_token/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param institutionId The ID of the institution the Item will be associated with
 * @param initialProducts The products to initially pull for the Item. May be any products that the
 * specified `institution_id`  supports. This array may not be empty.
 * @param options An optional set of options to be used when configuring the Item. If specified,
 * must not be `null`.
 */
@Serializable
data class SandboxPublicTokenCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("institution_id")
    val institutionId: String,
    @SerialName("initial_products")
    val initialProducts: List<Products>,
    @SerialName("options")
    val options: SandboxPublicTokenCreateRequestOptions? = null
)
