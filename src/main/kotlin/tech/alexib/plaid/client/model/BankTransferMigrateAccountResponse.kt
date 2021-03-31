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
 * BankTransferMigrateAccountResponse defines the response schema for
 * `/bank_transfer/migrate_account`
 * @param accessToken The Plaid `access_token` for the newly created Item.
 * @param accountId The Plaid `account_id` for the newly created Item.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class BankTransferMigrateAccountResponse(
    @SerialName("access_token")
    val accessToken: AccessToken,
    @SerialName("account_id")
    val accountId: String,
    @SerialName("request_id")
    val requestId: RequestID
)
