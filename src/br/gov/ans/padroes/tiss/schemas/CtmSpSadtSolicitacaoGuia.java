
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
 * <p>Java class for ctm_sp-sadtSolicitacaoGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtSolicitacaoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosSolicitante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
 *         &lt;element name="dadosExecutante" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ctm_sp-sadtSolicitacaoGuia", propOrder = {
    "cabecalhoSolicitacao",
    "numeroGuiaPrincipal",
    "dadosBeneficiario",
    "dadosSolicitante",
    "caraterAtendimento",
    "dataSolicitacao",
    "indicacaoClinica",
    "procedimentosSolicitados",
    "dadosExecutante",
    "anexoClinico",
    "observacao"
})
public class CtmSpSadtSolicitacaoGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoSolicitacao;
    protected String numeroGuiaPrincipal;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmSpSadtSolicitacaoGuia.DadosSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected String caraterAtendimento;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitacao;
    protected String indicacaoClinica;
    @XmlElement(required = true)
    protected List<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados> procedimentosSolicitados;
    protected CtmSpSadtSolicitacaoGuia.DadosExecutante dadosExecutante;
    protected CtmSpSadtSolicitacaoGuia.AnexoClinico anexoClinico;
    protected String observacao;

    /**
     * Gets the value of the cabecalhoSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoSolicitacao() {
        return cabecalhoSolicitacao;
    }

    /**
     * Sets the value of the cabecalhoSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoSolicitacao(CtGuiaCabecalho value) {
        this.cabecalhoSolicitacao = value;
    }

    /**
     * Gets the value of the numeroGuiaPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Sets the value of the numeroGuiaPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
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
     * Gets the value of the dadosSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosSolicitante }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.DadosSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Sets the value of the dadosSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosSolicitante }
     *     
     */
    public void setDadosSolicitante(CtmSpSadtSolicitacaoGuia.DadosSolicitante value) {
        this.dadosSolicitante = value;
    }

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
     * {@link CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados }
     * 
     * 
     */
    public List<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados> getProcedimentosSolicitados() {
        if (procedimentosSolicitados == null) {
            procedimentosSolicitados = new ArrayList<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados>();
        }
        return this.procedimentosSolicitados;
    }

    /**
     * Gets the value of the dadosExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosExecutante }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.DadosExecutante getDadosExecutante() {
        return dadosExecutante;
    }

    /**
     * Sets the value of the dadosExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.DadosExecutante }
     *     
     */
    public void setDadosExecutante(CtmSpSadtSolicitacaoGuia.DadosExecutante value) {
        this.dadosExecutante = value;
    }

    /**
     * Gets the value of the anexoClinico property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia.AnexoClinico }
     *     
     */
    public CtmSpSadtSolicitacaoGuia.AnexoClinico getAnexoClinico() {
        return anexoClinico;
    }

    /**
     * Sets the value of the anexoClinico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia.AnexoClinico }
     *     
     */
    public void setAnexoClinico(CtmSpSadtSolicitacaoGuia.AnexoClinico value) {
        this.anexoClinico = value;
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
     *         &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "codigonaOperadora",
        "nomeContratado",
        "cnes"
    })
    public static class DadosExecutante {

        @XmlElement(required = true)
        protected String codigonaOperadora;
        @XmlElement(required = true)
        protected String nomeContratado;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Gets the value of the codigonaOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigonaOperadora() {
            return codigonaOperadora;
        }

        /**
         * Sets the value of the codigonaOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigonaOperadora(String value) {
            this.codigonaOperadora = value;
        }

        /**
         * Gets the value of the nomeContratado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratado() {
            return nomeContratado;
        }

        /**
         * Sets the value of the nomeContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratado(String value) {
            this.nomeContratado = value;
        }

        /**
         * Gets the value of the cnes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNES() {
            return cnes;
        }

        /**
         * Sets the value of the cnes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNES(String value) {
            this.cnes = value;
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
     *         &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
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
        "contratadoSolicitante",
        "profissionalSolicitante"
    })
    public static class DadosSolicitante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoSolicitante;
        @XmlElement(required = true)
        protected CtContratadoProfissionalDados profissionalSolicitante;

        /**
         * Gets the value of the contratadoSolicitante property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoSolicitante() {
            return contratadoSolicitante;
        }

        /**
         * Sets the value of the contratadoSolicitante property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoSolicitante(CtContratadoDados value) {
            this.contratadoSolicitante = value;
        }

        /**
         * Gets the value of the profissionalSolicitante property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public CtContratadoProfissionalDados getProfissionalSolicitante() {
            return profissionalSolicitante;
        }

        /**
         * Sets the value of the profissionalSolicitante property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public void setProfissionalSolicitante(CtContratadoProfissionalDados value) {
            this.profissionalSolicitante = value;
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
