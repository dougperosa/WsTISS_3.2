
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * lote de recurso de glosa
 * 
 * <p>Java class for ct_guiaRecursoLote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaRecursoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="guiaRecursoGlosaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_recursoGlosaOdonto"/>
 *         &lt;element name="guiaRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_recursoGlosa"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaRecursoLote", propOrder = {
    "guiaRecursoGlosaOdonto",
    "guiaRecursoGlosa"
})
public class CtGuiaRecursoLote {

    protected CtoRecursoGlosaOdonto guiaRecursoGlosaOdonto;
    protected CtmRecursoGlosa guiaRecursoGlosa;

    /**
     * Gets the value of the guiaRecursoGlosaOdonto property.
     * 
     * @return
     *     possible object is
     *     {@link CtoRecursoGlosaOdonto }
     *     
     */
    public CtoRecursoGlosaOdonto getGuiaRecursoGlosaOdonto() {
        return guiaRecursoGlosaOdonto;
    }

    /**
     * Sets the value of the guiaRecursoGlosaOdonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoRecursoGlosaOdonto }
     *     
     */
    public void setGuiaRecursoGlosaOdonto(CtoRecursoGlosaOdonto value) {
        this.guiaRecursoGlosaOdonto = value;
    }

    /**
     * Gets the value of the guiaRecursoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtmRecursoGlosa }
     *     
     */
    public CtmRecursoGlosa getGuiaRecursoGlosa() {
        return guiaRecursoGlosa;
    }

    /**
     * Sets the value of the guiaRecursoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmRecursoGlosa }
     *     
     */
    public void setGuiaRecursoGlosa(CtmRecursoGlosa value) {
        this.guiaRecursoGlosa = value;
    }

}
