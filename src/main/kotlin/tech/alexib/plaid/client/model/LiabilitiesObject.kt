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
 * An object containing liability accounts
 * @param credit The credit accounts returned. If no credit accounts are returned, `credit` will not
 * be present in the schema.
 * @param mortgage The mortgage accounts returned. If no mortgage accounts are returned, `mortgage`
 * will not be present in the schema.
 * @param student The student loan accounts returned. If no student loan accounts are returned,
 * `student` will not be present in the schema.
 */
@Serializable
data class LiabilitiesObject(
    @SerialName("credit")
    val credit: List<CreditCardLiability>? = null,
    @SerialName("mortgage")
    val mortgage: List<MortgageLiability>? = null,
    @SerialName("student")
    val student: List<StudentLoan>? = null
)
