
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_beneficiarioDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_beneficiarioDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_beneficiarioDados", propOrder = {
    "numeroCarteira",
    "atendimentoRN",
    "nomeBeneficiario",
    "numeroCNS",
    "identificadorBeneficiario"
})
public class CtBeneficiarioDados {

    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected DmSimNao atendimentoRN;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    protected byte[] identificadorBeneficiario;

    /**
     * Gets the value of the numeroCarteira property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    /**
     * Sets the value of the numeroCarteira property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarteira(String value) {
        this.numeroCarteira = value;
    }

    /**
     * Gets the value of the atendimentoRN property.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getAtendimentoRN() {
        return atendimentoRN;
    }

    /**
     * Sets the value of the atendimentoRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setAtendimentoRN(DmSimNao value) {
        this.atendimentoRN = value;
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
     * Gets the value of the numeroCNS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Sets the value of the numeroCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
    }

    /**
     * Gets the value of the identificadorBeneficiario property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    /**
     * Sets the value of the identificadorBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIdentificadorBeneficiario(byte[] value) {
        this.identificadorBeneficiario = ((byte[]) value);
    }

}
