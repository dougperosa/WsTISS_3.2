
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_elegibilidadeRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_elegibilidadeRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="validadeCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="respostaSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
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
@XmlType(name = "ct_elegibilidadeRecibo", propOrder = {
    "registroANS",
    "numeroCarteira",
    "validadeCarteira",
    "nomeBeneficiario",
    "numeroCNS",
    "identificadorBeneficiario",
    "respostaSolicitacao",
    "motivosNegativa"
})
public class CtElegibilidadeRecibo {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroCarteira;
    protected XMLGregorianCalendar validadeCarteira;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    protected byte[] identificadorBeneficiario;
    @XmlElement(required = true)
    protected DmSimNao respostaSolicitacao;
    protected CtElegibilidadeRecibo.MotivosNegativa motivosNegativa;

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
     * Gets the value of the validadeCarteira property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeCarteira() {
        return validadeCarteira;
    }

    /**
     * Sets the value of the validadeCarteira property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeCarteira(XMLGregorianCalendar value) {
        this.validadeCarteira = value;
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
     * Gets the value of the identificadorBeneficiario property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    /**
     * Sets the value of the identificadorBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIdentificadorBeneficiario(byte[] value) {
        this.identificadorBeneficiario = ((byte[]) value);
    }

    /**
     * Gets the value of the respostaSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getRespostaSolicitacao() {
        return respostaSolicitacao;
    }

    /**
     * Sets the value of the respostaSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setRespostaSolicitacao(DmSimNao value) {
        this.respostaSolicitacao = value;
    }

    /**
     * Gets the value of the motivosNegativa property.
     * 
     * @return
     *     possible object is
     *     {@link CtElegibilidadeRecibo.MotivosNegativa }
     *     
     */
    public CtElegibilidadeRecibo.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Sets the value of the motivosNegativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtElegibilidadeRecibo.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtElegibilidadeRecibo.MotivosNegativa value) {
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

}
