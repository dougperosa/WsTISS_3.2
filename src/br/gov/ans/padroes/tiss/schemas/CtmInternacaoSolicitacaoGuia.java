
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
 * <p>Java class for ctm_internacaoSolicitacaoGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_internacaoSolicitacaoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="identificacaoSolicitante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosDoContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="dadosProfissionalContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosHospitalSolicitado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoIndicadonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeContratadoIndicado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="dataSugeridaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosInternacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *                   &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
 *                   &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regimeInternacao"/>
 *                   &lt;element name="qtDiariasSolicitadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="indicadorOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                   &lt;element name="indicadorQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                   &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hipotesesDiagnosticas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diagnosticoCID" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="indicadorAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosSolicitados" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                   &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000" minOccurs="0"/>
 *         &lt;element name="anexoClinico" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="solicitacaoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio" minOccurs="0"/>
 *                   &lt;element name="solicitacaoRadioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio" minOccurs="0"/>
 *                   &lt;element name="solicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME" minOccurs="0"/>
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
@XmlType(name = "ctm_internacaoSolicitacaoGuia", propOrder = {
    "registroANS",
    "numeroGuiaPrestador",
    "dadosBeneficiario",
    "identificacaoSolicitante",
    "dadosHospitalSolicitado",
    "dadosInternacao",
    "hipotesesDiagnosticas",
    "procedimentosSolicitados",
    "dataSolicitacao",
    "observacao",
    "anexoClinico"
})
public class CtmInternacaoSolicitacaoGuia {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmInternacaoSolicitacaoGuia.IdentificacaoSolicitante identificacaoSolicitante;
    @XmlElement(required = true)
    protected CtmInternacaoSolicitacaoGuia.DadosHospitalSolicitado dadosHospitalSolicitado;
    @XmlElement(required = true)
    protected CtmInternacaoSolicitacaoGuia.DadosInternacao dadosInternacao;
    @XmlElement(required = true)
    protected CtmInternacaoSolicitacaoGuia.HipotesesDiagnosticas hipotesesDiagnosticas;
    @XmlElement(required = true)
    protected List<CtmInternacaoSolicitacaoGuia.ProcedimentosSolicitados> procedimentosSolicitados;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitacao;
    protected String observacao;
    protected CtmInternacaoSolicitacaoGuia.AnexoClinico anexoClinico;

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
     * Gets the value of the identificacaoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia.IdentificacaoSolicitante }
     *     
     */
    public CtmInternacaoSolicitacaoGuia.IdentificacaoSolicitante getIdentificacaoSolicitante() {
        return identificacaoSolicitante;
    }

    /**
     * Sets the value of the identificacaoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia.IdentificacaoSolicitante }
     *     
     */
    public void setIdentificacaoSolicitante(CtmInternacaoSolicitacaoGuia.IdentificacaoSolicitante value) {
        this.identificacaoSolicitante = value;
    }

    /**
     * Gets the value of the dadosHospitalSolicitado property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia.DadosHospitalSolicitado }
     *     
     */
    public CtmInternacaoSolicitacaoGuia.DadosHospitalSolicitado getDadosHospitalSolicitado() {
        return dadosHospitalSolicitado;
    }

    /**
     * Sets the value of the dadosHospitalSolicitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia.DadosHospitalSolicitado }
     *     
     */
    public void setDadosHospitalSolicitado(CtmInternacaoSolicitacaoGuia.DadosHospitalSolicitado value) {
        this.dadosHospitalSolicitado = value;
    }

    /**
     * Gets the value of the dadosInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia.DadosInternacao }
     *     
     */
    public CtmInternacaoSolicitacaoGuia.DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Sets the value of the dadosInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia.DadosInternacao }
     *     
     */
    public void setDadosInternacao(CtmInternacaoSolicitacaoGuia.DadosInternacao value) {
        this.dadosInternacao = value;
    }

    /**
     * Gets the value of the hipotesesDiagnosticas property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia.HipotesesDiagnosticas }
     *     
     */
    public CtmInternacaoSolicitacaoGuia.HipotesesDiagnosticas getHipotesesDiagnosticas() {
        return hipotesesDiagnosticas;
    }

    /**
     * Sets the value of the hipotesesDiagnosticas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia.HipotesesDiagnosticas }
     *     
     */
    public void setHipotesesDiagnosticas(CtmInternacaoSolicitacaoGuia.HipotesesDiagnosticas value) {
        this.hipotesesDiagnosticas = value;
    }

    /**
     * Gets the value of the procedimentosSolicitados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosSolicitados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosSolicitados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmInternacaoSolicitacaoGuia.ProcedimentosSolicitados }
     * 
     * 
     */
    public List<CtmInternacaoSolicitacaoGuia.ProcedimentosSolicitados> getProcedimentosSolicitados() {
        if (procedimentosSolicitados == null) {
            procedimentosSolicitados = new ArrayList<CtmInternacaoSolicitacaoGuia.ProcedimentosSolicitados>();
        }
        return this.procedimentosSolicitados;
    }

    /**
     * Gets the value of the dataSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Sets the value of the dataSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitacao(XMLGregorianCalendar value) {
        this.dataSolicitacao = value;
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
     * Gets the value of the anexoClinico property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia.AnexoClinico }
     *     
     */
    public CtmInternacaoSolicitacaoGuia.AnexoClinico getAnexoClinico() {
        return anexoClinico;
    }

    /**
     * Sets the value of the anexoClinico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia.AnexoClinico }
     *     
     */
    public void setAnexoClinico(CtmInternacaoSolicitacaoGuia.AnexoClinico value) {
        this.anexoClinico = value;
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
     *         &lt;element name="solicitacaoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio" minOccurs="0"/>
     *         &lt;element name="solicitacaoRadioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio" minOccurs="0"/>
     *         &lt;element name="solicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME" minOccurs="0"/>
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
        "solicitacaoQuimioterapia",
        "solicitacaoRadioterapia",
        "solicitacaoOPME"
    })
    public static class AnexoClinico {

        protected CtmAnexoSolicitacaoQuimio solicitacaoQuimioterapia;
        protected CtmAnexoSolicitacaoRadio solicitacaoRadioterapia;
        protected CtmAnexoSolicitacaoOPME solicitacaoOPME;

        /**
         * Gets the value of the solicitacaoQuimioterapia property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public CtmAnexoSolicitacaoQuimio getSolicitacaoQuimioterapia() {
            return solicitacaoQuimioterapia;
        }

        /**
         * Sets the value of the solicitacaoQuimioterapia property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public void setSolicitacaoQuimioterapia(CtmAnexoSolicitacaoQuimio value) {
            this.solicitacaoQuimioterapia = value;
        }

        /**
         * Gets the value of the solicitacaoRadioterapia property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public CtmAnexoSolicitacaoRadio getSolicitacaoRadioterapia() {
            return solicitacaoRadioterapia;
        }

        /**
         * Sets the value of the solicitacaoRadioterapia property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public void setSolicitacaoRadioterapia(CtmAnexoSolicitacaoRadio value) {
            this.solicitacaoRadioterapia = value;
        }

        /**
         * Gets the value of the solicitacaoOPME property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public CtmAnexoSolicitacaoOPME getSolicitacaoOPME() {
            return solicitacaoOPME;
        }

        /**
         * Sets the value of the solicitacaoOPME property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public void setSolicitacaoOPME(CtmAnexoSolicitacaoOPME value) {
            this.solicitacaoOPME = value;
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
     *         &lt;element name="codigoIndicadonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeContratadoIndicado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="dataSugeridaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
        "codigoIndicadonaOperadora",
        "nomeContratadoIndicado",
        "dataSugeridaInternacao"
    })
    public static class DadosHospitalSolicitado {

        @XmlElement(required = true)
        protected String codigoIndicadonaOperadora;
        @XmlElement(required = true)
        protected String nomeContratadoIndicado;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataSugeridaInternacao;

        /**
         * Gets the value of the codigoIndicadonaOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoIndicadonaOperadora() {
            return codigoIndicadonaOperadora;
        }

        /**
         * Sets the value of the codigoIndicadonaOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoIndicadonaOperadora(String value) {
            this.codigoIndicadonaOperadora = value;
        }

        /**
         * Gets the value of the nomeContratadoIndicado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratadoIndicado() {
            return nomeContratadoIndicado;
        }

        /**
         * Sets the value of the nomeContratadoIndicado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratadoIndicado(String value) {
            this.nomeContratadoIndicado = value;
        }

        /**
         * Gets the value of the dataSugeridaInternacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSugeridaInternacao() {
            return dataSugeridaInternacao;
        }

        /**
         * Sets the value of the dataSugeridaInternacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSugeridaInternacao(XMLGregorianCalendar value) {
            this.dataSugeridaInternacao = value;
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
     *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
     *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
     *         &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regimeInternacao"/>
     *         &lt;element name="qtDiariasSolicitadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="indicadorOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *         &lt;element name="indicadorQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500"/>
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
        "caraterAtendimento",
        "tipoInternacao",
        "regimeInternacao",
        "qtDiariasSolicitadas",
        "indicadorOPME",
        "indicadorQuimio",
        "indicacaoClinica"
    })
    public static class DadosInternacao {

        @XmlElement(required = true)
        protected String caraterAtendimento;
        @XmlElement(required = true)
        protected String tipoInternacao;
        @XmlElement(required = true)
        protected String regimeInternacao;
        @XmlElement(required = true)
        protected BigInteger qtDiariasSolicitadas;
        @XmlElement(required = true)
        protected DmSimNao indicadorOPME;
        @XmlElement(required = true)
        protected DmSimNao indicadorQuimio;
        @XmlElement(required = true)
        protected String indicacaoClinica;

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
         * Gets the value of the qtDiariasSolicitadas property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQtDiariasSolicitadas() {
            return qtDiariasSolicitadas;
        }

        /**
         * Sets the value of the qtDiariasSolicitadas property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQtDiariasSolicitadas(BigInteger value) {
            this.qtDiariasSolicitadas = value;
        }

        /**
         * Gets the value of the indicadorOPME property.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getIndicadorOPME() {
            return indicadorOPME;
        }

        /**
         * Sets the value of the indicadorOPME property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setIndicadorOPME(DmSimNao value) {
            this.indicadorOPME = value;
        }

        /**
         * Gets the value of the indicadorQuimio property.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getIndicadorQuimio() {
            return indicadorQuimio;
        }

        /**
         * Sets the value of the indicadorQuimio property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setIndicadorQuimio(DmSimNao value) {
            this.indicadorQuimio = value;
        }

        /**
         * Gets the value of the indicacaoClinica property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicacaoClinica() {
            return indicacaoClinica;
        }

        /**
         * Sets the value of the indicacaoClinica property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicacaoClinica(String value) {
            this.indicacaoClinica = value;
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
     *         &lt;element name="diagnosticoCID" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="indicadorAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
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
        "diagnosticoCID",
        "indicadorAcidente"
    })
    public static class HipotesesDiagnosticas {

        protected List<String> diagnosticoCID;
        @XmlElement(required = true)
        protected String indicadorAcidente;

        /**
         * Gets the value of the diagnosticoCID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagnosticoCID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiagnosticoCID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDiagnosticoCID() {
            if (diagnosticoCID == null) {
                diagnosticoCID = new ArrayList<String>();
            }
            return this.diagnosticoCID;
        }

        /**
         * Gets the value of the indicadorAcidente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicadorAcidente() {
            return indicadorAcidente;
        }

        /**
         * Sets the value of the indicadorAcidente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicadorAcidente(String value) {
            this.indicadorAcidente = value;
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
     *         &lt;element name="dadosDoContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="dadosProfissionalContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
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
        "dadosDoContratado",
        "dadosProfissionalContratado"
    })
    public static class IdentificacaoSolicitante {

        @XmlElement(required = true)
        protected CtContratadoDados dadosDoContratado;
        @XmlElement(required = true)
        protected CtContratadoProfissionalDados dadosProfissionalContratado;

        /**
         * Gets the value of the dadosDoContratado property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosDoContratado() {
            return dadosDoContratado;
        }

        /**
         * Sets the value of the dadosDoContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosDoContratado(CtContratadoDados value) {
            this.dadosDoContratado = value;
        }

        /**
         * Gets the value of the dadosProfissionalContratado property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public CtContratadoProfissionalDados getDadosProfissionalContratado() {
            return dadosProfissionalContratado;
        }

        /**
         * Sets the value of the dadosProfissionalContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public void setDadosProfissionalContratado(CtContratadoProfissionalDados value) {
            this.dadosProfissionalContratado = value;
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
     *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
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
        "quantidadeSolicitada"
    })
    public static class ProcedimentosSolicitados {

        @XmlElement(required = true)
        protected CtProcedimentoDados procedimento;
        @XmlElement(required = true)
        protected BigInteger quantidadeSolicitada;

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
         * Gets the value of the quantidadeSolicitada property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidadeSolicitada() {
            return quantidadeSolicitada;
        }

        /**
         * Sets the value of the quantidadeSolicitada property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidadeSolicitada(BigInteger value) {
            this.quantidadeSolicitada = value;
        }

    }

}
