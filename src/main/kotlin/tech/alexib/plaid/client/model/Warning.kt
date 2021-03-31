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
 * It is possible for an Asset Report to be returned with missing account owner information. In such
 * cases, the Asset Report will contain warning data in the response, indicating why obtaining the
 * owner information failed.
 * @param warningType The warning type, which will always be `ASSET_REPORT_WARNING`
 * @param warningCode The warning code identifies a specific kind of warning. Currently, the only
 * possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not
 * available.
 * @param cause An error object and associated `item_id` used to identify a specific Item and error
 * when a batch operation operating on multiple Items has encountered an error in one of the Items.
 */
@Serializable
data class Warning(
    @SerialName("warning_type")
    val warningType: String,
    @SerialName("warning_code")
    val warningCode: String,
    @SerialName("cause")
    val cause: Cause
)
