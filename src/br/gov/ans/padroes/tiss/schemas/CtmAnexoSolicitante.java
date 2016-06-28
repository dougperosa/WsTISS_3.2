
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_anexoSolicitante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="telefoneProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11"/>
 *         &lt;element name="emailProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_anexoSolicitante", propOrder = {
    "nomeProfissional",
    "telefoneProfissional",
    "emailProfissional"
})
public class CtmAnexoSolicitante {

    @XmlElement(required = true)
    protected String nomeProfissional;
    @XmlElement(required = true)
    protected String telefoneProfissional;
    protected String emailProfissional;

    /**
     * Gets the value of the nomeProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfissional() {
        return nomeProfissional;
    }

    /**
     * Sets the value of the nomeProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfissional(String value) {
        this.nomeProfissional = value;
    }

    /**
     * Gets the value of the telefoneProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneProfissional() {
        return telefoneProfissional;
    }

    /**
     * Sets the value of the telefoneProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneProfissional(String value) {
        this.telefoneProfissional = value;
    }

    /**
     * Gets the value of the emailProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProfissional() {
        return emailProfissional;
    }

    /**
     * Sets the value of the emailProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProfissional(String value) {
        this.emailProfissional = value;
    }

}
