package tech.alexib.plaid.client

import kotlinx.serialization.json.Json
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.fail
import tech.alexib.plaid.client.infrastructure.ClientId
import tech.alexib.plaid.client.infrastructure.PlaidApiConfiguration
import tech.alexib.plaid.client.infrastructure.Secret
import tech.alexib.plaid.client.model.PlaidError
import tech.alexib.plaid.client.model.Item

/**
 * Abstract base class for integration tests which gets configuration from the
 * environment.
 *
 * PLAID_CLIENT_ID, PLAID_SECRET, and PLAID_BASE_URL must be
 * defined or errors will be thrown.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class AbstractIntegrationTest {
    private lateinit var plaidClient: PlaidClient

    private val serializer = Json {
        isLenient = true
        prettyPrint = false
        ignoreUnknownKeys = true
    }

    init {
        System.setProperty("PLAID_CLIENT_ID", "605d48e9138226000f85ee45")
        System.setProperty("PLAID_SECRET", "29480e5052a830f59bffebec5d0532")
    }

    @BeforeAll
    @Throws(Exception::class)
    fun setUpClient() {
        val plaidClientId = System.getenv("PLAID_CLIENT_ID")
        val plaidSecret = System.getenv("PLAID_SECRET")
        assertNotNull(
            "PLAID_CLIENT_ID environment variable is required",
            plaidClientId
        )
        assertNotNull("PLAID_SECRET environment variable is required", plaidSecret)

        val apiConfiguration = PlaidApiConfiguration(
            clientId = ClientId(plaidClientId),
            secret = Secret(plaidSecret),

        )

        plaidClient = PlaidClient(apiConfiguration)
//        apiClient.setPlaidAdapter(ApiClient.BaseUrl.Sandbox)
//        plaidClient = apiClient.createService(PlaidApi::class.java)
    }

    protected fun client(): PlaidClient {
        return plaidClient
    }

//    protected fun apiClient(): ApiClient {
//        return apiClient
//    }

    @Throws(Exception::class)
    fun assertErrorResponse(
        error: Throwable,
        expectedErrorType: PlaidError.ErrorType,
        expectedErrorCode: String?
    ) {
//        assertFalse(response.success)
//        assertTrue(response is ApiResponse<Error>)
//        assertNotNull(response.errorBody())

        when (error) {
            is PlaidError -> {
                assertNotNull(error.requestId)
                assertEquals(expectedErrorType, error.errorType)
                assertEquals(expectedErrorCode, error.errorCode)
            }
            else -> fail { "Expected PlaidError" }
        }
    }

    companion object {
        /**
         * Sandbox-specific institution IDs used for testing. See sandbox documentation
         * for more information.
         */
        const val FIRST_PLATYPUS_BANK_INSTITUTION_ID = "ins_109508"
        const val FIRST_GINGHAM_CREDIT_UNION_INSTITION_ID = "ins_109509"
        const val TATTERSALL_FEDERAL_CREDIT_UNION_INSTITUTION_ID = "ins_109510"
        const val TARTAN_BANK_INSTITUTION_ID = "ins_109511"
        const val HOUNDSTOOTH_BANK_INSTITUTION_ID = "ins_109512"

        fun assertItemEquals(expectedItem: Item, actualItem: Item) {
            assertEquals(expectedItem.error, actualItem.error)
            assertEquals(
                expectedItem.availableProducts,
                actualItem.availableProducts
            )
            assertEquals(
                expectedItem.billedProducts,
                actualItem.billedProducts
            )
            assertEquals(
                expectedItem.institutionId,
                actualItem.institutionId
            )
            assertEquals(expectedItem.itemId, actualItem.itemId)
            assertEquals(expectedItem.webhook, actualItem.webhook)
            assertEquals(
                expectedItem.consentExpirationTime,
                actualItem.consentExpirationTime
            )
        }
    }
}
