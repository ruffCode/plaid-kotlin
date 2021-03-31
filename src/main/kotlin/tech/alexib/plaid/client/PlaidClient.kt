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

import tech.alexib.plaid.client.infrastructure.OctetByteArray
import tech.alexib.plaid.client.infrastructure.PlaidApiConfiguration
import tech.alexib.plaid.client.infrastructure.RequestConfig
import tech.alexib.plaid.client.infrastructure.RequestMethod
import tech.alexib.plaid.client.model.AccountsBalanceGetRequest
import tech.alexib.plaid.client.model.AccountsGetRequest
import tech.alexib.plaid.client.model.AccountsGetResponse
import tech.alexib.plaid.client.model.AssetReportAuditCopyCreateRequest
import tech.alexib.plaid.client.model.AssetReportAuditCopyCreateResponse
import tech.alexib.plaid.client.model.AssetReportAuditCopyGetRequest
import tech.alexib.plaid.client.model.AssetReportAuditCopyRemoveRequest
import tech.alexib.plaid.client.model.AssetReportAuditCopyRemoveResponse
import tech.alexib.plaid.client.model.AssetReportCreateRequest
import tech.alexib.plaid.client.model.AssetReportCreateResponse
import tech.alexib.plaid.client.model.AssetReportFilterRequest
import tech.alexib.plaid.client.model.AssetReportFilterResponse
import tech.alexib.plaid.client.model.AssetReportGetRequest
import tech.alexib.plaid.client.model.AssetReportGetResponse
import tech.alexib.plaid.client.model.AssetReportPDFGetRequest
import tech.alexib.plaid.client.model.AssetReportRefreshRequest
import tech.alexib.plaid.client.model.AssetReportRefreshResponse
import tech.alexib.plaid.client.model.AssetReportRemoveRequest
import tech.alexib.plaid.client.model.AssetReportRemoveResponse
import tech.alexib.plaid.client.model.AuthGetRequest
import tech.alexib.plaid.client.model.AuthGetResponse
import tech.alexib.plaid.client.model.BankTransferBalanceGetRequest
import tech.alexib.plaid.client.model.BankTransferBalanceGetResponse
import tech.alexib.plaid.client.model.BankTransferCancelRequest
import tech.alexib.plaid.client.model.BankTransferCancelResponse
import tech.alexib.plaid.client.model.BankTransferCreateRequest
import tech.alexib.plaid.client.model.BankTransferCreateResponse
import tech.alexib.plaid.client.model.BankTransferEventListRequest
import tech.alexib.plaid.client.model.BankTransferEventListResponse
import tech.alexib.plaid.client.model.BankTransferEventSyncRequest
import tech.alexib.plaid.client.model.BankTransferEventSyncResponse
import tech.alexib.plaid.client.model.BankTransferGetRequest
import tech.alexib.plaid.client.model.BankTransferGetResponse
import tech.alexib.plaid.client.model.BankTransferListRequest
import tech.alexib.plaid.client.model.BankTransferListResponse
import tech.alexib.plaid.client.model.BankTransferMigrateAccountRequest
import tech.alexib.plaid.client.model.BankTransferMigrateAccountResponse
import tech.alexib.plaid.client.model.CategoriesGetResponse
import tech.alexib.plaid.client.model.DepositSwitchAltCreateRequest
import tech.alexib.plaid.client.model.DepositSwitchAltCreateResponse
import tech.alexib.plaid.client.model.DepositSwitchCreateRequest
import tech.alexib.plaid.client.model.DepositSwitchCreateResponse
import tech.alexib.plaid.client.model.DepositSwitchGetRequest
import tech.alexib.plaid.client.model.DepositSwitchGetResponse
import tech.alexib.plaid.client.model.DepositSwitchTokenCreateRequest
import tech.alexib.plaid.client.model.DepositSwitchTokenCreateResponse
import tech.alexib.plaid.client.model.IdentityGetRequest
import tech.alexib.plaid.client.model.IdentityGetResponse
import tech.alexib.plaid.client.model.IncomeVerificationCreateRequest
import tech.alexib.plaid.client.model.IncomeVerificationCreateResponse
import tech.alexib.plaid.client.model.IncomeVerificationDocumentsDownloadRequest
import tech.alexib.plaid.client.model.IncomeVerificationPaystubGetRequest
import tech.alexib.plaid.client.model.IncomeVerificationPaystubGetResponse
import tech.alexib.plaid.client.model.IncomeVerificationSummaryGetRequest
import tech.alexib.plaid.client.model.IncomeVerificationSummaryGetResponse
import tech.alexib.plaid.client.model.InstitutionsGetByIdRequest
import tech.alexib.plaid.client.model.InstitutionsGetByIdResponse
import tech.alexib.plaid.client.model.InstitutionsGetRequest
import tech.alexib.plaid.client.model.InstitutionsGetResponse
import tech.alexib.plaid.client.model.InstitutionsSearchRequest
import tech.alexib.plaid.client.model.InstitutionsSearchResponse
import tech.alexib.plaid.client.model.InvestmentsHoldingsGetRequest
import tech.alexib.plaid.client.model.InvestmentsHoldingsGetResponse
import tech.alexib.plaid.client.model.InvestmentsTransactionsGetRequest
import tech.alexib.plaid.client.model.InvestmentsTransactionsGetResponse
import tech.alexib.plaid.client.model.ItemAccessTokenInvalidateRequest
import tech.alexib.plaid.client.model.ItemAccessTokenInvalidateResponse
import tech.alexib.plaid.client.model.ItemGetRequest
import tech.alexib.plaid.client.model.ItemGetResponse
import tech.alexib.plaid.client.model.ItemImportRequest
import tech.alexib.plaid.client.model.ItemImportResponse
import tech.alexib.plaid.client.model.ItemPublicTokenCreateRequest
import tech.alexib.plaid.client.model.ItemPublicTokenCreateResponse
import tech.alexib.plaid.client.model.ItemPublicTokenExchangeRequest
import tech.alexib.plaid.client.model.ItemPublicTokenExchangeResponse
import tech.alexib.plaid.client.model.ItemRemoveRequest
import tech.alexib.plaid.client.model.ItemRemoveResponse
import tech.alexib.plaid.client.model.ItemWebhookUpdateRequest
import tech.alexib.plaid.client.model.ItemWebhookUpdateResponse
import tech.alexib.plaid.client.model.LiabilitiesGetRequest
import tech.alexib.plaid.client.model.LiabilitiesGetResponse
import tech.alexib.plaid.client.model.LinkTokenCreateRequest
import tech.alexib.plaid.client.model.LinkTokenCreateResponse
import tech.alexib.plaid.client.model.LinkTokenGetRequest
import tech.alexib.plaid.client.model.LinkTokenGetResponse
import tech.alexib.plaid.client.model.PaymentInitiationPaymentCreateRequest
import tech.alexib.plaid.client.model.PaymentInitiationPaymentCreateResponse
import tech.alexib.plaid.client.model.PaymentInitiationPaymentGetRequest
import tech.alexib.plaid.client.model.PaymentInitiationPaymentGetResponse
import tech.alexib.plaid.client.model.PaymentInitiationPaymentListRequest
import tech.alexib.plaid.client.model.PaymentInitiationPaymentListResponse
import tech.alexib.plaid.client.model.PaymentInitiationPaymentTokenCreateRequest
import tech.alexib.plaid.client.model.PaymentInitiationPaymentTokenCreateResponse
import tech.alexib.plaid.client.model.PaymentInitiationRecipientCreateRequest
import tech.alexib.plaid.client.model.PaymentInitiationRecipientCreateResponse
import tech.alexib.plaid.client.model.PaymentInitiationRecipientGetRequest
import tech.alexib.plaid.client.model.PaymentInitiationRecipientGetResponse
import tech.alexib.plaid.client.model.PaymentInitiationRecipientListRequest
import tech.alexib.plaid.client.model.PaymentInitiationRecipientListResponse
import tech.alexib.plaid.client.model.ProcessorApexProcessorTokenCreateRequest
import tech.alexib.plaid.client.model.ProcessorAuthGetRequest
import tech.alexib.plaid.client.model.ProcessorAuthGetResponse
import tech.alexib.plaid.client.model.ProcessorBalanceGetRequest
import tech.alexib.plaid.client.model.ProcessorBalanceGetResponse
import tech.alexib.plaid.client.model.ProcessorIdentityGetRequest
import tech.alexib.plaid.client.model.ProcessorIdentityGetResponse
import tech.alexib.plaid.client.model.ProcessorStripeBankAccountTokenCreateRequest
import tech.alexib.plaid.client.model.ProcessorStripeBankAccountTokenCreateResponse
import tech.alexib.plaid.client.model.ProcessorTokenCreateRequest
import tech.alexib.plaid.client.model.ProcessorTokenCreateResponse
import tech.alexib.plaid.client.model.SandboxBankTransferSimulateRequest
import tech.alexib.plaid.client.model.SandboxBankTransferSimulateResponse
import tech.alexib.plaid.client.model.SandboxItemFireWebhookRequest
import tech.alexib.plaid.client.model.SandboxItemFireWebhookResponse
import tech.alexib.plaid.client.model.SandboxItemResetLoginRequest
import tech.alexib.plaid.client.model.SandboxItemResetLoginResponse
import tech.alexib.plaid.client.model.SandboxItemSetVerificationStatusRequest
import tech.alexib.plaid.client.model.SandboxItemSetVerificationStatusResponse
import tech.alexib.plaid.client.model.SandboxProcessorTokenCreateRequest
import tech.alexib.plaid.client.model.SandboxProcessorTokenCreateResponse
import tech.alexib.plaid.client.model.SandboxPublicTokenCreateRequest
import tech.alexib.plaid.client.model.SandboxPublicTokenCreateResponse
import tech.alexib.plaid.client.model.TransactionsGetRequest
import tech.alexib.plaid.client.model.TransactionsGetResponse
import tech.alexib.plaid.client.model.TransactionsRefreshRequest
import tech.alexib.plaid.client.model.TransactionsRefreshResponse
import tech.alexib.plaid.client.model.WebhookVerificationKeyGetRequest
import tech.alexib.plaid.client.model.WebhookVerificationKeyGetResponse

