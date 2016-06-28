
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_autorizacaoSolicitaStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_autorizacaoSolicitaStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_autorizacaoSolicitaStatus", propOrder = {
    "identificacaoSolicitacao",
    "dadosBeneficiario",
    "dadosContratado"
})
public class CtAutorizacaoSolicitaStatus {

    @XmlElement(required = true)
    protected CtGuiaCabecalho identificacaoSolicitacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtContratadoDados dadosContratado;

    /**
     * Gets the value of the identificacaoSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getIdentificacaoSolicitacao() {
        return identificacaoSolicitacao;
    }

    /**
     * Sets the value of the identificacaoSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setIdentificacaoSolicitacao(CtGuiaCabecalho value) {
        this.identificacaoSolicitacao = value;
    }

    /**
     * Gets the value of the dadosBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Sets the value of the dadosBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Gets the value of the dadosContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Sets the value of the dadosContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosContratado(CtContratadoDados value) {
        this.dadosContratado = value;
    }

}
