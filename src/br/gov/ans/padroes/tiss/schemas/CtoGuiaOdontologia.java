
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
 * <p>Java class for cto_guiaOdontologia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cto_guiaOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="senhaAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="validadeSenha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="planoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40"/>
 *         &lt;element name="nomeEmpresa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *         &lt;element name="numeroTelefone" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11" minOccurs="0"/>
 *         &lt;element name="nomeTitular" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *         &lt;element name="dadosProfissionaisResponsaveis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nomeProfSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *                   &lt;element name="croSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *                   &lt;element name="ufSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
 *                   &lt;element name="cbosSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS" minOccurs="0"/>
 *                   &lt;element name="codigoProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="croExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *                   &lt;element name="ufExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *                   &lt;element name="cnesExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                   &lt;element name="nomeProfExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
 *                   &lt;element name="croExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *                   &lt;element name="ufExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
 *                   &lt;element name="cbosExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosExecutados" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
 *                   &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataTerminoTrat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAtendimentoOdonto"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoFaturamentoOdonto"/>
 *         &lt;element name="qtdTotalUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorTotalProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorTotalFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="odontoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicialnaGTO" minOccurs="0"/>
 *         &lt;element name="assinaturaDigitalGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}assinaturaDigital" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_guiaOdontologia", propOrder = {
    "registroANS",
    "numeroGuiaPrestador",
    "numeroGuiaPrincipal",
    "dataAutorizacao",
    "senhaAutorizacao",
    "validadeSenha",
    "numeroGuiaOperadora",
    "dadosBeneficiario",
    "planoBeneficiario",
    "nomeEmpresa",
    "numeroTelefone",
    "nomeTitular",
    "dadosProfissionaisResponsaveis",
    "procedimentosExecutados",
    "dataTerminoTrat",
    "tipoAtendimento",
    "tipoFaturamento",
    "qtdTotalUS",
    "valorTotalProc",
    "valorTotalFranquia",
    "observacao",
    "odontoInicial",
    "assinaturaDigitalGuia"
})
public class CtoGuiaOdontologia {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaPrincipal;
    protected XMLGregorianCalendar dataAutorizacao;
    protected String senhaAutorizacao;
    protected XMLGregorianCalendar validadeSenha;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected String planoBeneficiario;
    protected String nomeEmpresa;
    protected String numeroTelefone;
    protected String nomeTitular;
    @XmlElement(required = true)
    protected CtoGuiaOdontologia.DadosProfissionaisResponsaveis dadosProfissionaisResponsaveis;
    @XmlElement(required = true)
    protected List<CtoGuiaOdontologia.ProcedimentosExecutados> procedimentosExecutados;
    protected XMLGregorianCalendar dataTerminoTrat;
    @XmlElement(required = true)
    protected String tipoAtendimento;
    @XmlElement(required = true)
    protected String tipoFaturamento;
    protected BigDecimal qtdTotalUS;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProc;
    protected BigDecimal valorTotalFranquia;
    protected String observacao;
    protected CtoAnexoSituacaoInicialnaGTO odontoInicial;
    protected AssinaturaDigital assinaturaDigitalGuia;

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
     * Gets the value of the numeroGuiaPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Sets the value of the numeroGuiaPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
    }

    /**
     * Gets the value of the dataAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAutorizacao() {
        return dataAutorizacao;
    }

    /**
     * Sets the value of the dataAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAutorizacao(XMLGregorianCalendar value) {
        this.dataAutorizacao = value;
    }

    /**
     * Gets the value of the senhaAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAutorizacao() {
        return senhaAutorizacao;
    }

    /**
     * Sets the value of the senhaAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAutorizacao(String value) {
        this.senhaAutorizacao = value;
    }

    /**
     * Gets the value of the validadeSenha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeSenha() {
        return validadeSenha;
    }

    /**
     * Sets the value of the validadeSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeSenha(XMLGregorianCalendar value) {
        this.validadeSenha = value;
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
     * Gets the value of the planoBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanoBeneficiario() {
        return planoBeneficiario;
    }

    /**
     * Sets the value of the planoBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanoBeneficiario(String value) {
        this.planoBeneficiario = value;
    }

    /**
     * Gets the value of the nomeEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Sets the value of the nomeEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmpresa(String value) {
        this.nomeEmpresa = value;
    }

    /**
     * Gets the value of the numeroTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Sets the value of the numeroTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefone(String value) {
        this.numeroTelefone = value;
    }

    /**
     * Gets the value of the nomeTitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Sets the value of the nomeTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitular(String value) {
        this.nomeTitular = value;
    }

    /**
     * Gets the value of the dadosProfissionaisResponsaveis property.
     * 
     * @return
     *     possible object is
     *     {@link CtoGuiaOdontologia.DadosProfissionaisResponsaveis }
     *     
     */
    public CtoGuiaOdontologia.DadosProfissionaisResponsaveis getDadosProfissionaisResponsaveis() {
        return dadosProfissionaisResponsaveis;
    }

    /**
     * Sets the value of the dadosProfissionaisResponsaveis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoGuiaOdontologia.DadosProfissionaisResponsaveis }
     *     
     */
    public void setDadosProfissionaisResponsaveis(CtoGuiaOdontologia.DadosProfissionaisResponsaveis value) {
        this.dadosProfissionaisResponsaveis = value;
    }

    /**
     * Gets the value of the procedimentosExecutados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosExecutados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosExecutados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtoGuiaOdontologia.ProcedimentosExecutados }
     * 
     * 
     */
    public List<CtoGuiaOdontologia.ProcedimentosExecutados> getProcedimentosExecutados() {
        if (procedimentosExecutados == null) {
            procedimentosExecutados = new ArrayList<CtoGuiaOdontologia.ProcedimentosExecutados>();
        }
        return this.procedimentosExecutados;
    }

    /**
     * Gets the value of the dataTerminoTrat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTerminoTrat() {
        return dataTerminoTrat;
    }

    /**
     * Sets the value of the dataTerminoTrat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTerminoTrat(XMLGregorianCalendar value) {
        this.dataTerminoTrat = value;
    }

    /**
     * Gets the value of the tipoAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Sets the value of the tipoAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
    }

    /**
     * Gets the value of the tipoFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFaturamento() {
        return tipoFaturamento;
    }

    /**
     * Sets the value of the tipoFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFaturamento(String value) {
        this.tipoFaturamento = value;
    }

    /**
     * Gets the value of the qtdTotalUS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdTotalUS() {
        return qtdTotalUS;
    }

    /**
     * Sets the value of the qtdTotalUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdTotalUS(BigDecimal value) {
        this.qtdTotalUS = value;
    }

    /**
     * Gets the value of the valorTotalProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProc() {
        return valorTotalProc;
    }

    /**
     * Sets the value of the valorTotalProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProc(BigDecimal value) {
        this.valorTotalProc = value;
    }

    /**
     * Gets the value of the valorTotalFranquia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalFranquia() {
        return valorTotalFranquia;
    }

    /**
     * Sets the value of the valorTotalFranquia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalFranquia(BigDecimal value) {
        this.valorTotalFranquia = value;
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
     * Gets the value of the odontoInicial property.
     * 
     * @return
     *     possible object is
     *     {@link CtoAnexoSituacaoInicialnaGTO }
     *     
     */
    public CtoAnexoSituacaoInicialnaGTO getOdontoInicial() {
        return odontoInicial;
    }

    /**
     * Sets the value of the odontoInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAnexoSituacaoInicialnaGTO }
     *     
     */
    public void setOdontoInicial(CtoAnexoSituacaoInicialnaGTO value) {
        this.odontoInicial = value;
    }

    /**
     * Gets the value of the assinaturaDigitalGuia property.
     * 
     * @return
     *     possible object is
     *     {@link AssinaturaDigital }
     *     
     */
    public AssinaturaDigital getAssinaturaDigitalGuia() {
        return assinaturaDigitalGuia;
    }

    /**
     * Sets the value of the assinaturaDigitalGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssinaturaDigital }
     *     
     */
    public void setAssinaturaDigitalGuia(AssinaturaDigital value) {
        this.assinaturaDigitalGuia = value;
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
     *         &lt;element name="nomeProfSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
     *         &lt;element name="croSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
     *         &lt;element name="ufSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
     *         &lt;element name="cbosSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS" minOccurs="0"/>
     *         &lt;element name="codigoProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeProfExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="croExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
     *         &lt;element name="ufExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
     *         &lt;element name="cnesExec" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
     *         &lt;element name="nomeProfExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70" minOccurs="0"/>
     *         &lt;element name="croExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
     *         &lt;element name="ufExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF" minOccurs="0"/>
     *         &lt;element name="cbosExec2" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
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
        "nomeProfSolic",
        "croSolic",
        "ufSolic",
        "cbosSolic",
        "codigoProfExec",
        "nomeProfExec",
        "croExec",
        "ufExec",
        "cnesExec",
        "nomeProfExec2",
        "croExec2",
        "ufExec2",
        "cbosExec2"
    })
    public static class DadosProfissionaisResponsaveis {

        protected String nomeProfSolic;
        protected String croSolic;
        protected String ufSolic;
        protected String cbosSolic;
        @XmlElement(required = true)
        protected String codigoProfExec;
        @XmlElement(required = true)
        protected String nomeProfExec;
        @XmlElement(required = true)
        protected String croExec;
        @XmlElement(required = true)
        protected String ufExec;
        @XmlElement(required = true)
        protected String cnesExec;
        protected String nomeProfExec2;
        protected String croExec2;
        protected String ufExec2;
        @XmlElement(required = true)
        protected String cbosExec2;

        /**
         * Gets the value of the nomeProfSolic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfSolic() {
            return nomeProfSolic;
        }

        /**
         * Sets the value of the nomeProfSolic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfSolic(String value) {
            this.nomeProfSolic = value;
        }

        /**
         * Gets the value of the croSolic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroSolic() {
            return croSolic;
        }

        /**
         * Sets the value of the croSolic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroSolic(String value) {
            this.croSolic = value;
        }

        /**
         * Gets the value of the ufSolic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfSolic() {
            return ufSolic;
        }

        /**
         * Sets the value of the ufSolic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfSolic(String value) {
            this.ufSolic = value;
        }

        /**
         * Gets the value of the cbosSolic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbosSolic() {
            return cbosSolic;
        }

        /**
         * Sets the value of the cbosSolic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbosSolic(String value) {
            this.cbosSolic = value;
        }

        /**
         * Gets the value of the codigoProfExec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoProfExec() {
            return codigoProfExec;
        }

        /**
         * Sets the value of the codigoProfExec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoProfExec(String value) {
            this.codigoProfExec = value;
        }

        /**
         * Gets the value of the nomeProfExec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfExec() {
            return nomeProfExec;
        }

        /**
         * Sets the value of the nomeProfExec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfExec(String value) {
            this.nomeProfExec = value;
        }

        /**
         * Gets the value of the croExec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroExec() {
            return croExec;
        }

        /**
         * Sets the value of the croExec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroExec(String value) {
            this.croExec = value;
        }

        /**
         * Gets the value of the ufExec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfExec() {
            return ufExec;
        }

        /**
         * Sets the value of the ufExec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfExec(String value) {
            this.ufExec = value;
        }

        /**
         * Gets the value of the cnesExec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesExec() {
            return cnesExec;
        }

        /**
         * Sets the value of the cnesExec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesExec(String value) {
            this.cnesExec = value;
        }

        /**
         * Gets the value of the nomeProfExec2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfExec2() {
            return nomeProfExec2;
        }

        /**
         * Sets the value of the nomeProfExec2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfExec2(String value) {
            this.nomeProfExec2 = value;
        }

        /**
         * Gets the value of the croExec2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCroExec2() {
            return croExec2;
        }

        /**
         * Sets the value of the croExec2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCroExec2(String value) {
            this.croExec2 = value;
        }

        /**
         * Gets the value of the ufExec2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfExec2() {
            return ufExec2;
        }

        /**
         * Sets the value of the ufExec2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfExec2(String value) {
            this.ufExec2 = value;
        }

        /**
         * Gets the value of the cbosExec2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbosExec2() {
            return cbosExec2;
        }

        /**
         * Sets the value of the cbosExec2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbosExec2(String value) {
            this.cbosExec2 = value;
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
     *         &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
     *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
        "procSolic",
        "denteRegiao",
        "denteFace",
        "qtdProc",
        "qtdUS",
        "valorProc",
        "valorFranquia",
        "autorizado",
        "dataRealizacao"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected CtProcedimentoDados procSolic;
        protected CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao denteRegiao;
        protected String denteFace;
        @XmlElement(required = true)
        protected BigInteger qtdProc;
        protected BigDecimal qtdUS;
        @XmlElement(required = true)
        protected BigDecimal valorProc;
        protected BigDecimal valorFranquia;
        protected boolean autorizado;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRealizacao;

        /**
         * Gets the value of the procSolic property.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public CtProcedimentoDados getProcSolic() {
            return procSolic;
        }

        /**
         * Sets the value of the procSolic property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public void setProcSolic(CtProcedimentoDados value) {
            this.procSolic = value;
        }

        /**
         * Gets the value of the denteRegiao property.
         * 
         * @return
         *     possible object is
         *     {@link CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao }
         *     
         */
        public CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao getDenteRegiao() {
            return denteRegiao;
        }

        /**
         * Sets the value of the denteRegiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao }
         *     
         */
        public void setDenteRegiao(CtoGuiaOdontologia.ProcedimentosExecutados.DenteRegiao value) {
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
         * Gets the value of the qtdUS property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdUS() {
            return qtdUS;
        }

        /**
         * Sets the value of the qtdUS property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdUS(BigDecimal value) {
            this.qtdUS = value;
        }

        /**
         * Gets the value of the valorProc property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProc() {
            return valorProc;
        }

        /**
         * Sets the value of the valorProc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProc(BigDecimal value) {
            this.valorProc = value;
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
         * Gets the value of the autorizado property.
         * 
         */
        public boolean isAutorizado() {
            return autorizado;
        }

        /**
         * Sets the value of the autorizado property.
         * 
         */
        public void setAutorizado(boolean value) {
            this.autorizado = value;
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
