
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_guiaDadosAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaDadosAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dataEmissao_SolicitacaoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="vlInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *         &lt;element name="glosaAnexo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                   &lt;element name="vlGlosaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosSolicitados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
 *                             &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *                             &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                             &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *                             &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="glosasProcedimento">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                                       &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
@XmlType(name = "ct_guiaDadosAnexo", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "dadosBeneficiario",
    "dataEmissaoSolicitacaoAnexo",
    "vlInformadoGuia",
    "glosaAnexo",
    "procedimentosSolicitados"
})
public class CtGuiaDadosAnexo {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(name = "dataEmissao_SolicitacaoAnexo", required = true)
    protected XMLGregorianCalendar dataEmissaoSolicitacaoAnexo;
    @XmlElement(required = true)
    protected CtValorTotal vlInformadoGuia;
    protected CtGuiaDadosAnexo.GlosaAnexo glosaAnexo;
    protected CtGuiaDadosAnexo.ProcedimentosSolicitados procedimentosSolicitados;

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
     * Gets the value of the dadosBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Sets the value of the dadosBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Gets the value of the dataEmissaoSolicitacaoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoSolicitacaoAnexo() {
        return dataEmissaoSolicitacaoAnexo;
    }

    /**
     * Sets the value of the dataEmissaoSolicitacaoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoSolicitacaoAnexo(XMLGregorianCalendar value) {
        this.dataEmissaoSolicitacaoAnexo = value;
    }

    /**
     * Gets the value of the vlInformadoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getVlInformadoGuia() {
        return vlInformadoGuia;
    }

    /**
     * Sets the value of the vlInformadoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setVlInformadoGuia(CtValorTotal value) {
        this.vlInformadoGuia = value;
    }

    /**
     * Gets the value of the glosaAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosAnexo.GlosaAnexo }
     *     
     */
    public CtGuiaDadosAnexo.GlosaAnexo getGlosaAnexo() {
        return glosaAnexo;
    }

    /**
     * Sets the value of the glosaAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosAnexo.GlosaAnexo }
     *     
     */
    public void setGlosaAnexo(CtGuiaDadosAnexo.GlosaAnexo value) {
        this.glosaAnexo = value;
    }

    /**
     * Gets the value of the procedimentosSolicitados property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados }
     *     
     */
    public CtGuiaDadosAnexo.ProcedimentosSolicitados getProcedimentosSolicitados() {
        return procedimentosSolicitados;
    }

