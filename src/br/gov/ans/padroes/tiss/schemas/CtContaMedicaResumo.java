
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * utilizado no demonstrativo de análise de conta
 * 
 * <p>Java class for ct_contaMedicaResumo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_contaMedicaResumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLotePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="GlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *         &lt;element name="situacaoProtrocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="relacaoGuias" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="dataInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="dataFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="horaFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="motivoGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="situacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *                   &lt;element name="detalhesGuia" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
 *                             &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
 *                             &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
 *                   &lt;element name="valorInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorInformadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorProcessadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorLiberadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contaMedicaResumo", propOrder = {
    "numeroLotePrestador",
    "numeroProtocolo",
    "dataProtocolo",
    "glosaProtocolo",
    "situacaoProtrocolo",
    "relacaoGuias",
    "valorInformadoProtocolo",
    "valorProcessadoProtocolo",
    "valorLiberadoProtocolo",
    "valorGlosaProtocolo"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo.class
})
public class CtContaMedicaResumo {

    @XmlElement(required = true)
    protected String numeroLotePrestador;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataProtocolo;
    @XmlElement(name = "GlosaProtocolo")
    protected CtMotivoGlosa glosaProtocolo;
    @XmlElement(required = true)
    protected String situacaoProtrocolo;
    protected List<CtContaMedicaResumo.RelacaoGuias> relacaoGuias;
    @XmlElement(required = true)
    protected BigDecimal valorInformadoProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoProtocolo;
    protected BigDecimal valorGlosaProtocolo;

    /**
     * Gets the value of the numeroLotePrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLotePrestador() {
        return numeroLotePrestador;
    }

    /**
     * Sets the value of the numeroLotePrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLotePrestador(String value) {
        this.numeroLotePrestador = value;
    }

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the dataProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocolo() {
        return dataProtocolo;
    }

    /**
     * Sets the value of the dataProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocolo(XMLGregorianCalendar value) {
        this.dataProtocolo = value;
    }

    /**
     * Gets the value of the glosaProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getGlosaProtocolo() {
        return glosaProtocolo;
    }

    /**
     * Sets the value of the glosaProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setGlosaProtocolo(CtMotivoGlosa value) {
        this.glosaProtocolo = value;
    }

    /**
     * Gets the value of the situacaoProtrocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoProtrocolo() {
        return situacaoProtrocolo;
    }

    /**
     * Sets the value of the situacaoProtrocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoProtrocolo(String value) {
        this.situacaoProtrocolo = value;
    }

    /**
     * Gets the value of the relacaoGuias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacaoGuias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacaoGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtContaMedicaResumo.RelacaoGuias }
     * 
     * 
     */
    public List<CtContaMedicaResumo.RelacaoGuias> getRelacaoGuias() {
        if (relacaoGuias == null) {
            relacaoGuias = new ArrayList<CtContaMedicaResumo.RelacaoGuias>();
        }
        return this.relacaoGuias;
    }

