
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
 * <p>Java class for ctm_anexoSolicitacaoRadio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitacaoRadio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosComplementaresBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosComplementaresBeneficiarioRadio"/>
 *         &lt;element name="medicoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitante"/>
 *         &lt;element name="diagnosticoOncologicoRadio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diagRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
 *                   &lt;element name="diagnosticoImagem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_diagnosticoImagem" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tratamentosAnteriores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="datacirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="quimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="dataQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosComplementares">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoComplementar" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosComplementares" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroCampos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="doseCampo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="doseTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="nrDias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="dtPrevistaInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
@XmlType(name = "ctm_anexoSolicitacaoRadio", propOrder = {
    "cabecalhoAnexo",
    "dadosBeneficiario",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoRadio",
    "tratamentosAnteriores",
    "procedimentosComplementares",
    "numeroCampos",
    "doseCampo",
    "doseTotal",
    "nrDias",
    "dtPrevistaInicio",
    "observacao"
})
public class CtmAnexoSolicitacaoRadio {

    @XmlElement(required = true)
    protected CtAnexoCabecalho cabecalhoAnexo;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiarioRadio dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio diagnosticoOncologicoRadio;
    protected CtmAnexoSolicitacaoRadio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoRadio.ProcedimentosComplementares procedimentosComplementares;
    @XmlElement(required = true)
    protected BigInteger numeroCampos;
    @XmlElement(required = true)
    protected BigInteger doseCampo;
    @XmlElement(required = true)
    protected BigInteger doseTotal;
    @XmlElement(required = true)
    protected BigInteger nrDias;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtPrevistaInicio;
    protected String observacao;

    /**
     * Gets the value of the cabecalhoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public CtAnexoCabecalho getCabecalhoAnexo() {
        return cabecalhoAnexo;
    }

    /**
     * Sets the value of the cabecalhoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public void setCabecalhoAnexo(CtAnexoCabecalho value) {
        this.cabecalhoAnexo = value;
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
     * Gets the value of the dadosComplementaresBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosComplementaresBeneficiarioRadio }
     *     
     */
    public CtDadosComplementaresBeneficiarioRadio getDadosComplementaresBeneficiario() {
        return dadosComplementaresBeneficiario;
    }

    /**
     * Sets the value of the dadosComplementaresBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosComplementaresBeneficiarioRadio }
     *     
     */
    public void setDadosComplementaresBeneficiario(CtDadosComplementaresBeneficiarioRadio value) {
        this.dadosComplementaresBeneficiario = value;
    }