    /**
     * Sets the value of the procedimentosSolicitados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados }
     *     
     */
    public void setProcedimentosSolicitados(CtGuiaDadosAnexo.ProcedimentosSolicitados value) {
        this.procedimentosSolicitados = value;
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
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *         &lt;element name="vlGlosaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "motivoGlosa",
        "vlGlosaAnexo"
    })
    public static class GlosaAnexo {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;
        @XmlElement(required = true)
        protected BigDecimal vlGlosaAnexo;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
        }

        /**
         * Gets the value of the vlGlosaAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlGlosaAnexo() {
            return vlGlosaAnexo;
        }

        /**
         * Sets the value of the vlGlosaAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlGlosaAnexo(BigDecimal value) {
            this.vlGlosaAnexo = value;
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
     *         &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
     *                   &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
     *                   &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *                   &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
     *                   &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="glosasProcedimento">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *                             &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "procedimentoSolicitado"
    })
    public static class ProcedimentosSolicitados {

        @XmlElement(required = true)
        protected List<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado> procedimentoSolicitado;

        /**
         * Gets the value of the procedimentoSolicitado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoSolicitado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoSolicitado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado }
         * 
         * 
         */
        public List<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado> getProcedimentoSolicitado() {
            if (procedimentoSolicitado == null) {
                procedimentoSolicitado = new ArrayList<CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado>();
            }
            return this.procedimentoSolicitado;
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
         *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *         &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
         *         &lt;element name="qtdSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
         *         &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
         *         &lt;element name="qtdAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
         *         &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="glosasProcedimento">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
         *                   &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "procedimento",
            "opcaoFabricante",
            "qtdSolicitada",
            "valorSolicitado",
            "qtdAutorizada",
            "valorAutorizado",
            "glosasProcedimento"
        })
        public static class ProcedimentoSolicitado {

            @XmlElement(required = true)
            protected CtProcedimentoDados procedimento;
            protected String opcaoFabricante;
            @XmlElement(required = true)
            protected BigDecimal qtdSolicitada;
            protected BigDecimal valorSolicitado;
            @XmlElement(required = true)
            protected BigDecimal qtdAutorizada;
            @XmlElement(required = true)
            protected BigDecimal valorAutorizado;
            @XmlElement(required = true)
            protected CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento glosasProcedimento;

            /**
             * Gets the value of the procedimento property.
             * 
             * @return
             *     possible object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public CtProcedimentoDados getProcedimento() {
                return procedimento;
            }

            /**
             * Sets the value of the procedimento property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public void setProcedimento(CtProcedimentoDados value) {
                this.procedimento = value;
            }

            /**
             * Gets the value of the opcaoFabricante property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpcaoFabricante() {
                return opcaoFabricante;
            }

            /**
             * Sets the value of the opcaoFabricante property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpcaoFabricante(String value) {
                this.opcaoFabricante = value;
            }

            /**
             * Gets the value of the qtdSolicitada property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdSolicitada() {
                return qtdSolicitada;
            }

            /**
             * Sets the value of the qtdSolicitada property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdSolicitada(BigDecimal value) {
                this.qtdSolicitada = value;
            }

            /**
             * Gets the value of the valorSolicitado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorSolicitado() {
                return valorSolicitado;
            }

            /**
             * Sets the value of the valorSolicitado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorSolicitado(BigDecimal value) {
                this.valorSolicitado = value;
            }

            /**
             * Gets the value of the qtdAutorizada property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdAutorizada() {
                return qtdAutorizada;
            }

            /**
             * Sets the value of the qtdAutorizada property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdAutorizada(BigDecimal value) {
                this.qtdAutorizada = value;
            }

            /**
             * Gets the value of the valorAutorizado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorAutorizado() {
                return valorAutorizado;
            }

            /**
             * Sets the value of the valorAutorizado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorAutorizado(BigDecimal value) {
                this.valorAutorizado = value;
            }

            /**
             * Gets the value of the glosasProcedimento property.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento }
             *     
             */
            public CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento getGlosasProcedimento() {
                return glosasProcedimento;
            }

            /**
             * Sets the value of the glosasProcedimento property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento }
             *     
             */
            public void setGlosasProcedimento(CtGuiaDadosAnexo.ProcedimentosSolicitados.ProcedimentoSolicitado.GlosasProcedimento value) {
                this.glosasProcedimento = value;
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
             *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
             *         &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "motivoGlosa",
                "valorGlosaProcedimento"
            })
            public static class GlosasProcedimento {

                @XmlElement(required = true)
                protected List<CtMotivoGlosa> motivoGlosa;
                @XmlElement(required = true)
                protected BigDecimal valorGlosaProcedimento;

                /**
                 * Gets the value of the motivoGlosa property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMotivoGlosa().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtMotivoGlosa }
                 * 
                 * 
                 */
                public List<CtMotivoGlosa> getMotivoGlosa() {
                    if (motivoGlosa == null) {
                        motivoGlosa = new ArrayList<CtMotivoGlosa>();
                    }
                    return this.motivoGlosa;
                }

                /**
                 * Gets the value of the valorGlosaProcedimento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorGlosaProcedimento() {
                    return valorGlosaProcedimento;
                }

                /**
                 * Sets the value of the valorGlosaProcedimento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorGlosaProcedimento(BigDecimal value) {
                    this.valorGlosaProcedimento = value;
                }

            }

        }

    }

}
