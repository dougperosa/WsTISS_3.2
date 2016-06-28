
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_intervaloCiclos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_intervaloCiclos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tempo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *         &lt;element name="unidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_unidadeTempoCiclo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_intervaloCiclos", propOrder = {
    "tempo",
    "unidade"
})
public class CtIntervaloCiclos {

    @XmlElement(required = true)
    protected BigInteger tempo;
    @XmlElement(required = true)
    protected String unidade;

    /**
     * Gets the value of the tempo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTempo() {
        return tempo;
    }

    /**
     * Sets the value of the tempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTempo(BigInteger value) {
        this.tempo = value;
    }

    /**
     * Gets the value of the unidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Sets the value of the unidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidade(String value) {
        this.unidade = value;
    }

}
