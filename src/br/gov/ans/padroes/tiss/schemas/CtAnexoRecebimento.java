
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  estrutura de recibo do recebimento de um lote de anexos dos prestadores
 * 
 * <p>Java class for ct_anexoRecebimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_anexoRecebimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProtocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="qtAnexosClinicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="anexosClinicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
 *                     &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
 *                     &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
 *                     &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_anexoRecebimento", propOrder = {
    "nrProtocoloRecebimento",
    "dataEnvioAnexo",
    "numeroLote",
    "registroANS",
    "dadosPrestador",
    "qtAnexosClinicos",
    "anexosClinicos",
    "observacao"
})
public class CtAnexoRecebimento {

    @XmlElement(required = true)
    protected String nrProtocoloRecebimento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioAnexo;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected BigInteger qtAnexosClinicos;
    @XmlElement(required = true)
    protected CtAnexoRecebimento.AnexosClinicos anexosClinicos;
    protected String observacao;

    /**
     * Gets the value of the nrProtocoloRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProtocoloRecebimento() {
        return nrProtocoloRecebimento;
    }

    /**
     * Sets the value of the nrProtocoloRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProtocoloRecebimento(String value) {
        this.nrProtocoloRecebimento = value;
    }

    /**
     * Gets the value of the dataEnvioAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioAnexo() {
        return dataEnvioAnexo;
    }

    /**
     * Sets the value of the dataEnvioAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioAnexo(XMLGregorianCalendar value) {
        this.dataEnvioAnexo = value;
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
     * Gets the value of the qtAnexosClinicos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtAnexosClinicos() {
        return qtAnexosClinicos;
    }

    /**
     * Sets the value of the qtAnexosClinicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtAnexosClinicos(BigInteger value) {
        this.qtAnexosClinicos = value;
    }

    /**
     * Gets the value of the anexosClinicos property.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoRecebimento.AnexosClinicos }
     *     
     */
    public CtAnexoRecebimento.AnexosClinicos getAnexosClinicos() {
        return anexosClinicos;
    }

    /**
     * Sets the value of the anexosClinicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoRecebimento.AnexosClinicos }
     *     
     */
    public void setAnexosClinicos(CtAnexoRecebimento.AnexosClinicos value) {
        this.anexosClinicos = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     *         &lt;choice>
     *           &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
     *           &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
     *           &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
     *           &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
     *         &lt;/choice>
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
        "anexoOPME",
        "anexoQuimio",
        "anexoRadio",
        "anexoSituacaoInicial"
    })
    public static class AnexosClinicos {

        protected CtmAutorizacaoOPME anexoOPME;
        protected CtmAutorizacaoQuimio anexoQuimio;
        protected CtmAutorizacaoRadio anexoRadio;
        protected List<CtoAnexoSituacaoInicial> anexoSituacaoInicial;

        /**
         * Gets the value of the anexoOPME property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoOPME }
         *     
         */
        public CtmAutorizacaoOPME getAnexoOPME() {
            return anexoOPME;
        }

        /**
         * Sets the value of the anexoOPME property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoOPME }
         *     
         */
        public void setAnexoOPME(CtmAutorizacaoOPME value) {
            this.anexoOPME = value;
        }

        /**
         * Gets the value of the anexoQuimio property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoQuimio }
         *     
         */
        public CtmAutorizacaoQuimio getAnexoQuimio() {
            return anexoQuimio;
        }

        /**
         * Sets the value of the anexoQuimio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoQuimio }
         *     
         */
        public void setAnexoQuimio(CtmAutorizacaoQuimio value) {
            this.anexoQuimio = value;
        }

        /**
         * Gets the value of the anexoRadio property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoRadio }
         *     
         */
        public CtmAutorizacaoRadio getAnexoRadio() {
            return anexoRadio;
        }

        /**
         * Sets the value of the anexoRadio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoRadio }
         *     
         */
        public void setAnexoRadio(CtmAutorizacaoRadio value) {
            this.anexoRadio = value;
        }

        /**
         * Gets the value of the anexoSituacaoInicial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anexoSituacaoInicial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnexoSituacaoInicial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoAnexoSituacaoInicial }
         * 
         * 
         */
        public List<CtoAnexoSituacaoInicial> getAnexoSituacaoInicial() {
            if (anexoSituacaoInicial == null) {
                anexoSituacaoInicial = new ArrayList<CtoAnexoSituacaoInicial>();
            }
            return this.anexoSituacaoInicial;
        }

    }

}
