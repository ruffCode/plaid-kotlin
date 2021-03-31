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

/**
 * Your Plaid API `secret`.
 */
typealias APISecret = String

/**
 * The access token associated with the Item data is being requested for.
 */
typealias AccessToken = String

/**
 * A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.
 */
typealias AssetReportId = String

typealias AssetReportPDFGetResponse = ByteArray

/**
 * The `asset_report_token` returned by the original call to `/asset_report/create`
 */
typealias AssetReportRefreshAssetReportToken = String

/**
 * A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get`
 * to fetch or update an Asset Report.
 */
typealias AssetReportToken = String

/**
 * The Plaid `access_token` for the account that will be debited or credited.
 */
typealias BankTransferAccessToken = String

// /**
// * Indicates the direction of the transfer: `outbound` for API-initiated transfers, or `inbound` for
// * payments received by the FBO account.
// */
// typealias BankTransferDirection = String

/**
 * Plaid’s unique identifier for a bank transfer.
 */
typealias BankTransferID = String

/**
 * Your Plaid API `client_id`.
 */
typealias ClientID = String

/**
 * The `item_id` of the Item associated with this webhook, warning, or error
 */
typealias ItemId = String

/**
 * The processor token obtained from the Plaid integration partner. Processor tokens are in the
 * format: `processor-<environment>-<identifier>`
 */
typealias ProcessorToken = String

/**
 * A unique identifier for the request, which can be used for troubleshooting. This identifier, like
 * all Plaid identifiers, is case sensitive.
 */
typealias RequestID = String

/**
 * Test password to use for the creation of the Sandbox Item. Default value is `pass_good`.
 */
typealias SandboxOverridePassword = String

/**
 * Test username to use for the creation of the Sandbox Item. Default value is `user_good`.
 */
typealias SandboxOverrideUsername = String

/**
 * An array of account subtypes to display in Link. If not specified, all account subtypes will be
 * shown. For a full list of valid types and subtypes, see the [Account
 * schema](/docs/api/accounts#accounts-schema).
 */
typealias AccountSubtypes = List<AccountSubtype>

/**
 * The Metadata object is a mapping of client-provided string fields to any string value. The
 * following limitations apply:
 * - The JSON values must be Strings (no nested JSON objects allowed)
 * - Only ASCII characters may be used
 * - Maximum of 50 key/value pairs
 * - Maximum key length of 40 characters
 * - Maximum value length of 500 characters
 */
typealias BankTransferMetadata = Map<String, String>
