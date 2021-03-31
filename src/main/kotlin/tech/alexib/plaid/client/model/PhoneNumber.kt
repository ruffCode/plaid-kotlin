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
 * A phone number
 * @param data The phone number.
 * @param primary When `true`, identifies the phone number as the primary number on an account.
 * @param type The type of phone number.
 */
@Serializable
data class PhoneNumber(
    @SerialName("data")
    val data: String,
    @SerialName("primary")
    val primary: Boolean? = null,
    @SerialName("type")
    val type: Type? = null
) {
    @Serializable
    enum class Type {
        @SerialName("home")
        HOME,

        @SerialName("work")
        WORK,

        @SerialName("office")
        OFFICE,

        @SerialName("mobile")
        MOBILE,

        @SerialName("mobile1")
        MOBILE_1,

        @SerialName("other")
        OTHER
    }
}
