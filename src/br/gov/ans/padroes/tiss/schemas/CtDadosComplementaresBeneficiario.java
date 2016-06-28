
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_dadosComplementaresBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosComplementaresBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *         &lt;element name="altura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *         &lt;element name="superficieCorporal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal4-2"/>
 *         &lt;element name="idade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="sexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_sexo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosComplementaresBeneficiario", propOrder = {
    "peso",
    "altura",
    "superficieCorporal",
    "idade",
    "sexo"
})
public class CtDadosComplementaresBeneficiario {

    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    protected BigDecimal altura;
    @XmlElement(required = true)
    protected BigDecimal superficieCorporal;
    @XmlElement(required = true)
    protected BigInteger idade;
    @XmlElement(required = true)
    protected String sexo;

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Gets the value of the altura property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltura() {
        return altura;
    }

    /**
     * Sets the value of the altura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltura(BigDecimal value) {
        this.altura = value;
    }

    /**
     * Gets the value of the superficieCorporal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuperficieCorporal() {
        return superficieCorporal;
    }

    /**
     * Sets the value of the superficieCorporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuperficieCorporal(BigDecimal value) {
        this.superficieCorporal = value;
    }

    /**
     * Gets the value of the idade property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdade() {
        return idade;
    }

    /**
     * Sets the value of the idade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdade(BigInteger value) {
        this.idade = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

}
