package tech.alexib.plaid.client

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import tech.alexib.plaid.client.model.AccountBase
import tech.alexib.plaid.client.model.AccountSubtype
import tech.alexib.plaid.client.model.AccountType
import tech.alexib.plaid.client.model.Item
import tech.alexib.plaid.client.model.ItemGetRequest
import tech.alexib.plaid.client.model.ItemGetResponse
import tech.alexib.plaid.client.model.ItemPublicTokenExchangeRequest
import tech.alexib.plaid.client.model.ItemPublicTokenExchangeResponse
import tech.alexib.plaid.client.model.Products
import tech.alexib.plaid.client.model.SandboxPublicTokenCreateRequest
import tech.alexib.plaid.client.model.SandboxPublicTokenCreateResponse

/**
 * For tests where an item is required.
 *
 *
 * Subclasses must provide the institution and products desired by implementing.
 * [.setupItemProducts] and [.setupItemInstitutionId]
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class AbstractItemIntegrationTest : AbstractIntegrationTest() {
    private var exchangeTokenResponse: ItemPublicTokenExchangeResponse? = null
    private var item: Item? = null

    @BeforeAll
    @Throws(Exception::class)
    fun setUpItem() {
        runBlocking {
            val request: SandboxPublicTokenCreateRequest =
                SandboxPublicTokenCreateRequest(
                    institutionId = setupItemInstitutionId(),
                    initialProducts = setupItemProducts()
                )

            val createResponse: SandboxPublicTokenCreateResponse =
                client().sandboxPublicTokenCreate(request)

            val itemPublicTokenExchangeRequest =
                ItemPublicTokenExchangeRequest(publicToken = createResponse.publicToken)

            val response: ItemPublicTokenExchangeResponse = client()
                .itemPublicTokenExchange(itemPublicTokenExchangeRequest)

            exchangeTokenResponse = response
            val itemGetRequest = ItemGetRequest(accessToken = exchangeTokenResponse!!.accessToken)

            val itemGetResponse: ItemGetResponse = client()
                .itemGet(itemGetRequest)

            item = itemGetResponse.item
        }
    }

    abstract fun setupItemProducts(): List<Products>
    abstract fun setupItemInstitutionId(): String
    val itemPublicTokenExchangeResponse: ItemPublicTokenExchangeResponse?
        get() = exchangeTokenResponse

    fun getItem(): Item? {
        return item
    }

    companion object {
        fun assertAccount(
            actualAccount: AccountBase,
            expectedType: AccountType?,
            expectedSubType: AccountSubtype?,
            expectedBalanceAvailable: Double?,
            expectedBalanceCurrent: Double?,
            expectedBalanceLimit: Double?,
            expectedName: String?,
            expectedMask: String?,
            expectedOfficialName: String?
        ) {
            Assertions.assertNotNull(actualAccount.accountId)
            assertEquals(expectedType, actualAccount.type)
            assertEquals(expectedSubType, actualAccount.subtype)
            assertEquals(
                expectedBalanceAvailable,
                actualAccount.balances.available
            )
            assertEquals(
                expectedBalanceCurrent,
                actualAccount.balances.current
            )
            assertEquals(expectedBalanceLimit, actualAccount.balances.limit)
            assertEquals(expectedName, actualAccount.name)
            assertEquals(expectedMask, actualAccount.mask)
            assertEquals(expectedOfficialName, actualAccount.officialName)
        }
    }
}
