
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dm_statusComunicacaoBeneficiario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_statusComunicacaoBeneficiario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_statusComunicacaoBeneficiario")
@XmlEnum
public enum DmStatusComunicacaoBeneficiario {

    P,
    B;

    public String value() {
        return name();
    }

    public static DmStatusComunicacaoBeneficiario fromValue(String v) {
        return valueOf(v);
    }

}
