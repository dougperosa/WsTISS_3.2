
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_solicitacaoLote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_solicitacaoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="solicitacaoSP-SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_prorrogacaoSolicitacaoGuia"/>
 *         &lt;element name="solicitacaoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_odontoSolicitacaoGuia"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_solicitacaoLote", propOrder = {
    "solicitacaoSPSADT",
    "solicitacaoInternacao",
    "solicitacaoProrrogacao",
    "solicitacaoOdontologia"
})
@XmlSeeAlso({
    CtSolicitacaoProcedimento.class
})
public class CtmSolicitacaoLote {

    @XmlElement(name = "solicitacaoSP-SADT")
    protected CtmSpSadtSolicitacaoGuia solicitacaoSPSADT;
    protected CtmInternacaoSolicitacaoGuia solicitacaoInternacao;
    protected CtmProrrogacaoSolicitacaoGuia solicitacaoProrrogacao;
    protected CtoOdontoSolicitacaoGuia solicitacaoOdontologia;

    /**
     * Gets the value of the solicitacaoSPSADT property.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtSolicitacaoGuia }
     *     
     */
    public CtmSpSadtSolicitacaoGuia getSolicitacaoSPSADT() {
        return solicitacaoSPSADT;
    }

    /**
     * Sets the value of the solicitacaoSPSADT property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoSPSADT(CtmSpSadtSolicitacaoGuia value) {
        this.solicitacaoSPSADT = value;
    }

    /**
     * Gets the value of the solicitacaoInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmInternacaoSolicitacaoGuia }
     *     
     */
    public CtmInternacaoSolicitacaoGuia getSolicitacaoInternacao() {
        return solicitacaoInternacao;
    }

    /**
     * Sets the value of the solicitacaoInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmInternacaoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoInternacao(CtmInternacaoSolicitacaoGuia value) {
        this.solicitacaoInternacao = value;
    }

    /**
     * Gets the value of the solicitacaoProrrogacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmProrrogacaoSolicitacaoGuia }
     *     
     */
    public CtmProrrogacaoSolicitacaoGuia getSolicitacaoProrrogacao() {
        return solicitacaoProrrogacao;
    }

    /**
     * Sets the value of the solicitacaoProrrogacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmProrrogacaoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoProrrogacao(CtmProrrogacaoSolicitacaoGuia value) {
        this.solicitacaoProrrogacao = value;
    }

    /**
     * Gets the value of the solicitacaoOdontologia property.
     * 
     * @return
     *     possible object is
     *     {@link CtoOdontoSolicitacaoGuia }
     *     
     */
    public CtoOdontoSolicitacaoGuia getSolicitacaoOdontologia() {
        return solicitacaoOdontologia;
    }

    /**
     * Sets the value of the solicitacaoOdontologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoOdontoSolicitacaoGuia }
     *     
     */
    public void setSolicitacaoOdontologia(CtoOdontoSolicitacaoGuia value) {
        this.solicitacaoOdontologia = value;
    }

}
