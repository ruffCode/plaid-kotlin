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
 * Information about the last webhook fired for the Item.
 * @param sentAt ISO 8601 timestamp of when the webhook was fired.
 * @param codeSent The last webhook code sent.
 */
@Serializable
data class ItemGetResponseStatusLastWebhook(
    @SerialName("sent_at")
    val sentAt: String? = null,
    @SerialName("code_sent")
    val codeSent: String? = null
)
