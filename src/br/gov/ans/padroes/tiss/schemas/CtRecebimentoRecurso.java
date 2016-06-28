
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_recebimentoRecurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_recebimentoRecurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="protocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_recursoGlosaRecebimento"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_recebimentoRecurso", propOrder = {
    "mensagemErro",
    "protocoloRecebimento"
})
public class CtRecebimentoRecurso {

    protected CtMotivoGlosa mensagemErro;
    protected CtRecursoGlosaRecebimento protocoloRecebimento;

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
     * Gets the value of the protocoloRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtRecursoGlosaRecebimento }
     *     
     */
    public CtRecursoGlosaRecebimento getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Sets the value of the protocoloRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecursoGlosaRecebimento }
     *     
     */
    public void setProtocoloRecebimento(CtRecursoGlosaRecebimento value) {
        this.protocoloRecebimento = value;
    }

}
