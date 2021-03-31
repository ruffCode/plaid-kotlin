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
 * `accounts`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of
 * the account. An account may have more than one number type. If a particular identifying number type
 * is not used by any `accounts` for which data has been requested, the array for that type will be
 * empty.
 * @param ach An array of ACH numbers identifying accounts.
 * @param eft An array of EFT numbers identifying accounts.
 * @param international An array of IBAN numbers identifying accounts.
 * @param bacs An array of BACS numbers identifying accounts.
 */
@Serializable
data class AuthGetNumbers(
    @SerialName("ach")
    val ach: List<NumbersACH>? = null,
    @SerialName("eft")
    val eft: List<NumbersEFT>? = null,
    @SerialName("international")
    val international: List<NumbersInternational>? = null,
    @SerialName("bacs")
    val bacs: List<NumbersBACS>? = null
)
