
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_guiaCancelamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaCancelamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" minOccurs="0"/>
 *         &lt;element name="guiasCancelamento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
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
@XmlType(name = "ct_guiaCancelamento", propOrder = {
    "tipoGuia",
    "dadosPrestador",
    "numeroProtocolo",
    "guiasCancelamento"
})
public class CtGuiaCancelamento {

    @XmlElement(required = true)
    protected String tipoGuia;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected List<CtGuiaCancelamento.GuiasCancelamento> guiasCancelamento;

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
     * Gets the value of the guiasCancelamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasCancelamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasCancelamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtGuiaCancelamento.GuiasCancelamento }
     * 
     * 
     */
    public List<CtGuiaCancelamento.GuiasCancelamento> getGuiasCancelamento() {
        if (guiasCancelamento == null) {
            guiasCancelamento = new ArrayList<CtGuiaCancelamento.GuiasCancelamento>();
        }
        return this.guiasCancelamento;
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
        "numeroGuiaOperadora"
    })
    public static class GuiasCancelamento {

        @XmlElement(required = true)
        protected String numeroGuiaPrestador;
        protected String numeroGuiaOperadora;

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

    }

}
