
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_situacaoProtocolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="situacaoDoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloStatus"/>
 *         &lt;element name="situacaoProtocoloAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloAnexoStatus"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoProtocolo", propOrder = {
    "mensagemErro",
    "situacaoDoProtocolo",
    "situacaoProtocoloAnexo"
})
public class CtSituacaoProtocolo {

    protected CtMotivoGlosa mensagemErro;
    protected CtProtocoloStatus situacaoDoProtocolo;
    protected CtProtocoloAnexoStatus situacaoProtocoloAnexo;

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
     * Gets the value of the situacaoDoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloStatus }
     *     
     */
    public CtProtocoloStatus getSituacaoDoProtocolo() {
        return situacaoDoProtocolo;
    }

    /**
     * Sets the value of the situacaoDoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloStatus }
     *     
     */
    public void setSituacaoDoProtocolo(CtProtocoloStatus value) {
        this.situacaoDoProtocolo = value;
    }

    /**
     * Gets the value of the situacaoProtocoloAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloAnexoStatus }
     *     
     */
    public CtProtocoloAnexoStatus getSituacaoProtocoloAnexo() {
        return situacaoProtocoloAnexo;
    }

    /**
     * Sets the value of the situacaoProtocoloAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloAnexoStatus }
     *     
     */
    public void setSituacaoProtocoloAnexo(CtProtocoloAnexoStatus value) {
        this.situacaoProtocoloAnexo = value;
    }

}
