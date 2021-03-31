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
 * An object representing an email address
 * @param data The email address.
 * @param primary When `true`, identifies the email address as the primary email on an account.
 * @param type The type of email account as described by the financial institution.
 */
@Serializable
data class Email(
    @SerialName("data")
    val data: String,
    @SerialName("primary")
    val primary: Boolean,
    @SerialName("type")
    val type: Type
) {
    @Serializable
    enum class Type {
        @SerialName("primary")
        PRIMARY,

        @SerialName("secondary")
        SECONDARY,

        @SerialName("other")
        OTHER
    }
}
