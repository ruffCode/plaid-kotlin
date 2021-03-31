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
 * Specifies options for initializing Link for use with the Payment Initiation (Europe) product.
 * This field is required if `payment_initiation` is included in the `products` array.
 * @param paymentId The `payment_id` provided by the `/payment_initiation/payment/create` endpoint.
 */
@Serializable
data class LinkTokenCreateRequestPaymentInitiation(
    @SerialName("payment_id")
    val paymentId: String
)
