
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_respostaElegibilidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaElegibilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaElegibilidade", propOrder = {
    "mensagemErro",
    "reciboElegibilidade"
})
public class CtRespostaElegibilidade {

    protected CtMotivoGlosa mensagemErro;
    protected CtElegibilidadeRecibo reciboElegibilidade;

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
     * Gets the value of the reciboElegibilidade property.
     * 
     * @return
     *     possible object is
     *     {@link CtElegibilidadeRecibo }
     *     
     */
    public CtElegibilidadeRecibo getReciboElegibilidade() {
        return reciboElegibilidade;
    }

    /**
     * Sets the value of the reciboElegibilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtElegibilidadeRecibo }
     *     
     */
    public void setReciboElegibilidade(CtElegibilidadeRecibo value) {
        this.reciboElegibilidade = value;
    }

}
