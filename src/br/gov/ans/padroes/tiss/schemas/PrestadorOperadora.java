
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prestadorOperadora complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestadorOperadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="loteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_guiaLote" minOccurs="0"/>
 *         &lt;element name="loteAnexos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoLote" minOccurs="0"/>
 *         &lt;element name="solicitacaoDemonstrativoRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoSolicitacao" minOccurs="0"/>
 *         &lt;element name="solicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloSolicitacaoStatus" minOccurs="0"/>
 *         &lt;element name="solicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoProcedimento" minOccurs="0"/>
 *         &lt;element name="solicitaStatusAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoSolicitaStatus" minOccurs="0"/>
 *         &lt;element name="verificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_elegibilidadeVerifica" minOccurs="0"/>
 *         &lt;element name="cancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCancelamento" minOccurs="0"/>
 *         &lt;element name="comunicacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacao" minOccurs="0"/>
 *         &lt;element name="recursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaRecursoLote" minOccurs="0"/>
 *         &lt;element name="solicitacaoStatusRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloSolicitacaoStatus" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestadorOperadora", propOrder = {
    "loteGuias",
    "loteAnexos",
    "solicitacaoDemonstrativoRetorno",
    "solicitacaoStatusProtocolo",
    "solicitacaoProcedimento",
    "solicitaStatusAutorizacao",
    "verificaElegibilidade",
    "cancelaGuia",
    "comunicacaoInternacao",
    "recursoGlosa",
    "solicitacaoStatusRecursoGlosa"
})
public class PrestadorOperadora {

    protected CtmGuiaLote loteGuias;
    protected CtAnexoLote loteAnexos;
    protected CtDemonstrativoSolicitacao solicitacaoDemonstrativoRetorno;
    protected CtProtocoloSolicitacaoStatus solicitacaoStatusProtocolo;
    protected CtSolicitacaoProcedimento solicitacaoProcedimento;
    protected CtAutorizacaoSolicitaStatus solicitaStatusAutorizacao;
    protected CtElegibilidadeVerifica verificaElegibilidade;
    protected CtGuiaCancelamento cancelaGuia;
    protected CtmBeneficiarioComunicacao comunicacaoInternacao;
    protected CtGuiaRecursoLote recursoGlosa;
    protected CtProtocoloSolicitacaoStatus solicitacaoStatusRecursoGlosa;

    /**
     * Gets the value of the loteGuias property.
     * 
     * @return
     *     possible object is
     *     {@link CtmGuiaLote }
     *     
     */
    public CtmGuiaLote getLoteGuias() {
        return loteGuias;
    }

    /**
     * Sets the value of the loteGuias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmGuiaLote }
     *     
     */
    public void setLoteGuias(CtmGuiaLote value) {
        this.loteGuias = value;
    }

    /**
     * Gets the value of the loteAnexos property.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoLote }
     *     
     */
    public CtAnexoLote getLoteAnexos() {
        return loteAnexos;
    }

    /**
     * Sets the value of the loteAnexos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoLote }
     *     
     */
    public void setLoteAnexos(CtAnexoLote value) {
        this.loteAnexos = value;
    }

    /**
     * Gets the value of the solicitacaoDemonstrativoRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoSolicitacao }
     *     
     */
    public CtDemonstrativoSolicitacao getSolicitacaoDemonstrativoRetorno() {
        return solicitacaoDemonstrativoRetorno;
    }

    /**
     * Sets the value of the solicitacaoDemonstrativoRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoSolicitacao }
     *     
     */
    public void setSolicitacaoDemonstrativoRetorno(CtDemonstrativoSolicitacao value) {
        this.solicitacaoDemonstrativoRetorno = value;
    }

    /**
     * Gets the value of the solicitacaoStatusProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public CtProtocoloSolicitacaoStatus getSolicitacaoStatusProtocolo() {
        return solicitacaoStatusProtocolo;
    }

    /**
     * Sets the value of the solicitacaoStatusProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public void setSolicitacaoStatusProtocolo(CtProtocoloSolicitacaoStatus value) {
        this.solicitacaoStatusProtocolo = value;
    }

    /**
     * Gets the value of the solicitacaoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public CtSolicitacaoProcedimento getSolicitacaoProcedimento() {
        return solicitacaoProcedimento;
    }

    /**
     * Sets the value of the solicitacaoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitacaoProcedimento }
     *     
     */
    public void setSolicitacaoProcedimento(CtSolicitacaoProcedimento value) {
        this.solicitacaoProcedimento = value;
    }

    /**
     * Gets the value of the solicitaStatusAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoSolicitaStatus }
     *     
     */
    public CtAutorizacaoSolicitaStatus getSolicitaStatusAutorizacao() {
        return solicitaStatusAutorizacao;
    }

    /**
     * Sets the value of the solicitaStatusAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoSolicitaStatus }
     *     
     */
    public void setSolicitaStatusAutorizacao(CtAutorizacaoSolicitaStatus value) {
        this.solicitaStatusAutorizacao = value;
    }

    /**
     * Gets the value of the verificaElegibilidade property.
     * 
     * @return
     *     possible object is
     *     {@link CtElegibilidadeVerifica }
     *     
     */
    public CtElegibilidadeVerifica getVerificaElegibilidade() {
        return verificaElegibilidade;
    }

    /**
     * Sets the value of the verificaElegibilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtElegibilidadeVerifica }
     *     
     */
    public void setVerificaElegibilidade(CtElegibilidadeVerifica value) {
        this.verificaElegibilidade = value;
    }

    /**
     * Gets the value of the cancelaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamento }
     *     
     */
    public CtGuiaCancelamento getCancelaGuia() {
        return cancelaGuia;
    }

    /**
     * Sets the value of the cancelaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamento }
     *     
     */
    public void setCancelaGuia(CtGuiaCancelamento value) {
        this.cancelaGuia = value;
    }

    /**
     * Gets the value of the comunicacaoInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public CtmBeneficiarioComunicacao getComunicacaoInternacao() {
        return comunicacaoInternacao;
    }

    /**
     * Sets the value of the comunicacaoInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public void setComunicacaoInternacao(CtmBeneficiarioComunicacao value) {
        this.comunicacaoInternacao = value;
    }

    /**
     * Gets the value of the recursoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaRecursoLote }
     *     
     */
    public CtGuiaRecursoLote getRecursoGlosa() {
        return recursoGlosa;
    }

    /**
     * Sets the value of the recursoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaRecursoLote }
     *     
     */
    public void setRecursoGlosa(CtGuiaRecursoLote value) {
        this.recursoGlosa = value;
    }

    /**
     * Gets the value of the solicitacaoStatusRecursoGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public CtProtocoloSolicitacaoStatus getSolicitacaoStatusRecursoGlosa() {
        return solicitacaoStatusRecursoGlosa;
    }

    /**
     * Sets the value of the solicitacaoStatusRecursoGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloSolicitacaoStatus }
     *     
     */
    public void setSolicitacaoStatusRecursoGlosa(CtProtocoloSolicitacaoStatus value) {
        this.solicitacaoStatusRecursoGlosa = value;
    }

}
