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
 * Represents a bank transfer within the Bank Transfers API.
 * @param id Plaid’s unique identifier for a bank transfer.
 * @param achClass Specifies the use case of the transfer.  Required for transfers on an ACH
 * network.
 *
 * `"arc"` - Accounts Receivable Entry
 *
 * `"cbr`" - Cross Border Entry
 *
 * `"ccd"` - Corporate Credit or Debit - fund transfer between two corporate bank accounts
 *
 * `"cie"` - Customer Initiated Entry
 *
 * `"cor"` - Automated Notification of Change
 *
 * `"ctx"` - Corporate Trade Exchange
 *
 * `"iat"` - International
 *
 * `"mte"` - Machine Transfer Entry
 *
 * `"pbr"` - Cross Border Entry
 *
 * `"pop`" - Point-of-Purchase Entry
 *
 * `"pos"` - Point-of-Sale Entry
 *
 * `"ppd"` - Prearranged Payment or Deposit - the transfer is part of a pre-existing relationship
 * with a consumer, eg. bill payment
 *
 * `"rck"` - Re-presented Check Entry
 *
 * `"tel"` - Telephone-Initiated Entry
 *
 * `"web"` - Internet-Initiated Entry - debits from a consumer’s account where their authorization
 * is obtained over the Internet
 * @param accountId The account ID that should be credited/debited for this bank transfer.
 * @param type The type of bank transfer. This will be either `debit` or `credit`.  A `debit`
 * indicates a transfer of money into your origination account; a `credit` indicates a transfer of
 * money out of your origination account.
 * @param user The legal name and other information for the account holder.
 * @param amount The amount of the transfer (decimal string with two digits of precision e.g.
 * “10.00”).
 * @param isoCurrencyCode The currency of the transfer amount, e.g. "USD"
 * @param description The description of the transfer.
 * @param created The datetime when this bank transfer was created. This will be of the form
 * `2006-01-02T15:04:05Z`
 * @param status The status of the transfer.
 * @param network The network or rails used for the transfer. Valid options are `ach`,
 * `same-day-ach`, or `wire`.
 * @param cancellable When `true`, you can still cancel this bank transfer.
 * @param failureReason The failure reason if the type of this transfer is `"failed"` or
 * `"reversed"`. Null value otherwise.
 * @param customTag A string containing the custom tag provided by the tech.alexib.plaid.client in the create request.
 * Will be null if not provided.
 * @param metadata The Metadata object is a mapping of tech.alexib.plaid.client-provided string fields to any string
 * value. The following limitations apply:
 * - The JSON values must be Strings (no nested JSON objects allowed)
 * - Only ASCII characters may be used
 * - Maximum of 50 key/value pairs
 * - Maximum key length of 40 characters
 * - Maximum value length of 500 characters
 *
 * @param originationAccountId Plaid’s unique identifier for the origination account that was used
 * for this transfer.
 * @param direction Indicates the direction of the transfer: `outbound` for API-initiated transfers,
 * or `inbound` for payments received by the FBO account.
 */
@Serializable
data class BankTransfer(
    @SerialName("id")
    val id: BankTransferID,
    @SerialName("ach_class")
    val achClass: ACHClass,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("type")
    val type: BankTransferType,
    @SerialName("user")
    val user: BankTransferUser,
    @SerialName("amount")
    val amount: String,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerialName("description")
    val description: String,
    @SerialName("created")
    val created: String,
    @SerialName("status")
    val status: BankTransferStatus,
    @SerialName("network")
    val network: BankTransferNetwork,
    @SerialName("cancellable")
    val cancellable: Boolean,
    @SerialName("failure_reason")
    val failureReason: BankTransferFailure? = null,
    @SerialName("custom_tag")
    val customTag: String? = null,
    @SerialName("metadata")
    val metadata: BankTransferMetadata? = null,
    @SerialName("origination_account_id")
    val originationAccountId: String,
    @SerialName("direction")
    val direction: BankTransferDirection? = null
)
