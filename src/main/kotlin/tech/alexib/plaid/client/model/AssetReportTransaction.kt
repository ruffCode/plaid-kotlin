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
@file:UseSerializers(InstantSerializer::class, LocalDateSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.InstantSerializer
import tech.alexib.plaid.client.infrastructure.LocalDateSerializer

/**
 * @param transactionType Please use the `payment_channel` field, `transaction_type` will be
 * deprecated in the future.
 *
 * `digital:` transactions that took place online.
 *
 * `place:` transactions that were made at a physical location.
 *
 * `special:` transactions that relate to banks, e.g. fees or deposits.
 *
 * `unresolved:` transactions that do not fit into the other three types.
 *
 * @param transactionId The unique ID of the transaction. Like all Plaid identifiers, the
 * `transaction_id` is case sensitive.
 * @param accountOwner The name of the account owner. This field is not typically populated and only
 * relevant when dealing with sub-accounts.
 * @param pendingTransactionId The ID of a posted transaction's associated pending transaction,
 * where applicable.
 * @param pending When `true`, identifies the transaction as pending or unsettled. Pending
 * transaction details (name, type, amount, category ID) may change before they are settled.
 * @param paymentChannel The channel used to make a payment.
 * `online:` transactions that took place online.
 *
 * `in store:` transactions that were made at a physical location.
 *
 * `other:` transactions that relate to banks, e.g. fees or deposits.
 *
 * This field replaces the `transaction_type` field.
 *
 * @param paymentMeta Transaction information specific to inter-bank transfers. If the transaction
 * was not an inter-bank transfer, all fields will be `null`.
 *
 * If the `transaction` object was returned by a Transactions endpoint such as `/transactions/get`,
 * the `payment_meta` key will always appear, but no data elements are guaranteed. If the `transaction`
 * object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`,
 * this field will only appear in an Asset Report with Insights.
 * @param name The merchant name or transaction description.
 *
 * If the `transaction` object was returned by a Transactions endpoint such as `/transactions/get`,
 * this field will always appear. If the `transaction` object was returned by an Assets endpoint such
 * as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report
 * with Insights.
 * @param merchantName The merchant name, as extracted by Plaid from the `name` field.
 * @param location A representation of where a transaction took place
 * @param authorizedDate The date that the transaction was authorized. Dates are returned in an ISO
 * 8601 format ( `YYYY-MM-DD` ).
 * @param authorizedDatetime Date and time when a transaction was authorized in ISO 8601 format (
 * `YYYY-MM-DDTHH:mm:ssZ` ).
 *
 * This field is only populated for UK institutions. For institutions in other countries, will be
 * `null`.
 * @param date For pending transactions, the date that the transaction occurred; for posted
 * transactions, the date that the transaction posted. Both dates are returned in an ISO 8601 format (
 * `YYYY-MM-DD` ).
 * @param datetime Date and time when a transaction was posted in ISO 8601 format (
 * `YYYY-MM-DDTHH:mm:ssZ` ).
 *
 * This field is only populated for UK institutions. For institutions in other countries, will be
 * `null`.
 * @param categoryId The ID of the category to which this transaction belongs. See
 * [Categories](https://plaid.com/docs/#category-overview).
 *
 * If the `transaction` object was returned by an Assets endpoint such as `/asset_report/get/` or
 * `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.
 * @param category A hierarchical array of the categories to which this transaction belongs. See
 * [Categories](https://plaid.com/docs/#category-overview).
 *
 * If the `transaction` object was returned by an Assets endpoint such as `/asset_report/get/` or
 * `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.
 * @param unofficialCurrencyCode The unofficial currency code associated with the transaction.
 * Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for
 * currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies
 * of certain countries.
 *
 * See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of
 * supported `iso_currency_code`s.
 * @param isoCurrencyCode The ISO-4217 currency code of the transaction. Always `null` if
 * `unofficial_currency_code` is non-null.
 * @param amount The settled value of the transaction, denominated in the account's currency, as
 * stated in `iso_currency_code` or `unofficial_currency_code`. Positive values when money moves out of
 * the account; negative values when money moves in. For example, debit card purchases are positive;
 * credit card payments, direct deposits, and refunds are negative.
 * @param accountId The ID of the account in which this transaction occurred.
 * @param transactionCode An identifier classifying the transaction type.
 *
 * This field is only populated for European institutions. For institutions in the US and Canada,
 * this field is set to `null`.
 *
 * `adjustment:` Bank adjustment
 *
 * `atm:` Cash deposit or withdrawal via an automated teller machine
 *
 * `bank charge:` Charge or fee levied by the institution
 *
 * `bill payment`: Payment of a bill
 *
 * `cash:` Cash deposit or withdrawal
 *
 * `cashback:` Cash withdrawal while making a debit card purchase
 *
 * `cheque:` Document ordering the payment of money to another person or organization
 *
 * `direct debit:` Automatic withdrawal of funds initiated by a third party at a regular interval
 *
 * `interest:` Interest earned or incurred
 *
 * `purchase:` Purchase made with a debit or credit card
 *
 * `standing order:` Payment instructed by the account holder to a third party at a regular interval
 *
 * `transfer:` Transfer of money between accounts
 * @param dateTransacted The date on which the transaction took place, in IS0 8601 format.
 * @param originalDescription The string returned by the financial institution to describe the
 * transaction
 */
@Serializable
data class AssetReportTransaction(
    @SerialName("transaction_type")
    val transactionType: Transaction.TransactionType? = null,
    @SerialName("transaction_id")
    val transactionId: String,
    @SerialName("account_owner")
    val accountOwner: String? = null,
    @SerialName("pending_transaction_id")
    val pendingTransactionId: String? = null,
    @SerialName("pending")
    val pending: Boolean,
    @SerialName("payment_channel")
    val paymentChannel: Transaction.PaymentChannel? = null,
    @SerialName("payment_meta")
    val paymentMeta: PaymentMeta? = null,
    @SerialName("name")
    val name: String? = null,
    @SerialName("merchant_name")
    val merchantName: String? = null,
    @SerialName("location")
    val location: TransactionLocation? = null,
    @SerialName("authorized_date")
    val authorizedDate: LocalDate? = null,
    @SerialName("authorized_datetime")
    val authorizedDatetime: Instant? = null,
    @SerialName("date")
    val date: LocalDate,
    @SerialName("datetime")
    val datetime: Instant? = null,
    @SerialName("category_id")
    val categoryId: String? = null,
    @SerialName("category")
    val category: List<String>? = null,
    @SerialName("unofficial_currency_code")
    val unofficialCurrencyCode: String? = null,
    @SerialName("iso_currency_code")
    val isoCurrencyCode: String? = null,
    @SerialName("amount")
    val amount: Double,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("transaction_code")
    val transactionCode: TransactionCode? = null,
    @SerialName("date_transacted")
    val dateTransacted: String? = null,
    @SerialName("original_description")
    val originalDescription: String
)
