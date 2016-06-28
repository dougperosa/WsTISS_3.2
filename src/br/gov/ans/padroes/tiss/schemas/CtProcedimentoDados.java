
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_procedimentoDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
 *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
 *         &lt;element name="descricaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoDados", propOrder = {
    "codigoTabela",
    "codigoProcedimento",
    "descricaoProcedimento"
})
public class CtProcedimentoDados {

    @XmlElement(required = true)
    protected String codigoTabela;
    @XmlElement(required = true)
    protected String codigoProcedimento;
    @XmlElement(required = true)
    protected String descricaoProcedimento;

    /**
     * Gets the value of the codigoTabela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTabela() {
        return codigoTabela;
    }

    /**
     * Sets the value of the codigoTabela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTabela(String value) {
        this.codigoTabela = value;
    }

    /**
     * Gets the value of the codigoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    /**
     * Sets the value of the codigoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProcedimento(String value) {
        this.codigoProcedimento = value;
    }

    /**
     * Gets the value of the descricaoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }

    /**
     * Sets the value of the descricaoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProcedimento(String value) {
        this.descricaoProcedimento = value;
    }

}
