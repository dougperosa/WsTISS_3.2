
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_sp-sadtAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAtendimento"/>
 *         &lt;element name="indicacaoAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *         &lt;element name="tipoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoConsulta" minOccurs="0"/>
 *         &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaidaObito" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_sp-sadtAtendimento", propOrder = {
    "tipoAtendimento",
    "indicacaoAcidente",
    "tipoConsulta",
    "motivoEncerramento"
})
public class CtmSpSadtAtendimento {

    @XmlElement(required = true)
    protected String tipoAtendimento;
    @XmlElement(required = true)
    protected String indicacaoAcidente;
    protected String tipoConsulta;
    protected String motivoEncerramento;

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
     * Gets the value of the indicacaoAcidente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoAcidente() {
        return indicacaoAcidente;
    }

    /**
     * Sets the value of the indicacaoAcidente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoAcidente(String value) {
        this.indicacaoAcidente = value;
    }

    /**
     * Gets the value of the tipoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the motivoEncerramento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEncerramento() {
        return motivoEncerramento;
    }

    /**
     * Sets the value of the motivoEncerramento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEncerramento(String value) {
        this.motivoEncerramento = value;
    }

}
