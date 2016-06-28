
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_guiaCancelamentoRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaCancelamentoRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="guiasCanceladas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosGuia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                             &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
 *                             &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaCancelamentoRecibo", propOrder = {
    "registroANS",
    "dadosPrestador",
    "guiasCanceladas"
})
public class CtGuiaCancelamentoRecibo {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected CtGuiaCancelamentoRecibo.GuiasCanceladas guiasCanceladas;

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
     * Gets the value of the dadosPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Sets the value of the dadosPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosPrestador(CtContratadoDados value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the guiasCanceladas property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamentoRecibo.GuiasCanceladas }
     *     
     */
    public CtGuiaCancelamentoRecibo.GuiasCanceladas getGuiasCanceladas() {
        return guiasCanceladas;
    }

    /**
     * Sets the value of the guiasCanceladas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamentoRecibo.GuiasCanceladas }
     *     
     */
    public void setGuiasCanceladas(CtGuiaCancelamentoRecibo.GuiasCanceladas value) {
        this.guiasCanceladas = value;
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
     *         &lt;element name="dadosGuia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                   &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
     *                   &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
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
        "dadosGuia"
    })
    public static class GuiasCanceladas {

        @XmlElement(required = true)
        protected List<CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia> dadosGuia;

        /**
         * Gets the value of the dadosGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia }
         * 
         * 
         */
        public List<CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia> getDadosGuia() {
            if (dadosGuia == null) {
                dadosGuia = new ArrayList<CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia>();
            }
            return this.dadosGuia;
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
         *         &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
         *         &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
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
            "tipoGuia",
            "statusCancelamento"
        })
        public static class DadosGuia {

            @XmlElement(required = true)
            protected String numeroGuiaPrestador;
            @XmlElement(required = true)
            protected String tipoGuia;
            @XmlElement(required = true)
            protected String statusCancelamento;

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
             * Gets the value of the tipoGuia property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoGuia() {
                return tipoGuia;
            }

            /**
             * Sets the value of the tipoGuia property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoGuia(String value) {
                this.tipoGuia = value;
            }

            /**
             * Gets the value of the statusCancelamento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCancelamento() {
                return statusCancelamento;
            }

            /**
             * Sets the value of the statusCancelamento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCancelamento(String value) {
                this.statusCancelamento = value;
            }

        }

    }

}
