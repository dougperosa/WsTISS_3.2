
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
 * <p>Java class for cto_recursoGlosaOdonto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cto_recursoGlosaOdonto">
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
 *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                             &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                             &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                             &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                             &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
 *                                       &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                                       &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                       &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                       &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                     &lt;/sequence>
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
@XmlType(name = "cto_recursoGlosaOdonto", propOrder = {
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
public class CtoRecursoGlosaOdonto {

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
    protected CtoRecursoGlosaOdonto.OpcaoRecurso opcaoRecurso;
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
     *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso }
     *     
     */
    public CtoRecursoGlosaOdonto.OpcaoRecurso getOpcaoRecurso() {
        return opcaoRecurso;
    }

    /**
     * Sets the value of the opcaoRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso }
     *     
     */
    public void setOpcaoRecurso(CtoRecursoGlosaOdonto.OpcaoRecurso value) {
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
     *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                   &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                   &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                   &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
     *                             &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *                             &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                             &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                             &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                           &lt;/sequence>
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

        protected CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo recursoProtocolo;
        protected List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia> recursoGuia;

        /**
         * Gets the value of the recursoProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo getRecursoProtocolo() {
            return recursoProtocolo;
        }

        /**
         * Sets the value of the recursoProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public void setRecursoProtocolo(CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo value) {
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
         * {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia }
         * 
         * 
         */
        public List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia> getRecursoGuia() {
            if (recursoGuia == null) {
                recursoGuia = new ArrayList<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia>();
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
         *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *         &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
         *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
         *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *                   &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
        @XmlType(name = "", propOrder = {
            "numeroGuiaPrestador",
            "numeroGuiaOperadora",
            "senha",
            "nomeBeneficiario",
            "codGlosaGuia",
            "justificativaGuia",
            "recursoProcedimento"
        })
        public static class RecursoGuia {

            @XmlElement(required = true)
            protected String numeroGuiaPrestador;
            protected String numeroGuiaOperadora;
            protected String senha;
            @XmlElement(required = true)
            protected String nomeBeneficiario;
            @XmlElement(required = true)
            protected String codGlosaGuia;
            @XmlElement(required = true)
            protected String justificativaGuia;
            protected List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento> recursoProcedimento;

            /**
             * Gets the value of the numeroGuiaPrestador property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroGuiaPrestador() {
                return numeroGuiaPrestador;
            }

            /**
             * Sets the value of the numeroGuiaPrestador property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroGuiaPrestador(String value) {
                this.numeroGuiaPrestador = value;
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
             * Gets the value of the nomeBeneficiario property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomeBeneficiario() {
                return nomeBeneficiario;
            }

            /**
             * Sets the value of the nomeBeneficiario property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomeBeneficiario(String value) {
                this.nomeBeneficiario = value;
            }

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

            /**
             * Gets the value of the recursoProcedimento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recursoProcedimento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRecursoProcedimento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento }
             * 
             * 
             */
            public List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento> getRecursoProcedimento() {
                if (recursoProcedimento == null) {
                    recursoProcedimento = new ArrayList<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento>();
                }
                return this.recursoProcedimento;
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
             *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
             *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
             *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
             *         &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
             *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
                "dataRealizacao",
                "denteRegiao",
                "denteFace",
                "quantidade",
                "procRecurso",
                "codGlosaProc",
                "justificativaProc",
                "valorRecursado"
            })
            public static class RecursoProcedimento {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dataRealizacao;
                protected CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao denteRegiao;
                protected String denteFace;
                @XmlElement(required = true)
                protected BigInteger quantidade;
                @XmlElement(required = true)
                protected CtProcedimentoDados procRecurso;
                @XmlElement(required = true)
                protected String codGlosaProc;
                @XmlElement(required = true)
                protected String justificativaProc;
                @XmlElement(required = true)
                protected BigDecimal valorRecursado;

                /**
                 * Gets the value of the dataRealizacao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataRealizacao() {
                    return dataRealizacao;
                }

                /**
                 * Sets the value of the dataRealizacao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataRealizacao(XMLGregorianCalendar value) {
                    this.dataRealizacao = value;
                }

                /**
                 * Gets the value of the denteRegiao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao }
                 *     
                 */
                public CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao getDenteRegiao() {
                    return denteRegiao;
                }

                /**
                 * Sets the value of the denteRegiao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao }
                 *     
                 */
                public void setDenteRegiao(CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao value) {
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
                 * Gets the value of the quantidade property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getQuantidade() {
                    return quantidade;
                }

                /**
                 * Sets the value of the quantidade property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setQuantidade(BigInteger value) {
                    this.quantidade = value;
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
                 * Gets the value of the codGlosaProc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodGlosaProc() {
                    return codGlosaProc;
                }

                /**
                 * Sets the value of the codGlosaProc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodGlosaProc(String value) {
                    this.codGlosaProc = value;
                }

                /**
                 * Gets the value of the justificativaProc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJustificativaProc() {
                    return justificativaProc;
                }

                /**
                 * Sets the value of the justificativaProc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJustificativaProc(String value) {
                    this.justificativaProc = value;
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
