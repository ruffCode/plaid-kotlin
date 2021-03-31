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
 * The status of an institution is determined by the health of its Item logins, Transactions
 * updates, Investments updates, Auth requests, Balance requests, and Identity requests. A login
 * attempt is conducted during the initial Item add in Link. If there is not enough traffic to
 * accurately calculate an institution's status, Plaid will return null rather than potentially
 * inaccurate data.
 *
 * Institution status is accessible in the Dashboard and via the API using the
 * `/institutions/get_by_id` endpoint with the `include_status` option set to true. Note that
 * institution status is not available in the Sandbox environment.
 *
 * @param itemLogins A representation of the status health of a request type. Auth requests, Balance
 * requests, Identity requests, Transactions updates, Investments updates, and Item logins each have
 * their own status object.
 * @param transactionsUpdates A representation of the status health of a request type. Auth
 * requests, Balance requests, Identity requests, Transactions updates, Investments updates, and Item
 * logins each have their own status object.
 * @param auth A representation of the status health of a request type. Auth requests, Balance
 * requests, Identity requests, Transactions updates, Investments updates, and Item logins each have
 * their own status object.
 * @param balance A representation of the status health of a request type. Auth requests, Balance
 * requests, Identity requests, Transactions updates, Investments updates, and Item logins each have
 * their own status object.
 * @param identity A representation of the status health of a request type. Auth requests, Balance
 * requests, Identity requests, Transactions updates, Investments updates, and Item logins each have
 * their own status object.
 * @param investmentsUpdates A representation of the status health of a request type. Auth requests,
 * Balance requests, Identity requests, Transactions updates, Investments updates, and Item logins each
 * have their own status object.
 * @param healthIncidents Details of recent health incidents associated with the institution.
 */
@Serializable
data class InstitutionStatus(
    @SerialName("item_logins")
    val itemLogins: ProductStatus,
    @SerialName("transactions_updates")
    val transactionsUpdates: ProductStatus,
    @SerialName("auth")
    val auth: ProductStatus,
    @SerialName("balance")
    val balance: ProductStatus,
    @SerialName("identity")
    val identity: ProductStatus,
    @SerialName("investments_updates")
    val investmentsUpdates: ProductStatus,
    @SerialName("health_incidents")
    val healthIncidents: List<HealthIncident>? = null
)
