
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura utilizada na resposta da operadora sobre a situação do protocolo
 * 
 * <p>Java class for ct_protocoloAnexoStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloAnexoStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="loteAnexo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheLoteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexoStatus"/>
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
@XmlType(name = "ct_protocoloAnexoStatus", propOrder = {
    "identificacaoOperadora",
    "dadosPrestador",
    "loteAnexo"
})
public class CtProtocoloAnexoStatus {

    @XmlElement(required = true)
    protected String identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected CtProtocoloAnexoStatus.LoteAnexo loteAnexo;

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
     * Gets the value of the loteAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloAnexoStatus.LoteAnexo }
     *     
     */
    public CtProtocoloAnexoStatus.LoteAnexo getLoteAnexo() {
        return loteAnexo;
    }

    /**
     * Sets the value of the loteAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloAnexoStatus.LoteAnexo }
     *     
     */
    public void setLoteAnexo(CtProtocoloAnexoStatus.LoteAnexo value) {
        this.loteAnexo = value;
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
     *         &lt;element name="detalheLoteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexoStatus"/>
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
        "detalheLoteAnexo",
        "mensagemErro"
    })
    public static class LoteAnexo {

        protected CtLoteAnexoStatus detalheLoteAnexo;
        protected CtMotivoGlosa mensagemErro;

        /**
         * Gets the value of the detalheLoteAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteAnexoStatus }
         *     
         */
        public CtLoteAnexoStatus getDetalheLoteAnexo() {
            return detalheLoteAnexo;
        }

        /**
         * Sets the value of the detalheLoteAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteAnexoStatus }
         *     
         */
        public void setDetalheLoteAnexo(CtLoteAnexoStatus value) {
            this.detalheLoteAnexo = value;
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
