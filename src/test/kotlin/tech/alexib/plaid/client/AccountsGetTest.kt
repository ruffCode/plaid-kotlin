/*
 * Copyright 2021 Alexi Bre
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
package tech.alexib.plaid.client

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import tech.alexib.plaid.client.model.AccountBase
import tech.alexib.plaid.client.model.AccountSubtype
import tech.alexib.plaid.client.model.AccountType
import tech.alexib.plaid.client.model.AccountsGetRequest
import tech.alexib.plaid.client.model.AccountsGetRequestOptions
import tech.alexib.plaid.client.model.AccountsGetResponse
import tech.alexib.plaid.client.model.PlaidError
import tech.alexib.plaid.client.model.Products

class AccountsGetTest : AbstractItemIntegrationTest() {

    override fun setupItemProducts(): List<Products> = listOf(Products.TRANSACTIONS)

    override fun setupItemInstitutionId(): String {
        return TARTAN_BANK_INSTITUTION_ID
    }

    @Test
    fun testAccountsGetSuccess() {
        runBlocking {
            val request = AccountsGetRequest(accessToken = itemPublicTokenExchangeResponse!!.accessToken)

            val response: AccountsGetResponse = client()
                .accountsGet(request)

            // item should be the same one we created
            Assertions.assertEquals(getItem(), response.item)
            // assertItemEquals(getItem()!!, response.item)

            // sandbox should return expected accounts
            val accounts: List<AccountBase> = response.accounts
            Assertions.assertTrue(accounts.size > 1)
            assertAccount(
                accounts[0],
                AccountType.DEPOSITORY,
                AccountSubtype.CHECKING,
                100.0,
                110.0,
                null,
                "Plaid Checking",
                "0000",
                "Plaid Gold Standard 0% Interest Checking"
            )
            assertAccount(
                accounts[1],
                AccountType.DEPOSITORY,
                AccountSubtype.SAVINGS,
                200.0,
                210.0,
                null,
                "Plaid Saving",
                "1111",
                "Plaid Silver Standard 0.1% Interest Saving"
            )
            assertAccount(
                accounts[2],
                AccountType.DEPOSITORY,
                AccountSubtype.CD,
                null,
                1000.0,
                null,
                "Plaid CD",
                "2222",
                "Plaid Bronze Standard 0.2% Interest CD"
            )
            assertAccount(
                accounts[3],
                AccountType.CREDIT,
                AccountSubtype.CREDIT_CARD,
                null,
                410.0,
                2000.0,
                "Plaid Credit Card",
                "3333",
                "Plaid Diamond 12.5% APR Interest Credit Card"
            )
        }
    }

    @Test
    fun testAccountGetWithAccountId() {
        runBlocking {
            // first call to get an account ID
            val request: AccountsGetRequest =
                AccountsGetRequest(accessToken = itemPublicTokenExchangeResponse!!.accessToken)

            var response: AccountsGetResponse = client()
                .accountsGet(request)

            val accountId: String = response.accounts[1].accountId

            // call under test
            val accountsGetRequest: AccountsGetRequest =
                AccountsGetRequest(accessToken = itemPublicTokenExchangeResponse!!.accessToken)

            val options: AccountsGetRequestOptions = AccountsGetRequestOptions(accountIds = listOf(accountId))

            response = client().accountsGet(accountsGetRequest.copy(options = options))

            // item should be the same one we created
            assertItemEquals(getItem()!!, response.item)

            // sandbox should return expected accounts
            val accounts: List<AccountBase> = response.accounts
            Assertions.assertEquals(1, accounts.size.toLong())
            assertAccount(
                accounts[0],
                AccountType.DEPOSITORY,
                AccountSubtype.SAVINGS,
                200.0,
                210.0,
                null,
                "Plaid Saving",
                "1111",
                "Plaid Silver Standard 0.1% Interest Saving"
            )
        }
    }

    @Test
    fun testAccountGetInvalidAccountId() {
        runBlocking {
            val accountsGetRequest: AccountsGetRequest =
                AccountsGetRequest(accessToken = itemPublicTokenExchangeResponse!!.accessToken)

            val options: AccountsGetRequestOptions = AccountsGetRequestOptions(listOf("not-real"))

            try {
                client()
                    .accountsGet(accountsGetRequest.copy(options = options))
            } catch (e: Throwable) {
                assertErrorResponse(
                    e,
                    PlaidError.ErrorType.INVALID_REQUEST,
                    "INVALID_FIELD"
                )
            }
        }
    }

    @Test
    fun testAccountGetInvalidAccessToken() {
        val accountsGetRequest: AccountsGetRequest = AccountsGetRequest(accessToken = "notreal")

        runBlocking {
            try {
                client()
                    .accountsGet(accountsGetRequest)
            } catch (e: Throwable) {
                assertErrorResponse(
                    e,
                    PlaidError.ErrorType.INVALID_INPUT,
                    "INVALID_ACCESS_TOKEN"
                )
            }
        }
    }
}
