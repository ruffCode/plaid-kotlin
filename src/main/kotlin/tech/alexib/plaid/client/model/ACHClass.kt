package tech.alexib.plaid.client.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ACHClass {
    @SerialName("arc")
    ARC,

    @SerialName("cbr")
    CBR,

    @SerialName("ccd")
    CCD,

    @SerialName("cie")
    CIE,

    @SerialName("cor")
    COR,

    @SerialName("ctx")
    CTX,

    @SerialName("iat")
    IAT,

    @SerialName("mte")
    MTE,

    @SerialName("pbr")
    PBR,

    @SerialName("pop")
    POP,

    @SerialName("pos")
    POS,

    @SerialName("ppd")
    PPD,

    @SerialName("rck")
    RCK,

    @SerialName("tel")
    TEL,

    @SerialName("web")
    WEB
}
