
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_recursoGlosaRecebimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_recursoGlosaRecebimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="nrProtocoloRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="recursoProtocolo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                   &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="qtGuiasRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *         &lt;element name="guiasRecurso" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="opcaoRecursoGuia">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="recursoGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="itensGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                       &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                                       &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                       &lt;element name="denteRegiao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                                                 &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *                                       &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_recursoGlosaRecebimento", propOrder = {
    "nrProtocoloRecursoGlosa",
    "dataEnvioRecurso",
    "dataRecebimentoRecurso",
    "numeroLote",
    "registroANS",
    "dadosPrestador",
    "nrProtocoloRecursado",
    "recursoProtocolo",
    "qtGuiasRecurso",
    "guiasRecurso",
    "observacao",
    "valorTotalRecursado"
})
public class CtRecursoGlosaRecebimento {

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
    protected String nrProtocoloRecursado;
    protected CtRecursoGlosaRecebimento.RecursoProtocolo recursoProtocolo;
    protected BigInteger qtGuiasRecurso;
    protected List<CtRecursoGlosaRecebimento.GuiasRecurso> guiasRecurso;
    protected String observacao;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;

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
     * Gets the value of the nrProtocoloRecursado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProtocoloRecursado() {
        return nrProtocoloRecursado;
    }

    /**
     * Sets the value of the nrProtocoloRecursado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProtocoloRecursado(String value) {
        this.nrProtocoloRecursado = value;
    }

    /**
     * Gets the value of the recursoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtRecursoGlosaRecebimento.RecursoProtocolo }
     *     
     */
    public CtRecursoGlosaRecebimento.RecursoProtocolo getRecursoProtocolo() {
        return recursoProtocolo;
    }

    /**
     * Sets the value of the recursoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecursoGlosaRecebimento.RecursoProtocolo }
     *     
     */
    public void setRecursoProtocolo(CtRecursoGlosaRecebimento.RecursoProtocolo value) {
        this.recursoProtocolo = value;
    }

    /**
     * Gets the value of the qtGuiasRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtGuiasRecurso() {
        return qtGuiasRecurso;
    }

    /**
     * Sets the value of the qtGuiasRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtGuiasRecurso(BigInteger value) {
        this.qtGuiasRecurso = value;
    }

    /**
     * Gets the value of the guiasRecurso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasRecurso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasRecurso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtRecursoGlosaRecebimento.GuiasRecurso }
     * 
     * 
     */
    public List<CtRecursoGlosaRecebimento.GuiasRecurso> getGuiasRecurso() {
        if (guiasRecurso == null) {
            guiasRecurso = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso>();
        }
        return this.guiasRecurso;
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
     * Gets the value of the valorTotalRecursado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalRecursado() {
        return valorTotalRecursado;
    }

    /**
     * Sets the value of the valorTotalRecursado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalRecursado(BigDecimal value) {
        this.valorTotalRecursado = value;
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
     *         &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="opcaoRecursoGuia">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="recursoGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="itensGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                             &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *                             &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                             &lt;element name="denteRegiao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                                       &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
     *                             &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "numeroGuiaOrigem",
        "numeroGuiaOperadora",
        "senha",
        "opcaoRecursoGuia"
    })
    public static class GuiasRecurso {

        @XmlElement(required = true)
        protected String numeroGuiaOrigem;
        protected String numeroGuiaOperadora;
        protected String senha;
        @XmlElement(required = true)
        protected CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia opcaoRecursoGuia;

        /**
         * Gets the value of the numeroGuiaOrigem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroGuiaOrigem() {
            return numeroGuiaOrigem;
        }

        /**
         * Sets the value of the numeroGuiaOrigem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroGuiaOrigem(String value) {
            this.numeroGuiaOrigem = value;
        }

        /**
         * Gets the value of the numeroGuiaOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroGuiaOperadora() {
            return numeroGuiaOperadora;
        }

        /**
         * Sets the value of the numeroGuiaOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroGuiaOperadora(String value) {
            this.numeroGuiaOperadora = value;
        }

        /**
         * Gets the value of the senha property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenha() {
            return senha;
        }

        /**
         * Sets the value of the senha property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenha(String value) {
            this.senha = value;
        }

        /**
         * Gets the value of the opcaoRecursoGuia property.
         * 
         * @return
         *     possible object is
         *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia }
         *     
         */
        public CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia getOpcaoRecursoGuia() {
            return opcaoRecursoGuia;
        }

        /**
         * Sets the value of the opcaoRecursoGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia }
         *     
         */
        public void setOpcaoRecursoGuia(CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia value) {
            this.opcaoRecursoGuia = value;
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
         *         &lt;element name="recursoGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="itensGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *                   &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
         *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *                   &lt;element name="denteRegiao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
         *                   &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "recursoGuia",
            "itensGuia"
        })
        public static class OpcaoRecursoGuia {

            protected List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia> recursoGuia;
            protected List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia> itensGuia;

            /**
             * Gets the value of the recursoGuia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recursoGuia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRecursoGuia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia }
             * 
             * 
             */
            public List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia> getRecursoGuia() {
                if (recursoGuia == null) {
                    recursoGuia = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia>();
                }
                return this.recursoGuia;
            }

