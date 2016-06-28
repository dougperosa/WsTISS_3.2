
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_situacaoAutorizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoAutorizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="autorizacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoInternacao"/>
 *         &lt;element name="autorizacaoServico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="autorizacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoProrrogacao"/>
 *         &lt;element name="autorizacaoServicoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_autorizacaoServico"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoAutorizacao", propOrder = {
    "mensagemErro",
    "autorizacaoInternacao",
    "autorizacaoServico",
    "autorizacaoProrrogacao",
    "autorizacaoServicoOdonto"
})
public class CtSituacaoAutorizacao {

    protected CtMotivoGlosa mensagemErro;
    protected CtmAutorizacaoInternacao autorizacaoInternacao;
    protected CtmAutorizacaoServico autorizacaoServico;
    protected CtmAutorizacaoProrrogacao autorizacaoProrrogacao;
    protected CtoAutorizacaoServico autorizacaoServicoOdonto;

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
     * Gets the value of the autorizacaoInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoInternacao }
     *     
     */
    public CtmAutorizacaoInternacao getAutorizacaoInternacao() {
        return autorizacaoInternacao;
    }

    /**
     * Sets the value of the autorizacaoInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoInternacao }
     *     
     */
    public void setAutorizacaoInternacao(CtmAutorizacaoInternacao value) {
        this.autorizacaoInternacao = value;
    }

    /**
     * Gets the value of the autorizacaoServico property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoServico() {
        return autorizacaoServico;
    }

    /**
     * Sets the value of the autorizacaoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoServico(CtmAutorizacaoServico value) {
        this.autorizacaoServico = value;
    }

    /**
     * Gets the value of the autorizacaoProrrogacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoProrrogacao }
     *     
     */
    public CtmAutorizacaoProrrogacao getAutorizacaoProrrogacao() {
        return autorizacaoProrrogacao;
    }

    /**
     * Sets the value of the autorizacaoProrrogacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoProrrogacao }
     *     
     */
    public void setAutorizacaoProrrogacao(CtmAutorizacaoProrrogacao value) {
        this.autorizacaoProrrogacao = value;
    }

    /**
     * Gets the value of the autorizacaoServicoOdonto property.
     * 
     * @return
     *     possible object is
     *     {@link CtoAutorizacaoServico }
     *     
     */
    public CtoAutorizacaoServico getAutorizacaoServicoOdonto() {
        return autorizacaoServicoOdonto;
    }

    /**
     * Sets the value of the autorizacaoServicoOdonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAutorizacaoServico }
     *     
     */
    public void setAutorizacaoServicoOdonto(CtoAutorizacaoServico value) {
        this.autorizacaoServicoOdonto = value;
    }

}
