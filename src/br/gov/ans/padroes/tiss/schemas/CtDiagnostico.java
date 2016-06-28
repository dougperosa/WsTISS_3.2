
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_diagnostico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabelaDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabelasDiagnostico"/>
 *         &lt;element name="codigoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4"/>
 *         &lt;element name="descricaoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnostico", propOrder = {
    "tabelaDiagnostico",
    "codigoDiagnostico",
    "descricaoDiagnostico"
})
public class CtDiagnostico {

    @XmlElement(required = true)
    protected DmTabelasDiagnostico tabelaDiagnostico;
    @XmlElement(required = true)
    protected String codigoDiagnostico;
    @XmlElement(required = true)
    protected String descricaoDiagnostico;

    /**
     * Gets the value of the tabelaDiagnostico property.
     * 
     * @return
     *     possible object is
     *     {@link DmTabelasDiagnostico }
     *     
     */
    public DmTabelasDiagnostico getTabelaDiagnostico() {
        return tabelaDiagnostico;
    }

    /**
     * Sets the value of the tabelaDiagnostico property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTabelasDiagnostico }
     *     
     */
    public void setTabelaDiagnostico(DmTabelasDiagnostico value) {
        this.tabelaDiagnostico = value;
    }

    /**
     * Gets the value of the codigoDiagnostico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    /**
     * Sets the value of the codigoDiagnostico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDiagnostico(String value) {
        this.codigoDiagnostico = value;
    }

    /**
     * Gets the value of the descricaoDiagnostico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDiagnostico() {
        return descricaoDiagnostico;
    }

    /**
     * Sets the value of the descricaoDiagnostico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDiagnostico(String value) {
        this.descricaoDiagnostico = value;
    }

}
