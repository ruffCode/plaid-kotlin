package tech.alexib.plaid.client.model

import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A single account at a financial institution.
 * @param accountId Plaid’s unique identifier for the account. This value will not change unless Plaid can't reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new `account_id` will be assigned to the account.  The `account_id` can also change if the `access_token` is deleted and the same credentials that were used to generate that `access_token` are used to generate a new `access_token` on a later date. In that case, the new `account_id` will be different from the old `account_id`.  Like all Plaid identifiers, the `account_id` is case sensitive.
 * @param balances
 * @param name The name of the account, either assigned by the user or by the financial institution itself
 * @param type
 * @param subtype
 * @param mask The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user.
 * @param officialName The official name of the account as given by the financial institution
 * @param verificationStatus The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  `pending_automatic_verification`: The Item is pending automatic verification  `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the two amounts.  `automatically_verified`: The Item has successfully been automatically verified   `manually_verified`: The Item has successfully been manually verified  `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  `verification_failed`: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.
 */
@Serializable
data class AccountBase(
    /* Plaid’s unique identifier for the account. This value will not change unless Plaid can't reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new `account_id` will be assigned to the account.  The `account_id` can also change if the `access_token` is deleted and the same credentials that were used to generate that `access_token` are used to generate a new `access_token` on a later date. In that case, the new `account_id` will be different from the old `account_id`.  Like all Plaid identifiers, the `account_id` is case sensitive. */
    @SerialName(value = "account_id") @Required
    val accountId: String,
    @SerialName(value = "balances") @Required
    val balances: AccountBalance,
    /* The name of the account, either assigned by the user or by the financial institution itself */
    @SerialName(value = "name") @Required
    val name: String,
    @SerialName(value = "type") @Required
    val type: AccountType,
    @SerialName(value = "subtype") @Required
    val subtype: AccountSubtype?,
    /* The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user. */
    @SerialName(value = "mask") val mask: String? = null,
    /* The official name of the account as given by the financial institution */
    @SerialName(value = "official_name") val officialName: String? = null,
    /* The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  `pending_automatic_verification`: The Item is pending automatic verification  `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the two amounts.  `automatically_verified`: The Item has successfully been automatically verified   `manually_verified`: The Item has successfully been manually verified  `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  `verification_failed`: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.    */
    @SerialName(value = "verification_status") val verificationStatus: VerificationStatus? = null
)
