
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_procedimentoExecutadoOutras complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutadoOutras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataExecucao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
 *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
 *         &lt;element name="quantidadeExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-4"/>
 *         &lt;element name="unidadeMedida" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_unidadeMedida"/>
 *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal3-2"/>
 *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="descricaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
 *         &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoExecutadoOutras", propOrder = {
    "dataExecucao",
    "horaInicial",
    "horaFinal",
    "codigoTabela",
    "codigoProcedimento",
    "quantidadeExecutada",
    "unidadeMedida",
    "reducaoAcrescimo",
    "valorUnitario",
    "valorTotal",
    "descricaoProcedimento",
    "registroANVISA",
    "codigoRefFabricante",
    "autorizacaoFuncionamento"
})
public class CtProcedimentoExecutadoOutras {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataExecucao;
    protected XMLGregorianCalendar horaInicial;
    protected XMLGregorianCalendar horaFinal;
    @XmlElement(required = true)
    protected String codigoTabela;
    @XmlElement(required = true)
    protected String codigoProcedimento;
    @XmlElement(required = true)
    protected BigDecimal quantidadeExecutada;
    @XmlElement(required = true)
    protected String unidadeMedida;
    @XmlElement(required = true)
    protected BigDecimal reducaoAcrescimo;
    @XmlElement(required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    @XmlElement(required = true)
    protected String descricaoProcedimento;
    protected String registroANVISA;
    protected String codigoRefFabricante;
    protected String autorizacaoFuncionamento;

    /**
     * Gets the value of the dataExecucao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExecucao() {
        return dataExecucao;
    }

    /**
     * Sets the value of the dataExecucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExecucao(XMLGregorianCalendar value) {
        this.dataExecucao = value;
    }

    /**
     * Gets the value of the horaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicial() {
        return horaInicial;
    }

    /**
     * Sets the value of the horaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicial(XMLGregorianCalendar value) {
        this.horaInicial = value;
    }

    /**
     * Gets the value of the horaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinal() {
        return horaFinal;
    }

    /**
     * Sets the value of the horaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinal(XMLGregorianCalendar value) {
        this.horaFinal = value;
    }

    /**
     * Gets the value of the codigoTabela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTabela() {
        return codigoTabela;
    }

    /**
     * Sets the value of the codigoTabela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTabela(String value) {
        this.codigoTabela = value;
    }

    /**
     * Gets the value of the codigoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    /**
     * Sets the value of the codigoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProcedimento(String value) {
        this.codigoProcedimento = value;
    }

    /**
     * Gets the value of the quantidadeExecutada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeExecutada() {
        return quantidadeExecutada;
    }

    /**
     * Sets the value of the quantidadeExecutada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeExecutada(BigDecimal value) {
        this.quantidadeExecutada = value;
    }

    /**
     * Gets the value of the unidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Sets the value of the unidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeMedida(String value) {
        this.unidadeMedida = value;
    }

    /**
     * Gets the value of the reducaoAcrescimo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducaoAcrescimo() {
        return reducaoAcrescimo;
    }

    /**
     * Sets the value of the reducaoAcrescimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducaoAcrescimo(BigDecimal value) {
        this.reducaoAcrescimo = value;
    }

    /**
     * Gets the value of the valorUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Sets the value of the valorUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the descricaoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }

    /**
     * Sets the value of the descricaoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProcedimento(String value) {
        this.descricaoProcedimento = value;
    }

    /**
     * Gets the value of the registroANVISA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANVISA() {
        return registroANVISA;
    }

    /**
     * Sets the value of the registroANVISA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANVISA(String value) {
        this.registroANVISA = value;
    }

    /**
     * Gets the value of the codigoRefFabricante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRefFabricante() {
        return codigoRefFabricante;
    }

    /**
     * Sets the value of the codigoRefFabricante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRefFabricante(String value) {
        this.codigoRefFabricante = value;
    }

    /**
     * Gets the value of the autorizacaoFuncionamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacaoFuncionamento() {
        return autorizacaoFuncionamento;
    }

    /**
     * Sets the value of the autorizacaoFuncionamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacaoFuncionamento(String value) {
        this.autorizacaoFuncionamento = value;
    }

}
