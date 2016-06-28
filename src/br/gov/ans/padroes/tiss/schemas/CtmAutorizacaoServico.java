
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_autorizacaoServico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="prestadorAutorizado" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="cnesContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
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
 *         &lt;element name="servicosAutorizados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servicoAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000" minOccurs="0"/>
 *         &lt;element name="autorizacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio" minOccurs="0"/>
 *         &lt;element name="autorizacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoServico", propOrder = {
    "dadosAutorizacao",
    "dadosBeneficiario",
    "prestadorAutorizado",
    "statusSolicitacao",
    "motivosNegativa",
    "servicosAutorizados",
    "observacao",
    "autorizacaoQuimio",
    "autorizacaoRadio"
})
public class CtmAutorizacaoServico {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    protected CtmAutorizacaoServico.PrestadorAutorizado prestadorAutorizado;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    protected CtmAutorizacaoServico.MotivosNegativa motivosNegativa;
    protected CtmAutorizacaoServico.ServicosAutorizados servicosAutorizados;
    protected String observacao;
    protected CtmAutorizacaoQuimio autorizacaoQuimio;
    protected CtmAutorizacaoRadio autorizacaoRadio;

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
     * Gets the value of the prestadorAutorizado property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico.PrestadorAutorizado }
     *     
     */
    public CtmAutorizacaoServico.PrestadorAutorizado getPrestadorAutorizado() {
        return prestadorAutorizado;
    }

    /**
     * Sets the value of the prestadorAutorizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico.PrestadorAutorizado }
     *     
     */
    public void setPrestadorAutorizado(CtmAutorizacaoServico.PrestadorAutorizado value) {
        this.prestadorAutorizado = value;
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
     * Gets the value of the motivosNegativa property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico.MotivosNegativa }
     *     
     */
    public CtmAutorizacaoServico.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Sets the value of the motivosNegativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtmAutorizacaoServico.MotivosNegativa value) {
        this.motivosNegativa = value;
    }

    /**
     * Gets the value of the servicosAutorizados property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico.ServicosAutorizados }
     *     
     */
    public CtmAutorizacaoServico.ServicosAutorizados getServicosAutorizados() {
        return servicosAutorizados;
    }

    /**
     * Sets the value of the servicosAutorizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico.ServicosAutorizados }
     *     
     */
    public void setServicosAutorizados(CtmAutorizacaoServico.ServicosAutorizados value) {
        this.servicosAutorizados = value;
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
     * Gets the value of the autorizacaoQuimio property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio }
     *     
     */
    public CtmAutorizacaoQuimio getAutorizacaoQuimio() {
        return autorizacaoQuimio;
    }

    /**
     * Sets the value of the autorizacaoQuimio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio }
     *     
     */
    public void setAutorizacaoQuimio(CtmAutorizacaoQuimio value) {
        this.autorizacaoQuimio = value;
    }

    /**
     * Gets the value of the autorizacaoRadio property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoRadio }
     *     
     */
    public CtmAutorizacaoRadio getAutorizacaoRadio() {
        return autorizacaoRadio;
    }

    /**
     * Sets the value of the autorizacaoRadio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoRadio }
     *     
     */
    public void setAutorizacaoRadio(CtmAutorizacaoRadio value) {
        this.autorizacaoRadio = value;
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
     *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="cnesContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "dadosContratado",
        "cnesContratado"
    })
    public static class PrestadorAutorizado {

        @XmlElement(required = true)
        protected CtContratadoDados dadosContratado;
        @XmlElement(required = true)
        protected String cnesContratado;

        /**
         * Gets the value of the dadosContratado property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Sets the value of the dadosContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosContratado(CtContratadoDados value) {
            this.dadosContratado = value;
        }

        /**
         * Gets the value of the cnesContratado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesContratado() {
            return cnesContratado;
        }

        /**
         * Sets the value of the cnesContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesContratado(String value) {
            this.cnesContratado = value;
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
     *         &lt;element name="servicoAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado" maxOccurs="unbounded"/>
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
        "servicoAutorizado"
    })
    public static class ServicosAutorizados {

        @XmlElement(required = true)
        protected List<CtProcedimentoAutorizado> servicoAutorizado;

        /**
         * Gets the value of the servicoAutorizado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicoAutorizado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicoAutorizado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoAutorizado }
         * 
         * 
         */
        public List<CtProcedimentoAutorizado> getServicoAutorizado() {
            if (servicoAutorizado == null) {
                servicoAutorizado = new ArrayList<CtProcedimentoAutorizado>();
            }
            return this.servicoAutorizado;
        }

    }

}
