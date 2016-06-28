
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operadoraPrestador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operadoraPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="recebimentoLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recebimentoLote" minOccurs="0"/>
 *         &lt;element name="recebimentoAnexo" minOccurs="0">
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
 *         &lt;element name="recebimentoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recebimentoRecurso" minOccurs="0"/>
 *         &lt;element name="demonstrativosRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoRetorno" minOccurs="0"/>
 *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoProtocolo" minOccurs="0"/>
 *         &lt;element name="autorizacaoServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
 *         &lt;element name="situacaoAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
 *         &lt;element name="respostaElegibilidade" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *                   &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboCancelaGuia" minOccurs="0"/>
 *         &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboComunicacao" minOccurs="0"/>
 *         &lt;element name="respostaRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosa" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operadoraPrestador", propOrder = {
    "recebimentoLote",
    "recebimentoAnexo",
    "recebimentoRecursoGlosa",
    "demonstrativosRetorno",
    "situacaoProtocolo",
    "autorizacaoServicos",
    "situacaoAutorizacao",
    "respostaElegibilidade",
    "reciboCancelaGuia",
    "reciboComunicacao",
    "respostaRecursoGlosa"
})
public class OperadoraPrestador {

    protected CtRecebimentoLote recebimentoLote;
    protected OperadoraPrestador.RecebimentoAnexo recebimentoAnexo;
    protected CtRecebimentoRecurso recebimentoRecursoGlosa;
    protected CtDemonstrativoRetorno demonstrativosRetorno;
    protected CtSituacaoProtocolo situacaoProtocolo;
    protected CtSituacaoAutorizacao autorizacaoServicos;
    protected CtSituacaoAutorizacao situacaoAutorizacao;
    protected OperadoraPrestador.RespostaElegibilidade respostaElegibilidade;
    protected CtReciboCancelaGuia reciboCancelaGuia;
    protected CtReciboComunicacao reciboComunicacao;
    protected CtRespostaGlosa respostaRecursoGlosa;

    /**
     * Gets the value of the recebimentoLote property.
     * 
     * @return
     *     possible object is
     *     {@link CtRecebimentoLote }
     *     
     */
    public CtRecebimentoLote getRecebimentoLote() {
        return recebimentoLote;
    }

    /**
     * Sets the value of the recebimentoLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecebimentoLote }
     *     
     */
    public void setRecebimentoLote(CtRecebimentoLote value) {
        this.recebimentoLote = value;
    }

    /**
     * Gets the value of the recebimentoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link OperadoraPrestador.RecebimentoAnexo }
     *     
     */
    public OperadoraPrestador.RecebimentoAnexo getRecebimentoAnexo() {
        return recebimentoAnexo;
    }

    /**
     * Sets the value of the recebimentoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadoraPrestador.RecebimentoAnexo }
     *     
     */
    public void setRecebimentoAnexo(OperadoraPrestador.RecebimentoAnexo value) {
        this.recebimentoAnexo = value;
    }

    /**
     * Gets the value of the recebimentoRecursoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtRecebimentoRecurso }
     *     
     */
    public CtRecebimentoRecurso getRecebimentoRecursoGlosa() {
        return recebimentoRecursoGlosa;
    }

    /**
     * Sets the value of the recebimentoRecursoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecebimentoRecurso }
     *     
     */
    public void setRecebimentoRecursoGlosa(CtRecebimentoRecurso value) {
        this.recebimentoRecursoGlosa = value;
    }

    /**
     * Gets the value of the demonstrativosRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoRetorno }
     *     
     */
    public CtDemonstrativoRetorno getDemonstrativosRetorno() {
        return demonstrativosRetorno;
    }

    /**
     * Sets the value of the demonstrativosRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoRetorno }
     *     
     */
    public void setDemonstrativosRetorno(CtDemonstrativoRetorno value) {
        this.demonstrativosRetorno = value;
    }

    /**
     * Gets the value of the situacaoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoProtocolo }
     *     
     */
    public CtSituacaoProtocolo getSituacaoProtocolo() {
        return situacaoProtocolo;
    }

    /**
     * Sets the value of the situacaoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoProtocolo }
     *     
     */
    public void setSituacaoProtocolo(CtSituacaoProtocolo value) {
        this.situacaoProtocolo = value;
    }

    /**
     * Gets the value of the autorizacaoServicos property.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public CtSituacaoAutorizacao getAutorizacaoServicos() {
        return autorizacaoServicos;
    }

    /**
     * Sets the value of the autorizacaoServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public void setAutorizacaoServicos(CtSituacaoAutorizacao value) {
        this.autorizacaoServicos = value;
    }

    /**
     * Gets the value of the situacaoAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public CtSituacaoAutorizacao getSituacaoAutorizacao() {
        return situacaoAutorizacao;
    }

    /**
     * Sets the value of the situacaoAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoAutorizacao }
     *     
     */
    public void setSituacaoAutorizacao(CtSituacaoAutorizacao value) {
        this.situacaoAutorizacao = value;
    }

    /**
     * Gets the value of the respostaElegibilidade property.
     * 
     * @return
     *     possible object is
     *     {@link OperadoraPrestador.RespostaElegibilidade }
     *     
     */
    public OperadoraPrestador.RespostaElegibilidade getRespostaElegibilidade() {
        return respostaElegibilidade;
    }

    /**
     * Sets the value of the respostaElegibilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperadoraPrestador.RespostaElegibilidade }
     *     
     */
    public void setRespostaElegibilidade(OperadoraPrestador.RespostaElegibilidade value) {
        this.respostaElegibilidade = value;
    }

    /**
     * Gets the value of the reciboCancelaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboCancelaGuia }
     *     
     */
    public CtReciboCancelaGuia getReciboCancelaGuia() {
        return reciboCancelaGuia;
    }

    /**
     * Sets the value of the reciboCancelaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboCancelaGuia }
     *     
     */
    public void setReciboCancelaGuia(CtReciboCancelaGuia value) {
        this.reciboCancelaGuia = value;
    }

    /**
     * Gets the value of the reciboComunicacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboComunicacao }
     *     
     */
    public CtReciboComunicacao getReciboComunicacao() {
        return reciboComunicacao;
    }

    /**
     * Sets the value of the reciboComunicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboComunicacao }
     *     
     */
    public void setReciboComunicacao(CtReciboComunicacao value) {
        this.reciboComunicacao = value;
    }

    /**
     * Gets the value of the respostaRecursoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtRespostaGlosa }
     *     
     */
    public CtRespostaGlosa getRespostaRecursoGlosa() {
        return respostaRecursoGlosa;
    }

    /**
     * Sets the value of the respostaRecursoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRespostaGlosa }
     *     
     */
    public void setRespostaRecursoGlosa(CtRespostaGlosa value) {
        this.respostaRecursoGlosa = value;
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
    public static class RecebimentoAnexo {

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
     *         &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
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
        "reciboElegibilidade"
    })
    public static class RespostaElegibilidade {

        protected CtMotivoGlosa mensagemErro;
        protected CtElegibilidadeRecibo reciboElegibilidade;

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
         * Gets the value of the reciboElegibilidade property.
         * 
         * @return
         *     possible object is
         *     {@link CtElegibilidadeRecibo }
         *     
         */
        public CtElegibilidadeRecibo getReciboElegibilidade() {
            return reciboElegibilidade;
        }

        /**
         * Sets the value of the reciboElegibilidade property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtElegibilidadeRecibo }
         *     
         */
        public void setReciboElegibilidade(CtElegibilidadeRecibo value) {
            this.reciboElegibilidade = value;
        }

    }

}
