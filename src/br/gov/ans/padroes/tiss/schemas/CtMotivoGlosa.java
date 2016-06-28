
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_motivoGlosa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_motivoGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="descricaoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_motivoGlosa", propOrder = {
    "codigoGlosa",
    "descricaoGlosa"
})
public class CtMotivoGlosa {

    @XmlElement(required = true)
    protected String codigoGlosa;
    protected String descricaoGlosa;

    /**
     * Gets the value of the codigoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGlosa() {
        return codigoGlosa;
    }

    /**
     * Sets the value of the codigoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGlosa(String value) {
        this.codigoGlosa = value;
    }

    /**
     * Gets the value of the descricaoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoGlosa() {
        return descricaoGlosa;
    }

    /**
     * Sets the value of the descricaoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoGlosa(String value) {
        this.descricaoGlosa = value;
    }

}
