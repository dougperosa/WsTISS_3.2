
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_respostaRecursoGuiaOdonto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaRecursoGuiaOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="recursoAcatadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaRecursoGuiaOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "nomeBeneficiario",
    "codGlosaGuia",
    "justificativaGuia",
    "recursoAcatadoGuia"
})
public class CtRespostaRecursoGuiaOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected String codGlosaGuia;
    @XmlElement(required = true)
    protected String justificativaGuia;
    @XmlElement(required = true)
    protected DmSimNao recursoAcatadoGuia;

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
     * Gets the value of the codGlosaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGlosaGuia() {
        return codGlosaGuia;
    }

    /**
     * Sets the value of the codGlosaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGlosaGuia(String value) {
        this.codGlosaGuia = value;
    }

    /**
     * Gets the value of the justificativaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaGuia() {
        return justificativaGuia;
    }

    /**
     * Sets the value of the justificativaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaGuia(String value) {
        this.justificativaGuia = value;
    }

    /**
     * Gets the value of the recursoAcatadoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getRecursoAcatadoGuia() {
        return recursoAcatadoGuia;
    }

    /**
     * Sets the value of the recursoAcatadoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setRecursoAcatadoGuia(DmSimNao value) {
        this.recursoAcatadoGuia = value;
    }

}
