
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_beneficiarioComunicacaoRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_beneficiarioComunicacaoRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="beneficiarioComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacao"/>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_beneficiarioComunicacaoRecibo", propOrder = {
    "statusComunicacao",
    "beneficiarioComunicacao",
    "mensagemErro"
})
public class CtmBeneficiarioComunicacaoRecibo {

    @XmlElement(required = true)
    protected DmSimNao statusComunicacao;
    @XmlElement(required = true)
    protected CtmBeneficiarioComunicacao beneficiarioComunicacao;
    protected CtMotivoGlosa mensagemErro;

    /**
     * Gets the value of the statusComunicacao property.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getStatusComunicacao() {
        return statusComunicacao;
    }

    /**
     * Sets the value of the statusComunicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setStatusComunicacao(DmSimNao value) {
        this.statusComunicacao = value;
    }

    /**
     * Gets the value of the beneficiarioComunicacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public CtmBeneficiarioComunicacao getBeneficiarioComunicacao() {
        return beneficiarioComunicacao;
    }

    /**
     * Sets the value of the beneficiarioComunicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public void setBeneficiarioComunicacao(CtmBeneficiarioComunicacao value) {
        this.beneficiarioComunicacao = value;
    }

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

}
