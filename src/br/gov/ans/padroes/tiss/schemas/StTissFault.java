
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for st_tissFault.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="st_tissFault">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DestinatarioInvalido"/>
 *     &lt;enumeration value="RemetenteInvalido"/>
 *     &lt;enumeration value="LoginInvalido"/>
 *     &lt;enumeration value="VersaoInvalida"/>
 *     &lt;enumeration value="HashInvalido"/>
 *     &lt;enumeration value="SchemaInvalido"/>
 *     &lt;enumeration value="ErroInesperadoServidor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "st_tissFault")
@XmlEnum
public enum StTissFault {

    @XmlEnumValue("DestinatarioInvalido")
    DESTINATARIO_INVALIDO("DestinatarioInvalido"),
    @XmlEnumValue("RemetenteInvalido")
    REMETENTE_INVALIDO("RemetenteInvalido"),
    @XmlEnumValue("LoginInvalido")
    LOGIN_INVALIDO("LoginInvalido"),
    @XmlEnumValue("VersaoInvalida")
    VERSAO_INVALIDA("VersaoInvalida"),
    @XmlEnumValue("HashInvalido")
    HASH_INVALIDO("HashInvalido"),
    @XmlEnumValue("SchemaInvalido")
    SCHEMA_INVALIDO("SchemaInvalido"),
    @XmlEnumValue("ErroInesperadoServidor")
    ERRO_INESPERADO_SERVIDOR("ErroInesperadoServidor");
    private final String value;

    StTissFault(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StTissFault fromValue(String v) {
        for (StTissFault c: StTissFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
