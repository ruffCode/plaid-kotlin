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
 * AssetReportAuditCopyCreateResponse defines the response schema for `/asset_report/audit_copy/get`
 * @param auditCopyToken A token that can be shared with a third party auditor to allow them to
 * obtain access to the Asset Report. This token should be stored securely.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class AssetReportAuditCopyCreateResponse(
    @SerialName("audit_copy_token")
    val auditCopyToken: String,
    @SerialName("request_id")
    val requestId: RequestID
)
