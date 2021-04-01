/*
 * Copyright 2021 Alexi Bre
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
package tech.alexib.plaid.client.infrastructure

data class PlaidApiConfiguration(
    val clientId: ClientId,
    val secret: Secret,
    val baseUrl: BaseUrl = BaseUrl.Sandbox,
    val plaidVersion: PlaidVersion = PlaidVersion()
)

inline class ClientId(val value: String) {
    init {
        require(value.isNotEmpty()) { "ClientId must not be blank" }
    }
}

inline class Secret(val value: String) {
    init {
        require(value.isNotEmpty()) { "Secret must not be blank" }
    }
}

@Suppress("MagicNumber")
inline class PlaidVersion(val value: String = "2020-09-14")
