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
 * Metadata about the Item.
 * @param itemId The Plaid Item ID. The `item_id` is always unique; linking the same account at the
 * same institution twice will result in two Items with different `item_id` values. Like all Plaid
 * identifiers, the `item_id` is case-sensitive.
 * @param institutionId The Plaid Institution ID associated with the Item. Field is `null` for Items
 * created via Same Day Micro-deposits.
 * @param webhook The URL registered to receive webhooks for the Item.
 * @param error We use standard HTTP response codes for success and failure notifications, and our
 * errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X
 * codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.
 * Error fields will be `null` if no error has occurred.
 * @param availableProducts A list of products available for the Item that have not yet been
 * accessed.
 * @param billedProducts A list of products that have been billed for the Item. Note -
 * `billed_products` is populated in all environments but only requests in Production are billed.
 *
 * @param consentExpirationTime The RFC 3339 timestamp after which the consent provided by the end
 * user will expire. Upon consent expiration, the item will enter the `ITEM_LOGIN_REQUIRED` error
 * state. To circumvent the `ITEM_LOGIN_REQUIRED` error and maintain continuous consent, the end user
 * can reauthenticate via Link’s update mode in advance of the consent expiration time.
 *
 * Note - This is only relevant for European institutions subject to PSD2 regulations mandating a
 * 90-day consent window. For all other institutions, this field will be null.
 *
 * @param updateType Indicates whether an Item requires user interaction to be updated, which can be
 * the case for Items with some forms of two-factor authentication.
 *
 * `background` - Item can be updated in the background
 *
 * `requires_user_authentication` - Item requires user interaction to be updated
 */
@Serializable
data class Item(
    @SerialName("item_id")
    val itemId: String,
    @SerialName("institution_id")
    val institutionId: String? = null,
    @SerialName("webhook")
    val webhook: String? = null,
    @SerialName("error")
    val error: PlaidError? = null,
    @SerialName("available_products")
    val availableProducts: List<Products>,
    @SerialName("billed_products")
    val billedProducts: List<Products>,
    @SerialName("consent_expiration_time")
    val consentExpirationTime: String? = null,
    @SerialName("update_type")
    val updateType: UpdateType
) {
    @Serializable
    enum class UpdateType {
        @SerialName("background")
        BACKGROUND,

        @SerialName("requires_user_authentication")
        REQUIRES_USER_AUTHENTICATION
    }
}
