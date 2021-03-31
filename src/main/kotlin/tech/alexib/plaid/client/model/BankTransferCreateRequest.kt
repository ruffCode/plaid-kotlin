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
 * BankTransferCreateRequest defines the request schema for `/bank_transfer/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param idempotencyKey A random key provided by the tech.alexib.plaid.client, per unique bank transfer. Maximum of
 * 50 characters.
 *
 * The API supports idempotency for safely retrying requests without accidentally performing the
 * same operation twice. For example, if a request to create a bank transfer fails due to a network
 * connection error, you can retry the request with the same idempotency key to guarantee that only a
 * single bank transfer is created.
 * @param accessToken The Plaid `access_token` for the account that will be debited or credited.
 * @param accountId The Plaid `account_id` for the account that will be debited or credited.
 * @param type The type of bank transfer. This will be either `debit` or `credit`.  A `debit`
 * indicates a transfer of money into your origination account; a `credit` indicates a transfer of
 * money out of your origination account.
 * @param network The network or rails used for the transfer. Valid options are `ach`,
 * `same-day-ach`, or `wire`.
 * @param amount The transfer amount (decimal string with two digits of precision e.g. "10.00").
 * @param isoCurrencyCode The currency of the transfer amount – should be set to "USD".
 * @param description The transfer description. Maximum of 10 characters.
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
 * @param user The legal name and other information for the account holder.
 * @param customTag An arbitrary string provided by the tech.alexib.plaid.client for storage with the bank transfer.
 * Will be returned in all `BankTransfer` objects. May be up to 100 characters.
 * @param metadata The Metadata object is a mapping of tech.alexib.plaid.client-provided string fields to any string
 * value. The following limitations apply:
 * - The JSON values must be Strings (no nested JSON objects allowed)
 * - Only ASCII characters may be used
 * - Maximum of 50 key/value pairs
 * - Maximum key length of 40 characters
 * - Maximum value length of 500 characters
 *
 * @param originationAccountId Plaid’s unique identifier for the origination account for this
 * transfer. If you have more than one origination account, this value must be specified.
 */
@Serializable
data class BankTransferCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("idempotency_key")
    val idempotencyKey: String,
    @SerialName("access_token")
    val accessToken: BankTransferAccessToken,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("type")
    val type: BankTransferType,
    @SerialName("network")
    val network: BankTransferNetwork,
    @SerialName("amount")
    val amount: String,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerialName("description")
    val description: String,
    @SerialName("ach_class")
    val achClass: ACHClass? = null,
    @SerialName("user")
    val user: BankTransferUser,
    @SerialName("custom_tag")
    val customTag: String? = null,
    @SerialName("metadata")
    val metadata: BankTransferMetadata? = null,
    @SerialName("origination_account_id")
    val originationAccountId: String? = null
)
