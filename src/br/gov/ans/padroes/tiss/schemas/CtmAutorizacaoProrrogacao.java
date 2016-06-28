
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_autorizacaoProrrogacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoProrrogacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacaoDosServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="diariasAutorizadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2" minOccurs="0"/>
 *         &lt;element name="acomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
 *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoProrrogacao", propOrder = {
    "autorizacaoDosServicos",
    "diariasAutorizadas",
    "acomodacaoAutorizada",
    "justificativaOperadora"
})
public class CtmAutorizacaoProrrogacao {

    @XmlElement(required = true)
    protected CtmAutorizacaoServico autorizacaoDosServicos;
    protected BigInteger diariasAutorizadas;
    protected String acomodacaoAutorizada;
    protected String justificativaOperadora;

    /**
     * Gets the value of the autorizacaoDosServicos property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoDosServicos() {
        return autorizacaoDosServicos;
    }

    /**
     * Sets the value of the autorizacaoDosServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoDosServicos(CtmAutorizacaoServico value) {
        this.autorizacaoDosServicos = value;
    }

    /**
     * Gets the value of the diariasAutorizadas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiariasAutorizadas() {
        return diariasAutorizadas;
    }

    /**
     * Sets the value of the diariasAutorizadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiariasAutorizadas(BigInteger value) {
        this.diariasAutorizadas = value;
    }

    /**
     * Gets the value of the acomodacaoAutorizada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcomodacaoAutorizada() {
        return acomodacaoAutorizada;
    }

    /**
     * Sets the value of the acomodacaoAutorizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcomodacaoAutorizada(String value) {
        this.acomodacaoAutorizada = value;
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
