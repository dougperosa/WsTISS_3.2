
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
 * recibo de recurso de glosa
 * 
 * <p>Java class for ct_glosaRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_glosaRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaRecGlosaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaRecGlosaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="objetoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_objetoRecurso"/>
 *         &lt;element name="dadosContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico12"/>
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
 *                             &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="recursoGuia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="respostaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaGuiaMedica"/>
 *                             &lt;element name="respostaGuiaItens" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaItemMedico"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorTotalAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_glosaRecibo", propOrder = {
    "registroANS",
    "numeroGuiaRecGlosaPrestador",
    "numeroGuiaRecGlosaOperadora",
    "nomeOperadora",
    "objetoRecurso",
    "dadosContratado",
    "numeroLote",
    "numeroProtocolo",
    "opcaoRecurso",
    "dataRecurso",
    "valorTotalRecursado",
    "valorTotalAcatado"
})
public class CtGlosaRecibo {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaRecGlosaPrestador;
    protected String numeroGuiaRecGlosaOperadora;
    @XmlElement(required = true)
    protected String nomeOperadora;
    @XmlElement(required = true)
    protected String objetoRecurso;
    @XmlElement(required = true)
    protected CtGlosaRecibo.DadosContratado dadosContratado;
    @XmlElement(required = true)
    protected BigInteger numeroLote;
    @XmlElement(required = true)
    protected BigInteger numeroProtocolo;
    @XmlElement(required = true)
    protected CtGlosaRecibo.OpcaoRecurso opcaoRecurso;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRecurso;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;
    @XmlElement(required = true)
    protected BigDecimal valorTotalAcatado;

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
     * Gets the value of the dadosContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtGlosaRecibo.DadosContratado }
     *     
     */
    public CtGlosaRecibo.DadosContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Sets the value of the dadosContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaRecibo.DadosContratado }
     *     
     */
    public void setDadosContratado(CtGlosaRecibo.DadosContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
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
     *     {@link CtGlosaRecibo.OpcaoRecurso }
     *     
     */
    public CtGlosaRecibo.OpcaoRecurso getOpcaoRecurso() {
        return opcaoRecurso;
    }

    /**
     * Sets the value of the opcaoRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGlosaRecibo.OpcaoRecurso }
     *     
     */
    public void setOpcaoRecurso(CtGlosaRecibo.OpcaoRecurso value) {
        this.opcaoRecurso = value;
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
     * Gets the value of the valorTotalAcatado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalAcatado() {
        return valorTotalAcatado;
    }

    /**
     * Sets the value of the valorTotalAcatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalAcatado(BigDecimal value) {
        this.valorTotalAcatado = value;
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
     *         &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
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
        "codigoPrestador",
        "nomePrestador"
    })
    public static class DadosContratado {

        @XmlElement(required = true)
        protected String codigoPrestador;
        @XmlElement(required = true)
        protected String nomePrestador;

        /**
         * Gets the value of the codigoPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestador() {
            return codigoPrestador;
        }

        /**
         * Sets the value of the codigoPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestador(String value) {
            this.codigoPrestador = value;
        }

        /**
         * Gets the value of the nomePrestador property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePrestador() {
            return nomePrestador;
        }

        /**
         * Sets the value of the nomePrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePrestador(String value) {
            this.nomePrestador = value;
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
     *         &lt;element name="recursoProtocolo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                   &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                   &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="recursoGuia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="respostaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaGuiaMedica"/>
     *                   &lt;element name="respostaGuiaItens" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaItemMedico"/>
     *                 &lt;/choice>
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

        protected CtGlosaRecibo.OpcaoRecurso.RecursoProtocolo recursoProtocolo;
        protected List<CtGlosaRecibo.OpcaoRecurso.RecursoGuia> recursoGuia;

        /**
         * Gets the value of the recursoProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link CtGlosaRecibo.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public CtGlosaRecibo.OpcaoRecurso.RecursoProtocolo getRecursoProtocolo() {
            return recursoProtocolo;
        }

        /**
         * Sets the value of the recursoProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGlosaRecibo.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public void setRecursoProtocolo(CtGlosaRecibo.OpcaoRecurso.RecursoProtocolo value) {
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
         * {@link CtGlosaRecibo.OpcaoRecurso.RecursoGuia }
         * 
         * 
         */
        public List<CtGlosaRecibo.OpcaoRecurso.RecursoGuia> getRecursoGuia() {
            if (recursoGuia == null) {
                recursoGuia = new ArrayList<CtGlosaRecibo.OpcaoRecurso.RecursoGuia>();
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
         *       &lt;choice>
         *         &lt;element name="respostaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaGuiaMedica"/>
         *         &lt;element name="respostaGuiaItens" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaGlosaItemMedico"/>
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
            "respostaGuia",
            "respostaGuiaItens"
        })
        public static class RecursoGuia {

            protected CtRespostaGlosaGuiaMedica respostaGuia;
            protected CtRespostaGlosaItemMedico respostaGuiaItens;

            /**
             * Gets the value of the respostaGuia property.
             * 
             * @return
             *     possible object is
             *     {@link CtRespostaGlosaGuiaMedica }
             *     
             */
            public CtRespostaGlosaGuiaMedica getRespostaGuia() {
                return respostaGuia;
            }

            /**
             * Sets the value of the respostaGuia property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtRespostaGlosaGuiaMedica }
             *     
             */
            public void setRespostaGuia(CtRespostaGlosaGuiaMedica value) {
                this.respostaGuia = value;
            }

            /**
             * Gets the value of the respostaGuiaItens property.
             * 
             * @return
             *     possible object is
             *     {@link CtRespostaGlosaItemMedico }
             *     
             */
            public CtRespostaGlosaItemMedico getRespostaGuiaItens() {
                return respostaGuiaItens;
            }

            /**
             * Sets the value of the respostaGuiaItens property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtRespostaGlosaItemMedico }
             *     
             */
            public void setRespostaGuiaItens(CtRespostaGlosaItemMedico value) {
                this.respostaGuiaItens = value;
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
         *         &lt;element name="recursoAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
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
            "justificativaProtocolo",
            "recursoAcatado"
        })
        public static class RecursoProtocolo {

            @XmlElement(required = true)
            protected String codigoGlosaProtocolo;
            @XmlElement(required = true)
            protected String justificativaProtocolo;
            @XmlElement(required = true)
            protected DmSimNao recursoAcatado;

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

            /**
             * Gets the value of the recursoAcatado property.
             * 
             * @return
             *     possible object is
             *     {@link DmSimNao }
             *     
             */
            public DmSimNao getRecursoAcatado() {
                return recursoAcatado;
            }

            /**
             * Sets the value of the recursoAcatado property.
             * 
             * @param value
             *     allowed object is
             *     {@link DmSimNao }
             *     
             */
            public void setRecursoAcatado(DmSimNao value) {
                this.recursoAcatado = value;
            }

        }

    }

}
