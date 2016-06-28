
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_contratadoProfissionalDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_contratadoProfissionalDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
 *         &lt;element name="numeroConselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *         &lt;element name="UF" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *         &lt;element name="CBOS" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contratadoProfissionalDados", propOrder = {
    "nomeProfissional",
    "conselhoProfissional",
    "numeroConselhoProfissional",
    "uf",
    "cbos"
})
public class CtContratadoProfissionalDados {

    protected String nomeProfissional;
    @XmlElement(required = true)
    protected String conselhoProfissional;
    @XmlElement(required = true)
    protected String numeroConselhoProfissional;
    @XmlElement(name = "UF", required = true)
    protected String uf;
    @XmlElement(name = "CBOS", required = true)
    protected String cbos;

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
     * Gets the value of the conselhoProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConselhoProfissional() {
        return conselhoProfissional;
    }

    /**
     * Sets the value of the conselhoProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConselhoProfissional(String value) {
        this.conselhoProfissional = value;
    }

    /**
     * Gets the value of the numeroConselhoProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConselhoProfissional() {
        return numeroConselhoProfissional;
    }

    /**
     * Sets the value of the numeroConselhoProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConselhoProfissional(String value) {
        this.numeroConselhoProfissional = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the cbos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBOS() {
        return cbos;
    }

    /**
     * Sets the value of the cbos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBOS(String value) {
        this.cbos = value;
    }

}
