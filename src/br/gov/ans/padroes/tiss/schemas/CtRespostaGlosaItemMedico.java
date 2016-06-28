
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_respostaGlosaItemMedico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaGlosaItemMedico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="codGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="valorAcatadado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaGlosaItemMedico", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "dataRealizacao",
    "dataFim",
    "procRecurso",
    "codGlosa",
    "valorRecursado",
    "justificativaPrestador",
    "valorAcatadado",
    "justificativaOperadora"
})
public class CtRespostaGlosaItemMedico {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRealizacao;
    protected XMLGregorianCalendar dataFim;
    @XmlElement(required = true)
    protected CtProcedimentoDados procRecurso;
    @XmlElement(required = true)
    protected String codGlosa;
    @XmlElement(required = true)
    protected BigDecimal valorRecursado;
    @XmlElement(required = true)
    protected String justificativaPrestador;
    @XmlElement(required = true)
    protected BigDecimal valorAcatadado;
    protected String justificativaOperadora;

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
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
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
     * Gets the value of the dataFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Sets the value of the dataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

    /**
     * Gets the value of the procRecurso property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcRecurso() {
        return procRecurso;
    }

    /**
     * Sets the value of the procRecurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcRecurso(CtProcedimentoDados value) {
        this.procRecurso = value;
    }

    /**
     * Gets the value of the codGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGlosa() {
        return codGlosa;
    }

    /**
     * Sets the value of the codGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGlosa(String value) {
        this.codGlosa = value;
    }

    /**
     * Gets the value of the valorRecursado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRecursado() {
        return valorRecursado;
    }

    /**
     * Sets the value of the valorRecursado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRecursado(BigDecimal value) {
        this.valorRecursado = value;
    }

    /**
     * Gets the value of the justificativaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaPrestador() {
        return justificativaPrestador;
    }

    /**
     * Sets the value of the justificativaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaPrestador(String value) {
        this.justificativaPrestador = value;
    }

    /**
     * Gets the value of the valorAcatadado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAcatadado() {
        return valorAcatadado;
    }

    /**
     * Sets the value of the valorAcatadado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAcatadado(BigDecimal value) {
        this.valorAcatadado = value;
    }

    /**
     * Gets the value of the justificativaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaOperadora() {
        return justificativaOperadora;
    }

    /**
     * Sets the value of the justificativaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaOperadora(String value) {
        this.justificativaOperadora = value;
    }

}