    /**
     * Gets the value of the valorInformadoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInformadoProtocolo() {
        return valorInformadoProtocolo;
    }

    /**
     * Sets the value of the valorInformadoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInformadoProtocolo(BigDecimal value) {
        this.valorInformadoProtocolo = value;
    }

    /**
     * Gets the value of the valorProcessadoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoProtocolo() {
        return valorProcessadoProtocolo;
    }

    /**
     * Sets the value of the valorProcessadoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoProtocolo(BigDecimal value) {
        this.valorProcessadoProtocolo = value;
    }

    /**
     * Gets the value of the valorLiberadoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoProtocolo() {
        return valorLiberadoProtocolo;
    }

    /**
     * Sets the value of the valorLiberadoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoProtocolo(BigDecimal value) {
        this.valorLiberadoProtocolo = value;
    }

    /**
     * Gets the value of the valorGlosaProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaProtocolo() {
        return valorGlosaProtocolo;
    }

    /**
     * Sets the value of the valorGlosaProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaProtocolo(BigDecimal value) {
        this.valorGlosaProtocolo = value;
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
     *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="dataInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="dataFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="horaFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="motivoGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="situacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
     *         &lt;element name="detalhesGuia" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
     *                   &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
     *                   &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
     *         &lt;element name="valorInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
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
        "numeroGuiaPrestador",
        "numeroGuiaOperadora",
        "senha",
        "nomeBeneficiario",
        "numeroCarteira",
        "dataInicioFat",
        "horaInicioFat",
        "dataFimFat",
        "horaFimFat",
        "motivoGlosaGuia",
        "situacaoGuia",
        "detalhesGuia",
        "valorInformadoGuia",
        "valorProcessadoGuia",
        "valorLiberadoGuia",
        "valorGlosaGuia"
    })
    public static class RelacaoGuias {

        @XmlElement(required = true)
        protected String numeroGuiaPrestador;
        protected String numeroGuiaOperadora;
        protected String senha;
        @XmlElement(required = true)
        protected String nomeBeneficiario;
        @XmlElement(required = true)
        protected String numeroCarteira;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataInicioFat;
        protected XMLGregorianCalendar horaInicioFat;
        protected XMLGregorianCalendar dataFimFat;
        protected XMLGregorianCalendar horaFimFat;
        protected List<CtMotivoGlosa> motivoGlosaGuia;
        @XmlElement(required = true)
        protected String situacaoGuia;
        protected List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia> detalhesGuia;
        @XmlElement(required = true)
        protected BigDecimal valorInformadoGuia;
        @XmlElement(required = true)
        protected BigDecimal valorProcessadoGuia;
        @XmlElement(required = true)
        protected BigDecimal valorLiberadoGuia;
        protected BigDecimal valorGlosaGuia;

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
         * Gets the value of the dataInicioFat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataInicioFat() {
            return dataInicioFat;
        }

        /**
         * Sets the value of the dataInicioFat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataInicioFat(XMLGregorianCalendar value) {
            this.dataInicioFat = value;
        }

        /**
         * Gets the value of the horaInicioFat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraInicioFat() {
            return horaInicioFat;
        }

        /**
         * Sets the value of the horaInicioFat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraInicioFat(XMLGregorianCalendar value) {
            this.horaInicioFat = value;
        }

        /**
         * Gets the value of the dataFimFat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFimFat() {
            return dataFimFat;
        }

        /**
         * Sets the value of the dataFimFat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFimFat(XMLGregorianCalendar value) {
            this.dataFimFat = value;
        }

        /**
         * Gets the value of the horaFimFat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraFimFat() {
            return horaFimFat;
        }

        /**
         * Sets the value of the horaFimFat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraFimFat(XMLGregorianCalendar value) {
            this.horaFimFat = value;
        }

        /**
         * Gets the value of the motivoGlosaGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosaGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosaGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosaGuia() {
            if (motivoGlosaGuia == null) {
                motivoGlosaGuia = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosaGuia;
        }

        /**
         * Gets the value of the situacaoGuia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSituacaoGuia() {
            return situacaoGuia;
        }

        /**
         * Sets the value of the situacaoGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSituacaoGuia(String value) {
            this.situacaoGuia = value;
        }

        /**
         * Gets the value of the detalhesGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalhesGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalhesGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtContaMedicaResumo.RelacaoGuias.DetalhesGuia }
         * 
         * 
         */
        public List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia> getDetalhesGuia() {
            if (detalhesGuia == null) {
                detalhesGuia = new ArrayList<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia>();
            }
            return this.detalhesGuia;
        }

