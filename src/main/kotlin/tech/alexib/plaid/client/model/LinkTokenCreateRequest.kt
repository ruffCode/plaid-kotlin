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
 * LinkTokenCreateRequest defines the request schema for `/link/token/create`
 * @param clientId Your Plaid API `client_id`.
 * @param secret Your Plaid API `secret`.
 * @param clientName The name of your application, as it should be displayed in Link.
 * @param language The language that Link should be displayed in.
 *
 * Supported languages are:
 * - English (`'en'`)
 * - French (`'fr'`)
 * - Spanish (`'es'`)
 * - Dutch (`'nl'`)
 *
 * When using a Link customization, the language configured here must match the setting in the
 * customization, or the customization will not be applied.
 * @param countryCodes Specify an array of Plaid-supported country codes using the ISO-3166-1
 * alpha-2 country code standard. Institutions from all listed countries will be shown.  Supported
 * country codes are: `US`, `CA`, `ES`, `FR`, `GB`, `IE`, `NL`. Example value: `['US', 'CA']`.
 *
 * If Link is launched with multiple country codes, only products that you are enabled for in all
 * countries will be used by Link. Note that while all countries are enabled by default in Sandbox and
 * Development, in Production only US and Canada are enabled by default. To gain access to European
 * institutions in the Production environment, [file a product access Support
 * ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access)
 * via the Plaid dashboard. If you initialize with a European country code, your users will see the
 * European consent panel during the Link flow.
 *
 * If using a Link customization, make sure the country codes in the customization match those
 * specified in `country_codes`. If both `country_codes` and a Link customization are used, the value
 * in `country_codes` may override the value in the customization.
 *
 * If using the Auth features Instant Match, Same-day Micro-deposits, or Automated Micro-deposits,
 * `country_codes` must be set to `['US']`.
 * @param user An object specifying information about the end user who will be linking their
 * account.
 * @param products List of Plaid product(s) you wish to use. If launching Link in update mode,
 * should be omitted; required otherwise. Valid products are:
 *
 * `transactions`, `auth`, `identity`, `assets`, `investments`, `liabilities`, `payment_initiation`,
 * `deposit_switch`
 *
 * Example: `['auth', 'transactions']`
 *
 * `balance` is *not* a valid value, the Balance product does not require explicit initalization and
 * will automatically be initialized when any other product is initialized.
 *
 * Only institutions that support *all* requested products will be shown in Link; to maximize the
 * number of institutions listed, it is recommended to initialize Link with the minimal product set
 * required for your use case. Additional products can be added after Link initialization by calling
 * the relevant endpoints. For details and exceptions, see [Choosing when to initialize
 * products](/docs/link/best-practices/#choosing-when-to-initialize-products).
 *
 * In Production, you will be billed for each product that you specify when initializing Link. Note
 * that a product cannot be removed from an Item once the Item has been initialized with that product.
 * To stop billing on an Item for subscription-based products, such as Liabilities, Investments, and
 * Transactions, remove the Item via `/item/remove`.
 * @param webhook The destination URL to which any webhooks should be sent.
 * @param accessToken The `access_token` associated with the Item to update, used when updating or
 * modifying an existing `access_token`. Used when launching Link in update mode, when completing the
 * Same-day (manual) Micro-deposit flow, or (optionally) when initializing Link as part of the Payment
 * Initiation (UK and Europe) flow.
 * @param linkCustomizationName The name of the Link customization from the Plaid Dashboard to be
 * applied to Link. If not specified, the `default` customization will be used. When using a Link
 * customization, the language in the customization must match the language selected via the `language`
 * parameter, and the countries in the customization should match the country codes selected via
 * `country_codes`.
 * @param redirectUri A URI indicating the destination where a user should be forwarded after
 * completing the Link flow; used to support OAuth authentication flows when launching Link in the
 * browser or via a webview. The `redirect_uri` should not contain any query parameters. If
 * `android_package_name` is specified, this field should be left blank. Any redirect URI specified
 * here must also be added under the "Allowed redirect URIs" configuration on the [developer
 * dashboard](https://dashboard.plaid.com/team/api). In non-Sandbox (Production and Development)
 * environments, the `redirect_uri` must begin with https.
 * @param androidPackageName The name of your app's Android package. Required if using the
 * `link_token` to initialize Link on Android. When creating a `link_token` for initializing Link on
 * other platforms, this field must be left blank. Any package name specified here must also be added
 * to the Allowed Android package names setting on the [developer
 * dashboard](https://dashboard.plaid.com/team/api).
 * @param accountFilters By default, Link will only display account types that are compatible with
 * all products supplied in the `products` parameter of `/link/token/create`. You can further limit the
 * accounts shown in Link by using `account_filters` to specify the account subtypes to be shown in
 * Link. Only the specified subtypes will be shown. This filtering applies to both the Account Select
 * view (if enabled) and the Institution Select view. Institutions that do not support the selected
 * subtypes will be omitted from Link. To indicate that all subtypes should be shown, use the value
 * `"all"`. If the `account_filters` filter is used, any account type for which a filter is not
 * specified will be entirely omitted from Link. For a full list of valid types and subtypes, see the
 * [Account schema](/docs/api/accounts#accounts-schema).
 *
 * For institutions using OAuth, the filter will not affect the list of institutions or accounts
 * shown by the bank in the OAuth window.
 *
 * @param institutionId Used for certain legacy use cases
 * @param paymentInitiation Specifies options for initializing Link for use with the Payment
 * Initiation (Europe) product. This field is required if `payment_initiation` is included in the
 * `products` array.
 * @param depositSwitch Specifies options for initializing Link for use with the Deposit Switch
 * (beta) product. This field is required if `deposit_switch` is included in the `products` array.
 */
@Serializable
data class LinkTokenCreateRequest(
    @SerialName("client_id")
    val clientId: String? = null,
    @SerialName("secret")
    val secret: String? = null,
    @SerialName("client_name")
    val clientName: String,
    @SerialName("language")
    val language: String,
    @SerialName("country_codes")
    val countryCodes: List<CountryCode>,
    @SerialName("user")
    val user: LinkTokenCreateRequestUser,
    @SerialName("products")
    val products: List<Products>? = null,
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("access_token")
    val accessToken: String? = null,
    @SerialName("link_customization_name")
    val linkCustomizationName: String? = null,
    @SerialName("redirect_uri")
    val redirectUri: String? = null,
    @SerialName("android_package_name")
    val androidPackageName: String? = null,
    @SerialName("account_filters")
    val accountFilters: LinkTokenAccountFilters? = null,
    @SerialName("institution_id")
    val institutionId: String? = null,
    @SerialName("payment_initiation")
    val paymentInitiation: LinkTokenCreateRequestPaymentInitiation? = null,
    @SerialName("deposit_switch")
    val depositSwitch: LinkTokenCreateRequestDepositSwitch? = null
)
