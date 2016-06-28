
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cto_demonstrativoOdontologia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cto_demonstrativoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativoOdonto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="numeroDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnpjOper" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                   &lt;element name="periodoProc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosPrestador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cpfCNPJContratado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                             &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosPagamentoPorData" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPagamento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
 *                             &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
 *                             &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="protocolos" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                             &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                             &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                                       &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                                       &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                                       &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                                       &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                                       &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                                       &lt;element name="dadosPagamento" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                                 &lt;element name="denteRegiao" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                                                           &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
 *                                                 &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                                 &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                                                 &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *                                       &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisPorProtocolo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totaisPorData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="debCredPorDataPagamento" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totalLiquidoPorData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totaisBrutoDemonstrativo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="valorInformadoPorDemonstrativoData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorlProcessadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorlGlosaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valoFranquiaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorLiberadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="debCredDemonstrativo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalDebitosDemonstativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="totalCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorRecebidoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_demonstrativoOdontologia", propOrder = {
    "cabecalhoDemonstrativoOdonto",
    "dadosPrestador",
    "dadosPagamentoPorData",
    "totaisBrutoDemonstrativo",
    "debCredDemonstrativo",
    "totalDebitosDemonstativo",
    "totalCreditosDemonstrativo",
    "valorRecebidoDemonstrativo",
    "observacao"
})
public class CtoDemonstrativoOdontologia {

    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto cabecalhoDemonstrativoOdonto;
    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.DadosPrestador dadosPrestador;
    @XmlElement(required = true)
    protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData> dadosPagamentoPorData;
    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo totaisBrutoDemonstrativo;
    protected CtoDemonstrativoOdontologia.DebCredDemonstrativo debCredDemonstrativo;
    @XmlElement(required = true)
    protected BigDecimal totalDebitosDemonstativo;
    @XmlElement(required = true)
    protected BigDecimal totalCreditosDemonstrativo;
    @XmlElement(required = true)
    protected BigDecimal valorRecebidoDemonstrativo;
    protected String observacao;

    /**
     * Gets the value of the cabecalhoDemonstrativoOdonto property.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto }
     *     
     */
    public CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto getCabecalhoDemonstrativoOdonto() {
        return cabecalhoDemonstrativoOdonto;
    }

    /**
     * Sets the value of the cabecalhoDemonstrativoOdonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto }
     *     
     */
    public void setCabecalhoDemonstrativoOdonto(CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto value) {
        this.cabecalhoDemonstrativoOdonto = value;
    }

    /**
     * Gets the value of the dadosPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public CtoDemonstrativoOdontologia.DadosPrestador getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Sets the value of the dadosPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public void setDadosPrestador(CtoDemonstrativoOdontologia.DadosPrestador value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the dadosPagamentoPorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosPagamentoPorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosPagamentoPorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData }
     * 
     * 
     */
    public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData> getDadosPagamentoPorData() {
        if (dadosPagamentoPorData == null) {
            dadosPagamentoPorData = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData>();
        }
        return this.dadosPagamentoPorData;
    }

    /**
     * Gets the value of the totaisBrutoDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo }
     *     
     */
    public CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo getTotaisBrutoDemonstrativo() {
        return totaisBrutoDemonstrativo;
    }

    /**
     * Sets the value of the totaisBrutoDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo }
     *     
     */
    public void setTotaisBrutoDemonstrativo(CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo value) {
        this.totaisBrutoDemonstrativo = value;
    }

    /**
     * Gets the value of the debCredDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.DebCredDemonstrativo }
     *     
     */
    public CtoDemonstrativoOdontologia.DebCredDemonstrativo getDebCredDemonstrativo() {
        return debCredDemonstrativo;
    }

    /**
     * Sets the value of the debCredDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.DebCredDemonstrativo }
     *     
     */
    public void setDebCredDemonstrativo(CtoDemonstrativoOdontologia.DebCredDemonstrativo value) {
        this.debCredDemonstrativo = value;
    }

