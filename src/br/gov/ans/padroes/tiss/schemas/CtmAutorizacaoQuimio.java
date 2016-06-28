
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
 * <p>Java class for ctm_autorizacaoQuimio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoQuimio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
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
 *         &lt;element name="motivosNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
@XmlType(name = "ctm_autorizacaoQuimio", propOrder = {
    "dadosAutorizacao",
    "numeroCarteira",
    "statusSolicitacao",
    "nomeBeneficiario",
    "numeroCNS",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoQuimioterapia",
    "drogasSolicitadas",
    "tratamentosAnteriores",
    "numeroCiclos",
    "cicloAtual",
    "intervaloCiclos",
    "motivosNegativa"
})
public class CtmAutorizacaoQuimio {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiario dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia diagnosticoOncologicoQuimioterapia;
    @XmlElement(required = true)
    protected CtmAutorizacaoQuimio.DrogasSolicitadas drogasSolicitadas;
    protected CtmAutorizacaoQuimio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected BigInteger numeroCiclos;
    @XmlElement(required = true)
    protected BigInteger cicloAtual;
    @XmlElement(required = true)
    protected BigInteger intervaloCiclos;
    protected CtmAutorizacaoQuimio.MotivosNegativa motivosNegativa;

    /**
     * Gets the value of the dadosAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public CtAutorizacaoDados getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Sets the value of the dadosAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoDados value) {
        this.dadosAutorizacao = value;
    }

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
     * Gets the value of the statusSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    /**
     * Sets the value of the statusSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacao(String value) {
        this.statusSolicitacao = value;
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
     * Gets the value of the numeroCNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Sets the value of the numeroCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
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
     *     {@link CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia getDiagnosticoOncologicoQuimioterapia() {
        return diagnosticoOncologicoQuimioterapia;
    }

    /**
     * Sets the value of the diagnosticoOncologicoQuimioterapia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public void setDiagnosticoOncologicoQuimioterapia(CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia value) {
        this.diagnosticoOncologicoQuimioterapia = value;
    }

    /**
     * Gets the value of the drogasSolicitadas property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.DrogasSolicitadas }
     *     
     */
    public CtmAutorizacaoQuimio.DrogasSolicitadas getDrogasSolicitadas() {
        return drogasSolicitadas;
    }

    /**
     * Sets the value of the drogasSolicitadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.DrogasSolicitadas }
     *     
     */
    public void setDrogasSolicitadas(CtmAutorizacaoQuimio.DrogasSolicitadas value) {
        this.drogasSolicitadas = value;
    }

    /**
     * Gets the value of the tratamentosAnteriores property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.TratamentosAnteriores }
     *     
     */
    public CtmAutorizacaoQuimio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Sets the value of the tratamentosAnteriores property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAutorizacaoQuimio.TratamentosAnteriores value) {
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
     * Gets the value of the motivosNegativa property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.MotivosNegativa }
     *     
     */
    public CtmAutorizacaoQuimio.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Sets the value of the motivosNegativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtmAutorizacaoQuimio.MotivosNegativa value) {
        this.motivosNegativa = value;
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
     *         &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
        "motivoNegativa"
    })
    public static class MotivosNegativa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoNegativa;

        /**
         * Gets the value of the motivoNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoNegativa() {
            if (motivoNegativa == null) {
                motivoNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoNegativa;
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
