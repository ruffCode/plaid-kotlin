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
 * @param accountId Plaid’s unique identifier for the account. This value will not change unless
 * Plaid can't reconcile the account with the data returned by the financial institution. This may
 * occur, for example, when the name of the account changes. If this happens a new `account_id` will be
 * assigned to the account.
 *
 * The `account_id` can also change if the `access_token` is deleted and the same credentials that
 * were used to generate that `access_token` are used to generate a new `access_token` on a later date.
 * In that case, the new `account_id` will be different from the old `account_id`.
 *
 * Like all Plaid identifiers, the `account_id` is case sensitive.
 * @param balances A set of fields describing the balance for an account. Balance information may be
 * cached unless the balance object was returned by `/accounts/balance/get`.
 * @param mask The last 2-4 alphanumeric characters of an account's official account number. Note
 * that the mask may be non-unique between an Item's accounts, and it may also not match the mask that
 * the bank displays to the user.
 * @param name The name of the account, either assigned by the user or by the financial institution
 * itself
 * @param officialName The official name of the account as given by the financial institution
 * @param type `investment:` Investment account
 *
 * `credit:` Credit card
 *
 * `depository:` Depository account
 *
 * `loan:` Loan account
 *
 * `brokerage`: An investment account. Used for `/assets/` endpoints only; other endpoints use
 * `investment`.
 *
 * `other:` Non-specified account type
 *
 * See the [Account type schema](/docs/api/accounts#account-type-schema) for a full listing of
 * account types and corresponding subtypes.
 * @param subtype See the [Account type schema](/docs/api/accounts/#account-type-schema) for a full
 * listing of account types and corresponding subtypes.
 * @param verificationStatus The current verification status of an Auth Item initiated through
 * Automated or Manual micro-deposits.  Returned for Auth Items only.
 *
 * `pending_automatic_verification`: The Item is pending automatic verification
 *
 * `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items
 * remain in this state until the user successfully verifies the two amounts.
 *
 * `automatically_verified`: The Item has successfully been automatically verified
 *
 * `manually_verified`: The Item has successfully been manually verified
 *
 * `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar
 * days and will no longer attempt to validate the Item. Users may retry by submitting their
 * information again through Link.
 *
 * `verification_failed`: The Item failed manual micro-deposit verification because the user
 * exhausted all 3 verification attempts. Users may retry by submitting their information again through
 * Link.
 *
 * @param daysAvailable The duration of transaction history available for this Item, typically
 * defined as the time since the date of the earliest transaction in that account. Only returned by
 * Assets endpoints.
 * @param transactions Transaction history associated with the account. Only returned by Assets
 * endpoints. Transaction history returned by endpoints such as `/transactions/get` or
 * `/investments/transactions/get` will be returned in the top-level `transactions` field instead.
 * @param owners Data returned by the financial institution about the account owner or owners. Only
 * returned by Identity or Assets endpoints. Multiple owners on a single account will be represented in
 * the same `owner` object, not in multiple owner objects within the array.
 * @param historicalBalances Calculated data about the historical balances on the account. Only
 * returned by Assets endpoints.
 */
@Serializable
data class AccountAssets(
    @SerialName("account_id")
    val accountId: String,
    @SerialName("balances")
    val balances: AccountBalance,
    @SerialName("mask")
    val mask: String? = null,
    @SerialName("name")
    val name: String,
    @SerialName("official_name")
    val officialName: String? = null,
    @SerialName("type")
    val type: AccountType,
    @SerialName("subtype")
    val subtype: AccountSubtype? = null,
    @SerialName("verification_status")
    val verificationStatus: Account.VerificationStatus? = null,
    @SerialName("days_available")
    val daysAvailable: Double? = null,
    @SerialName("transactions")
    val transactions: List<AssetReportTransaction>? = null,
    @SerialName("owners")
    val owners: List<Owner>,
    @SerialName("historical_balances")
    val historicalBalances: List<HistoricalBalance>? = null
)
