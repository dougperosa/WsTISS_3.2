
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tissFault" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tissFault"/>
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
    "tissFault"
})
@XmlRootElement(name = "tissFaultWS")
public class TissFaultWS {

    @XmlElement(required = true)
    protected StTissFault tissFault;

    /**
     * Gets the value of the tissFault property.
     * 
     * @return
     *     possible object is
     *     {@link StTissFault }
     *     
     */
    public StTissFault getTissFault() {
        return tissFault;
    }

    /**
     * Sets the value of the tissFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTissFault }
     *     
     */
    public void setTissFault(StTissFault value) {
        this.tissFault = value;
    }

}
