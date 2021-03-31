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
 * An object containing identifying numbers used for making electronic transfers to and from the
 * `account`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of
 * the account. An account may have more than one number type. If a particular identifying number type
 * is not used by the `account` for which auth data has been requested, a null value will be returned.
 */
@Serializable
data class ProcessorNumber(
    @SerialName("ach")
    val ach: NullableNumbersACH? = null,
    @SerialName("eft")
    val eft: NullableNumbersEFT? = null,
    @SerialName("international")
    val international: NullableNumbersInternational? = null,
    @SerialName("bacs")
    val bacs: NullableNumbersBACS? = null
)
