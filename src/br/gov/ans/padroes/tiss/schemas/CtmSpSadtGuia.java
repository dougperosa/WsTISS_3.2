
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctm_sp-sadtGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho">
 *                 &lt;sequence>
 *                   &lt;element name="guiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoSADT" minOccurs="0"/>
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
 *         &lt;element name="dadosSolicitacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *                   &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtAtendimento"/>
 *         &lt;element name="procedimentosExecutados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoSadt" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesas" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaValorTotal"/>
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
@XmlType(name = "ctm_sp-sadtGuia", propOrder = {
    "cabecalhoGuia",
    "dadosAutorizacao",
    "dadosBeneficiario",
    "dadosSolicitante",
    "dadosSolicitacao",
    "dadosExecutante",
    "dadosAtendimento",
    "procedimentosExecutados",
    "outrasDespesas",
    "observacao",
    "valorTotal",
    "assinaturaDigitalGuia"
})
public class CtmSpSadtGuia {

    @XmlElement(required = true)
    protected CtmSpSadtGuia.CabecalhoGuia cabecalhoGuia;
    protected CtAutorizacaoSADT dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosSolicitacao dadosSolicitacao;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosExecutante dadosExecutante;
    @XmlElement(required = true)
    protected CtmSpSadtAtendimento dadosAtendimento;
    protected CtmSpSadtGuia.ProcedimentosExecutados procedimentosExecutados;
    protected CtOutrasDespesas outrasDespesas;
    protected String observacao;
    @XmlElement(required = true)
    protected CtGuiaValorTotal valorTotal;
    protected AssinaturaDigital assinaturaDigitalGuia;

    /**
     * Gets the value of the cabecalhoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.CabecalhoGuia }
     *     
     */
    public CtmSpSadtGuia.CabecalhoGuia getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Sets the value of the cabecalhoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.CabecalhoGuia }
     *     
     */
    public void setCabecalhoGuia(CtmSpSadtGuia.CabecalhoGuia value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Gets the value of the dadosAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoSADT }
     *     
     */
    public CtAutorizacaoSADT getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Sets the value of the dadosAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoSADT }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoSADT value) {
        this.dadosAutorizacao = value;
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
     *     {@link CtmSpSadtGuia.DadosSolicitante }
     *     
     */
    public CtmSpSadtGuia.DadosSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Sets the value of the dadosSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosSolicitante }
     *     
     */
    public void setDadosSolicitante(CtmSpSadtGuia.DadosSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Gets the value of the dadosSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.DadosSolicitacao }
     *     
     */
    public CtmSpSadtGuia.DadosSolicitacao getDadosSolicitacao() {
        return dadosSolicitacao;
    }

    /**
     * Sets the value of the dadosSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosSolicitacao }
     *     
     */
    public void setDadosSolicitacao(CtmSpSadtGuia.DadosSolicitacao value) {
        this.dadosSolicitacao = value;
    }

    /**
     * Gets the value of the dadosExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.DadosExecutante }
     *     
     */
    public CtmSpSadtGuia.DadosExecutante getDadosExecutante() {
        return dadosExecutante;
    }

    /**
     * Sets the value of the dadosExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosExecutante }
     *     
     */
    public void setDadosExecutante(CtmSpSadtGuia.DadosExecutante value) {
        this.dadosExecutante = value;
    }

    /**
     * Gets the value of the dadosAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtAtendimento }
     *     
     */
    public CtmSpSadtAtendimento getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Sets the value of the dadosAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtAtendimento }
     *     
     */
    public void setDadosAtendimento(CtmSpSadtAtendimento value) {
        this.dadosAtendimento = value;
    }

    /**
     * Gets the value of the procedimentosExecutados property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.ProcedimentosExecutados }
     *     
     */
    public CtmSpSadtGuia.ProcedimentosExecutados getProcedimentosExecutados() {
        return procedimentosExecutados;
    }

    /**
     * Sets the value of the procedimentosExecutados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.ProcedimentosExecutados }
     *     
     */
    public void setProcedimentosExecutados(CtmSpSadtGuia.ProcedimentosExecutados value) {
        this.procedimentosExecutados = value;
    }

    /**
     * Gets the value of the outrasDespesas property.
     * 
     * @return
     *     possible object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public CtOutrasDespesas getOutrasDespesas() {
        return outrasDespesas;
    }

    /**
     * Sets the value of the outrasDespesas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public void setOutrasDespesas(CtOutrasDespesas value) {
        this.outrasDespesas = value;
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
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public CtGuiaValorTotal getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public void setValorTotal(CtGuiaValorTotal value) {
        this.valorTotal = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho">
     *       &lt;sequence>
     *         &lt;element name="guiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guiaPrincipal"
    })
    public static class CabecalhoGuia
        extends CtGuiaCabecalho
    {

        protected String guiaPrincipal;

        /**
         * Gets the value of the guiaPrincipal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuiaPrincipal() {
            return guiaPrincipal;
        }

        /**
         * Sets the value of the guiaPrincipal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuiaPrincipal(String value) {
            this.guiaPrincipal = value;
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
     *         &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
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
        "contratadoExecutante",
        "cnes"
    })
    public static class DadosExecutante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoExecutante;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Gets the value of the contratadoExecutante property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoExecutante() {
            return contratadoExecutante;
        }

        /**
         * Sets the value of the contratadoExecutante property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoExecutante(CtContratadoDados value) {
            this.contratadoExecutante = value;
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
     *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
     *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
        "dataSolicitacao",
        "caraterAtendimento",
        "indicacaoClinica"
    })
    public static class DadosSolicitacao {

        protected XMLGregorianCalendar dataSolicitacao;
        @XmlElement(required = true)
        protected String caraterAtendimento;
        protected String indicacaoClinica;

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
     *         &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoSadt" maxOccurs="unbounded"/>
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
        "procedimentoExecutado"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected List<CtProcedimentoExecutadoSadt> procedimentoExecutado;

        /**
         * Gets the value of the procedimentoExecutado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoExecutado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoExecutado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoExecutadoSadt }
         * 
         * 
         */
        public List<CtProcedimentoExecutadoSadt> getProcedimentoExecutado() {
            if (procedimentoExecutado == null) {
                procedimentoExecutado = new ArrayList<CtProcedimentoExecutadoSadt>();
            }
            return this.procedimentoExecutado;
        }

    }

}
