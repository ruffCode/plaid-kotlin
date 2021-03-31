package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AccountSubtype {
    @SerialName("401a")
    FOUR_HUNDRED_ONE_A,

    @SerialName("401k")
    FOUR_HUNDRED_ONE_K,

    @SerialName("403B")
    FOUR_HUNDRED_THREE_B,

    @SerialName("457b")
    FOUR_HUNDRED_FIFTY_SEVEN_B,

    @SerialName("529")
    FIVE_HUNDRED_TWENTY_NINE,

    @SerialName("brokerage")
    BROKERAGE,

    @SerialName("cash isa")
    CASH_ISA,

    @SerialName("education savings account")
    EDUCATION_SAVINGS_ACCOUNT,

    @SerialName("gic")
    GIC,

    @SerialName("health reimbursement arrangement")
    HEALTH_REIMBURSEMENT_ARRANGEMENT,

    @SerialName("hsa")
    HSA,

    @SerialName("isa")
    ISA,

    @SerialName("ira")
    IRA,

    @SerialName("lif")
    LIF,

    @SerialName("lira")
    LIRA,

    @SerialName("lrif")
    LRIF,

    @SerialName("lrsp")
    LRSP,

    @SerialName("non-taxable brokerage account")
    NON_TAXABLE_BROKERAGE_ACCOUNT,

    @SerialName("other")
    OTHER,

    @SerialName("prif")
    PRIF,

    @SerialName("rdsp")
    RDSP,

    @SerialName("resp")
    RESP,

    @SerialName("rlif")
    RLIF,

    @SerialName("rrif")
    RRIF,

    @SerialName("pension")
    PENSION,

    @SerialName("profit sharing plan")
    PROFIT_SHARING_PLAN,

    @SerialName("retirement")
    RETIREMENT,

    @SerialName("roth")
    ROTH,

    @SerialName("roth 401k")
    ROTH_401_K,

    @SerialName("rrsp")
    RRSP,

    @SerialName("sep ira")
    SEP_IRA,

    @SerialName("simple ira")
    SIMPLE_IRA,

    @SerialName("sipp")
    SIPP,

    @SerialName("stock plan")
    STOCK_PLAN,

    @SerialName("thrift savings plan")
    THRIFT_SAVINGS_PLAN,

    @SerialName("tfsa")
    TFSA,

    @SerialName("trust")
    TRUST,

    @SerialName("ugma")
    UGMA,

    @SerialName("utma")
    UTMA,

    @SerialName("variable annuity")
    VARIABLE_ANNUITY,

    @SerialName("credit card")
    CREDIT_CARD,

    @SerialName("paypal")
    PAYPAL,

    @SerialName("cd")
    CD,

    @SerialName("checking")
    CHECKING,

    @SerialName("savings")
    SAVINGS,

    @SerialName("money market")
    MONEY_MARKET,

    @SerialName("prepaid")
    PREPAID,

    @SerialName("auto")
    AUTO,

    @SerialName("commercial")
    COMMERCIAL,

    @SerialName("construction")
    CONSTRUCTION,

    @SerialName("consumer")
    CONSUMER,

    @SerialName("home")
    HOME,

    @SerialName("home equity")
    HOME_EQUITY,

    @SerialName("loan")
    LOAN,

    @SerialName("mortgage")
    MORTGAGE,

    @SerialName("overdraft")
    OVERDRAFT,

    @SerialName("line of credit")
    LINE_OF_CREDIT,

    @SerialName("student")
    STUDENT,

    @SerialName("cash management")
    CASH_MANAGEMENT,

    @SerialName("keogh")
    KEOGH,

    @SerialName("mutual fund")
    MUTUAL_FUND,

    @SerialName("recurring")
    RECURRING,

    @SerialName("rewards")
    REWARDS,

    @SerialName("safe deposit")
    SAFE_DEPOSIT,

    @SerialName("sarsep")
    SARSEP
}
