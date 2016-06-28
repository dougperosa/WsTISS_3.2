
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_respostaGlosa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="reciboGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_glosaRecibo"/>
 *         &lt;element name="reciboGlosaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_glosaReciboOdonto"/>
 *         &lt;element name="reciboGlosaStatus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="nrProtocoloSituacaoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataSituacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ct_respostaGlosa", propOrder = {
    "reciboGlosa",
    "reciboGlosaOdonto",
    "reciboGlosaStatus",
    "mensagemErro"
})
public class CtRespostaGlosa {

    protected CtGlosaRecibo reciboGlosa;
    protected CtGlosaReciboOdonto reciboGlosaOdonto;
    protected CtRespostaGlosa.ReciboGlosaStatus reciboGlosaStatus;
    protected CtMotivoGlosa mensagemErro;

    /**
     * Gets the value of the reciboGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaRecibo }
     *     
     */
    public CtGlosaRecibo getReciboGlosa() {
        return reciboGlosa;
    }

    /**
     * Sets the value of the reciboGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaRecibo }
     *     
     */
    public void setReciboGlosa(CtGlosaRecibo value) {
        this.reciboGlosa = value;
    }

    /**
     * Gets the value of the reciboGlosaOdonto property.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaReciboOdonto }
     *     
     */
    public CtGlosaReciboOdonto getReciboGlosaOdonto() {
        return reciboGlosaOdonto;
    }

    /**
     * Sets the value of the reciboGlosaOdonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaReciboOdonto }
     *     
     */
    public void setReciboGlosaOdonto(CtGlosaReciboOdonto value) {
        this.reciboGlosaOdonto = value;
    }

    /**
     * Gets the value of the reciboGlosaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CtRespostaGlosa.ReciboGlosaStatus }
     *     
     */
    public CtRespostaGlosa.ReciboGlosaStatus getReciboGlosaStatus() {
        return reciboGlosaStatus;
    }

    /**
     * Sets the value of the reciboGlosaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRespostaGlosa.ReciboGlosaStatus }
     *     
     */
    public void setReciboGlosaStatus(CtRespostaGlosa.ReciboGlosaStatus value) {
        this.reciboGlosaStatus = value;
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
     *         &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="nrProtocoloSituacaoRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataSituacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
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
        "nrProtocoloRecursoGlosa",
        "dataEnvioRecurso",
        "dataRecebimentoRecurso",
        "numeroLote",
        "registroANS",
        "dadosPrestador",
        "nrProtocoloSituacaoRecursoGlosa",
        "dataSituacao",
        "situacaoProtocolo"
    })
    public static class ReciboGlosaStatus {

        @XmlElement(required = true)
        protected String nrProtocoloRecursoGlosa;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataEnvioRecurso;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRecebimentoRecurso;
        @XmlElement(required = true)
        protected String numeroLote;
        @XmlElement(required = true)
        protected String registroANS;
        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(required = true)
        protected String nrProtocoloSituacaoRecursoGlosa;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataSituacao;
        @XmlElement(required = true)
        protected String situacaoProtocolo;

        /**
         * Gets the value of the nrProtocoloRecursoGlosa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProtocoloRecursoGlosa() {
            return nrProtocoloRecursoGlosa;
        }

        /**
         * Sets the value of the nrProtocoloRecursoGlosa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProtocoloRecursoGlosa(String value) {
            this.nrProtocoloRecursoGlosa = value;
        }

        /**
         * Gets the value of the dataEnvioRecurso property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEnvioRecurso() {
            return dataEnvioRecurso;
        }

        /**
         * Sets the value of the dataEnvioRecurso property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEnvioRecurso(XMLGregorianCalendar value) {
            this.dataEnvioRecurso = value;
        }

        /**
         * Gets the value of the dataRecebimentoRecurso property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRecebimentoRecurso() {
            return dataRecebimentoRecurso;
        }

        /**
         * Sets the value of the dataRecebimentoRecurso property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRecebimentoRecurso(XMLGregorianCalendar value) {
            this.dataRecebimentoRecurso = value;
        }

        /**
         * Gets the value of the numeroLote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroLote() {
            return numeroLote;
        }

        /**
         * Sets the value of the numeroLote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroLote(String value) {
            this.numeroLote = value;
        }

        /**
         * Gets the value of the registroANS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistroANS() {
            return registroANS;
        }

        /**
         * Sets the value of the registroANS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistroANS(String value) {
            this.registroANS = value;
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
         * Gets the value of the nrProtocoloSituacaoRecursoGlosa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProtocoloSituacaoRecursoGlosa() {
            return nrProtocoloSituacaoRecursoGlosa;
        }

        /**
         * Sets the value of the nrProtocoloSituacaoRecursoGlosa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProtocoloSituacaoRecursoGlosa(String value) {
            this.nrProtocoloSituacaoRecursoGlosa = value;
        }

        /**
         * Gets the value of the dataSituacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSituacao() {
            return dataSituacao;
        }

        /**
         * Sets the value of the dataSituacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSituacao(XMLGregorianCalendar value) {
            this.dataSituacao = value;
        }

        /**
         * Gets the value of the situacaoProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSituacaoProtocolo() {
            return situacaoProtocolo;
        }

        /**
         * Sets the value of the situacaoProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSituacaoProtocolo(String value) {
            this.situacaoProtocolo = value;
        }

    }

}
