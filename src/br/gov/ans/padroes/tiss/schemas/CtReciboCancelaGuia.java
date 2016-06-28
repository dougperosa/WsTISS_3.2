
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_reciboCancelaGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboCancelaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCancelamentoRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboCancelaGuia", propOrder = {
    "mensagemErro",
    "reciboCancelaGuia"
})
public class CtReciboCancelaGuia {

    protected CtMotivoGlosa mensagemErro;
    protected CtGuiaCancelamentoRecibo reciboCancelaGuia;

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Gets the value of the reciboCancelaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public CtGuiaCancelamentoRecibo getReciboCancelaGuia() {
        return reciboCancelaGuia;
    }

    /**
     * Sets the value of the reciboCancelaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public void setReciboCancelaGuia(CtGuiaCancelamentoRecibo value) {
        this.reciboCancelaGuia = value;
    }

}