        /**
         * Gets the value of the valorInformadoGuia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorInformadoGuia() {
            return valorInformadoGuia;
        }

        /**
         * Sets the value of the valorInformadoGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorInformadoGuia(BigDecimal value) {
            this.valorInformadoGuia = value;
        }

        /**
         * Gets the value of the valorProcessadoGuia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProcessadoGuia() {
            return valorProcessadoGuia;
        }

        /**
         * Sets the value of the valorProcessadoGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProcessadoGuia(BigDecimal value) {
            this.valorProcessadoGuia = value;
        }

        /**
         * Gets the value of the valorLiberadoGuia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorLiberadoGuia() {
            return valorLiberadoGuia;
        }

        /**
         * Sets the value of the valorLiberadoGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorLiberadoGuia(BigDecimal value) {
            this.valorLiberadoGuia = value;
        }

        /**
         * Gets the value of the valorGlosaGuia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorGlosaGuia() {
            return valorGlosaGuia;
        }

        /**
         * Sets the value of the valorGlosaGuia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorGlosaGuia(BigDecimal value) {
            this.valorGlosaGuia = value;
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
         *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *         &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
         *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
         *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
            "dataRealizacao",
            "procedimento",
            "grauParticipacao",
            "valorInformado",
            "qtdExecutada",
            "valorProcessado",
            "valorLiberado",
            "relacaoGlosa"
        })
        public static class DetalhesGuia {

            @XmlElement(required = true)
            protected XMLGregorianCalendar dataRealizacao;
            @XmlElement(required = true)
            protected CtProcedimentoDados procedimento;
            protected String grauParticipacao;
            @XmlElement(required = true)
            protected BigDecimal valorInformado;
            @XmlElement(required = true)
            protected BigDecimal qtdExecutada;
            @XmlElement(required = true)
            protected BigDecimal valorProcessado;
            @XmlElement(required = true)
            protected BigDecimal valorLiberado;
            protected List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa> relacaoGlosa;

            /**
             * Gets the value of the dataRealizacao property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDataRealizacao() {
                return dataRealizacao;
            }

            /**
             * Sets the value of the dataRealizacao property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDataRealizacao(XMLGregorianCalendar value) {
                this.dataRealizacao = value;
            }

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
             * Gets the value of the grauParticipacao property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrauParticipacao() {
                return grauParticipacao;
            }

            /**
             * Sets the value of the grauParticipacao property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrauParticipacao(String value) {
                this.grauParticipacao = value;
            }

            /**
             * Gets the value of the valorInformado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorInformado() {
                return valorInformado;
            }

            /**
             * Sets the value of the valorInformado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorInformado(BigDecimal value) {
                this.valorInformado = value;
            }

            /**
             * Gets the value of the qtdExecutada property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdExecutada() {
                return qtdExecutada;
            }

            /**
             * Sets the value of the qtdExecutada property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdExecutada(BigDecimal value) {
                this.qtdExecutada = value;
            }

            /**
             * Gets the value of the valorProcessado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorProcessado() {
                return valorProcessado;
            }

            /**
             * Sets the value of the valorProcessado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorProcessado(BigDecimal value) {
                this.valorProcessado = value;
            }

            /**
             * Gets the value of the valorLiberado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorLiberado() {
                return valorLiberado;
            }

            /**
             * Sets the value of the valorLiberado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorLiberado(BigDecimal value) {
                this.valorLiberado = value;
            }

            /**
             * Gets the value of the relacaoGlosa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relacaoGlosa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRelacaoGlosa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa }
             * 
             * 
             */
            public List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa> getRelacaoGlosa() {
                if (relacaoGlosa == null) {
                    relacaoGlosa = new ArrayList<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa>();
                }
                return this.relacaoGlosa;
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
             *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
                "valorGlosa",
                "tipoGlosa"
            })
            public static class RelacaoGlosa {

                @XmlElement(required = true)
                protected BigDecimal valorGlosa;
                @XmlElement(required = true)
                protected String tipoGlosa;

                /**
                 * Gets the value of the valorGlosa property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorGlosa() {
                    return valorGlosa;
                }

                /**
                 * Sets the value of the valorGlosa property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorGlosa(BigDecimal value) {
                    this.valorGlosa = value;
                }

                /**
                 * Gets the value of the tipoGlosa property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoGlosa() {
                    return tipoGlosa;
                }

                /**
                 * Sets the value of the tipoGlosa property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoGlosa(String value) {
                    this.tipoGlosa = value;
                }

            }

        }

    }

}