    /**
     * Gets the value of the totalDebitosDemonstativo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebitosDemonstativo() {
        return totalDebitosDemonstativo;
    }

    /**
     * Sets the value of the totalDebitosDemonstativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebitosDemonstativo(BigDecimal value) {
        this.totalDebitosDemonstativo = value;
    }

    /**
     * Gets the value of the totalCreditosDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditosDemonstrativo() {
        return totalCreditosDemonstrativo;
    }

    /**
     * Sets the value of the totalCreditosDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditosDemonstrativo(BigDecimal value) {
        this.totalCreditosDemonstrativo = value;
    }

    /**
     * Gets the value of the valorRecebidoDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRecebidoDemonstrativo() {
        return valorRecebidoDemonstrativo;
    }

    /**
     * Sets the value of the valorRecebidoDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRecebidoDemonstrativo(BigDecimal value) {
        this.valorRecebidoDemonstrativo = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="numeroDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnpjOper" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *         &lt;element name="periodoProc">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
    @XmlType(name = "", propOrder = {
        "registroANS",
        "numeroDemonstrativo",
        "nomeOperadora",
        "cnpjOper",
        "periodoProc"
    })
    public static class CabecalhoDemonstrativoOdonto {

        @XmlElement(required = true)
        protected String registroANS;
        @XmlElement(required = true)
        protected String numeroDemonstrativo;
        @XmlElement(required = true)
        protected String nomeOperadora;
        @XmlElement(required = true)
        protected String cnpjOper;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc periodoProc;

        /**
         * Gets the value of the registroANS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistroANS() {
            return registroANS;
        }

        /**
         * Sets the value of the registroANS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistroANS(String value) {
            this.registroANS = value;
        }

        /**
         * Gets the value of the numeroDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDemonstrativo() {
            return numeroDemonstrativo;
        }

        /**
         * Sets the value of the numeroDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDemonstrativo(String value) {
            this.numeroDemonstrativo = value;
        }

        /**
         * Gets the value of the nomeOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeOperadora() {
            return nomeOperadora;
        }

        /**
         * Sets the value of the nomeOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeOperadora(String value) {
            this.nomeOperadora = value;
        }

        /**
         * Gets the value of the cnpjOper property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjOper() {
            return cnpjOper;
        }

        /**
         * Sets the value of the cnpjOper property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjOper(String value) {
            this.cnpjOper = value;
        }

        /**
         * Gets the value of the periodoProc property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc }
         *     
         */
        public CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc getPeriodoProc() {
            return periodoProc;
        }

