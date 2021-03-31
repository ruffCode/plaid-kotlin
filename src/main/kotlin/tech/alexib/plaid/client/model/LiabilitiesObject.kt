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
 * An object containing liability accounts
 * @param credit The credit accounts returned. If no credit accounts are returned, `credit` will not
 * be present in the schema.
 * @param mortgage The mortgage accounts returned. If no mortgage accounts are returned, `mortgage`
 * will not be present in the schema.
 * @param student The student loan accounts returned. If no student loan accounts are returned,
 * `student` will not be present in the schema.
 */
@Serializable
data class LiabilitiesObject(
    @SerialName("credit")
    val credit: List<CreditCardLiability>? = null,
    @SerialName("mortgage")
    val mortgage: List<MortgageLiability>? = null,
    @SerialName("student")
    val student: List<StudentLoan>? = null
)
