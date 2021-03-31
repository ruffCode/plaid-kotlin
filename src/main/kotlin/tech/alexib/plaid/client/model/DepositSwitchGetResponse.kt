// NOTE: This file is auto generated. Do not edit the file manually!
//
// The Plaid API
// The Plaid REST API. Please see https://plaid.com/docs/api for more details.
// Version 2020-09-14_1.8.0
//
// Contact
//   Plaid Developer Team
//   URL: https://plaid.com
//

@file:UseSerializers(InstantSerializer::class)

package tech.alexib.plaid.client.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import tech.alexib.plaid.client.infrastructure.InstantSerializer

/**
 * DepositSwitchGetResponse defines the response schema for `/deposit_switch/get`
 * @param depositSwitchId The ID of the deposit switch
 * @param targetAccountId The ID of the bank account the direct deposit was switched to
 * @param targetItemId The ID of the Item the direct deposit was switched to.
 * @param state The state of the deposit switch.
 * @param accountHasMultipleAllocations When `true`, user’s direct deposit goes to multiple banks.
 * When false, user’s direct deposit only goes to the target account. Always `null` if the deposit
 * switch has not been completed.
 * @param isAllocatedRemainder When `true`, the target account is allocated the remainder of direct
 * deposit after all other allocations have been deducted. When `false`, user’s direct deposit is
 * allocated as a percent or amount. Always `null` if the deposit switch has not been completed.
 * @param percentAllocated The percentage of direct deposit allocated to the target account. Always
 * `null` if the target account is not allocated a percentage or if the deposit switch has not been
 * completed or if `is_allocated_remainder` is true.
 * @param amountAllocated The dollar amount of direct deposit allocated to the target account.
 * Always `null` if the target account is not allocated an amount or if the deposit switch has not been
 * completed.
 * @param dateCreated ISO8601 date the deposit switch was created.
 * @param dateCompleted ISO8601 date the deposit switch was completed. Always `null` if the deposit
 * switch has not been completed.
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This
 * identifier, like all Plaid identifiers, is case sensitive.
 */
@Serializable
data class DepositSwitchGetResponse(
    @SerialName("deposit_switch_id")
    val depositSwitchId: String,
    @SerialName("target_account_id")
    val targetAccountId: String? = null,
    @SerialName("target_item_id")
    val targetItemId: String? = null,
    @SerialName("state")
    val state: State,
    @SerialName("account_has_multiple_allocations")
    val accountHasMultipleAllocations: Boolean? = null,
    @SerialName("is_allocated_remainder")
    val isAllocatedRemainder: Boolean? = null,
    @SerialName("percent_allocated")
    val percentAllocated: Double? = null,
    @SerialName("amount_allocated")
    val amountAllocated: Double? = null,
    @SerialName("date_created")
    val dateCreated: Instant,
    @SerialName("date_completed")
    val dateCompleted: Instant? = null,
    @SerialName("request_id")
    val requestId: RequestID
) {
    @Serializable
    enum class State {
        @SerialName("initialized")
        INITIALIZED,

        @SerialName("completed")
        COMPLETED,

        @SerialName("error")
        ERROR
    }
}
