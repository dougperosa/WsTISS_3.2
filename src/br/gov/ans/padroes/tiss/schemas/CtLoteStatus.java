
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * resposta a uma solicitação de situação de protocolo
 * 
 * <p>Java class for ct_loteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_loteStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="valorTotalLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *         &lt;element name="guiasTISS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="guiasMedicas" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="guiasOdonto" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
@XmlType(name = "ct_loteStatus", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "valorTotalLote",
    "guiasTISS"
})
public class CtLoteStatus {

    @XmlElement(required = true)
    protected String statusProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(required = true)
    protected CtValorTotal valorTotalLote;
    @XmlElement(required = true)
    protected CtLoteStatus.GuiasTISS guiasTISS;

    /**
     * Gets the value of the statusProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocolo() {
        return statusProtocolo;
    }

    /**
     * Sets the value of the statusProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProtocolo(String value) {
        this.statusProtocolo = value;
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
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Gets the value of the dataEnvioLote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the valorTotalLote property.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getValorTotalLote() {
        return valorTotalLote;
    }

    /**
     * Sets the value of the valorTotalLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setValorTotalLote(CtValorTotal value) {
        this.valorTotalLote = value;
    }

    /**
     * Gets the value of the guiasTISS property.
     * 
     * @return
     *     possible object is
     *     {@link CtLoteStatus.GuiasTISS }
     *     
     */
    public CtLoteStatus.GuiasTISS getGuiasTISS() {
        return guiasTISS;
    }

    /**
     * Sets the value of the guiasTISS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoteStatus.GuiasTISS }
     *     
     */
    public void setGuiasTISS(CtLoteStatus.GuiasTISS value) {
        this.guiasTISS = value;
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
     *         &lt;element name="guiasMedicas" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="guiasOdonto" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "guiasMedicas",
        "guiasOdonto"
    })
    public static class GuiasTISS {

        protected List<CtLoteStatus.GuiasTISS.GuiasMedicas> guiasMedicas;
        protected List<CtLoteStatus.GuiasTISS.GuiasOdonto> guiasOdonto;

        /**
         * Gets the value of the guiasMedicas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiasMedicas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiasMedicas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtLoteStatus.GuiasTISS.GuiasMedicas }
         * 
         * 
         */
        public List<CtLoteStatus.GuiasTISS.GuiasMedicas> getGuiasMedicas() {
            if (guiasMedicas == null) {
                guiasMedicas = new ArrayList<CtLoteStatus.GuiasTISS.GuiasMedicas>();
            }
            return this.guiasMedicas;
        }

        /**
         * Gets the value of the guiasOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiasOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiasOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtLoteStatus.GuiasTISS.GuiasOdonto }
         * 
         * 
         */
        public List<CtLoteStatus.GuiasTISS.GuiasOdonto> getGuiasOdonto() {
            if (guiasOdonto == null) {
                guiasOdonto = new ArrayList<CtLoteStatus.GuiasTISS.GuiasOdonto>();
            }
            return this.guiasOdonto;
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
         *         &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
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
            "guias"
        })
        public static class GuiasMedicas {

            @XmlElement(required = true)
            protected CtGuiaDados guias;

            /**
             * Gets the value of the guias property.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDados }
             *     
             */
            public CtGuiaDados getGuias() {
                return guias;
            }

            /**
             * Sets the value of the guias property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDados }
             *     
             */
            public void setGuias(CtGuiaDados value) {
                this.guias = value;
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
         *         &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
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
            "guias"
        })
        public static class GuiasOdonto {

            @XmlElement(required = true)
            protected CtGuiaDadosOdonto guias;

            /**
             * Gets the value of the guias property.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDadosOdonto }
             *     
             */
            public CtGuiaDadosOdonto getGuias() {
                return guias;
            }

            /**
             * Sets the value of the guias property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDadosOdonto }
             *     
             */
            public void setGuias(CtGuiaDadosOdonto value) {
                this.guias = value;
            }

        }

    }

}
