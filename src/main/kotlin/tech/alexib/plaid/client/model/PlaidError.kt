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
 * We use standard HTTP response codes for success and failure notifications, and our errors are
 * further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X codes are
 * for developer- or user-related failures, and 50X codes are for Plaid-related issues.  Error fields
 * will be `null` if no error has occurred.
 * @param errorType A broad categorization of the error. Safe for programatic use.
 * @param errorCode The particular error code. Safe for programmatic use.
 * @param errorMessage A developer-friendly representation of the error code. This may change over
 * time and is not safe for programmatic use.
 * @param displayMessage A user-friendly representation of the error code. `null` if the error is
 * not related to user action.
 *
 * This may change over time and is not safe for programmatic use.
 * @param requestId A unique identifying the request, to be used for troubleshooting purposes. This
 * field will be omitted in errors provided by webhooks.
 * @param causes In the Assets product, a request can pertain to more than one Item. If an error is
 * returned for such a request, `causes` will return an array of errors containing a breakdown of these
 * errors on the individual Item level, if any can be identified.
 *
 * `causes` will only be provided for the `error_type` `ASSET_REPORT_ERROR`.
 * @param status The HTTP status code associated with the error. This will only be returned in the
 * response body when the error information is provided via a webhook.
 * @param documentationUrl The URL of a Plaid documentation page with more information about the
 * error
 * @param suggestedAction Suggested steps for resolving the error
 */
@Serializable
data class PlaidError(
    @SerialName("error_type")
    val errorType: ErrorType,
    @SerialName("error_code")
    val errorCode: String,
    @SerialName("error_message")
    val errorMessage: String,
    @SerialName("display_message")
    val displayMessage: String? = null,
    @SerialName("request_id")
    val requestId: String,
    @SerialName("causes")
    val causes: List<ItemGetResponseItemErrorCausesItems>? = null,
    @SerialName("status")
    val status: Double? = null,
    @SerialName("documentation_url")
    val documentationUrl: String? = null,
    @SerialName("suggested_action")
    val suggestedAction: String? = null
) : Throwable(message = errorMessage) {
    @Serializable
    enum class ErrorType {
        @SerialName("INVALID_REQUEST")
        INVALID_REQUEST,

        @SerialName("INVALID_INPUT")
        INVALID_INPUT,

        @SerialName("INSTITUTION_ERROR")
        INSTITUTION_ERROR,

        @SerialName("RATE_LIMIT_EXCEEDED")
        RATE_LIMIT_EXCEEDED,

        @SerialName("API_ERROR")
        API_ERROR,

        @SerialName("ITEM_ERROR")
        ITEM_ERROR,

        @SerialName("ASSET_REPORT_ERROR")
        ASSET_REPORT_ERROR,

        @SerialName("RECAPTCHA_ERROR")
        RECAPTCHA_ERROR,

        @SerialName("OAUTH_ERROR")
        OAUTH_ERROR,

        @SerialName("PAYMENT_ERROR")
        PAYMENT_ERROR,

        @SerialName("BANK_TRANSFER_ERROR")
        BANK_TRANSFER_ERROR
    }
}
