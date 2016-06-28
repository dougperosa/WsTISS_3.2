
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
 * <p>Java class for ctm_prorrogacaoSolicitacaoGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_prorrogacaoSolicitacaoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nrGuiaReferenciada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="dadosBeneficiario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosContratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="dadosProfissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *         &lt;element name="dadosInternacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qtDiariasAdicionais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *                   &lt;element name="tipoAcomodacaoSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
 *                   &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosAdicionais" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="anexoClinicoProrrogacao" minOccurs="0">
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
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_prorrogacaoSolicitacaoGuia", propOrder = {
    "registroANS",
    "numeroGuiaPrestador",
    "nrGuiaReferenciada",
    "dadosBeneficiario",
    "dadosContratadoSolicitante",
    "dadosProfissionalSolicitante",
    "dadosInternacao",
    "procedimentosAdicionais",
    "anexoClinicoProrrogacao",
    "observacao",
    "dataSolicitacao"
})
public class CtmProrrogacaoSolicitacaoGuia {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    @XmlElement(required = true)
    protected String nrGuiaReferenciada;
    @XmlElement(required = true)
    protected CtmProrrogacaoSolicitacaoGuia.DadosBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtContratadoDados dadosContratadoSolicitante;
    @XmlElement(required = true)
    protected CtContratadoProfissionalDados dadosProfissionalSolicitante;
    @XmlElement(required = true)
    protected CtmProrrogacaoSolicitacaoGuia.DadosInternacao dadosInternacao;
    protected List<CtmProrrogacaoSolicitacaoGuia.ProcedimentosAdicionais> procedimentosAdicionais;
    protected CtmProrrogacaoSolicitacaoGuia.AnexoClinicoProrrogacao anexoClinicoProrrogacao;
    protected String observacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitacao;

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
     * Gets the value of the nrGuiaReferenciada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrGuiaReferenciada() {
        return nrGuiaReferenciada;
    }

    /**
     * Sets the value of the nrGuiaReferenciada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrGuiaReferenciada(String value) {
        this.nrGuiaReferenciada = value;
    }

    /**
     * Gets the value of the dadosBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.DadosBeneficiario }
     *     
     */
    public CtmProrrogacaoSolicitacaoGuia.DadosBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Sets the value of the dadosBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.DadosBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtmProrrogacaoSolicitacaoGuia.DadosBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Gets the value of the dadosContratadoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosContratadoSolicitante() {
        return dadosContratadoSolicitante;
    }

    /**
     * Sets the value of the dadosContratadoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosContratadoSolicitante(CtContratadoDados value) {
        this.dadosContratadoSolicitante = value;
    }

    /**
     * Gets the value of the dadosProfissionalSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoProfissionalDados }
     *     
     */
    public CtContratadoProfissionalDados getDadosProfissionalSolicitante() {
        return dadosProfissionalSolicitante;
    }

    /**
     * Sets the value of the dadosProfissionalSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoProfissionalDados }
     *     
     */
    public void setDadosProfissionalSolicitante(CtContratadoProfissionalDados value) {
        this.dadosProfissionalSolicitante = value;
    }

    /**
     * Gets the value of the dadosInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.DadosInternacao }
     *     
     */
    public CtmProrrogacaoSolicitacaoGuia.DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Sets the value of the dadosInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.DadosInternacao }
     *     
     */
    public void setDadosInternacao(CtmProrrogacaoSolicitacaoGuia.DadosInternacao value) {
        this.dadosInternacao = value;
    }

    /**
     * Gets the value of the procedimentosAdicionais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosAdicionais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosAdicionais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmProrrogacaoSolicitacaoGuia.ProcedimentosAdicionais }
     * 
     * 
     */
    public List<CtmProrrogacaoSolicitacaoGuia.ProcedimentosAdicionais> getProcedimentosAdicionais() {
        if (procedimentosAdicionais == null) {
            procedimentosAdicionais = new ArrayList<CtmProrrogacaoSolicitacaoGuia.ProcedimentosAdicionais>();
        }
        return this.procedimentosAdicionais;
    }

    /**
     * Gets the value of the anexoClinicoProrrogacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.AnexoClinicoProrrogacao }
     *     
     */
    public CtmProrrogacaoSolicitacaoGuia.AnexoClinicoProrrogacao getAnexoClinicoProrrogacao() {
        return anexoClinicoProrrogacao;
    }

    /**
     * Sets the value of the anexoClinicoProrrogacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmProrrogacaoSolicitacaoGuia.AnexoClinicoProrrogacao }
     *     
     */
    public void setAnexoClinicoProrrogacao(CtmProrrogacaoSolicitacaoGuia.AnexoClinicoProrrogacao value) {
        this.anexoClinicoProrrogacao = value;
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
    public static class AnexoClinicoProrrogacao {

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
     *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
        "numeroCarteira",
        "nomeBeneficiario",
        "identificadorBeneficiario"
    })
    public static class DadosBeneficiario {

        @XmlElement(required = true)
        protected String numeroCarteira;
        @XmlElement(required = true)
        protected String nomeBeneficiario;
        protected byte[] identificadorBeneficiario;

        /**
         * Gets the value of the numeroCarteira property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroCarteira() {
            return numeroCarteira;
        }

        /**
         * Sets the value of the numeroCarteira property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroCarteira(String value) {
            this.numeroCarteira = value;
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
         * Gets the value of the identificadorBeneficiario property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getIdentificadorBeneficiario() {
            return identificadorBeneficiario;
        }

        /**
         * Sets the value of the identificadorBeneficiario property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setIdentificadorBeneficiario(byte[] value) {
            this.identificadorBeneficiario = ((byte[]) value);
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
     *         &lt;element name="qtDiariasAdicionais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
     *         &lt;element name="tipoAcomodacaoSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
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
        "qtDiariasAdicionais",
        "tipoAcomodacaoSolicitada",
        "indicacaoClinica"
    })
    public static class DadosInternacao {

        protected BigInteger qtDiariasAdicionais;
        protected String tipoAcomodacaoSolicitada;
        @XmlElement(required = true)
        protected String indicacaoClinica;

        /**
         * Gets the value of the qtDiariasAdicionais property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQtDiariasAdicionais() {
            return qtDiariasAdicionais;
        }

        /**
         * Sets the value of the qtDiariasAdicionais property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQtDiariasAdicionais(BigInteger value) {
            this.qtDiariasAdicionais = value;
        }

        /**
         * Gets the value of the tipoAcomodacaoSolicitada property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoAcomodacaoSolicitada() {
            return tipoAcomodacaoSolicitada;
        }

        /**
         * Sets the value of the tipoAcomodacaoSolicitada property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoAcomodacaoSolicitada(String value) {
            this.tipoAcomodacaoSolicitada = value;
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
    public static class ProcedimentosAdicionais {

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
