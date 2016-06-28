
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_reciboComunicacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboComunicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacaoRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboComunicacao", propOrder = {
    "mensagemErro",
    "reciboComunicacao"
})
public class CtReciboComunicacao {

    protected CtMotivoGlosa mensagemErro;
    protected CtmBeneficiarioComunicacaoRecibo reciboComunicacao;

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
     * Gets the value of the reciboComunicacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacaoRecibo }
     *     
     */
    public CtmBeneficiarioComunicacaoRecibo getReciboComunicacao() {
        return reciboComunicacao;
    }

    /**
     * Sets the value of the reciboComunicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacaoRecibo }
     *     
     */
    public void setReciboComunicacao(CtmBeneficiarioComunicacaoRecibo value) {
        this.reciboComunicacao = value;
    }

}
