
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_internacaoDadosSaida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_internacaoDadosSaida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="indicadorAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *         &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaida"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_internacaoDadosSaida", propOrder = {
    "diagnostico",
    "indicadorAcidente",
    "motivoEncerramento"
})
public class CtmInternacaoDadosSaida {

    protected List<String> diagnostico;
    @XmlElement(required = true)
    protected String indicadorAcidente;
    @XmlElement(required = true)
    protected String motivoEncerramento;

    /**
     * Gets the value of the diagnostico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnostico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnostico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiagnostico() {
        if (diagnostico == null) {
            diagnostico = new ArrayList<String>();
        }
        return this.diagnostico;
    }

    /**
     * Gets the value of the indicadorAcidente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorAcidente() {
        return indicadorAcidente;
    }

    /**
     * Sets the value of the indicadorAcidente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorAcidente(String value) {
        this.indicadorAcidente = value;
    }

    /**
     * Gets the value of the motivoEncerramento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEncerramento() {
        return motivoEncerramento;
    }

    /**
     * Sets the value of the motivoEncerramento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEncerramento(String value) {
        this.motivoEncerramento = value;
    }

}
