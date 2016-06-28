
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dm_tabelasDiagnostico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tabelasDiagnostico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CID-10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tabelasDiagnostico")
@XmlEnum
public enum DmTabelasDiagnostico {

    @XmlEnumValue("CID-10")
    CID_10("CID-10");
    private final String value;

    DmTabelasDiagnostico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTabelasDiagnostico fromValue(String v) {
        for (DmTabelasDiagnostico c: DmTabelasDiagnostico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
