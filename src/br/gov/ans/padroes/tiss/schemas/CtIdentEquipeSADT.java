
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_identEquipeSADT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_identEquipeSADT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grauPart" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
 *         &lt;element name="codProfissional">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nomeProf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="conselho" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
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
@XmlType(name = "ct_identEquipeSADT", propOrder = {
    "grauPart",
    "codProfissional",
    "nomeProf",
    "conselho",
    "numeroConselhoProfissional",
    "uf",
    "cbos"
})
public class CtIdentEquipeSADT {

    protected String grauPart;
    @XmlElement(required = true)
    protected CtIdentEquipeSADT.CodProfissional codProfissional;
    @XmlElement(required = true)
    protected String nomeProf;
    @XmlElement(required = true)
    protected String conselho;
    @XmlElement(required = true)
    protected String numeroConselhoProfissional;
    @XmlElement(name = "UF", required = true)
    protected String uf;
    @XmlElement(name = "CBOS", required = true)
    protected String cbos;

    /**
     * Gets the value of the grauPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrauPart() {
        return grauPart;
    }

    /**
     * Sets the value of the grauPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrauPart(String value) {
        this.grauPart = value;
    }

    /**
     * Gets the value of the codProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentEquipeSADT.CodProfissional }
     *     
     */
    public CtIdentEquipeSADT.CodProfissional getCodProfissional() {
        return codProfissional;
    }

    /**
     * Sets the value of the codProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentEquipeSADT.CodProfissional }
     *     
     */
    public void setCodProfissional(CtIdentEquipeSADT.CodProfissional value) {
        this.codProfissional = value;
    }

    /**
     * Gets the value of the nomeProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProf() {
        return nomeProf;
    }

    /**
     * Sets the value of the nomeProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProf(String value) {
        this.nomeProf = value;
    }

    /**
     * Gets the value of the conselho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConselho() {
        return conselho;
    }

    /**
     * Sets the value of the conselho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConselho(String value) {
        this.conselho = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoPrestadorNaOperadora",
        "cpfContratado"
    })
    public static class CodProfissional {

        protected String codigoPrestadorNaOperadora;
        protected String cpfContratado;

        /**
         * Gets the value of the codigoPrestadorNaOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestadorNaOperadora() {
            return codigoPrestadorNaOperadora;
        }

        /**
         * Sets the value of the codigoPrestadorNaOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestadorNaOperadora(String value) {
            this.codigoPrestadorNaOperadora = value;
        }

        /**
         * Gets the value of the cpfContratado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfContratado() {
            return cpfContratado;
        }

        /**
         * Sets the value of the cpfContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfContratado(String value) {
            this.cpfContratado = value;
        }

    }

}
