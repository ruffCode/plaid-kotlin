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
 * A JSON Web Key (JWK) that can be used in conjunction with [JWT
 * libraries](https://jwt.io/#libraries-io) to verify Plaid webhooks
 * @param alg The alg member identifies the cryptographic algorithm family used with the key.
 * @param crv The crv member identifies the cryptographic curve used with the key.
 * @param kid The kid (Key ID) member can be used to match a specific key. This can be used, for
 * instance, to choose among a set of keys within the JWK during key rollover.
 * @param kty The kty (key type) parameter identifies the cryptographic algorithm family used with
 * the key, such as RSA or EC.
 * @param use The use (public key use) parameter identifies the intended use of the public key.
 * @param x The x member contains the x coordinate for the elliptic curve point.
 * @param y The y member contains the y coordinate for the elliptic curve point.
 */
@Serializable
data class JWKPublicKey(
    @SerialName("alg")
    val alg: String? = null,
    @SerialName("crv")
    val crv: String? = null,
    @SerialName("kid")
    val kid: String? = null,
    @SerialName("kty")
    val kty: String? = null,
    @SerialName("use")
    val use: String? = null,
    @SerialName("x")
    val x: String? = null,
    @SerialName("y")
    val y: String? = null,
    @SerialName("created_at")
    val createdAt: Int? = null,
    @SerialName("expired_at")
    val expiredAt: Int? = null
)
