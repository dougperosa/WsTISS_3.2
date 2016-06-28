
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura utilizada na resposta da operadora sobre a situação do protocolo
 * 
 * <p>Java class for ct_protocoloStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="lote">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteStatus"/>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloStatus", propOrder = {
    "identificacaoOperadora",
    "dadosPrestador",
    "lote"
})
public class CtProtocoloStatus {

    @XmlElement(required = true)
    protected String identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected CtProtocoloStatus.Lote lote;

    /**
     * Gets the value of the identificacaoOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoOperadora() {
        return identificacaoOperadora;
    }

    /**
     * Sets the value of the identificacaoOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoOperadora(String value) {
        this.identificacaoOperadora = value;
    }

    /**
     * Gets the value of the dadosPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Sets the value of the dadosPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosPrestador(CtContratadoDados value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the lote property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloStatus.Lote }
     *     
     */
    public CtProtocoloStatus.Lote getLote() {
        return lote;
    }

    /**
     * Sets the value of the lote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloStatus.Lote }
     *     
     */
    public void setLote(CtProtocoloStatus.Lote value) {
        this.lote = value;
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
     *         &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteStatus"/>
     *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
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
        "detalheLote",
        "mensagemErro"
    })
    public static class Lote {

        protected CtLoteStatus detalheLote;
        protected CtMotivoGlosa mensagemErro;

        /**
         * Gets the value of the detalheLote property.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteStatus }
         *     
         */
        public CtLoteStatus getDetalheLote() {
            return detalheLote;
        }

        /**
         * Sets the value of the detalheLote property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteStatus }
         *     
         */
        public void setDetalheLote(CtLoteStatus value) {
            this.detalheLote = value;
        }

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

    }

}
