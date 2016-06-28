
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_hipoteseDiagnostica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_hipoteseDiagnostica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico"/>
 *         &lt;element name="indicacaoAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_hipoteseDiagnostica", propOrder = {
    "diagnostico",
    "indicacaoAcidente"
})
public class CtHipoteseDiagnostica {

    @XmlElement(required = true)
    protected CtDiagnostico diagnostico;
    @XmlElement(required = true)
    protected String indicacaoAcidente;

    /**
     * Gets the value of the diagnostico property.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnostico }
     *     
     */
    public CtDiagnostico getDiagnostico() {
        return diagnostico;
    }

    /**
     * Sets the value of the diagnostico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnostico }
     *     
     */
    public void setDiagnostico(CtDiagnostico value) {
        this.diagnostico = value;
    }

    /**
     * Gets the value of the indicacaoAcidente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoAcidente() {
        return indicacaoAcidente;
    }

    /**
     * Sets the value of the indicacaoAcidente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoAcidente(String value) {
        this.indicacaoAcidente = value;
    }

}
