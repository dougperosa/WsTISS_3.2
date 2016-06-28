
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalho" type="{http://www.ans.gov.br/padroes/tiss/schemas}cabecalhoTransacao"/>
 *         &lt;choice>
 *           &lt;element name="operadoraParaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}operadoraPrestador" minOccurs="0"/>
 *           &lt;element name="prestadorParaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}prestadorOperadora" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="epilogo" type="{http://www.ans.gov.br/padroes/tiss/schemas}epilogo"/>
 *         &lt;element name="assinaturaDigital" type="{http://www.ans.gov.br/padroes/tiss/schemas}assinaturaDigital" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabecalho",
    "operadoraParaPrestador",
    "prestadorParaOperadora",
    "epilogo",
    "assinaturaDigital"
})
@XmlRootElement(name = "mensagemTISS")
public class MensagemTISS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    protected OperadoraPrestador operadoraParaPrestador;
    protected PrestadorOperadora prestadorParaOperadora;
    @XmlElement(required = true)
    protected Epilogo epilogo;
    protected AssinaturaDigital assinaturaDigital;

    /**
     * Gets the value of the cabecalho property.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public CabecalhoTransacao getCabecalho() {
        return cabecalho;
    }

    /**
     * Sets the value of the cabecalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public void setCabecalho(CabecalhoTransacao value) {
        this.cabecalho = value;
    }

    /**
     * Gets the value of the operadoraParaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link OperadoraPrestador }
     *     
     */
    public OperadoraPrestador getOperadoraParaPrestador() {
        return operadoraParaPrestador;
    }

    /**
     * Sets the value of the operadoraParaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadoraPrestador }
     *     
     */
    public void setOperadoraParaPrestador(OperadoraPrestador value) {
        this.operadoraParaPrestador = value;
    }

    /**
     * Gets the value of the prestadorParaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link PrestadorOperadora }
     *     
     */
    public PrestadorOperadora getPrestadorParaOperadora() {
        return prestadorParaOperadora;
    }

    /**
     * Sets the value of the prestadorParaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestadorOperadora }
     *     
     */
    public void setPrestadorParaOperadora(PrestadorOperadora value) {
        this.prestadorParaOperadora = value;
    }

    /**
     * Gets the value of the epilogo property.
     * 
     * @return
     *     possible object is
     *     {@link Epilogo }
     *     
     */
    public Epilogo getEpilogo() {
        return epilogo;
    }

    /**
     * Sets the value of the epilogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Epilogo }
     *     
     */
    public void setEpilogo(Epilogo value) {
        this.epilogo = value;
    }

    /**
     * Gets the value of the assinaturaDigital property.
     * 
     * @return
     *     possible object is
     *     {@link AssinaturaDigital }
     *     
     */
    public AssinaturaDigital getAssinaturaDigital() {
        return assinaturaDigital;
    }

    /**
     * Sets the value of the assinaturaDigital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssinaturaDigital }
     *     
     */
    public void setAssinaturaDigital(AssinaturaDigital value) {
        this.assinaturaDigital = value;
    }

}