        /**
         * Sets the value of the periodoProc property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc }
         *     
         */
        public void setPeriodoProc(CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc value) {
            this.periodoProc = value;
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
         *         &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
            "datainicio",
            "datafim"
        })
        public static class PeriodoProc {

            @XmlElement(required = true)
            protected XMLGregorianCalendar datainicio;
            @XmlElement(required = true)
            protected XMLGregorianCalendar datafim;

            /**
             * Gets the value of the datainicio property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatainicio() {
                return datainicio;
            }

            /**
             * Sets the value of the datainicio property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatainicio(XMLGregorianCalendar value) {
                this.datainicio = value;
            }

            /**
             * Gets the value of the datafim property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatafim() {
                return datafim;
            }

            /**
             * Sets the value of the datafim property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatafim(XMLGregorianCalendar value) {
                this.datafim = value;
            }

        }

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
     *         &lt;element name="dadosPagamento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
     *                   &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
     *                   &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="protocolos" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *                   &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *                   &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                             &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                             &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *                             &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                             &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                             &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                             &lt;element name="dadosPagamento" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                                       &lt;element name="denteRegiao" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                                                 &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                                               &lt;/choice>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
     *                                       &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                                       &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *                                       &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
     *                             &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisPorProtocolo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totaisPorData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="debCredPorDataPagamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totalLiquidoPorData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
    @XmlType(name = "", propOrder = {
        "dadosPagamento",
        "protocolos",
        "totaisPorData",
        "debCredPorDataPagamento",
        "totalLiquidoPorData"
    })
    public static class DadosPagamentoPorData {

        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento dadosPagamento;
        @XmlElement(required = true)
        protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos> protocolos;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData totaisPorData;
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento debCredPorDataPagamento;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData totalLiquidoPorData;

        /**
         * Gets the value of the dadosPagamento property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento getDadosPagamento() {
            return dadosPagamento;
        }

        /**
         * Sets the value of the dadosPagamento property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento }
         *     
         */
        public void setDadosPagamento(CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento value) {
            this.dadosPagamento = value;
        }

        /**
         * Gets the value of the protocolos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtocolos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos }
         * 
         * 
         */
        public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos> getProtocolos() {
            if (protocolos == null) {
                protocolos = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos>();
            }
            return this.protocolos;
        }

        /**
         * Gets the value of the totaisPorData property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData getTotaisPorData() {
            return totaisPorData;
        }

        /**
         * Sets the value of the totaisPorData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData }
         *     
         */
        public void setTotaisPorData(CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData value) {
            this.totaisPorData = value;
        }

        /**
         * Gets the value of the debCredPorDataPagamento property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento getDebCredPorDataPagamento() {
            return debCredPorDataPagamento;
        }

        /**
         * Sets the value of the debCredPorDataPagamento property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento }
         *     
         */
        public void setDebCredPorDataPagamento(CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento value) {
            this.debCredPorDataPagamento = value;
        }

        /**
         * Gets the value of the totalLiquidoPorData property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData getTotalLiquidoPorData() {
            return totalLiquidoPorData;
        }

        /**
         * Sets the value of the totalLiquidoPorData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData }
         *     
         */
        public void setTotalLiquidoPorData(CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData value) {
            this.totalLiquidoPorData = value;
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
         *         &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
         *         &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
         *         &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
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
            "dataPagamento",
            "banco",
            "agencia",
            "conta"
        })
        public static class DadosPagamento {

            @XmlElement(required = true)
            protected XMLGregorianCalendar dataPagamento;
            protected String banco;
            protected String agencia;
            protected String conta;

            /**
             * Gets the value of the dataPagamento property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDataPagamento() {
                return dataPagamento;
            }

            /**
             * Sets the value of the dataPagamento property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDataPagamento(XMLGregorianCalendar value) {
                this.dataPagamento = value;
            }

            /**
             * Gets the value of the banco property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBanco() {
                return banco;
            }

            /**
             * Sets the value of the banco property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBanco(String value) {
                this.banco = value;
            }

            /**
             * Gets the value of the agencia property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencia() {
                return agencia;
            }

            /**
             * Sets the value of the agencia property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencia(String value) {
                this.agencia = value;
            }

            /**
             * Gets the value of the conta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConta() {
                return conta;
            }

            /**
             * Sets the value of the conta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConta(String value) {
                this.conta = value;
            }

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
         *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
            "descontos"
        })
        public static class DebCredPorDataPagamento {

            @XmlElement(required = true)
            protected List<CtDescontos> descontos;

            /**
             * Gets the value of the descontos property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descontos property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescontos().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtDescontos }
             * 
             * 
             */
            public List<CtDescontos> getDescontos() {
                if (descontos == null) {
                    descontos = new ArrayList<CtDescontos>();
                }
                return this.descontos;
            }

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
         *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
         *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
         *         &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *                   &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
         *                   &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *                   &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *                   &lt;element name="dadosPagamento" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *                             &lt;element name="denteRegiao" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *                                       &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
         *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *                             &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
         *                             &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
         *                   &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisPorProtocolo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        @XmlType(name = "", propOrder = {
            "numeroLote",
            "numeroProtocolo",
            "dadosPagamentoGuia",
            "totaisPorProtocolo"
        })
        public static class Protocolos {

            @XmlElement(required = true)
            protected String numeroLote;
            @XmlElement(required = true)
            protected String numeroProtocolo;
            @XmlElement(required = true)
            protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia> dadosPagamentoGuia;
            @XmlElement(required = true)
            protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo totaisPorProtocolo;

            /**
             * Gets the value of the numeroLote property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroLote() {
                return numeroLote;
            }

            /**
             * Sets the value of the numeroLote property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroLote(String value) {
                this.numeroLote = value;
            }

            /**
             * Gets the value of the numeroProtocolo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroProtocolo() {
                return numeroProtocolo;
            }

            /**
             * Sets the value of the numeroProtocolo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroProtocolo(String value) {
                this.numeroProtocolo = value;
            }

            /**
             * Gets the value of the dadosPagamentoGuia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dadosPagamentoGuia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDadosPagamentoGuia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia }
             * 
             * 
             */
            public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia> getDadosPagamentoGuia() {
                if (dadosPagamentoGuia == null) {
                    dadosPagamentoGuia = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia>();
                }
                return this.dadosPagamentoGuia;
            }

            /**
             * Gets the value of the totaisPorProtocolo property.
             * 
             * @return
             *     possible object is
             *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo }
             *     
             */
            public CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo getTotaisPorProtocolo() {
                return totaisPorProtocolo;
            }

            /**
             * Sets the value of the totaisPorProtocolo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo }
             *     
             */
            public void setTotaisPorProtocolo(CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo value) {
                this.totaisPorProtocolo = value;
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
             *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
             *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
             *         &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
             *         &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
             *         &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
             *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
             *         &lt;element name="dadosPagamento" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
             *                   &lt;element name="denteRegiao" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
             *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
             *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
             *                   &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
             *                   &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
             *         &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
                "numeroGuiaPrestador",
                "numeroGuiaOperadora",
                "recurso",
                "nomeExecutante",
                "carteiraBeneficiario",
                "nomeBeneficiario",
                "dadosPagamento",
                "observacaoGuia",
                "valorTotalInformadoGuia",
                "valorTotalProcessadoGuia",
                "valorTotalGlosaGuia",
                "valorTotalFranquiaGuia",
                "valorTotalLiberadoGuia"
            })
            public static class DadosPagamentoGuia {

                @XmlElement(required = true)
                protected String numeroGuiaPrestador;
                protected String numeroGuiaOperadora;
                @XmlElement(required = true)
                protected DmSimNao recurso;
                @XmlElement(required = true)
                protected String nomeExecutante;
                @XmlElement(required = true)
                protected String carteiraBeneficiario;
                @XmlElement(required = true)
                protected String nomeBeneficiario;
                @XmlElement(required = true)
                protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento> dadosPagamento;
                protected String observacaoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalInformadoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalProcessadoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalGlosaGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalFranquiaGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalLiberadoGuia;

                /**
                 * Gets the value of the numeroGuiaPrestador property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroGuiaPrestador() {
                    return numeroGuiaPrestador;
                }

                /**
                 * Sets the value of the numeroGuiaPrestador property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroGuiaPrestador(String value) {
                    this.numeroGuiaPrestador = value;
                }

                /**
                 * Gets the value of the numeroGuiaOperadora property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroGuiaOperadora() {
                    return numeroGuiaOperadora;
                }

                /**
                 * Sets the value of the numeroGuiaOperadora property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroGuiaOperadora(String value) {
                    this.numeroGuiaOperadora = value;
                }

                /**
                 * Gets the value of the recurso property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DmSimNao }
                 *     
                 */
                public DmSimNao getRecurso() {
                    return recurso;
                }

                /**
                 * Sets the value of the recurso property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DmSimNao }
                 *     
                 */
                public void setRecurso(DmSimNao value) {
                    this.recurso = value;
                }

                /**
                 * Gets the value of the nomeExecutante property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomeExecutante() {
                    return nomeExecutante;
                }

                /**
                 * Sets the value of the nomeExecutante property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomeExecutante(String value) {
                    this.nomeExecutante = value;
                }

                /**
                 * Gets the value of the carteiraBeneficiario property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarteiraBeneficiario() {
                    return carteiraBeneficiario;
                }

                /**
                 * Sets the value of the carteiraBeneficiario property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarteiraBeneficiario(String value) {
                    this.carteiraBeneficiario = value;
                }

                /**
                 * Gets the value of the nomeBeneficiario property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomeBeneficiario() {
                    return nomeBeneficiario;
                }

                /**
                 * Sets the value of the nomeBeneficiario property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomeBeneficiario(String value) {
                    this.nomeBeneficiario = value;
                }

                /**
                 * Gets the value of the dadosPagamento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dadosPagamento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDadosPagamento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento }
                 * 
                 * 
                 */
                public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento> getDadosPagamento() {
                    if (dadosPagamento == null) {
                        dadosPagamento = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento>();
                    }
                    return this.dadosPagamento;
                }

                /**
                 * Gets the value of the observacaoGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObservacaoGuia() {
                    return observacaoGuia;
                }

                /**
                 * Sets the value of the observacaoGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObservacaoGuia(String value) {
                    this.observacaoGuia = value;
                }

                /**
                 * Gets the value of the valorTotalInformadoGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalInformadoGuia() {
                    return valorTotalInformadoGuia;
                }

                /**
                 * Sets the value of the valorTotalInformadoGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalInformadoGuia(BigDecimal value) {
                    this.valorTotalInformadoGuia = value;
                }

                /**
                 * Gets the value of the valorTotalProcessadoGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalProcessadoGuia() {
                    return valorTotalProcessadoGuia;
                }

                /**
                 * Sets the value of the valorTotalProcessadoGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalProcessadoGuia(BigDecimal value) {
                    this.valorTotalProcessadoGuia = value;
                }

                /**
                 * Gets the value of the valorTotalGlosaGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalGlosaGuia() {
                    return valorTotalGlosaGuia;
                }

                /**
                 * Sets the value of the valorTotalGlosaGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalGlosaGuia(BigDecimal value) {
                    this.valorTotalGlosaGuia = value;
                }

                /**
                 * Gets the value of the valorTotalFranquiaGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalFranquiaGuia() {
                    return valorTotalFranquiaGuia;
                }

                /**
                 * Sets the value of the valorTotalFranquiaGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalFranquiaGuia(BigDecimal value) {
                    this.valorTotalFranquiaGuia = value;
                }

                /**
                 * Gets the value of the valorTotalLiberadoGuia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalLiberadoGuia() {
                    return valorTotalLiberadoGuia;
                }

                /**
                 * Sets the value of the valorTotalLiberadoGuia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalLiberadoGuia(BigDecimal value) {
                    this.valorTotalLiberadoGuia = value;
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
                 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
                 *         &lt;element name="denteRegiao" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                 *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
                 *                 &lt;/choice>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
                 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
                 *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
                 *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
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
                    "procedimento",
                    "denteRegiao",
                    "denteFace",
                    "dataRealizacao",
                    "qtdProc",
                    "valorInformado",
                    "valorProcessado",
                    "valorGlosaEstorno",
                    "valorFranquia",
                    "valorLiberado",
                    "codigosGlosa"
                })
                public static class DadosPagamento {

                    @XmlElement(required = true)
                    protected CtProcedimentoDados procedimento;
                    protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao denteRegiao;
                    protected String denteFace;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dataRealizacao;
                    @XmlElement(required = true)
                    protected BigInteger qtdProc;
                    @XmlElement(required = true)
                    protected BigDecimal valorInformado;
                    @XmlElement(required = true)
                    protected BigDecimal valorProcessado;
                    @XmlElement(required = true)
                    protected BigDecimal valorGlosaEstorno;
                    @XmlElement(required = true)
                    protected BigDecimal valorFranquia;
                    @XmlElement(required = true)
                    protected BigDecimal valorLiberado;
                    protected List<String> codigosGlosa;

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
                     * Gets the value of the denteRegiao property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao }
                     *     
                     */
                    public CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao getDenteRegiao() {
                        return denteRegiao;
                    }

                    /**
                     * Sets the value of the denteRegiao property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao }
                     *     
                     */
                    public void setDenteRegiao(CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao value) {
                        this.denteRegiao = value;
                    }

                    /**
                     * Gets the value of the denteFace property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDenteFace() {
                        return denteFace;
                    }

                    /**
                     * Sets the value of the denteFace property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDenteFace(String value) {
                        this.denteFace = value;
                    }

                    /**
                     * Gets the value of the dataRealizacao property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDataRealizacao() {
                        return dataRealizacao;
                    }

                    /**
                     * Sets the value of the dataRealizacao property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDataRealizacao(XMLGregorianCalendar value) {
                        this.dataRealizacao = value;
                    }

                    /**
                     * Gets the value of the qtdProc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQtdProc() {
                        return qtdProc;
                    }

                    /**
                     * Sets the value of the qtdProc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQtdProc(BigInteger value) {
                        this.qtdProc = value;
                    }

                    /**
                     * Gets the value of the valorInformado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorInformado() {
                        return valorInformado;
                    }

                    /**
                     * Sets the value of the valorInformado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorInformado(BigDecimal value) {
                        this.valorInformado = value;
                    }

                    /**
                     * Gets the value of the valorProcessado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorProcessado() {
                        return valorProcessado;
                    }

                    /**
                     * Sets the value of the valorProcessado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorProcessado(BigDecimal value) {
                        this.valorProcessado = value;
                    }

                    /**
                     * Gets the value of the valorGlosaEstorno property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorGlosaEstorno() {
                        return valorGlosaEstorno;
                    }

                    /**
                     * Sets the value of the valorGlosaEstorno property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorGlosaEstorno(BigDecimal value) {
                        this.valorGlosaEstorno = value;
                    }

                    /**
                     * Gets the value of the valorFranquia property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorFranquia() {
                        return valorFranquia;
                    }

                    /**
                     * Sets the value of the valorFranquia property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorFranquia(BigDecimal value) {
                        this.valorFranquia = value;
                    }

                    /**
                     * Gets the value of the valorLiberado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorLiberado() {
                        return valorLiberado;
                    }

                    /**
                     * Sets the value of the valorLiberado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorLiberado(BigDecimal value) {
                        this.valorLiberado = value;
                    }

                    /**
                     * Gets the value of the codigosGlosa property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the codigosGlosa property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCodigosGlosa().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getCodigosGlosa() {
                        if (codigosGlosa == null) {
                            codigosGlosa = new ArrayList<String>();
                        }
                        return this.codigosGlosa;
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
                     *       &lt;choice>
                     *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                     *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
                     *       &lt;/choice>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "codDente",
                        "codRegiao"
                    })
                    public static class DenteRegiao {

                        protected String codDente;
                        protected DmRegiao codRegiao;

                        /**
                         * Gets the value of the codDente property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodDente() {
                            return codDente;
                        }

                        /**
                         * Sets the value of the codDente property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodDente(String value) {
                            this.codDente = value;
                        }

                        /**
                         * Gets the value of the codRegiao property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DmRegiao }
                         *     
                         */
                        public DmRegiao getCodRegiao() {
                            return codRegiao;
                        }

                        /**
                         * Sets the value of the codRegiao property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DmRegiao }
                         *     
                         */
                        public void setCodRegiao(DmRegiao value) {
                            this.codRegiao = value;
                        }

                    }

                }

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
             *         &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "valorTotalInformadoPorProtocolo",
                "valorTotalProcessadoPorProtocolo",
                "valorTotalGlosaPorProtocolo",
                "valorTotalFranquiaPorProtocolo",
                "valorTotalLiberadoPorProtocolo"
            })
            public static class TotaisPorProtocolo {

                @XmlElement(required = true)
                protected BigDecimal valorTotalInformadoPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalProcessadoPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalGlosaPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalFranquiaPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalLiberadoPorProtocolo;

                /**
                 * Gets the value of the valorTotalInformadoPorProtocolo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalInformadoPorProtocolo() {
                    return valorTotalInformadoPorProtocolo;
                }

                /**
                 * Sets the value of the valorTotalInformadoPorProtocolo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalInformadoPorProtocolo(BigDecimal value) {
                    this.valorTotalInformadoPorProtocolo = value;
                }

                /**
                 * Gets the value of the valorTotalProcessadoPorProtocolo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalProcessadoPorProtocolo() {
                    return valorTotalProcessadoPorProtocolo;
                }

                /**
                 * Sets the value of the valorTotalProcessadoPorProtocolo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalProcessadoPorProtocolo(BigDecimal value) {
                    this.valorTotalProcessadoPorProtocolo = value;
                }

                /**
                 * Gets the value of the valorTotalGlosaPorProtocolo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalGlosaPorProtocolo() {
                    return valorTotalGlosaPorProtocolo;
                }

                /**
                 * Sets the value of the valorTotalGlosaPorProtocolo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalGlosaPorProtocolo(BigDecimal value) {
                    this.valorTotalGlosaPorProtocolo = value;
                }

                /**
                 * Gets the value of the valorTotalFranquiaPorProtocolo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalFranquiaPorProtocolo() {
                    return valorTotalFranquiaPorProtocolo;
                }

                /**
                 * Sets the value of the valorTotalFranquiaPorProtocolo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalFranquiaPorProtocolo(BigDecimal value) {
                    this.valorTotalFranquiaPorProtocolo = value;
                }

                /**
                 * Gets the value of the valorTotalLiberadoPorProtocolo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalLiberadoPorProtocolo() {
                    return valorTotalLiberadoPorProtocolo;
                }

                /**
                 * Sets the value of the valorTotalLiberadoPorProtocolo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalLiberadoPorProtocolo(BigDecimal value) {
                    this.valorTotalLiberadoPorProtocolo = value;
                }

            }

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
         *         &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorBrutonformadoPorData",
            "valorBrutoProcessadoPorData",
            "valorBrutoGlosaPorData",
            "valorBrutoFranquiaPorData",
            "valorBrutoLiberadoPorData"
        })
        public static class TotaisPorData {

            @XmlElement(required = true)
            protected BigDecimal valorBrutonformadoPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoProcessadoPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoGlosaPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoFranquiaPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoLiberadoPorData;

            /**
             * Gets the value of the valorBrutonformadoPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutonformadoPorData() {
                return valorBrutonformadoPorData;
            }

            /**
             * Sets the value of the valorBrutonformadoPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutonformadoPorData(BigDecimal value) {
                this.valorBrutonformadoPorData = value;
            }

            /**
             * Gets the value of the valorBrutoProcessadoPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoProcessadoPorData() {
                return valorBrutoProcessadoPorData;
            }

            /**
             * Sets the value of the valorBrutoProcessadoPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoProcessadoPorData(BigDecimal value) {
                this.valorBrutoProcessadoPorData = value;
            }

            /**
             * Gets the value of the valorBrutoGlosaPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoGlosaPorData() {
                return valorBrutoGlosaPorData;
            }

            /**
             * Sets the value of the valorBrutoGlosaPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoGlosaPorData(BigDecimal value) {
                this.valorBrutoGlosaPorData = value;
            }

            /**
             * Gets the value of the valorBrutoFranquiaPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoFranquiaPorData() {
                return valorBrutoFranquiaPorData;
            }

            /**
             * Sets the value of the valorBrutoFranquiaPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoFranquiaPorData(BigDecimal value) {
                this.valorBrutoFranquiaPorData = value;
            }

            /**
             * Gets the value of the valorBrutoLiberadoPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoLiberadoPorData() {
                return valorBrutoLiberadoPorData;
            }

            /**
             * Sets the value of the valorBrutoLiberadoPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoLiberadoPorData(BigDecimal value) {
                this.valorBrutoLiberadoPorData = value;
            }

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
         *         &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorTotalDebitosPorData",
            "valorTotalCreditosPorData",
            "valorFinalAReceberPorData"
        })
        public static class TotalLiquidoPorData {

            @XmlElement(required = true)
            protected BigDecimal valorTotalDebitosPorData;
            @XmlElement(required = true)
            protected BigDecimal valorTotalCreditosPorData;
            @XmlElement(required = true)
            protected BigDecimal valorFinalAReceberPorData;

            /**
             * Gets the value of the valorTotalDebitosPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorTotalDebitosPorData() {
                return valorTotalDebitosPorData;
            }

            /**
             * Sets the value of the valorTotalDebitosPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorTotalDebitosPorData(BigDecimal value) {
                this.valorTotalDebitosPorData = value;
            }

            /**
             * Gets the value of the valorTotalCreditosPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorTotalCreditosPorData() {
                return valorTotalCreditosPorData;
            }

            /**
             * Sets the value of the valorTotalCreditosPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorTotalCreditosPorData(BigDecimal value) {
                this.valorTotalCreditosPorData = value;
            }

            /**
             * Gets the value of the valorFinalAReceberPorData property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorFinalAReceberPorData() {
                return valorFinalAReceberPorData;
            }

            /**
             * Sets the value of the valorFinalAReceberPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorFinalAReceberPorData(BigDecimal value) {
                this.valorFinalAReceberPorData = value;
            }

        }

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
     *         &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cpfCNPJContratado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *                   &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
     *                 &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "codigoPrestador",
        "nomePrestador",
        "cpfCNPJContratado"
    })
    public static class DadosPrestador {

        @XmlElement(required = true)
        protected String codigoPrestador;
        @XmlElement(required = true)
        protected String nomePrestador;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado cpfCNPJContratado;

        /**
         * Gets the value of the codigoPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestador() {
            return codigoPrestador;
        }

        /**
         * Sets the value of the codigoPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestador(String value) {
            this.codigoPrestador = value;
        }

        /**
         * Gets the value of the nomePrestador property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePrestador() {
            return nomePrestador;
        }

        /**
         * Sets the value of the nomePrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePrestador(String value) {
            this.nomePrestador = value;
        }

        /**
         * Gets the value of the cpfCNPJContratado property.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado getCpfCNPJContratado() {
            return cpfCNPJContratado;
        }

        /**
         * Sets the value of the cpfCNPJContratado property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado }
         *     
         */
        public void setCpfCNPJContratado(CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado value) {
            this.cpfCNPJContratado = value;
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
         *       &lt;choice>
         *         &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
         *         &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpjPrestador",
            "cpfContratado"
        })
        public static class CpfCNPJContratado {

            protected String cnpjPrestador;
            protected String cpfContratado;

            /**
             * Gets the value of the cnpjPrestador property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjPrestador() {
                return cnpjPrestador;
            }

            /**
             * Sets the value of the cnpjPrestador property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjPrestador(String value) {
                this.cnpjPrestador = value;
            }

            /**
             * Gets the value of the cpfContratado property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfContratado() {
                return cpfContratado;
            }

            /**
             * Sets the value of the cpfContratado property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfContratado(String value) {
                this.cpfContratado = value;
            }

        }

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
     *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
        "descontos"
    })
    public static class DebCredDemonstrativo {

        @XmlElement(required = true)
        protected List<CtDescontos> descontos;

        /**
         * Gets the value of the descontos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descontos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescontos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontos }
         * 
         * 
         */
        public List<CtDescontos> getDescontos() {
            if (descontos == null) {
                descontos = new ArrayList<CtDescontos>();
            }
            return this.descontos;
        }

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
     *         &lt;element name="valorInformadoPorDemonstrativoData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorlProcessadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorlGlosaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valoFranquiaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorLiberadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "valorInformadoPorDemonstrativoData",
        "valorlProcessadoPorDemonstrativo",
        "valorlGlosaPorDemonstrativo",
        "valoFranquiaPorDemonstrativo",
        "valorLiberadoPorDemonstrativo"
    })
    public static class TotaisBrutoDemonstrativo {

        @XmlElement(required = true)
        protected BigDecimal valorInformadoPorDemonstrativoData;
        @XmlElement(required = true)
        protected BigDecimal valorlProcessadoPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valorlGlosaPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valoFranquiaPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valorLiberadoPorDemonstrativo;

        /**
         * Gets the value of the valorInformadoPorDemonstrativoData property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorInformadoPorDemonstrativoData() {
            return valorInformadoPorDemonstrativoData;
        }

        /**
         * Sets the value of the valorInformadoPorDemonstrativoData property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorInformadoPorDemonstrativoData(BigDecimal value) {
            this.valorInformadoPorDemonstrativoData = value;
        }

        /**
         * Gets the value of the valorlProcessadoPorDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorlProcessadoPorDemonstrativo() {
            return valorlProcessadoPorDemonstrativo;
        }

        /**
         * Sets the value of the valorlProcessadoPorDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorlProcessadoPorDemonstrativo(BigDecimal value) {
            this.valorlProcessadoPorDemonstrativo = value;
        }

        /**
         * Gets the value of the valorlGlosaPorDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorlGlosaPorDemonstrativo() {
            return valorlGlosaPorDemonstrativo;
        }

        /**
         * Sets the value of the valorlGlosaPorDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorlGlosaPorDemonstrativo(BigDecimal value) {
            this.valorlGlosaPorDemonstrativo = value;
        }

        /**
         * Gets the value of the valoFranquiaPorDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValoFranquiaPorDemonstrativo() {
            return valoFranquiaPorDemonstrativo;
        }

        /**
         * Sets the value of the valoFranquiaPorDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValoFranquiaPorDemonstrativo(BigDecimal value) {
            this.valoFranquiaPorDemonstrativo = value;
        }

        /**
         * Gets the value of the valorLiberadoPorDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorLiberadoPorDemonstrativo() {
            return valorLiberadoPorDemonstrativo;
        }

        /**
         * Sets the value of the valorLiberadoPorDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorLiberadoPorDemonstrativo(BigDecimal value) {
            this.valorLiberadoPorDemonstrativo = value;
        }

    }

}
