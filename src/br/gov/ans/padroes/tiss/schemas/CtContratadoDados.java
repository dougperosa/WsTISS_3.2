
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_contratadoDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_contratadoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *           &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *           &lt;element name="cnpjContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *         &lt;/choice>
 *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contratadoDados", propOrder = {
    "codigoPrestadorNaOperadora",
    "cpfContratado",
    "cnpjContratado",
    "nomeContratado"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtmConsultaGuia.ContratadoExecutante.class
})
public class CtContratadoDados {

    protected String codigoPrestadorNaOperadora;
    protected String cpfContratado;
    protected String cnpjContratado;
    @XmlElement(required = true)
    protected String nomeContratado;

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

    /**
     * Gets the value of the cnpjContratado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjContratado() {
        return cnpjContratado;
    }

    /**
     * Sets the value of the cnpjContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjContratado(String value) {
        this.cnpjContratado = value;
    }

    /**
     * Gets the value of the nomeContratado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContratado() {
        return nomeContratado;
    }

    /**
     * Sets the value of the nomeContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContratado(String value) {
        this.nomeContratado = value;
    }

}
