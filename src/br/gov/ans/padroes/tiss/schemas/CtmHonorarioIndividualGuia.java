
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
 * <p>Java class for ctm_honorarioIndividualGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_honorarioIndividualGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="guiaSolicInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="beneficiario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoContratado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                             &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnes" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosContratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnesContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
 *                   &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="dataFimFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosRealizados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoRealizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoHonorIndiv" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotalHonorarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="dataEmissaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="assinaturaDigitalGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}assinaturaDigital" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_honorarioIndividualGuia", propOrder = {
    "cabecalhoGuia",
    "guiaSolicInternacao",
    "senha",
    "numeroGuiaOperadora",
    "beneficiario",
    "localContratado",
    "dadosContratadoExecutante",
    "dadosInternacao",
    "procedimentosRealizados",
    "observacao",
    "valorTotalHonorarios",
    "dataEmissaoGuia",
    "assinaturaDigitalGuia"
})
public class CtmHonorarioIndividualGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoGuia;
    @XmlElement(required = true)
    protected String guiaSolicInternacao;
    protected String senha;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtmHonorarioIndividualGuia.Beneficiario beneficiario;
    @XmlElement(required = true)
    protected CtmHonorarioIndividualGuia.LocalContratado localContratado;
    @XmlElement(required = true)
    protected CtmHonorarioIndividualGuia.DadosContratadoExecutante dadosContratadoExecutante;
    @XmlElement(required = true)
    protected CtmHonorarioIndividualGuia.DadosInternacao dadosInternacao;
    @XmlElement(required = true)
    protected CtmHonorarioIndividualGuia.ProcedimentosRealizados procedimentosRealizados;
    protected String observacao;
    @XmlElement(required = true)
    protected BigDecimal valorTotalHonorarios;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEmissaoGuia;
    protected AssinaturaDigital assinaturaDigitalGuia;

    /**
     * Gets the value of the cabecalhoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Sets the value of the cabecalhoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoGuia(CtGuiaCabecalho value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Gets the value of the guiaSolicInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaSolicInternacao() {
        return guiaSolicInternacao;
    }

    /**
     * Sets the value of the guiaSolicInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaSolicInternacao(String value) {
        this.guiaSolicInternacao = value;
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
     * Gets the value of the beneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtmHonorarioIndividualGuia.Beneficiario }
     *     
     */
    public CtmHonorarioIndividualGuia.Beneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Sets the value of the beneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmHonorarioIndividualGuia.Beneficiario }
     *     
     */
    public void setBeneficiario(CtmHonorarioIndividualGuia.Beneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Gets the value of the localContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtmHonorarioIndividualGuia.LocalContratado }
     *     
     */
    public CtmHonorarioIndividualGuia.LocalContratado getLocalContratado() {
        return localContratado;
    }

    /**
     * Sets the value of the localContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmHonorarioIndividualGuia.LocalContratado }
     *     
     */
    public void setLocalContratado(CtmHonorarioIndividualGuia.LocalContratado value) {
        this.localContratado = value;
    }

    /**
     * Gets the value of the dadosContratadoExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmHonorarioIndividualGuia.DadosContratadoExecutante }
     *     
     */
    public CtmHonorarioIndividualGuia.DadosContratadoExecutante getDadosContratadoExecutante() {
        return dadosContratadoExecutante;
    }

    /**
     * Sets the value of the dadosContratadoExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmHonorarioIndividualGuia.DadosContratadoExecutante }
     *     
     */
    public void setDadosContratadoExecutante(CtmHonorarioIndividualGuia.DadosContratadoExecutante value) {
        this.dadosContratadoExecutante = value;
    }

    /**
     * Gets the value of the dadosInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmHonorarioIndividualGuia.DadosInternacao }
     *     
     */
    public CtmHonorarioIndividualGuia.DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Sets the value of the dadosInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmHonorarioIndividualGuia.DadosInternacao }
     *     
     */
    public void setDadosInternacao(CtmHonorarioIndividualGuia.DadosInternacao value) {
        this.dadosInternacao = value;
    }

    /**
     * Gets the value of the procedimentosRealizados property.
     * 
     * @return
     *     possible object is
     *     {@link CtmHonorarioIndividualGuia.ProcedimentosRealizados }
     *     
     */
    public CtmHonorarioIndividualGuia.ProcedimentosRealizados getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    /**
     * Sets the value of the procedimentosRealizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmHonorarioIndividualGuia.ProcedimentosRealizados }
     *     
     */
    public void setProcedimentosRealizados(CtmHonorarioIndividualGuia.ProcedimentosRealizados value) {
        this.procedimentosRealizados = value;
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
     * Gets the value of the valorTotalHonorarios property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalHonorarios() {
        return valorTotalHonorarios;
    }

    /**
     * Sets the value of the valorTotalHonorarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalHonorarios(BigDecimal value) {
        this.valorTotalHonorarios = value;
    }

    /**
     * Gets the value of the dataEmissaoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    /**
     * Sets the value of the dataEmissaoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoGuia(XMLGregorianCalendar value) {
        this.dataEmissaoGuia = value;
    }

    /**
     * Gets the value of the assinaturaDigitalGuia property.
     * 
     * @return
     *     possible object is
     *     {@link AssinaturaDigital }
     *     
     */
    public AssinaturaDigital getAssinaturaDigitalGuia() {
        return assinaturaDigitalGuia;
    }

    /**
     * Sets the value of the assinaturaDigitalGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssinaturaDigital }
     *     
     */
    public void setAssinaturaDigitalGuia(AssinaturaDigital value) {
        this.assinaturaDigitalGuia = value;
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
     *         &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
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
        "atendimentoRN"
    })
    public static class Beneficiario {

        @XmlElement(required = true)
        protected String numeroCarteira;
        @XmlElement(required = true)
        protected String nomeBeneficiario;
        @XmlElement(required = true)
        protected DmSimNao atendimentoRN;

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
         * Gets the value of the atendimentoRN property.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getAtendimentoRN() {
            return atendimentoRN;
        }

        /**
         * Sets the value of the atendimentoRN property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setAtendimentoRN(DmSimNao value) {
            this.atendimentoRN = value;
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
     *         &lt;element name="nomeContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnesContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "nomeContratadoExecutante",
        "cnesContratadoExecutante"
    })
    public static class DadosContratadoExecutante {

        @XmlElement(required = true)
        protected String codigonaOperadora;
        @XmlElement(required = true)
        protected String nomeContratadoExecutante;
        @XmlElement(required = true)
        protected String cnesContratadoExecutante;

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
         * Gets the value of the nomeContratadoExecutante property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratadoExecutante() {
            return nomeContratadoExecutante;
        }

        /**
         * Sets the value of the nomeContratadoExecutante property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratadoExecutante(String value) {
            this.nomeContratadoExecutante = value;
        }

        /**
         * Gets the value of the cnesContratadoExecutante property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesContratadoExecutante() {
            return cnesContratadoExecutante;
        }

        /**
         * Sets the value of the cnesContratadoExecutante property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesContratadoExecutante(String value) {
            this.cnesContratadoExecutante = value;
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
     *         &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="dataFimFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
        "dataInicioFaturamento",
        "dataFimFaturamento"
    })
    public static class DadosInternacao {

        @XmlElement(required = true)
        protected XMLGregorianCalendar dataInicioFaturamento;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataFimFaturamento;

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
         * Gets the value of the dataFimFaturamento property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFimFaturamento() {
            return dataFimFaturamento;
        }

        /**
         * Sets the value of the dataFimFaturamento property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFimFaturamento(XMLGregorianCalendar value) {
            this.dataFimFaturamento = value;
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
     *         &lt;element name="codigoContratado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *                   &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnes" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "codigoContratado",
        "nomeContratado",
        "cnes"
    })
    public static class LocalContratado {

        @XmlElement(required = true)
        protected CtmHonorarioIndividualGuia.LocalContratado.CodigoContratado codigoContratado;
        @XmlElement(required = true)
        protected String nomeContratado;
        @XmlElement(required = true)
        protected String cnes;

        /**
         * Gets the value of the codigoContratado property.
         * 
         * @return
         *     possible object is
         *     {@link CtmHonorarioIndividualGuia.LocalContratado.CodigoContratado }
         *     
         */
        public CtmHonorarioIndividualGuia.LocalContratado.CodigoContratado getCodigoContratado() {
            return codigoContratado;
        }

        /**
         * Sets the value of the codigoContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmHonorarioIndividualGuia.LocalContratado.CodigoContratado }
         *     
         */
        public void setCodigoContratado(CtmHonorarioIndividualGuia.LocalContratado.CodigoContratado value) {
            this.codigoContratado = value;
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
        public String getCnes() {
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
        public void setCnes(String value) {
            this.cnes = value;
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
         *         &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
         *         &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
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
            "codigoNaOperadora",
            "cnpjLocalExecutante"
        })
        public static class CodigoContratado {

            protected String codigoNaOperadora;
            protected String cnpjLocalExecutante;

            /**
             * Gets the value of the codigoNaOperadora property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoNaOperadora() {
                return codigoNaOperadora;
            }

            /**
             * Sets the value of the codigoNaOperadora property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoNaOperadora(String value) {
                this.codigoNaOperadora = value;
            }

            /**
             * Gets the value of the cnpjLocalExecutante property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjLocalExecutante() {
                return cnpjLocalExecutante;
            }

            /**
             * Sets the value of the cnpjLocalExecutante property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjLocalExecutante(String value) {
                this.cnpjLocalExecutante = value;
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
     *         &lt;element name="procedimentoRealizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoHonorIndiv" maxOccurs="unbounded"/>
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
        "procedimentoRealizado"
    })
    public static class ProcedimentosRealizados {

        @XmlElement(required = true)
        protected List<CtProcedimentoExecutadoHonorIndiv> procedimentoRealizado;

        /**
         * Gets the value of the procedimentoRealizado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoRealizado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoRealizado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoExecutadoHonorIndiv }
         * 
         * 
         */
        public List<CtProcedimentoExecutadoHonorIndiv> getProcedimentoRealizado() {
            if (procedimentoRealizado == null) {
                procedimentoRealizado = new ArrayList<CtProcedimentoExecutadoHonorIndiv>();
            }
            return this.procedimentoRealizado;
        }

    }

}