            /**
             * Gets the value of the itensGuia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itensGuia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItensGuia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia }
             * 
             * 
             */
            public List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia> getItensGuia() {
                if (itensGuia == null) {
                    itensGuia = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia>();
                }
                return this.itensGuia;
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
             *         &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
             *         &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
             *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
             *         &lt;element name="denteRegiao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
             *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
             *         &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
                "dataInicio",
                "dataFim",
                "procRecurso",
                "denteRegiao",
                "denteFace",
                "codGlosaItem",
                "valorRecursado",
                "justificativaItem"
            })
            public static class ItensGuia {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dataInicio;
                protected XMLGregorianCalendar dataFim;
                @XmlElement(required = true)
                protected CtProcedimentoDados procRecurso;
                protected CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao denteRegiao;
                protected String denteFace;
                @XmlElement(required = true)
                protected String codGlosaItem;
                @XmlElement(required = true)
                protected BigDecimal valorRecursado;
                @XmlElement(required = true)
                protected String justificativaItem;

                /**
                 * Gets the value of the dataInicio property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataInicio() {
                    return dataInicio;
                }

                /**
                 * Sets the value of the dataInicio property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataInicio(XMLGregorianCalendar value) {
                    this.dataInicio = value;
                }

                /**
                 * Gets the value of the dataFim property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataFim() {
                    return dataFim;
                }

                /**
                 * Sets the value of the dataFim property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataFim(XMLGregorianCalendar value) {
                    this.dataFim = value;
                }

                /**
                 * Gets the value of the procRecurso property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtProcedimentoDados }
                 *     
                 */
                public CtProcedimentoDados getProcRecurso() {
                    return procRecurso;
                }

                /**
                 * Sets the value of the procRecurso property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtProcedimentoDados }
                 *     
                 */
                public void setProcRecurso(CtProcedimentoDados value) {
                    this.procRecurso = value;
                }

                /**
                 * Gets the value of the denteRegiao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao }
                 *     
                 */
                public CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao getDenteRegiao() {
                    return denteRegiao;
                }

                /**
                 * Sets the value of the denteRegiao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao }
                 *     
                 */
                public void setDenteRegiao(CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao value) {
                    this.denteRegiao = value;
                }

                /**
                 * Gets the value of the denteFace property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDenteFace() {
                    return denteFace;
                }

                /**
                 * Sets the value of the denteFace property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDenteFace(String value) {
                    this.denteFace = value;
                }

                /**
                 * Gets the value of the codGlosaItem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodGlosaItem() {
                    return codGlosaItem;
                }

                /**
                 * Sets the value of the codGlosaItem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodGlosaItem(String value) {
                    this.codGlosaItem = value;
                }

                /**
                 * Gets the value of the valorRecursado property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorRecursado() {
                    return valorRecursado;
                }

                /**
                 * Sets the value of the valorRecursado property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorRecursado(BigDecimal value) {
                    this.valorRecursado = value;
                }

                /**
                 * Gets the value of the justificativaItem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJustificativaItem() {
                    return justificativaItem;
                }

                /**
                 * Sets the value of the justificativaItem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJustificativaItem(String value) {
                    this.justificativaItem = value;
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
                 *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                 *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
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
                    "codDente",
                    "codRegiao"
                })
                public static class DenteRegiao {

                    protected String codDente;
                    protected DmRegiao codRegiao;

                    /**
                     * Gets the value of the codDente property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodDente() {
                        return codDente;
                    }

                    /**
                     * Sets the value of the codDente property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodDente(String value) {
                        this.codDente = value;
                    }

                    /**
                     * Gets the value of the codRegiao property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DmRegiao }
                     *     
                     */
                    public DmRegiao getCodRegiao() {
                        return codRegiao;
                    }

                    /**
                     * Sets the value of the codRegiao property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DmRegiao }
                     *     
                     */
                    public void setCodRegiao(DmRegiao value) {
                        this.codRegiao = value;
                    }

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
             *       &lt;sequence>
             *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
                "codGlosaGuia",
                "justificativaGuia"
            })
            public static class RecursoGuia {

                @XmlElement(required = true)
                protected String codGlosaGuia;
                @XmlElement(required = true)
                protected String justificativaGuia;

                /**
                 * Gets the value of the codGlosaGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodGlosaGuia() {
                    return codGlosaGuia;
                }

                /**
                 * Sets the value of the codGlosaGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodGlosaGuia(String value) {
                    this.codGlosaGuia = value;
                }

                /**
                 * Gets the value of the justificativaGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJustificativaGuia() {
                    return justificativaGuia;
                }

                /**
                 * Sets the value of the justificativaGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJustificativaGuia(String value) {
                    this.justificativaGuia = value;
                }

            }

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
     *       &lt;sequence>
     *         &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *         &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
        "codigoGlosaProtocolo",
        "justificativaProtocolo"
    })
    public static class RecursoProtocolo {

        @XmlElement(required = true)
        protected String codigoGlosaProtocolo;
        @XmlElement(required = true)
        protected String justificativaProtocolo;

        /**
         * Gets the value of the codigoGlosaProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoGlosaProtocolo() {
            return codigoGlosaProtocolo;
        }

        /**
         * Sets the value of the codigoGlosaProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoGlosaProtocolo(String value) {
            this.codigoGlosaProtocolo = value;
        }

        /**
         * Gets the value of the justificativaProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativaProtocolo() {
            return justificativaProtocolo;
        }

        /**
         * Sets the value of the justificativaProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativaProtocolo(String value) {
            this.justificativaProtocolo = value;
        }

    }

}
