
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
 *         &lt;element name="solicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoProcedimento"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "solicitacaoProcedimento",
    "hash",
    "assinaturaDigital"
})
@XmlRootElement(name = "solicitacaoProcedimentoWS")
public class SolicitacaoProcedimentoWS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    @XmlElement(required = true)
    protected CtSolicitacaoProcedimento solicitacaoProcedimento;
    @XmlElement(required = true)
    protected String hash;
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
     * Gets the value of the solicitacaoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public CtSolicitacaoProcedimento getSolicitacaoProcedimento() {
        return solicitacaoProcedimento;
    }

    /**
     * Sets the value of the solicitacaoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public void setSolicitacaoProcedimento(CtSolicitacaoProcedimento value) {
        this.solicitacaoProcedimento = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
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
