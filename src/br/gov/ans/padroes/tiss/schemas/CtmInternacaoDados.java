
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctm_internacaoDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_internacaoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoFaturamento"/>
 *         &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *         &lt;element name="dataFinalFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaFinalFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
 *         &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regimeInternacao"/>
 *         &lt;element name="declaracoes" maxOccurs="8" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="declaracaoNascido" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
 *                   &lt;element name="diagnosticoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
 *                   &lt;element name="declaracaoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
 *                   &lt;element name="indicadorDORN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ctm_internacaoDados", propOrder = {
    "caraterAtendimento",
    "tipoFaturamento",
    "dataInicioFaturamento",
    "horaInicioFaturamento",
    "dataFinalFaturamento",
    "horaFinalFaturamento",
    "tipoInternacao",
    "regimeInternacao",
    "declaracoes"
})
public class CtmInternacaoDados {

    @XmlElement(required = true)
    protected String caraterAtendimento;
    @XmlElement(required = true)
    protected String tipoFaturamento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataInicioFaturamento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar horaInicioFaturamento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataFinalFaturamento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar horaFinalFaturamento;
    @XmlElement(required = true)
    protected String tipoInternacao;
    @XmlElement(required = true)
    protected String regimeInternacao;
    protected List<CtmInternacaoDados.Declaracoes> declaracoes;

    /**
     * Gets the value of the caraterAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaraterAtendimento() {
        return caraterAtendimento;
    }

    /**
     * Sets the value of the caraterAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaraterAtendimento(String value) {
        this.caraterAtendimento = value;
    }

    /**
     * Gets the value of the tipoFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFaturamento() {
        return tipoFaturamento;
    }

    /**
     * Sets the value of the tipoFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFaturamento(String value) {
        this.tipoFaturamento = value;
    }

    /**
     * Gets the value of the dataInicioFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioFaturamento() {
        return dataInicioFaturamento;
    }

    /**
     * Sets the value of the dataInicioFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioFaturamento(XMLGregorianCalendar value) {
        this.dataInicioFaturamento = value;
    }

    /**
     * Gets the value of the horaInicioFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicioFaturamento() {
        return horaInicioFaturamento;
    }

    /**
     * Sets the value of the horaInicioFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicioFaturamento(XMLGregorianCalendar value) {
        this.horaInicioFaturamento = value;
    }

    /**
     * Gets the value of the dataFinalFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalFaturamento() {
        return dataFinalFaturamento;
    }

    /**
     * Sets the value of the dataFinalFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalFaturamento(XMLGregorianCalendar value) {
        this.dataFinalFaturamento = value;
    }

    /**
     * Gets the value of the horaFinalFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinalFaturamento() {
        return horaFinalFaturamento;
    }

    /**
     * Sets the value of the horaFinalFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinalFaturamento(XMLGregorianCalendar value) {
        this.horaFinalFaturamento = value;
    }

    /**
     * Gets the value of the tipoInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInternacao() {
        return tipoInternacao;
    }

    /**
     * Sets the value of the tipoInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInternacao(String value) {
        this.tipoInternacao = value;
    }

    /**
     * Gets the value of the regimeInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeInternacao() {
        return regimeInternacao;
    }

    /**
     * Sets the value of the regimeInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeInternacao(String value) {
        this.regimeInternacao = value;
    }

    /**
     * Gets the value of the declaracoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaracoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaracoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmInternacaoDados.Declaracoes }
     * 
     * 
     */
    public List<CtmInternacaoDados.Declaracoes> getDeclaracoes() {
        if (declaracoes == null) {
            declaracoes = new ArrayList<CtmInternacaoDados.Declaracoes>();
        }
        return this.declaracoes;
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
     *         &lt;element name="declaracaoNascido" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
     *         &lt;element name="diagnosticoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
     *         &lt;element name="declaracaoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
     *         &lt;element name="indicadorDORN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
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
        "declaracaoNascido",
        "diagnosticoObito",
        "declaracaoObito",
        "indicadorDORN"
    })
    public static class Declaracoes {

        protected String declaracaoNascido;
        protected String diagnosticoObito;
        protected String declaracaoObito;
        protected DmSimNao indicadorDORN;

        /**
         * Gets the value of the declaracaoNascido property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclaracaoNascido() {
            return declaracaoNascido;
        }

        /**
         * Sets the value of the declaracaoNascido property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclaracaoNascido(String value) {
            this.declaracaoNascido = value;
        }

        /**
         * Gets the value of the diagnosticoObito property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosticoObito() {
            return diagnosticoObito;
        }

        /**
         * Sets the value of the diagnosticoObito property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosticoObito(String value) {
            this.diagnosticoObito = value;
        }

        /**
         * Gets the value of the declaracaoObito property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclaracaoObito() {
            return declaracaoObito;
        }

        /**
         * Sets the value of the declaracaoObito property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclaracaoObito(String value) {
            this.declaracaoObito = value;
        }

        /**
         * Gets the value of the indicadorDORN property.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getIndicadorDORN() {
            return indicadorDORN;
        }

        /**
         * Sets the value of the indicadorDORN property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setIndicadorDORN(DmSimNao value) {
            this.indicadorDORN = value;
        }

    }

}