@Suppress("LargeClass", "TooManyFunctions")
class PlaidClient constructor(
    plaidApiConfiguration: PlaidApiConfiguration
) {

    private val client = ApiClient(plaidApiConfiguration)

    private suspend inline fun <reified T> request(requestConfig: RequestConfig, body: Any?): T =
        client.request(requestConfig, body)

    /**
     * Retrieve real-time balance data
     * The &#x60;/accounts/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/accounts/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. This endpoint can be used for existing Items that were added via any of Plaid’s other products. This endpoint can be used as long as Link has been initialized with any other product, &#x60;balance&#x60; itself is not a product that can be used to initialize Link.
     * @param accountsBalanceGetRequest
     * @return AccountsGetResponse
     */

    suspend fun accountsBalanceGet(accountsBalanceGetRequest: AccountsBalanceGetRequest): AccountsGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/accounts/balance/get",
        )

        return request(
            localVariableConfig,
            accountsBalanceGetRequest,
        )
    }

    /**
     * Retrieve accounts
     * The &#x60;/accounts/get&#x60;  endpoint can be used to retrieve information for any linked Item. Note that some information is nullable. Plaid will only return active bank accounts, i.e. accounts that are not closed and are capable of carrying a balance.
     * @param accountsGetRequest
     * @return AccountsGetResponse
     */

    suspend fun accountsGet(accountsGetRequest: AccountsGetRequest): AccountsGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/accounts/get",
        )

        return request(
            localVariableConfig,
            accountsGetRequest,
        )
    }

    /**
     * Create Asset Report Audit Copy
     * Plaid can provide an Audit Copy of any Asset Report directly to a participating third party on your behalf. For example, Plaid can supply an Audit Copy directly to Fannie Mae on your behalf if you participate in the Day 1 Certainty™ program. An Audit Copy contains the same underlying data as the Asset Report.  To grant access to an Audit Copy, use the &#x60;/asset_report/audit_copy/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the third party who needs access. Each third party has its own &#x60;auditor_id&#x60;, for example &#x60;fannie_mae&#x60;. You’ll need to create a separate Audit Copy for each third party to whom you want to grant access to the Report.
     * @param assetReportAuditCopyCreateRequest
     * @return AssetReportAuditCopyCreateResponse
     */

    suspend fun assetReportAuditCopyCreate(
        assetReportAuditCopyCreateRequest: AssetReportAuditCopyCreateRequest
    ): AssetReportAuditCopyCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/audit_copy/create",

        )

        return request(
            localVariableConfig,
            assetReportAuditCopyCreateRequest,
        )
    }

    /**
     * Retrieve an Asset Report Audit Copy
     * &#x60;/asset_report/audit_copy/get&#x60; allows auditors to get a copy of an Asset Report that was previously shared via the &#x60;/asset_report/audit_copy/create&#x60; endpoint.  The caller of &#x60;/asset_report/audit_copy/create&#x60; must provide the &#x60;audit_copy_token&#x60; to the auditor.  This token can then be used to call &#x60;/asset_report/audit_copy/create&#x60;.
     * @param assetReportAuditCopyGetRequest
     * @return AssetReportGetResponse
     */

    suspend fun assetReportAuditCopyGet(
        assetReportAuditCopyGetRequest: AssetReportAuditCopyGetRequest
    ): AssetReportGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/audit_copy/get",

        )

        return request(
            localVariableConfig,
            assetReportAuditCopyGetRequest,
        )
    }

    /**
     * Remove Asset Report Audit Copy
     * The &#x60;/asset_report/audit_copy/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Asset Report, the Asset Report itself and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.
     * @param assetReportAuditCopyRemoveRequest
     * @return AssetReportAuditCopyRemoveResponse
     */

    suspend fun assetReportAuditCopyRemove(
        assetReportAuditCopyRemoveRequest: AssetReportAuditCopyRemoveRequest
    ): AssetReportAuditCopyRemoveResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/audit_copy/remove",

        )

        return request(
            localVariableConfig,
            assetReportAuditCopyRemoveRequest,
        )
    }

    /**
     * Create an Asset Report
     * The &#x60;/asset_report/create&#x60; endpoint initiates the process of creating an Asset Report, which can then be retrieved by passing the &#x60;asset_report_token&#x60; return value to the &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; endpoints.  The Asset Report takes some time to be created and is not available immediately after calling &#x60;/asset_report/create&#x60;. When the Asset Report is ready to be retrieved using &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60;, Plaid will fire a &#x60;PRODUCT_READY&#x60; webhook. For full details of the webhook schema, see [Asset Report webhooks](/docs/api/webhooks/#Assets-webhooks).  The &#x60;/asset_report/create&#x60; endpoint creates an Asset Report at a moment in time. Asset Reports are immutable. To get an updated Asset Report, use the &#x60;/asset_report/refresh&#x60; endpoint.
     * @param assetReportCreateRequest
     * @return AssetReportCreateResponse
     */

    suspend fun assetReportCreate(assetReportCreateRequest: AssetReportCreateRequest): AssetReportCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/create",

        )

        return request(
            localVariableConfig,
            assetReportCreateRequest,
        )
    }

    /**
     * Filter Asset Report
     * By default, an Asset Report will contain all of the accounts on a given Item. In some cases, you may not want the Asset Report to contain all accounts. For example, you might have the end user choose which accounts are relevant in Link using the Select Account view, which you can enable in the dashboard. Or, you might always exclude certain account types or subtypes, which you can identify by using the &#x60;/accounts/get&#x60; endpoint. To narrow an Asset Report to only a subset of accounts, use the &#x60;/asset_report/filter&#x60; endpoint.  To exclude certain Accounts from an Asset Report, first use the &#x60;/asset_report/create&#x60; endpoint to create the report, then send the &#x60;asset_report_token&#x60; along with a list of &#x60;account_ids&#x60; to exclude to the &#x60;/asset_report/filter&#x60; endpoint, to create a new Asset Report which contains only a subset of the original Asset Report&#39;s data.  Because Asset Reports are immutable, calling &#x60;/asset_report/filter&#x60; does not alter the original Asset Report in any way; rather, &#x60;/asset_report/filter&#x60; creates a new Asset Report with a new token and id. Asset Reports created via &#x60;/asset_report/filter&#x60; do not contain new Asset data, and are not billed.  Plaid will fire a [&#x60;PRODUCT_READY&#x60;](/docs/api/webhooks) webhook once generation of the filtered Asset Report has completed.
     * @param assetReportFilterRequest
     * @return AssetReportFilterResponse
     */

    suspend fun assetReportFilter(assetReportFilterRequest: AssetReportFilterRequest): AssetReportFilterResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/filter",

        )

        return request(
            localVariableConfig,
            assetReportFilterRequest,
        )
    }

    /**
     * Retrieve an Asset Report
     * The &#x60;/asset_report/get&#x60; endpoint retrieves the Asset Report in JSON format. Before calling &#x60;/asset_report/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  By default, an Asset Report includes transaction descriptions as returned by the bank, as opposed to parsed and categorized by Plaid. You can also receive cleaned and categorized transactions, as well as additional insights like merchant name or location information. We call this an Asset Report with Insights. An Asset Report with Insights provides transaction category, location, and merchant information in addition to the transaction strings provided in a standard Asset Report.  To retrieve an Asset Report with Insights, call the &#x60;/asset_report/get&#x60; endpoint with &#x60;include_insights&#x60; set to &#x60;true&#x60;. Note that you will need to [contact us](https://dashboard.plaid.com/support) to get access to this feature.
     * @param assetReportGetRequest
     * @return AssetReportGetResponse
     */

    suspend fun assetReportGet(assetReportGetRequest: AssetReportGetRequest): AssetReportGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/get",

        )

        return request(
            localVariableConfig,
            assetReportGetRequest,
        )
    }

    /**
     * Retrieve a PDF Asset Report
     * The &#x60;/asset_report/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/asset_report/pdf/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/asset_report/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report with Insights](https://plaid.com/documents/sample-asset-report.pdf).
     * @param assetReportPDFGetRequest
     * @return tech.alexib.plaid.tech.alexib.plaid.client.infrastructure.OctetByteArray
     */

    suspend fun assetReportPdfGet(assetReportPDFGetRequest: AssetReportPDFGetRequest): OctetByteArray {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/pdf/get",

        )

        return request(
            localVariableConfig,
            assetReportPDFGetRequest,
        )
    }

    /**
     * Refresh an Asset Report
     * An Asset Report is an immutable snapshot of a user&#39;s assets. In order to \&quot;refresh\&quot; an Asset Report you created previously, you can use the &#x60;/asset_report/refresh&#x60; endpoint to create a new Asset Report based on the old one, but with the most recent data available.  The new Asset Report will contain the same Items as the original Report, as well as the same filters applied by any call to &#x60;/asset_report/filter&#x60;. By default, the new Asset Report will also use the same parameters you submitted with your original &#x60;/asset_report/create&#x60; request, but the original &#x60;days_requested&#x60; value and the values of any parameters in the &#x60;options&#x60; object can be overridden with new values. To change these arguments, simply supply new values for them in your request to &#x60;/asset_report/refresh&#x60;. Submit an empty string (\&quot;\&quot;) for any previously-populated fields you would like set as empty.
     * @param assetReportRefreshRequest
     * @return AssetReportRefreshResponse
     */

    suspend fun assetReportRefresh(assetReportRefreshRequest: AssetReportRefreshRequest): AssetReportRefreshResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/refresh",

        )

        return request(
            localVariableConfig,
            assetReportRefreshRequest,
        )
    }

    /**
     * Delete an Asset Report
     * The &#x60;/item/remove&#x60; endpoint allows you to invalidate an &#x60;access_token&#x60;, meaning you will not be able to create new Asset Reports with it. Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove them specifically.  The &#x60;/asset_report/remove&#x60; endpoint allows you to remove an Asset Report. Removing an Asset Report invalidates its &#x60;asset_report_token&#x60;, meaning you will no longer be able to use it to access Report data or create new Audit Copies. Removing an Asset Report does not affect the underlying Items, but does invalidate any &#x60;audit_copy_tokens&#x60; associated with the Asset Report.
     * @param assetReportRemoveRequest
     * @return AssetReportRemoveResponse
     */

    suspend fun assetReportRemove(assetReportRemoveRequest: AssetReportRemoveRequest): AssetReportRemoveResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/asset_report/remove",
        )

        return request(
            localVariableConfig,
            assetReportRemoveRequest,
        )
    }

    /**
     * Retrieve auth data
     * The &#x60;/auth/get&#x60; endpoint returns the bank account and bank identification numbers (such as routing numbers, for US accounts) associated with an Item&#39;s checking and savings accounts, along with high-level account data and balances when available.  Note: This request may take some time to complete if &#x60;auth&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.
     * @param authGetRequest
     * @return AuthGetResponse
     */

    suspend fun authGet(authGetRequest: AuthGetRequest): AuthGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/auth/get",
        )

        return request(
            localVariableConfig,
            authGetRequest,
        )
    }

    /**
     * Get balance of your Bank Transfer account
     * Use the &#x60;/bank_transfer/balance/get&#x60; endpoint to see the available balance in your bank transfer account. Debit transfers increase this balance once their status is posted. Credit transfers decrease this balance when they are created.  The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.  Note that this endpoint can only be used with FBO accounts, when using Bank Transfers in the Full Service configuration. It cannot be used on your own account when using Bank Transfers in the BTS Platform configuration.
     * @param bankTransferBalanceGetRequest
     * @return BankTransferBalanceGetResponse
     */

    suspend fun bankTransferBalanceGet(bankTransferBalanceGetRequest: BankTransferBalanceGetRequest):
        BankTransferBalanceGetResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/bank_transfer/balance/get",
            )

            return request(
                localVariableConfig,
                bankTransferBalanceGetRequest,
            )
        }

    /**
     * Cancel a bank transfer
     * Use the &#x60;/bank_transfer/cancel&#x60; endpoint to cancel a bank transfer.  A transfer is eligible for cancelation if the &#x60;cancellable&#x60; property returned by &#x60;/bank_transfer/get&#x60; is &#x60;true&#x60;.
     * @param bankTransferCancelRequest
     * @return BankTransferCancelResponse
     */

    suspend fun bankTransferCancel(bankTransferCancelRequest: BankTransferCancelRequest): BankTransferCancelResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bank_transfer/cancel",

        )

        return request(
            localVariableConfig,
            bankTransferCancelRequest,
        )
    }

    /**
     * Create a bank transfer
     * Use the &#x60;/bank_transfer/create&#x60; endpoint to initiate a new bank transfer.
     * @param bankTransferCreateRequest
     * @return BankTransferCreateResponse
     */

    suspend fun bankTransferCreate(bankTransferCreateRequest: BankTransferCreateRequest): BankTransferCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bank_transfer/create",

        )

        return request(
            localVariableConfig,
            bankTransferCreateRequest,
        )
    }

    /**
     * List bank transfer events
     * Use the &#x60;/bank_transfer/event/list&#x60; endpoint to get a list of bank transfer events based on specified filter criteria.
     * @param bankTransferEventListRequest
     * @return BankTransferEventListResponse
     */

    suspend fun bankTransferEventList(bankTransferEventListRequest: BankTransferEventListRequest):
        BankTransferEventListResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/bank_transfer/event/list",

            )

            return request(
                localVariableConfig,
                bankTransferEventListRequest,
            )
        }

    /**
     * Sync bank transfer events
     * &#x60;/bank_transfer/event/sync&#x60; allows you to request up to the next 25 bank transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/bank_transfer/event/sync&#x60; endpoint to guarantee you have seen all bank transfer events.
     * @param bankTransferEventSyncRequest
     * @return BankTransferEventSyncResponse
     */

    suspend fun bankTransferEventSync(bankTransferEventSyncRequest: BankTransferEventSyncRequest):
        BankTransferEventSyncResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/bank_transfer/event/sync",

            )

            return request(
                localVariableConfig,
                bankTransferEventSyncRequest,
            )
        }

    /**
     * Retrieve a bank transfer
     * The &#x60;/bank_transfer/get&#x60; fetches information about the bank transfer corresponding to the given &#x60;bank_transfer_id&#x60;.
     * @param bankTransferGetRequest
     * @return BankTransferGetResponse
     */

    suspend fun bankTransferGet(bankTransferGetRequest: BankTransferGetRequest): BankTransferGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bank_transfer/get",

        )

        return request(
            localVariableConfig,
            bankTransferGetRequest,
        )
    }

    /**
     * List bank transfers
     * Use the &#x60;/bank_transfer/list&#x60; endpoint to see a list of all your bank transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired bank transfers.
     * @param bankTransferListRequest
     * @return BankTransferListResponse
     */

    suspend fun bankTransferList(bankTransferListRequest: BankTransferListRequest): BankTransferListResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bank_transfer/list",

        )

        return request(
            localVariableConfig,
            bankTransferListRequest,
        )
    }

    /**
     * Migrate account into Bank Transfers
     * As an alternative to adding Items via Link, you can also use the &#x60;/bank_transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items.  Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Bank Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/bank_transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.
     * @param bankTransferMigrateAccountRequest
     * @return BankTransferMigrateAccountResponse
     */

    suspend fun bankTransferMigrateAccount(
        bankTransferMigrateAccountRequest: BankTransferMigrateAccountRequest
    ): BankTransferMigrateAccountResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/bank_transfer/migrate_account",

        )

        return request(
            localVariableConfig,
            bankTransferMigrateAccountRequest,
        )
    }

    /**
     * Get Categories
     * Send a request to the &#x60;/categories/get&#x60;  endpoint to get detailed information on categories returned by Plaid. This endpoint does not require authentication.
     * @param body
     * @return CategoriesGetResponse
     */

    suspend fun categoriesGet(body: String): CategoriesGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/categories/get",

        )

        return request(
            localVariableConfig,
            body,
        )
    }

    /**
     * Create payment token
     * The &#x60;/payment_initiation/payment/token/create&#x60; endpoint has been deprecated. New Plaid customers will be unable to use this endpoint, and existing customers are encouraged to migrate to the newer, &#x60;link_token&#x60;-based flow. The recommended flow is to provide the &#x60;payment_id&#x60; to &#x60;/link/token/create&#x60;, which returns a &#x60;link_token&#x60; used to initialize Link.  The &#x60;/payment_initiation/payment/token/create&#x60; is used to create a &#x60;payment_token&#x60;, which can then be used in Link initialization to enter a payment initiation flow. You can only use a &#x60;payment_token&#x60; once. If this attempt fails, the end user aborts the flow, or the token expires, you will need to create a new payment token. Creating a new payment token does not require end user input.
     * @param paymentInitiationPaymentTokenCreateRequest
     * @return PaymentInitiationPaymentTokenCreateResponse
     */

    suspend fun createPaymentToken(
        paymentInitiationPaymentTokenCreateRequest: PaymentInitiationPaymentTokenCreateRequest
    ): PaymentInitiationPaymentTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/payment_initiation/payment/token/create",
        )

        return request(
            localVariableConfig,
            paymentInitiationPaymentTokenCreateRequest,
        )
    }

    /**
     * Create a deposit switch when not using Plaid Exchange.&#39;
     * This endpoint provides an alternative to &#x60;/deposit_switch/create&#x60; for customers who have not yet fully integrated with Plaid Exchange. Like &#x60;/deposit_switch/create&#x60;, it created a deposit switch entity that will be persisted throughout the lifecycle of the switch.
     * @param depositSwitchAltCreateRequest  (optional)
     * @return DepositSwitchAltCreateResponse
     */

    suspend fun depositSwitchAltCreate(
        depositSwitchAltCreateRequest: DepositSwitchAltCreateRequest?
    ): DepositSwitchAltCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/deposit_switch/alt/create",

        )

        return request(
            localVariableConfig,
            depositSwitchAltCreateRequest,
        )
    }

    /**
     * Create a deposit switch
     * This endpoint creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.
     * @param depositSwitchCreateRequest
     * @return DepositSwitchCreateResponse
     */

    suspend fun depositSwitchCreate(depositSwitchCreateRequest: DepositSwitchCreateRequest):
        DepositSwitchCreateResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/deposit_switch/create",
            )

            return request(
                localVariableConfig,
                depositSwitchCreateRequest,
            )
        }

    /**
     * Retrieve a deposit switch
     * This endpoint returns information related to how the user has configured their payroll allocation and the state of the switch. You can use this information to build logic related to the user&#39;s direct deposit allocation preferences.
     * @param depositSwitchGetRequest
     * @return DepositSwitchGetResponse
     */

    suspend fun depositSwitchGet(depositSwitchGetRequest: DepositSwitchGetRequest): DepositSwitchGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/deposit_switch/get",

        )

        return request(
            localVariableConfig,
            depositSwitchGetRequest,
        )
    }

    /**
     * Create a deposit switch token
     * In order for the end user to take action, you will need to create a public token representing the deposit switch. This token is used to initialize Link. It can be used one time and expires after 30 minutes.
     * @param depositSwitchTokenCreateRequest
     * @return DepositSwitchTokenCreateResponse
     */

    suspend fun depositSwitchTokenCreate(
        depositSwitchTokenCreateRequest: DepositSwitchTokenCreateRequest
    ): DepositSwitchTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/deposit_switch/token/create",

        )

        return request(
            localVariableConfig,
            depositSwitchTokenCreateRequest,
        )
    }

