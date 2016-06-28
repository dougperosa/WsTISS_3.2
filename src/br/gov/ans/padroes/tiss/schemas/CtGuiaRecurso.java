
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * estrutura utilizada no retorno do recurso de glosa
 * 
 * <p>Java class for ct_guiaRecurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaRecurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numDemoAnalisePagto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" minOccurs="0"/>
 *         &lt;element name="numeroGuiaRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="motivosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaRecurso", propOrder = {
    "numeroProtocolo",
    "numDemoAnalisePagto",
    "numeroGuiaRecurso",
    "numeroGuiaOrigem",
    "motivosGlosa"
})
public class CtGuiaRecurso {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    protected String numDemoAnalisePagto;
    @XmlElement(required = true)
    protected String numeroGuiaRecurso;
    @XmlElement(required = true)
    protected String numeroGuiaOrigem;
    protected List<CtMotivoGlosa> motivosGlosa;

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
     * Gets the value of the numDemoAnalisePagto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDemoAnalisePagto() {
        return numDemoAnalisePagto;
    }

    /**
     * Sets the value of the numDemoAnalisePagto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDemoAnalisePagto(String value) {
        this.numDemoAnalisePagto = value;
    }

    /**
     * Gets the value of the numeroGuiaRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecurso() {
        return numeroGuiaRecurso;
    }

    /**
     * Sets the value of the numeroGuiaRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecurso(String value) {
        this.numeroGuiaRecurso = value;
    }

    /**
     * Gets the value of the numeroGuiaOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOrigem() {
        return numeroGuiaOrigem;
    }

    /**
     * Sets the value of the numeroGuiaOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOrigem(String value) {
        this.numeroGuiaOrigem = value;
    }

    /**
     * Gets the value of the motivosGlosa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motivosGlosa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotivosGlosa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtMotivoGlosa }
     * 
     * 
     */
    public List<CtMotivoGlosa> getMotivosGlosa() {
        if (motivosGlosa == null) {
            motivosGlosa = new ArrayList<CtMotivoGlosa>();
        }
        return this.motivosGlosa;
    }

}
