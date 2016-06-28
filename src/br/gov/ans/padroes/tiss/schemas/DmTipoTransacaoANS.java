
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dm_tipoTransacaoANS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tipoTransacaoANS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONITORAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tipoTransacaoANS")
@XmlEnum
public enum DmTipoTransacaoANS {

    MONITORAMENTO;

    public String value() {
        return name();
    }

    public static DmTipoTransacaoANS fromValue(String v) {
        return valueOf(v);
    }

}