//    /**
//     * Search employer database
//     * &#x60;/employers/search&#x60; allows you the ability to search Plaid’s database of known employers, for use with Deposit Switch. You can use this endpoint to look up a user&#39;s employer in order to confirm that they are supported. Users with non-supported employers can then be routed out of the Deposit Switch flow.  The data in the employer database is currently limited. As the Verification of Income product progresses through the beta period, more employers are being regularly added. Because the employer database is frequently updated, we recommend that you do not cache or store data from this endpoint for more than a day.
//     * @param employersSearchRequest  (optional)
//     * @return EmployersSearchResponse
//     */
//
//    suspend fun employersSearch(employersSearchRequest: EmployersSearchRequest?): EmployersSearchResponse {
//
//
//
//        val localVariableBody = employersSearchRequest
//
//        val localVariableQuery = mutableMapOf<String, List<String>>()
//
//        val localVariableHeaders = mutableMapOf<String, String>()
//
//        val localVariableConfig = RequestConfig(
//            RequestMethod.POST,
//            "/employers/search",
//            query = localVariableQuery,
//            headers = localVariableHeaders
//        )
//
//        return request(
//            localVariableConfig,
//            localVariableBody,
//        )
//    }

    /**
     * Retrieve identity data
     * The &#x60;/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses. Only name data is guaranteed to be returned; other fields will be empty arrays if not provided by the institution.  Note: This request may take some time to complete if identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.
     * @param identityGetRequest
     * @return IdentityGetResponse
     */

    suspend fun identityGet(identityGetRequest: IdentityGetRequest): IdentityGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/identity/get",

        )

        return request(
            localVariableConfig,
            identityGetRequest,
        )
    }

    /**
     * Download the original documents used for income verification
     * &#x60;/income/verification/documents/download&#x60; provides the ability to download the source paystub PDF that the end user uploaded via Paystub Import.  The response to &#x60;/income/verification/documents/download&#x60; is a ZIP file in binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  In the future, when Digital Verification is available, the most recent file available for download with the payroll provider will also be available from this endpoint.
     * @param incomeVerificationDocumentsDownloadRequest  (optional)
     * @return tech.alexib.plaid.tech.alexib.plaid.client.infrastructure.OctetByteArray
     */

    suspend fun incomeVerificationDocumentsDownload(
        incomeVerificationDocumentsDownloadRequest: IncomeVerificationDocumentsDownloadRequest?
    ): OctetByteArray {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/income/verification/documents/download",

        )

        return request(
            localVariableConfig,
            incomeVerificationDocumentsDownloadRequest,
        )
    }

    /**
     * Retrieve information from the paystub used for income verification
     * &#x60;/income/verification/paystub/get&#x60; returns the information collected from the paystub that was used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.
     * @param incomeVerificationPaystubGetRequest  (optional)
     * @return IncomeVerificationPaystubGetResponse
     */

    suspend fun incomeVerificationPaystubGet(
        incomeVerificationPaystubGetRequest: IncomeVerificationPaystubGetRequest?
    ): IncomeVerificationPaystubGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/income/verification/paystub/get",

        )

        return request(
            localVariableConfig,
            incomeVerificationPaystubGetRequest,
        )
    }

    /**
     * Retrieve a summary of information derived from income verification
     * &#x60;/income/verification/summary/get&#x60; returns a verification summary for the income that was verified for an end user. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.
     * @param incomeVerificationSummaryGetRequest  (optional)
     * @return IncomeVerificationSummaryGetResponse
     */

    suspend fun incomeVerificationSummaryGet(
        incomeVerificationSummaryGetRequest: IncomeVerificationSummaryGetRequest?
    ): IncomeVerificationSummaryGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/income/verification/summary/get",

        )

        return request(
            localVariableConfig,
            incomeVerificationSummaryGetRequest,
        )
    }

    /**
     * Get details of all supported institutions
     * Returns a JSON response containing details on all financial institutions currently supported by Plaid. Because Plaid supports thousands of institutions, results are paginated.  This data changes frequently. If you store it locally on your system, be sure to update it regularly.
     * @param institutionsGetRequest
     * @return InstitutionsGetResponse
     */

    suspend fun institutionsGet(institutionsGetRequest: InstitutionsGetRequest): InstitutionsGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/institutions/get",

        )

        return request(
            localVariableConfig,
            institutionsGetRequest,
        )
    }

    /**
     * Get details of an institution
     * Returns a JSON response containing details on a specified financial institution currently supported by Plaid.
     * @param institutionsGetByIdRequest
     * @return InstitutionsGetByIdResponse
     */

    suspend fun institutionsGetById(institutionsGetByIdRequest: InstitutionsGetByIdRequest):
        InstitutionsGetByIdResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/institutions/get_by_id",

            )

            return request(
                localVariableConfig,
                institutionsGetByIdRequest,
            )
        }

    /**
     * Search institutions
     * Returns a JSON response containing details for institutions that match the query parameters, up to a maximum of ten institutions per query.
     * @param institutionsSearchRequest
     * @return InstitutionsSearchResponse
     */

    suspend fun institutionsSearch(institutionsSearchRequest: InstitutionsSearchRequest): InstitutionsSearchResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/institutions/search",

        )

        return request(
            localVariableConfig,
            institutionsSearchRequest,
        )
    }

    /**
     * Get Investment holdings
     * The &#x60;/investments/holdings/get&#x60; endpoint allows developers to receive user-authorized stock position data for &#x60;investment&#x60;-type accounts.
     * @param investmentsHoldingsGetRequest
     * @return InvestmentsHoldingsGetResponse
     */

    suspend fun investmentsHoldingsGet(investmentsHoldingsGetRequest: InvestmentsHoldingsGetRequest):
        InvestmentsHoldingsGetResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/investments/holdings/get",

            )

            return request(
                localVariableConfig,
                investmentsHoldingsGetRequest,
            )
        }

    /**
     * Get investment transactions
     * The &#x60;/investments/transactions/get&#x60; endpoint allows developers to retrieve user-authorized transaction data for investment accounts.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Due to the potentially large number of investment transactions associated with an Item, results are paginated. Manipulate the count and offset parameters in conjunction with the &#x60;total_investment_transactions&#x60; response body field to fetch all available investment transactions.
     * @param investmentsTransactionsGetRequest
     * @return InvestmentsTransactionsGetResponse
     */

    suspend fun investmentsTransactionsGet(
        investmentsTransactionsGetRequest: InvestmentsTransactionsGetRequest
    ): InvestmentsTransactionsGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/investments/transactions/get",

        )

        return request(
            localVariableConfig,
            investmentsTransactionsGetRequest,
        )
    }

    /**
     * Invalidate access_token
     * By default, the &#x60;access_token&#x60; associated with an Item does not expire and should be stored in a persistent, secure manner.  You can use the &#x60;/item/access_token/invalidate&#x60; endpoint to rotate the &#x60;access_token&#x60; associated with an Item. The endpoint returns a new &#x60;access_token&#x60; and immediately invalidates the previous &#x60;access_token&#x60;.
     * @param itemAccessTokenInvalidateRequest
     * @return ItemAccessTokenInvalidateResponse
     */

    suspend fun itemAccessTokenInvalidate(
        itemAccessTokenInvalidateRequest: ItemAccessTokenInvalidateRequest
    ): ItemAccessTokenInvalidateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/item/access_token/invalidate",

        )

        return request(
            localVariableConfig,
            itemAccessTokenInvalidateRequest,
        )
    }

    /**
     * Create public token
     * Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated. Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60; to create a Link token for use with [update mode](/docs/link/update-mode).  If you need your user to take action to restore or resolve an error associated with an Item, generate a public token with the &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. You use a &#x60;public_token&#x60; to initialize Link in [update mode](/docs/link/update-mode) for a particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token&#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead. See the [Quickstart](/docs/quickstart) for more information.
     * @param itemPublicTokenCreateRequest
     * @return ItemPublicTokenCreateResponse
     */
    @Deprecated(
        "Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated.",
        replaceWith = ReplaceWith(
            """Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60;
                to create a Link token for use with [update mode](/docs/link/update-mode).  If you need your user to 
                take action to restore or resolve an error associated with an Item, generate a public token with the 
                &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;
                public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. 
                You use a &#x60;public_token&#x60; to initialize Link in [update mode](/docs/link/update-mode) for a 
                particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link 
                to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to 
                create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token
                &#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead.
                 See the [Quickstart](/docs/quickstart) for more information."""
        )
    )

    suspend fun itemCreatePublicToken(itemPublicTokenCreateRequest: ItemPublicTokenCreateRequest):
        ItemPublicTokenCreateResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/item/public_token/create",

            )

            return request(
                localVariableConfig,
                itemPublicTokenCreateRequest,
            )
        }

    /**
     * Retrieve an Item
     * Returns information about the status of an Item.
     * @param itemGetRequest
     * @return ItemGetResponse
     */

    suspend fun itemGet(itemGetRequest: ItemGetRequest): ItemGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/item/get",

        )

        return request(
            localVariableConfig,
            itemGetRequest,
        )
    }

    /**
     * Import Item
     * &#x60;/item/import&#x60; creates an Item via your Plaid Exchange Integration and returns an &#x60;access_token&#x60;. As part of an &#x60;/item/import&#x60; request, you will include a User ID (&#x60;user_auth.user_id&#x60;) and Authentication Token (&#x60;user_auth.auth_token&#x60;) that enable data aggregation through your Plaid Exchange API endpoints. These authentication principals are to be chosen by you.  Upon creating an Item via &#x60;/item/import&#x60;, Plaid will automatically begin an extraction of that Item through the Plaid Exchange infrastructure you have already integrated. This will automatically generate the Plaid native account ID for the account the user will switch their direct deposit to (&#x60;target_account_id&#x60;).
     * @param itemImportRequest
     * @return ItemImportResponse
     */

    suspend fun itemImport(itemImportRequest: ItemImportRequest): ItemImportResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/item/import",

            ),
            itemImportRequest,
        )
    }

    /**
     * Exchange public token for an access token
     * Exchange a Link &#x60;public_token&#x60; for an API &#x60;access_token&#x60;. Link hands off the &#x60;public_token&#x60; tech.alexib.plaid.client-side via the &#x60;onSuccess&#x60; callback once a user has successfully created an Item. The &#x60;public_token&#x60; is ephemeral and expires after 30 minutes.  The response also includes an &#x60;item_id&#x60; that should be stored with the &#x60;access_token&#x60;. The &#x60;item_id&#x60; is used to identify an Item in a webhook. The &#x60;item_id&#x60; can also be retrieved by making an &#x60;/item/get&#x60; request.
     * @param itemPublicTokenExchangeRequest
     * @return ItemPublicTokenExchangeResponse
     */

    suspend fun itemPublicTokenExchange(
        itemPublicTokenExchangeRequest: ItemPublicTokenExchangeRequest
    ): ItemPublicTokenExchangeResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/item/public_token/exchange",

            ),
            itemPublicTokenExchangeRequest,
        )
    }

    /**
     * Remove an Item
     * The &#x60;/item/remove&#x60;  endpoint allows you to remove an Item. Once removed, the &#x60;access_token&#x60;  associated with the Item is no longer valid and cannot be used to access any data that was associated with the Item.  Note that in the Development environment, issuing an &#x60;/item/remove&#x60;  request will not decrement your live credential count.
     * @param itemRemoveRequest
     * @return ItemRemoveResponse
     */

    suspend fun itemRemove(itemRemoveRequest: ItemRemoveRequest): ItemRemoveResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/item/remove",

            ),
            itemRemoveRequest,
        )
    }

    /**
     * Update Webhook URL
     * The POST &#x60;/item/webhook/update&#x60; allows you to update the webhook URL associated with an Item. This request triggers a [&#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;](/docs/api/webhooks/#item-webhook-url-updated) webhook to the newly specified webhook URL.
     * @param itemWebhookUpdateRequest
     * @return ItemWebhookUpdateResponse
     */

    suspend fun itemWebhookUpdate(itemWebhookUpdateRequest: ItemWebhookUpdateRequest): ItemWebhookUpdateResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/item/webhook/update",

            ),
            itemWebhookUpdateRequest,
        )
    }

    /**
     * Retrieve Liabilities data
     * The &#x60;/liabilities/get&#x60; endpoint returns various details about an Item with loan or credit accounts. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;. To limit accounts listed in Link to types and subtypes supported by Liabilities, you can use the &#x60;account_filter&#x60; parameter when [creating a Link token](/docs/api/tokens/#linktokencreate).  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the additional data.
     * @param liabilitiesGetRequest
     * @return LiabilitiesGetResponse
     */

    suspend fun liabilitiesGet(liabilitiesGetRequest: LiabilitiesGetRequest): LiabilitiesGetResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/liabilities/get",

            ),
            liabilitiesGetRequest,
        )
    }

    /**
     * Create Link Token
     * The &#x60;/link/token/create&#x60; endpoint creates a &#x60;link_token&#x60;, which is required as a parameter when initializing Link. Once Link has been initialized, it returns a &#x60;public_token&#x60;, which can then be exchanged for an &#x60;access_token&#x60; via &#x60;/item/public_token/exchange&#x60; as part of the main Link flow.  A &#x60;link_token&#x60; generated by &#x60;/link/token/create&#x60; is also used to initialize other Link flows, such as the update mode flow for tokens with expired credentials, or the Payment Initiation (Europe) flow.
     * @param linkTokenCreateRequest
     * @return LinkTokenCreateResponse
     */

    suspend fun linkTokenCreate(linkTokenCreateRequest: LinkTokenCreateRequest): LinkTokenCreateResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/link/token/create",

            ),
            linkTokenCreateRequest,
        )
    }

    /**
     * Get Link Token
     * The &#x60;/link/token/get&#x60; endpoint gets information about a previously-created &#x60;link_token&#x60; using the &#x60;/link/token/create&#x60; endpoint. It can be useful for debugging purposes.
     * @param linkTokenGetRequest
     * @return LinkTokenGetResponse
     */

    suspend fun linkTokenGet(linkTokenGetRequest: LinkTokenGetRequest): LinkTokenGetResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/link/token/get",

            ),
            linkTokenGetRequest,
        )
    }

    /**
     * Create a payment
     * After creating a payment recipient, you can use the &#x60;/payment_initiation/payment/create&#x60; endpoint to create a payment to that recipient.  Payments can be one-time or standing order (recurring) and can be denominated in either EUR or GBP.  If making domestic GBP-denominated payments, your recipient must have been created with BACS numbers. In general, EUR-denominated payments will be sent via SEPA Credit Transfer and GBP-denominated payments will be sent via the Faster Payments network, but the payment network used will be determined by the institution. Payments sent via Faster Payments will typically arrive immediately, while payments sent via SEPA Credit Transfer will typically arrive in one business day.  Standing orders (recurring payments) must be denominated in GBP and can only be sent to recipients in the UK. Once created, standing order payments will continue indefinitely and cannot be modified or canceled via the API. An end user can cancel or modify a standing order directly on their banking application or website, or by contacting the bank. Standing orders will follow the payment rules of the underlying rails (Faster Payments in UK). Payments can be sent Monday to Friday, excluding bank holidays. If the pre-arranged date falls on a weekend or bank holiday, the payment is made on the next working day. It is not possible to guarantee the exact time the payment will reach the recipient’s account, although at least 90% of standing order payments are sent by 6am.  In the Development environment, payments must be below 5 GBP / EUR. For details on any payment limits in Production, contact your Plaid Account Manager.
     * @param paymentInitiationPaymentCreateRequest
     * @return PaymentInitiationPaymentCreateResponse
     */

    suspend fun paymentInitiationPaymentCreate(
        paymentInitiationPaymentCreateRequest: PaymentInitiationPaymentCreateRequest
    ): PaymentInitiationPaymentCreateResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/payment/create",

            ),
            paymentInitiationPaymentCreateRequest,
        )
    }

    /**
     * Get payment details
     * The &#x60;/payment_initiation/payment/get&#x60; endpoint can be used to check the status of a payment, as well as to receive basic information such as recipient and payment amount. In the case of standing orders, the &#x60;/payment_initiation/payment/get&#x60; endpoint will provide information about the status of the overall standing order itself; the API cannot be used to retrieve payment status for individual payments within a standing order.
     * @param paymentInitiationPaymentGetRequest
     * @return PaymentInitiationPaymentGetResponse
     */

    suspend fun paymentInitiationPaymentGet(
        paymentInitiationPaymentGetRequest: PaymentInitiationPaymentGetRequest
    ): PaymentInitiationPaymentGetResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/payment/get",

            ),
            paymentInitiationPaymentGetRequest,
        )
    }

    /**
     * List payments
     * The &#x60;/payment_initiation/payment/list&#x60; endpoint can be used to retrieve all created payments. By default, the 10 most recent payments are returned. You can request more payments and paginate through the results using the optional &#x60;count&#x60; and &#x60;cursor&#x60; parameters.
     * @param paymentInitiationPaymentListRequest
     * @return PaymentInitiationPaymentListResponse
     */

    suspend fun paymentInitiationPaymentList(
        paymentInitiationPaymentListRequest: PaymentInitiationPaymentListRequest
    ): PaymentInitiationPaymentListResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/payment/list",
            ),
            paymentInitiationPaymentListRequest,
        )
    }

    /**
     * Create payment recipient
     * Create a payment recipient for payment initiation.  The recipient must be in Europe, within a country that is a member of the Single Euro Payment Area (SEPA).  For a standing order (recurring) payment, the recipient must be in the UK.  The endpoint is idempotent: if a developer has already made a request with the same payment details, Plaid will return the same &#x60;recipient_id&#x60;.  In the Sandbox environment, you can use the &#x60;/payment_initiation/recipient/create&#x60; endpoint to generate recipients. Programmatic recipient creation in the Development and Production environments can be done after approval by Plaid&#39;s Compliance team. [Contact Sales](https://plaid.com/contact/)for approval.
     * @param paymentInitiationRecipientCreateRequest
     * @return PaymentInitiationRecipientCreateResponse
     */

    suspend fun paymentInitiationRecipientCreate(
        paymentInitiationRecipientCreateRequest: PaymentInitiationRecipientCreateRequest
    ): PaymentInitiationRecipientCreateResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/recipient/create",
            ),
            paymentInitiationRecipientCreateRequest,
        )
    }

    /**
     * Get payment recipient
     * Get details about a payment recipient you have previously created.
     * @param paymentInitiationRecipientGetRequest
     * @return PaymentInitiationRecipientGetResponse
     */

    suspend fun paymentInitiationRecipientGet(
        paymentInitiationRecipientGetRequest: PaymentInitiationRecipientGetRequest
    ): PaymentInitiationRecipientGetResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/recipient/get",
            ),
            paymentInitiationRecipientGetRequest,
        )
    }

    /**
     * List payment recipients
     * The &#x60;/payment_initiation/recipient/list&#x60; endpoint list the payment recipients that you have previously created.
     * @param paymentInitiationRecipientListRequest
     * @return PaymentInitiationRecipientListResponse
     */

    suspend fun paymentInitiationRecipientList(
        paymentInitiationRecipientListRequest: PaymentInitiationRecipientListRequest
    ): PaymentInitiationRecipientListResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/payment_initiation/recipient/list",
            ),
            paymentInitiationRecipientListRequest,
        )
    }

    /**
     * Create an income verification instance
     * &#x60;/income/verification/create&#x60; begins the income verification process by returning an &#x60;income_verification_id&#x60;. You can then provide the &#x60;income_verification_id&#x60; to &#x60;/link/token/create&#x60; under the &#x60;income_verification&#x60; parameter in order to create a Link instance that will prompt the user to upload their income documents. Once the documents have been uploaded and parsed, Plaid will fire an &#x60;INCOME&#x60; webhook.
     * @param incomeVerificationCreateRequest  (optional)
     * @return IncomeVerificationCreateResponse
     */

    suspend fun postIncomeVerificationCreate(
        incomeVerificationCreateRequest: IncomeVerificationCreateRequest?
    ): IncomeVerificationCreateResponse {
        return request(
            RequestConfig(
                RequestMethod.POST,
                "/income/verification/create",
            ),
            incomeVerificationCreateRequest,
        )
    }

    /**
     * Create Apex bank account token
     * Used to create a token suitable for sending to Apex to enable Plaid-Apex integrations.
     * @param processorApexProcessorTokenCreateRequest
     * @return ProcessorTokenCreateResponse
     */

    suspend fun processorApexProcessorTokenCreate(
        processorApexProcessorTokenCreateRequest: ProcessorApexProcessorTokenCreateRequest
    ): ProcessorTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/processor/apex/processor_token/create",
        )

        return request(
            localVariableConfig,
            processorApexProcessorTokenCreateRequest,
        )
    }

    /**
     * Retrieve Auth data
     * The &#x60;/processor/auth/get&#x60; endpoint returns the bank account and bank identification number (such as the routing number, for US accounts), for a checking or savings account that&#39;s associated with a given &#x60;processor_token&#x60;. The endpoint also returns high-level account data and balances when available.
     * @param processorAuthGetRequest
     * @return ProcessorAuthGetResponse
     */

    suspend fun processorAuthGet(processorAuthGetRequest: ProcessorAuthGetRequest): ProcessorAuthGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/processor/auth/get",
        )

        return request(
            localVariableConfig,
            processorAuthGetRequest,
        )
    }

    /**
     * Retrieve Balance data
     * The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/processor/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached.
     * @param processorBalanceGetRequest The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for the account associated with a given &#x60;processor_token&#x60;.  The current balance is the total amount of funds in the account. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account.  Note that not all institutions calculate the available balance. In the event that available balance is unavailable from the institution, Plaid will return an available balance value of &#x60;null&#x60;.
     * @return ProcessorBalanceGetResponse
     */

    suspend fun processorBalanceGet(processorBalanceGetRequest: ProcessorBalanceGetRequest):
        ProcessorBalanceGetResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/processor/balance/get",
            )

            return request(
                localVariableConfig,
                processorBalanceGetRequest,
            )
        }

    /**
     * Retrieve Identity data
     * The &#x60;/processor/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses.
     * @param processorIdentityGetRequest
     * @return ProcessorIdentityGetResponse
     */

    suspend fun processorIdentityGet(processorIdentityGetRequest: ProcessorIdentityGetRequest):
        ProcessorIdentityGetResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/processor/identity/get",
            )

            return request(
                localVariableConfig,
                processorIdentityGetRequest,
            )
        }

    /**
     * Create Stripe bank account token
     * Used to create a token suitable for sending to Stripe to enable Plaid-Stripe integrations.
     * @param processorStripeBankAccountTokenCreateRequest
     * @return ProcessorStripeBankAccountTokenCreateResponse
     */

    suspend fun processorStripeBankAccountTokenCreate(
        processorStripeBankAccountTokenCreateRequest: ProcessorStripeBankAccountTokenCreateRequest
    ): ProcessorStripeBankAccountTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/processor/stripe/bank_account_token/create",
        )

        return request(
            localVariableConfig,
            processorStripeBankAccountTokenCreateRequest,
        )
    }

    /**
     * Create processor token
     * Used to create a token suitable for sending to one of Plaid&#39;s partners to enable integrations. Note that Stripe partnerships use bank account tokens instead; see &#x60;/processor/stripe/bank_account_token/create&#x60; for creating tokens for use with Stripe integrations.
     * @param processorTokenCreateRequest
     * @return ProcessorTokenCreateResponse
     */

    suspend fun processorTokenCreate(processorTokenCreateRequest: ProcessorTokenCreateRequest):
        ProcessorTokenCreateResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/processor/token/create",
            )

            return request(
                localVariableConfig,
                processorTokenCreateRequest,
            )
        }

    /**
     * Simulate a bank transfer event in Sandbox
     * Use the &#x60;/sandbox/bank_transfer/simulate&#x60; endpoint to simulate a bank transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/bank_transfer/event/sync&#x60; or &#x60;/bank_transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.
     * @param sandboxBankTransferSimulateRequest
     * @return SandboxBankTransferSimulateResponse
     */

    suspend fun sandboxBankTransferSimulate(
        sandboxBankTransferSimulateRequest: SandboxBankTransferSimulateRequest
    ): SandboxBankTransferSimulateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/sandbox/bank_transfer/simulate",
        )

        return request(
            localVariableConfig,
            sandboxBankTransferSimulateRequest,
        )
    }

    /**
     * Fire a test webhook
     * The &#x60;/sandbox/item/fire_webhook&#x60; endpoint is used to test that code correctly handles webhooks. Calling this endpoint triggers a Transactions &#x60;DEFAULT_UPDATE&#x60; webhook to be fired for a given Sandbox Item. If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result.
     * @param sandboxItemFireWebhookRequest
     * @return SandboxItemFireWebhookResponse
     */

    suspend fun sandboxItemFireWebhook(sandboxItemFireWebhookRequest: SandboxItemFireWebhookRequest):
        SandboxItemFireWebhookResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/sandbox/item/fire_webhook",

            )

            return request(
                localVariableConfig,
                sandboxItemFireWebhookRequest,
            )
        }

    /**
     * Force a Sandbox Item into an error state
     * &#x60;/sandbox/item/reset_login/&#x60; forces an Item into an &#x60;ITEM_LOGIN_REQUIRED&#x60; state in order to simulate an Item whose login is no longer valid. This makes it easy to test Link&#39;s [update mode](/docs/link/update-mode) flow in the Sandbox environment.  After calling &#x60;/sandbox/item/reset_login&#x60;, You can then use Plaid Link update mode to restore the Item to a good state. An &#x60;ITEM_LOGIN_REQUIRED&#x60; webhook will also be fired after a call to this endpoint, if one is associated with the Item.   In the Sandbox, Items will transition to an &#x60;ITEM_LOGIN_REQUIRED&#x60; error state automatically after 30 days, even if this endpoint is not called.
     * @param sandboxItemResetLoginRequest
     * @return SandboxItemResetLoginResponse
     */

    suspend fun sandboxItemResetLogin(sandboxItemResetLoginRequest: SandboxItemResetLoginRequest):
        SandboxItemResetLoginResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/sandbox/item/reset_login",

            )

            return request(
                localVariableConfig,
                sandboxItemResetLoginRequest,
            )
        }

    /**
     * Set verification status for Sandbox account
     * The &#x60;/sandbox/item/set_verification_status&#x60; endpoint can be used to change the verification status of an Item in in the Sandbox in order to simulate the Automated Micro-deposit flow.  Note that not all Plaid developer accounts are enabled for micro-deposit based verification by default. Your account must be enabled for this feature in order to test it in Sandbox. To enable this features or check your status, contact your account manager or [submit a product access Support ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access).  For more information on testing Automated Micro-deposits in Sandbox, see [Auth full coverage testing](/docs/auth/coverage/testing#).
     * @param sandboxItemSetVerificationStatusRequest
     * @return SandboxItemSetVerificationStatusResponse
     */

    suspend fun sandboxItemSetVerificationStatus(
        sandboxItemSetVerificationStatusRequest: SandboxItemSetVerificationStatusRequest
    ): SandboxItemSetVerificationStatusResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/sandbox/item/set_verification_status",

        )

        return request(
            localVariableConfig,
            sandboxItemSetVerificationStatusRequest,
        )
    }

    /**
     * Create a test Item and processor token
     * Use the &#x60;/sandbox/processor_token/create&#x60; endpoint to create a valid &#x60;processor_token&#x60; for an arbitrary institution ID and test credentials. The created &#x60;processor_token&#x60; corresponds to a new Sandbox Item. You can then use this &#x60;processor_token&#x60; with the &#x60;/processor/&#x60; API endpoints in Sandbox. You can also use &#x60;/sandbox/processor_token/create&#x60; with the [&#x60;user_custom&#x60; test username](/docs/sandbox/user-custom) to generate a test account with custom data.
     * @param sandboxProcessorTokenCreateRequest  (optional)
     * @return SandboxProcessorTokenCreateResponse
     */

    suspend fun sandboxProcessorTokenCreate(
        sandboxProcessorTokenCreateRequest: SandboxProcessorTokenCreateRequest?
    ): SandboxProcessorTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/sandbox/processor_token/create",

        )

        return request(
            localVariableConfig,
            sandboxProcessorTokenCreateRequest,
        )
    }

    /**
     * Create a test Item
     * Use the &#x60;/sandbox/public_token/create&#x60;  endpoint to create a valid &#x60;public_token&#x60;  for an arbitrary institution ID, initial products, and test credentials. The created &#x60;public_token&#x60; maps to a new Sandbox Item. You can then call &#x60;/item/public_token/exchange&#x60; to exchange the &#x60;public_token&#x60; for an &#x60;access_token&#x60; and perform all API actions. &#x60;/sandbox/public_token/create&#x60; can also be used with the [&#x60;user_custom&#x60; test username](/docs/sandbox/user-custom) to generate a test account with custom data.
     * @param sandboxPublicTokenCreateRequest
     * @return SandboxPublicTokenCreateResponse
     */

    suspend fun sandboxPublicTokenCreate(
        sandboxPublicTokenCreateRequest: SandboxPublicTokenCreateRequest
    ): SandboxPublicTokenCreateResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/sandbox/public_token/create",

        )

        return request(
            localVariableConfig,
            sandboxPublicTokenCreateRequest,
        )
    }

    /**
     * Get transaction data
     * The &#x60;/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (the list of loan-type accounts supported is the same as for Liabilities; for details, see the &#x60;/liabilities/get&#x60; endpoint). For transaction history from investments accounts, use the [Investments endpoint](/docs/api/products#investments) instead. Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/transactions/get&#x60;.  For more details, see [Pending and posted transactions](/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with an Item, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Note that data may not be immediately available to &#x60;/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/transactions/get&#x60;, if it wasn&#39;t. To be alerted when transaction data is ready to be fetched, listen for the [&#x60;INITIAL_UPDATE&#x60;](/docs/api/webhooks#transactions-initial_update) and [&#x60;HISTORICAL_UPDATE&#x60;](/docs/api/webhooks#transactions-historical_update) webhooks. If no transaction history is ready when &#x60;/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.
     * @param transactionsGetRequest
     * @return TransactionsGetResponse
     */

    suspend fun transactionsGet(transactionsGetRequest: TransactionsGetRequest): TransactionsGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/transactions/get",

        )

        return request(
            localVariableConfig,
            transactionsGetRequest,
        )
    }

    /**
     * Refresh transaction data
     * &#x60;/transactions/refresh&#x60; is an optional endpoint for users of the Transactions product. It initiates an on-demand extraction to fetch the newest transactions for an Item. This on-demand extraction takes place in addition to the periodic extractions that automatically occur multiple times a day for any Transactions-enabled Item. If changes to transactions are discovered after calling &#x60;/transactions/refresh&#x60;, Plaid will fire a webhook: [&#x60;TRANSACTIONS_REMOVED&#x60;](/docs/api/webhooks#deleted-transactions-detected) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](/docs/api/webhooks#transactions-default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/transactions/get&#x60;.  Access to &#x60;/transactions/refresh&#x60; in Production is specific to certain pricing plans. If you cannot access &#x60;/transactions/refresh&#x60; in Production, [contact Sales](https://www.plaid.com/contact) for assistance.
     * @param transactionsRefreshRequest
     * @return TransactionsRefreshResponse
     */

    suspend fun transactionsRefresh(transactionsRefreshRequest: TransactionsRefreshRequest):
        TransactionsRefreshResponse {
            val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/transactions/refresh",

            )

            return request(
                localVariableConfig,
                transactionsRefreshRequest,
            )
        }

    /**
     * Get webhook verification key
     * Plaid signs all outgoing webhooks and provides JSON Web Tokens (JWTs) so that you can verify the authenticity of any incoming webhooks to your application. A message signature is included in the &#x60;Plaid-Verification&#x60; header.  The &#x60;/webhook_verification_key/get&#x60; endpoint provides a JSON Web Key (JWK) that can be used to verify a JWT.
     * @param webhookVerificationKeyGetRequest
     * @return WebhookVerificationKeyGetResponse
     */

    suspend fun webhookVerificationKeyGet(
        webhookVerificationKeyGetRequest: WebhookVerificationKeyGetRequest
    ): WebhookVerificationKeyGetResponse {
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/webhook_verification_key/get",
        )

        return request(
            localVariableConfig,
            webhookVerificationKeyGetRequest,
        )
    }
}
