
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
 * <p>Java class for ct_guiaDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="vlInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal" minOccurs="0"/>
 *         &lt;element name="glosaGuia" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosRealizados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoRealizado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutado">
 *                           &lt;sequence>
 *                             &lt;element name="glosasProcedimento" minOccurs="0">
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
 *                         &lt;/extension>
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
@XmlType(name = "ct_guiaDados", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "dadosBeneficiario",
    "dataRealizacao",
    "vlInformadoGuia",
    "glosaGuia",
    "procedimentosRealizados"
})
public class CtGuiaDados {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    protected XMLGregorianCalendar dataRealizacao;
    protected CtValorTotal vlInformadoGuia;
    protected CtGuiaDados.GlosaGuia glosaGuia;
    protected CtGuiaDados.ProcedimentosRealizados procedimentosRealizados;

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
     * Gets the value of the glosaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDados.GlosaGuia }
     *     
     */
    public CtGuiaDados.GlosaGuia getGlosaGuia() {
        return glosaGuia;
    }

    /**
     * Sets the value of the glosaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDados.GlosaGuia }
     *     
     */
    public void setGlosaGuia(CtGuiaDados.GlosaGuia value) {
        this.glosaGuia = value;
    }

    /**
     * Gets the value of the procedimentosRealizados property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDados.ProcedimentosRealizados }
     *     
     */
    public CtGuiaDados.ProcedimentosRealizados getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    /**
     * Sets the value of the procedimentosRealizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDados.ProcedimentosRealizados }
     *     
     */
    public void setProcedimentosRealizados(CtGuiaDados.ProcedimentosRealizados value) {
        this.procedimentosRealizados = value;
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
        "motivoGlosa"
    })
    public static class GlosaGuia {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;

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
     *         &lt;element name="procedimentoRealizado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutado">
     *                 &lt;sequence>
     *                   &lt;element name="glosasProcedimento" minOccurs="0">
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
     *               &lt;/extension>
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
        "procedimentoRealizado"
    })
    public static class ProcedimentosRealizados {

        @XmlElement(required = true)
        protected List<CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado> procedimentoRealizado;

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
         * {@link CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado }
         * 
         * 
         */
        public List<CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado> getProcedimentoRealizado() {
            if (procedimentoRealizado == null) {
                procedimentoRealizado = new ArrayList<CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado>();
            }
            return this.procedimentoRealizado;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutado">
         *       &lt;sequence>
         *         &lt;element name="glosasProcedimento" minOccurs="0">
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
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "glosasProcedimento"
        })
        public static class ProcedimentoRealizado
            extends CtProcedimentoExecutado
        {

            protected CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento glosasProcedimento;

            /**
             * Gets the value of the glosasProcedimento property.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento }
             *     
             */
            public CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento getGlosasProcedimento() {
                return glosasProcedimento;
            }

            /**
             * Sets the value of the glosasProcedimento property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento }
             *     
             */
            public void setGlosasProcedimento(CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento value) {
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
