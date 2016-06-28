
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_procedimentoAutorizado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoAutorizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
 *         &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
 *         &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
 *         &lt;element name="motivosNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoAutorizado", propOrder = {
    "procedimento",
    "quantidadeSolicitada",
    "quantidadeAutorizada",
    "valorSolicitado",
    "valorAutorizado",
    "opcaoFabricante",
    "registroANVISA",
    "codigoRefFabricante",
    "autorizacaoFuncionamento",
    "motivosNegativa"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoOPME.ServicosAutorizadosOPME.class
})
public class CtProcedimentoAutorizado {

    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    @XmlElement(required = true)
    protected BigInteger quantidadeSolicitada;
    @XmlElement(required = true)
    protected BigInteger quantidadeAutorizada;
    protected BigDecimal valorSolicitado;
    protected BigDecimal valorAutorizado;
    protected String opcaoFabricante;
    protected String registroANVISA;
    protected String codigoRefFabricante;
    protected String autorizacaoFuncionamento;
    protected CtProcedimentoAutorizado.MotivosNegativa motivosNegativa;

    /**
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcedimento() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcedimento(CtProcedimentoDados value) {
        this.procedimento = value;
    }

    /**
     * Gets the value of the quantidadeSolicitada property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Sets the value of the quantidadeSolicitada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeSolicitada(BigInteger value) {
        this.quantidadeSolicitada = value;
    }

    /**
     * Gets the value of the quantidadeAutorizada property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeAutorizada() {
        return quantidadeAutorizada;
    }

    /**
     * Sets the value of the quantidadeAutorizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeAutorizada(BigInteger value) {
        this.quantidadeAutorizada = value;
    }

    /**
     * Gets the value of the valorSolicitado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSolicitado() {
        return valorSolicitado;
    }

    /**
     * Sets the value of the valorSolicitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSolicitado(BigDecimal value) {
        this.valorSolicitado = value;
    }

    /**
     * Gets the value of the valorAutorizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAutorizado() {
        return valorAutorizado;
    }

    /**
     * Sets the value of the valorAutorizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAutorizado(BigDecimal value) {
        this.valorAutorizado = value;
    }

    /**
     * Gets the value of the opcaoFabricante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcaoFabricante() {
        return opcaoFabricante;
    }

    /**
     * Sets the value of the opcaoFabricante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcaoFabricante(String value) {
        this.opcaoFabricante = value;
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

    /**
     * Gets the value of the motivosNegativa property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoAutorizado.MotivosNegativa }
     *     
     */
    public CtProcedimentoAutorizado.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Sets the value of the motivosNegativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoAutorizado.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtProcedimentoAutorizado.MotivosNegativa value) {
        this.motivosNegativa = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "motivoNegativa"
    })
    public static class MotivosNegativa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoNegativa;

        /**
         * Gets the value of the motivoNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoNegativa() {
            if (motivoNegativa == null) {
                motivoNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoNegativa;
        }

    }

}
