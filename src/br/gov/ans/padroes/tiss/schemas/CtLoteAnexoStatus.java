
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * resposta a uma solicitação de situação de protocolo
 * 
 * <p>Java class for ct_loteAnexoStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_loteAnexoStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="anexosClinicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
 *                   &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
 *                   &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
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
@XmlType(name = "ct_loteAnexoStatus", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "anexosClinicos"
})
public class CtLoteAnexoStatus {

    @XmlElement(required = true)
    protected String statusProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(required = true)
    protected CtLoteAnexoStatus.AnexosClinicos anexosClinicos;

    /**
     * Gets the value of the statusProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocolo() {
        return statusProtocolo;
    }

    /**
     * Sets the value of the statusProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProtocolo(String value) {
        this.statusProtocolo = value;
    }

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
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
     * Gets the value of the dataEnvioLote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the anexosClinicos property.
     * 
     * @return
     *     possible object is
     *     {@link CtLoteAnexoStatus.AnexosClinicos }
     *     
     */
    public CtLoteAnexoStatus.AnexosClinicos getAnexosClinicos() {
        return anexosClinicos;
    }

    /**
     * Sets the value of the anexosClinicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoteAnexoStatus.AnexosClinicos }
     *     
     */
    public void setAnexosClinicos(CtLoteAnexoStatus.AnexosClinicos value) {
        this.anexosClinicos = value;
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
     *         &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
     *         &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
     *         &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
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
        "anexoOPME",
        "anexoQuimio",
        "anexoRadio"
    })
    public static class AnexosClinicos {

        protected CtmAutorizacaoOPME anexoOPME;
        protected CtmAutorizacaoQuimio anexoQuimio;
        protected CtmAutorizacaoRadio anexoRadio;

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

    }

}
