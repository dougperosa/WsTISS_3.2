
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dm_regiao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_regiao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="HASD"/>
 *     &lt;enumeration value="HASE"/>
 *     &lt;enumeration value="HAID"/>
 *     &lt;enumeration value="HAIE"/>
 *     &lt;enumeration value="ASAI"/>
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="S2"/>
 *     &lt;enumeration value="S3"/>
 *     &lt;enumeration value="S4"/>
 *     &lt;enumeration value="S5"/>
 *     &lt;enumeration value="S6"/>
 *     &lt;enumeration value="LG"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="MJ"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="RIS"/>
 *     &lt;enumeration value="RCSD"/>
 *     &lt;enumeration value="RPSD"/>
 *     &lt;enumeration value="RCID"/>
 *     &lt;enumeration value="RMSD"/>
 *     &lt;enumeration value="RCSE"/>
 *     &lt;enumeration value="RPSE"/>
 *     &lt;enumeration value="RMSE"/>
 *     &lt;enumeration value="RII"/>
 *     &lt;enumeration value="RPID"/>
 *     &lt;enumeration value="RMID"/>
 *     &lt;enumeration value="RCIE"/>
 *     &lt;enumeration value="RPIE"/>
 *     &lt;enumeration value="RMIE"/>
 *     &lt;enumeration value="RMD"/>
 *     &lt;enumeration value="RME"/>
 *     &lt;enumeration value="RPD"/>
 *     &lt;enumeration value="RPE"/>
 *     &lt;enumeration value="RMPE"/>
 *     &lt;enumeration value="RMPD"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="TU"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="FLI"/>
 *     &lt;enumeration value="FLA"/>
 *     &lt;enumeration value="UV"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="RL"/>
 *     &lt;enumeration value="RP"/>
 *     &lt;enumeration value="RV"/>
 *     &lt;enumeration value="RSMD"/>
 *     &lt;enumeration value="RSME"/>
 *     &lt;enumeration value="RSL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_regiao")
@XmlEnum
public enum DmRegiao {

    AI("AI"),
    AS("AS"),
    HASD("HASD"),
    HASE("HASE"),
    HAID("HAID"),
    HAIE("HAIE"),
    ASAI("ASAI"),
    @XmlEnumValue("S1")
    S_1("S1"),
    @XmlEnumValue("S2")
    S_2("S2"),
    @XmlEnumValue("S3")
    S_3("S3"),
    @XmlEnumValue("S4")
    S_4("S4"),
    @XmlEnumValue("S5")
    S_5("S5"),
    @XmlEnumValue("S6")
    S_6("S6"),
    LG("LG"),
    CL("CL"),
    AB("AB"),
    PA("PA"),
    MJ("MJ"),
    PD("PD"),
    PM("PM"),
    RM("RM"),
    MA("MA"),
    GI("GI"),
    PT("PT"),
    TP("TP"),
    RIS("RIS"),
    RCSD("RCSD"),
    RPSD("RPSD"),
    RCID("RCID"),
    RMSD("RMSD"),
    RCSE("RCSE"),
    RPSE("RPSE"),
    RMSE("RMSE"),
    RII("RII"),
    RPID("RPID"),
    RMID("RMID"),
    RCIE("RCIE"),
    RPIE("RPIE"),
    RMIE("RMIE"),
    RMD("RMD"),
    RME("RME"),
    RPD("RPD"),
    RPE("RPE"),
    RMPE("RMPE"),
    RMPD("RMPD"),
    SM("SM"),
    TU("TU"),
    SI("SI"),
    FLI("FLI"),
    FLA("FLA"),
    UV("UV"),
    PP("PP"),
    PI("PI"),
    LS("LS"),
    LI("LI"),
    RL("RL"),
    RP("RP"),
    RV("RV"),
    RSMD("RSMD"),
    RSME("RSME"),
    RSL("RSL");
    private final String value;

    DmRegiao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRegiao fromValue(String v) {
        for (DmRegiao c: DmRegiao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