    /**
     * Gets the value of the medicoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public CtmAnexoSolicitante getMedicoSolicitante() {
        return medicoSolicitante;
    }

    /**
     * Sets the value of the medicoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public void setMedicoSolicitante(CtmAnexoSolicitante value) {
        this.medicoSolicitante = value;
    }

    /**
     * Gets the value of the diagnosticoOncologicoRadio property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio getDiagnosticoOncologicoRadio() {
        return diagnosticoOncologicoRadio;
    }

    /**
     * Sets the value of the diagnosticoOncologicoRadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public void setDiagnosticoOncologicoRadio(CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio value) {
        this.diagnosticoOncologicoRadio = value;
    }

    /**
     * Gets the value of the tratamentosAnteriores property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoRadio.TratamentosAnteriores }
     *     
     */
    public CtmAnexoSolicitacaoRadio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Sets the value of the tratamentosAnteriores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoRadio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAnexoSolicitacaoRadio.TratamentosAnteriores value) {
        this.tratamentosAnteriores = value;
    }

    /**
     * Gets the value of the procedimentosComplementares property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoRadio.ProcedimentosComplementares }
     *     
     */
    public CtmAnexoSolicitacaoRadio.ProcedimentosComplementares getProcedimentosComplementares() {
        return procedimentosComplementares;
    }

    /**
     * Sets the value of the procedimentosComplementares property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoRadio.ProcedimentosComplementares }
     *     
     */
    public void setProcedimentosComplementares(CtmAnexoSolicitacaoRadio.ProcedimentosComplementares value) {
        this.procedimentosComplementares = value;
    }

    /**
     * Gets the value of the numeroCampos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCampos() {
        return numeroCampos;
    }

    /**
     * Sets the value of the numeroCampos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroCampos(BigInteger value) {
        this.numeroCampos = value;
    }

    /**
     * Gets the value of the doseCampo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoseCampo() {
        return doseCampo;
    }

    /**
     * Sets the value of the doseCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoseCampo(BigInteger value) {
        this.doseCampo = value;
    }

    /**
     * Gets the value of the doseTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoseTotal() {
        return doseTotal;
    }

    /**
     * Sets the value of the doseTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoseTotal(BigInteger value) {
        this.doseTotal = value;
    }

    /**
     * Gets the value of the nrDias property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrDias() {
        return nrDias;
    }

    /**
     * Sets the value of the nrDias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrDias(BigInteger value) {
        this.nrDias = value;
    }

    /**
     * Gets the value of the dtPrevistaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrevistaInicio() {
        return dtPrevistaInicio;
    }

    /**
     * Sets the value of the dtPrevistaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPrevistaInicio(XMLGregorianCalendar value) {
        this.dtPrevistaInicio = value;
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
     *         &lt;element name="diagRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
     *         &lt;element name="diagnosticoImagem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_diagnosticoImagem" minOccurs="0"/>
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
        "diagRadio",
        "diagnosticoImagem"
    })
    public static class DiagnosticoOncologicoRadio {

        @XmlElement(required = true)
        protected CtDiagnosticoOncologico diagRadio;
        protected String diagnosticoImagem;

        /**
         * Gets the value of the diagRadio property.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public CtDiagnosticoOncologico getDiagRadio() {
            return diagRadio;
        }

        /**
         * Sets the value of the diagRadio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public void setDiagRadio(CtDiagnosticoOncologico value) {
            this.diagRadio = value;
        }

        /**
         * Gets the value of the diagnosticoImagem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosticoImagem() {
            return diagnosticoImagem;
        }

        /**
         * Sets the value of the diagnosticoImagem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosticoImagem(String value) {
            this.diagnosticoImagem = value;
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
     *         &lt;element name="procedimentoComplementar" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosComplementares" maxOccurs="unbounded"/>
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
        "procedimentoComplementar"
    })
    public static class ProcedimentosComplementares {

        @XmlElement(required = true)
        protected List<CtProcedimentosComplementares> procedimentoComplementar;

        /**
         * Gets the value of the procedimentoComplementar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoComplementar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoComplementar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentosComplementares }
         * 
         * 
         */
        public List<CtProcedimentosComplementares> getProcedimentoComplementar() {
            if (procedimentoComplementar == null) {
                procedimentoComplementar = new ArrayList<CtProcedimentosComplementares>();
            }
            return this.procedimentoComplementar;
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
     *         &lt;element name="cirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="datacirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="quimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="dataQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
        "cirurgia",
        "datacirurgia",
        "quimioterapia",
        "dataQuimioterapia"
    })
    public static class TratamentosAnteriores {

        protected String cirurgia;
        protected XMLGregorianCalendar datacirurgia;
        protected String quimioterapia;
        protected XMLGregorianCalendar dataQuimioterapia;

        /**
         * Gets the value of the cirurgia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCirurgia() {
            return cirurgia;
        }

        /**
         * Sets the value of the cirurgia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCirurgia(String value) {
            this.cirurgia = value;
        }

        /**
         * Gets the value of the datacirurgia property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatacirurgia() {
            return datacirurgia;
        }

        /**
         * Sets the value of the datacirurgia property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatacirurgia(XMLGregorianCalendar value) {
            this.datacirurgia = value;
        }

        /**
         * Gets the value of the quimioterapia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuimioterapia() {
            return quimioterapia;
        }

        /**
         * Sets the value of the quimioterapia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuimioterapia(String value) {
            this.quimioterapia = value;
        }

        /**
         * Gets the value of the dataQuimioterapia property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataQuimioterapia() {
            return dataQuimioterapia;
        }

        /**
         * Sets the value of the dataQuimioterapia property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataQuimioterapia(XMLGregorianCalendar value) {
            this.dataQuimioterapia = value;
        }

    }

}
