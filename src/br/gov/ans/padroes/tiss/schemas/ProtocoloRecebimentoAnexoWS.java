
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
 *         &lt;element name="loteAnexo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                   &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoRecebimento"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "loteAnexo",
    "hash",
    "assinaturaDigital"
})
@XmlRootElement(name = "protocoloRecebimentoAnexoWS")
public class ProtocoloRecebimentoAnexoWS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    @XmlElement(required = true)
    protected ProtocoloRecebimentoAnexoWS.LoteAnexo loteAnexo;
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
     * Gets the value of the loteAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocoloRecebimentoAnexoWS.LoteAnexo }
     *     
     */
    public ProtocoloRecebimentoAnexoWS.LoteAnexo getLoteAnexo() {
        return loteAnexo;
    }

    /**
     * Sets the value of the loteAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocoloRecebimentoAnexoWS.LoteAnexo }
     *     
     */
    public void setLoteAnexo(ProtocoloRecebimentoAnexoWS.LoteAnexo value) {
        this.loteAnexo = value;
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
     *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
     *         &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoRecebimento"/>
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
        "mensagemErro",
        "protocoloRecebimentoAnexo"
    })
    public static class LoteAnexo {

        protected CtMotivoGlosa mensagemErro;
        protected CtAnexoRecebimento protocoloRecebimentoAnexo;

        /**
         * Gets the value of the mensagemErro property.
         * 
         * @return
         *     possible object is
         *     {@link CtMotivoGlosa }
         *     
         */
        public CtMotivoGlosa getMensagemErro() {
            return mensagemErro;
        }

        /**
         * Sets the value of the mensagemErro property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtMotivoGlosa }
         *     
         */
        public void setMensagemErro(CtMotivoGlosa value) {
            this.mensagemErro = value;
        }

        /**
         * Gets the value of the protocoloRecebimentoAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link CtAnexoRecebimento }
         *     
         */
        public CtAnexoRecebimento getProtocoloRecebimentoAnexo() {
            return protocoloRecebimentoAnexo;
        }

        /**
         * Sets the value of the protocoloRecebimentoAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtAnexoRecebimento }
         *     
         */
        public void setProtocoloRecebimentoAnexo(CtAnexoRecebimento value) {
            this.protocoloRecebimentoAnexo = value;
        }

    }

}
