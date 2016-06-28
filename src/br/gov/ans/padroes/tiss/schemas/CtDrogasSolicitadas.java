
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_drogasSolicitadas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_drogasSolicitadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProvavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="identificacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="qtDoses" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *         &lt;element name="viaAdministracao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_viaAdministracao"/>
 *         &lt;element name="frequencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_drogasSolicitadas", propOrder = {
    "dataProvavel",
    "identificacao",
    "qtDoses",
    "viaAdministracao",
    "frequencia"
})
public class CtDrogasSolicitadas {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataProvavel;
    @XmlElement(required = true)
    protected CtProcedimentoDados identificacao;
    @XmlElement(required = true)
    protected BigDecimal qtDoses;
    @XmlElement(required = true)
    protected String viaAdministracao;
    @XmlElement(required = true)
    protected BigInteger frequencia;

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
     * Gets the value of the qtDoses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtDoses() {
        return qtDoses;
    }

    /**
     * Sets the value of the qtDoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtDoses(BigDecimal value) {
        this.qtDoses = value;
    }

    /**
     * Gets the value of the viaAdministracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaAdministracao() {
        return viaAdministracao;
    }

    /**
     * Sets the value of the viaAdministracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaAdministracao(String value) {
        this.viaAdministracao = value;
    }

    /**
     * Gets the value of the frequencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequencia() {
        return frequencia;
    }

    /**
     * Sets the value of the frequencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequencia(BigInteger value) {
        this.frequencia = value;
    }

}
