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
