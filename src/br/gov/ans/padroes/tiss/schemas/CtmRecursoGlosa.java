
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
 * <p>Java class for ctm_recursoGlosa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_recursoGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaRecGlosaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="objetoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_objetoRecurso"/>
 *         &lt;element name="numeroGuiaRecGlosaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico12"/>
 *         &lt;element name="opcaoRecurso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="recursoProtocolo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                             &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="recursoGuia" maxOccurs="100">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                             &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="opcaoRecursoGuia">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="recursoGuiaCompleta" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                                 &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="itensGuia" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                                 &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                                                 &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                                 &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
 *                                                 &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                                 &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                                 &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="dataRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_recursoGlosa", propOrder = {
    "registroANS",
    "numeroGuiaRecGlosaPrestador",
    "nomeOperadora",
    "objetoRecurso",
    "numeroGuiaRecGlosaOperadora",
    "dadosContratado",
    "numeroLote",
    "numeroProtocolo",
    "opcaoRecurso",
    "valorTotalRecursado",
    "dataRecurso"
})
public class CtmRecursoGlosa {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaRecGlosaPrestador;
    @XmlElement(required = true)
    protected String nomeOperadora;
    @XmlElement(required = true)
    protected String objetoRecurso;
    protected String numeroGuiaRecGlosaOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosContratado;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected BigInteger numeroProtocolo;
    @XmlElement(required = true)
    protected CtmRecursoGlosa.OpcaoRecurso opcaoRecurso;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRecurso;

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
     * Gets the value of the numeroGuiaRecGlosaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaPrestador() {
        return numeroGuiaRecGlosaPrestador;
    }

    /**
     * Sets the value of the numeroGuiaRecGlosaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaPrestador(String value) {
        this.numeroGuiaRecGlosaPrestador = value;
    }

    /**
     * Gets the value of the nomeOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadora() {
        return nomeOperadora;
    }

    /**
     * Sets the value of the nomeOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadora(String value) {
        this.nomeOperadora = value;
    }

    /**
     * Gets the value of the objetoRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoRecurso() {
        return objetoRecurso;
    }

    /**
     * Sets the value of the objetoRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoRecurso(String value) {
        this.objetoRecurso = value;
    }

    /**
     * Gets the value of the numeroGuiaRecGlosaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaOperadora() {
        return numeroGuiaRecGlosaOperadora;
    }

    /**
     * Sets the value of the numeroGuiaRecGlosaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaOperadora(String value) {
        this.numeroGuiaRecGlosaOperadora = value;
    }

    /**
     * Gets the value of the dadosContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Sets the value of the dadosContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosContratado(CtContratadoDados value) {
        this.dadosContratado = value;
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
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroProtocolo(BigInteger value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the opcaoRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link CtmRecursoGlosa.OpcaoRecurso }
     *     
     */
    public CtmRecursoGlosa.OpcaoRecurso getOpcaoRecurso() {
        return opcaoRecurso;
    }

    /**
     * Sets the value of the opcaoRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmRecursoGlosa.OpcaoRecurso }
     *     
     */
    public void setOpcaoRecurso(CtmRecursoGlosa.OpcaoRecurso value) {
        this.opcaoRecurso = value;
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
     * Gets the value of the dataRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRecurso() {
        return dataRecurso;
    }

    /**
     * Sets the value of the dataRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRecurso(XMLGregorianCalendar value) {
        this.dataRecurso = value;
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
     *         &lt;element name="recursoProtocolo">
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
     *         &lt;element name="recursoGuia" maxOccurs="100">
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
     *                             &lt;element name="recursoGuiaCompleta" maxOccurs="unbounded">
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
     *                                       &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
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
        "recursoProtocolo",
        "recursoGuia"
    })
    public static class OpcaoRecurso {

        protected CtmRecursoGlosa.OpcaoRecurso.RecursoProtocolo recursoProtocolo;
        protected List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia> recursoGuia;

        /**
         * Gets the value of the recursoProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link CtmRecursoGlosa.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public CtmRecursoGlosa.OpcaoRecurso.RecursoProtocolo getRecursoProtocolo() {
            return recursoProtocolo;
        }

        /**
         * Sets the value of the recursoProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmRecursoGlosa.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public void setRecursoProtocolo(CtmRecursoGlosa.OpcaoRecurso.RecursoProtocolo value) {
            this.recursoProtocolo = value;
        }

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
         * {@link CtmRecursoGlosa.OpcaoRecurso.RecursoGuia }
         * 
         * 
         */
        public List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia> getRecursoGuia() {
            if (recursoGuia == null) {
                recursoGuia = new ArrayList<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia>();
            }
            return this.recursoGuia;
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
         *                   &lt;element name="recursoGuiaCompleta" maxOccurs="unbounded">
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
         *                             &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
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
        public static class RecursoGuia {

            @XmlElement(required = true)
            protected String numeroGuiaOrigem;
            protected String numeroGuiaOperadora;
            protected String senha;
            @XmlElement(required = true)
            protected CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia opcaoRecursoGuia;

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
             *     {@link CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia }
             *     
             */
            public CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia getOpcaoRecursoGuia() {
                return opcaoRecursoGuia;
            }

            /**
             * Sets the value of the opcaoRecursoGuia property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia }
             *     
             */
            public void setOpcaoRecursoGuia(CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia value) {
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
             *         &lt;element name="recursoGuiaCompleta" maxOccurs="unbounded">
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
             *                   &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
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
                "recursoGuiaCompleta",
                "itensGuia"
            })
            public static class OpcaoRecursoGuia {

                protected List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.RecursoGuiaCompleta> recursoGuiaCompleta;
                protected List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.ItensGuia> itensGuia;

                /**
                 * Gets the value of the recursoGuiaCompleta property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the recursoGuiaCompleta property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecursoGuiaCompleta().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.RecursoGuiaCompleta }
                 * 
                 * 
                 */
                public List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.RecursoGuiaCompleta> getRecursoGuiaCompleta() {
                    if (recursoGuiaCompleta == null) {
                        recursoGuiaCompleta = new ArrayList<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.RecursoGuiaCompleta>();
                    }
                    return this.recursoGuiaCompleta;
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
                 * {@link CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.ItensGuia }
                 * 
                 * 
                 */
                public List<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.ItensGuia> getItensGuia() {
                    if (itensGuia == null) {
                        itensGuia = new ArrayList<CtmRecursoGlosa.OpcaoRecurso.RecursoGuia.OpcaoRecursoGuia.ItensGuia>();
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
                 *         &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
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
                    "grauParticipacao",
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
                    protected String grauParticipacao;
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
                     * Gets the value of the grauParticipacao property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGrauParticipacao() {
                        return grauParticipacao;
                    }

                    /**
                     * Sets the value of the grauParticipacao property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGrauParticipacao(String value) {
                        this.grauParticipacao = value;
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
                public static class RecursoGuiaCompleta {

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

}
