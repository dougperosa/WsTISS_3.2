
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_guiaValorTotalSADT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaValorTotalSADT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorProcedimentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorTaxasAlugueis" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorMateriais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorMedicamentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorGasesMedicinais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorTotalGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaValorTotalSADT", propOrder = {
    "valorProcedimentos",
    "valorTaxasAlugueis",
    "valorMateriais",
    "valorMedicamentos",
    "valorOPME",
    "valorGasesMedicinais",
    "valorTotalGeral"
})
public class CtGuiaValorTotalSADT {

    protected BigDecimal valorProcedimentos;
    protected BigDecimal valorTaxasAlugueis;
    protected BigDecimal valorMateriais;
    protected BigDecimal valorMedicamentos;
    protected BigDecimal valorOPME;
    protected BigDecimal valorGasesMedicinais;
    @XmlElement(required = true)
    protected BigDecimal valorTotalGeral;

    /**
     * Gets the value of the valorProcedimentos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcedimentos() {
        return valorProcedimentos;
    }

    /**
     * Sets the value of the valorProcedimentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcedimentos(BigDecimal value) {
        this.valorProcedimentos = value;
    }

    /**
     * Gets the value of the valorTaxasAlugueis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTaxasAlugueis() {
        return valorTaxasAlugueis;
    }

    /**
     * Sets the value of the valorTaxasAlugueis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTaxasAlugueis(BigDecimal value) {
        this.valorTaxasAlugueis = value;
    }

    /**
     * Gets the value of the valorMateriais property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMateriais() {
        return valorMateriais;
    }

    /**
     * Sets the value of the valorMateriais property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMateriais(BigDecimal value) {
        this.valorMateriais = value;
    }

    /**
     * Gets the value of the valorMedicamentos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMedicamentos() {
        return valorMedicamentos;
    }

    /**
     * Sets the value of the valorMedicamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMedicamentos(BigDecimal value) {
        this.valorMedicamentos = value;
    }

    /**
     * Gets the value of the valorOPME property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorOPME() {
        return valorOPME;
    }

    /**
     * Sets the value of the valorOPME property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorOPME(BigDecimal value) {
        this.valorOPME = value;
    }

    /**
     * Gets the value of the valorGasesMedicinais property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGasesMedicinais() {
        return valorGasesMedicinais;
    }

    /**
     * Sets the value of the valorGasesMedicinais property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGasesMedicinais(BigDecimal value) {
        this.valorGasesMedicinais = value;
    }

    /**
     * Gets the value of the valorTotalGeral property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGeral() {
        return valorTotalGeral;
    }

    /**
     * Sets the value of the valorTotalGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGeral(BigDecimal value) {
        this.valorTotalGeral = value;
    }

}
