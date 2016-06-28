
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_descontos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_descontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_debitoCreditoIndicador"/>
 *         &lt;element name="tipoDebitoCredito" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_debitoCreditoTipo"/>
 *         &lt;element name="descricaoDbCr" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40"/>
 *         &lt;element name="valorDbCr" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_descontos", propOrder = {
    "indicador",
    "tipoDebitoCredito",
    "descricaoDbCr",
    "valorDbCr"
})
public class CtDescontos {

    @XmlElement(required = true)
    protected String indicador;
    @XmlElement(required = true)
    protected String tipoDebitoCredito;
    @XmlElement(required = true)
    protected String descricaoDbCr;
    @XmlElement(required = true)
    protected BigDecimal valorDbCr;

    /**
     * Gets the value of the indicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Sets the value of the indicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

    /**
     * Gets the value of the tipoDebitoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDebitoCredito() {
        return tipoDebitoCredito;
    }

    /**
     * Sets the value of the tipoDebitoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDebitoCredito(String value) {
        this.tipoDebitoCredito = value;
    }

    /**
     * Gets the value of the descricaoDbCr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDbCr() {
        return descricaoDbCr;
    }

    /**
     * Sets the value of the descricaoDbCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDbCr(String value) {
        this.descricaoDbCr = value;
    }

    /**
     * Gets the value of the valorDbCr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDbCr() {
        return valorDbCr;
    }

    /**
     * Sets the value of the valorDbCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDbCr(BigDecimal value) {
        this.valorDbCr = value;
    }

}
