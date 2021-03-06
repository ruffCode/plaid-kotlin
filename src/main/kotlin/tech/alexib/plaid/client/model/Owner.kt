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
 * Data returned from the financial institution about the owner or owners of an account. Only the
 * `names` array must be non-empty.
 * @param names A list of names associated with the account by the financial institution. These
 * should always be the names of individuals, even for business accounts. If the name of a business is
 * reported, please contact Plaid Support.  In the case of a joint account, the names of all account
 * holders will be reported.
 *
 * If an Item contains multiple accounts with different owner names, some institutions will report
 * all names associated with the Item in each account's `names` array.
 * @param phoneNumbers A list of phone numbers associated with the account by the financial
 * institution. May be an empty array if no relevant information is returned from the financial
 * institution.
 * @param emails A list of email addresses associated with the account by the financial institution.
 * May be an empty array if no relevant information is returned from the financial institution.
 * @param addresses Data about the various addresses associated with the account by the financial
 * institution. May be an empty array if no relevant information is returned from the financial
 * institution.
 */
@Serializable
data class Owner(
    @SerialName("names")
    val names: List<String>,
    @SerialName("phone_numbers")
    val phoneNumbers: List<PhoneNumber>,
    @SerialName("emails")
    val emails: List<Email>,
    @SerialName("addresses")
    val addresses: List<Address>
)
