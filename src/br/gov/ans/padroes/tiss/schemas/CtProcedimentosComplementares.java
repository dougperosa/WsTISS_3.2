
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_procedimentosComplementares complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentosComplementares">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProvavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="identificacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentosComplementares", propOrder = {
    "dataProvavel",
    "identificacao",
    "quantidade"
})
public class CtProcedimentosComplementares {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataProvavel;
    @XmlElement(required = true)
    protected CtProcedimentoDados identificacao;
    @XmlElement(required = true)
    protected BigDecimal quantidade;

    /**
     * Gets the value of the dataProvavel property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavel() {
        return dataProvavel;
    }

    /**
     * Sets the value of the dataProvavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavel(XMLGregorianCalendar value) {
        this.dataProvavel = value;
    }

    /**
     * Gets the value of the identificacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getIdentificacao() {
        return identificacao;
    }

    /**
     * Sets the value of the identificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setIdentificacao(CtProcedimentoDados value) {
        this.identificacao = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
    }

}
