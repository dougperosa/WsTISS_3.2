
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
 * <p>Java class for ctm_anexoSolicitacaoQuimio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitacaoQuimio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosComplementaresBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosComplementaresBeneficiario"/>
 *         &lt;element name="medicoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitante"/>
 *         &lt;element name="diagnosticoOncologicoQuimioterapia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diagQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
 *                   &lt;element name="tipoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoQuimioterapia"/>
 *                   &lt;element name="planoTerapeutico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drogasSolicitadas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="drogaSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_drogasSolicitadas" maxOccurs="unbounded"/>
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
 *                   &lt;element name="areaIrradiada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="dataIrradiacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroCiclos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *         &lt;element name="cicloAtual" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *         &lt;element name="intervaloCiclos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
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
@XmlType(name = "ctm_anexoSolicitacaoQuimio", propOrder = {
    "cabecalhoAnexo",
    "dadosBeneficiario",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoQuimioterapia",
    "drogasSolicitadas",
    "tratamentosAnteriores",
    "numeroCiclos",
    "cicloAtual",
    "intervaloCiclos",
    "observacao"
})
public class CtmAnexoSolicitacaoQuimio {

    @XmlElement(required = true)
    protected CtAnexoCabecalho cabecalhoAnexo;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiario dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia diagnosticoOncologicoQuimioterapia;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoQuimio.DrogasSolicitadas drogasSolicitadas;
    protected CtmAnexoSolicitacaoQuimio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected BigInteger numeroCiclos;
    @XmlElement(required = true)
    protected BigInteger cicloAtual;
    @XmlElement(required = true)
    protected BigInteger intervaloCiclos;
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
     *     {@link CtDadosComplementaresBeneficiario }
     *     
     */
    public CtDadosComplementaresBeneficiario getDadosComplementaresBeneficiario() {
        return dadosComplementaresBeneficiario;
    }

    /**
     * Sets the value of the dadosComplementaresBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosComplementaresBeneficiario }
     *     
     */
    public void setDadosComplementaresBeneficiario(CtDadosComplementaresBeneficiario value) {
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
     * Gets the value of the diagnosticoOncologicoQuimioterapia property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia getDiagnosticoOncologicoQuimioterapia() {
        return diagnosticoOncologicoQuimioterapia;
    }

    /**
     * Sets the value of the diagnosticoOncologicoQuimioterapia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public void setDiagnosticoOncologicoQuimioterapia(CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia value) {
        this.diagnosticoOncologicoQuimioterapia = value;
    }

    /**
     * Gets the value of the drogasSolicitadas property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoQuimio.DrogasSolicitadas }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.DrogasSolicitadas getDrogasSolicitadas() {
        return drogasSolicitadas;
    }

    /**
     * Sets the value of the drogasSolicitadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.DrogasSolicitadas }
     *     
     */
    public void setDrogasSolicitadas(CtmAnexoSolicitacaoQuimio.DrogasSolicitadas value) {
        this.drogasSolicitadas = value;
    }

    /**
     * Gets the value of the tratamentosAnteriores property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoQuimio.TratamentosAnteriores }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Sets the value of the tratamentosAnteriores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAnexoSolicitacaoQuimio.TratamentosAnteriores value) {
        this.tratamentosAnteriores = value;
    }

    /**
     * Gets the value of the numeroCiclos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCiclos() {
        return numeroCiclos;
    }

    /**
     * Sets the value of the numeroCiclos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroCiclos(BigInteger value) {
        this.numeroCiclos = value;
    }

    /**
     * Gets the value of the cicloAtual property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCicloAtual() {
        return cicloAtual;
    }

    /**
     * Sets the value of the cicloAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCicloAtual(BigInteger value) {
        this.cicloAtual = value;
    }

    /**
     * Gets the value of the intervaloCiclos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntervaloCiclos() {
        return intervaloCiclos;
    }

    /**
     * Sets the value of the intervaloCiclos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntervaloCiclos(BigInteger value) {
        this.intervaloCiclos = value;
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
     *         &lt;element name="diagQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
     *         &lt;element name="tipoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoQuimioterapia"/>
     *         &lt;element name="planoTerapeutico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000"/>
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
        "diagQuimio",
        "tipoQuimioterapia",
        "planoTerapeutico"
    })
    public static class DiagnosticoOncologicoQuimioterapia {

        @XmlElement(required = true)
        protected CtDiagnosticoOncologico diagQuimio;
        @XmlElement(required = true)
        protected String tipoQuimioterapia;
        @XmlElement(required = true)
        protected String planoTerapeutico;

        /**
         * Gets the value of the diagQuimio property.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public CtDiagnosticoOncologico getDiagQuimio() {
            return diagQuimio;
        }

        /**
         * Sets the value of the diagQuimio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public void setDiagQuimio(CtDiagnosticoOncologico value) {
            this.diagQuimio = value;
        }

        /**
         * Gets the value of the tipoQuimioterapia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoQuimioterapia() {
            return tipoQuimioterapia;
        }

        /**
         * Sets the value of the tipoQuimioterapia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoQuimioterapia(String value) {
            this.tipoQuimioterapia = value;
        }

        /**
         * Gets the value of the planoTerapeutico property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanoTerapeutico() {
            return planoTerapeutico;
        }

        /**
         * Sets the value of the planoTerapeutico property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanoTerapeutico(String value) {
            this.planoTerapeutico = value;
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
     *         &lt;element name="drogaSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_drogasSolicitadas" maxOccurs="unbounded"/>
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
        "drogaSolicitada"
    })
    public static class DrogasSolicitadas {

        @XmlElement(required = true)
        protected List<CtDrogasSolicitadas> drogaSolicitada;

        /**
         * Gets the value of the drogaSolicitada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drogaSolicitada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrogaSolicitada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDrogasSolicitadas }
         * 
         * 
         */
        public List<CtDrogasSolicitadas> getDrogaSolicitada() {
            if (drogaSolicitada == null) {
                drogaSolicitada = new ArrayList<CtDrogasSolicitadas>();
            }
            return this.drogaSolicitada;
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
     *         &lt;element name="areaIrradiada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="dataIrradiacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
        "areaIrradiada",
        "dataIrradiacao"
    })
    public static class TratamentosAnteriores {

        protected String cirurgia;
        protected XMLGregorianCalendar datacirurgia;
        protected String areaIrradiada;
        protected XMLGregorianCalendar dataIrradiacao;

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
         * Gets the value of the areaIrradiada property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaIrradiada() {
            return areaIrradiada;
        }

        /**
         * Sets the value of the areaIrradiada property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaIrradiada(String value) {
            this.areaIrradiada = value;
        }

        /**
         * Gets the value of the dataIrradiacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataIrradiacao() {
            return dataIrradiacao;
        }

        /**
         * Sets the value of the dataIrradiacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataIrradiacao(XMLGregorianCalendar value) {
            this.dataIrradiacao = value;
        }

    }

}
