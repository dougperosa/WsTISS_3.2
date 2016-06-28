
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_protocoloDetalheAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloDetalheAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="valorTotalProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="glosasProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vlGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="dadosGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosAnexo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloDetalheAnexo", propOrder = {
    "numeroProtocolo",
    "valorTotalProtocolo",
    "glosasProtocolo",
    "vlGlosaProtocolo",
    "dadosGuias"
})
public class CtProtocoloDetalheAnexo {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProtocolo;
    protected List<CtMotivoGlosa> glosasProtocolo;
    protected BigDecimal vlGlosaProtocolo;
    @XmlElement(required = true)
    protected List<CtGuiaDadosAnexo> dadosGuias;

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
     * Gets the value of the valorTotalProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProtocolo() {
        return valorTotalProtocolo;
    }

    /**
     * Sets the value of the valorTotalProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProtocolo(BigDecimal value) {
        this.valorTotalProtocolo = value;
    }

    /**
     * Gets the value of the glosasProtocolo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glosasProtocolo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlosasProtocolo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtMotivoGlosa }
     * 
     * 
     */
    public List<CtMotivoGlosa> getGlosasProtocolo() {
        if (glosasProtocolo == null) {
            glosasProtocolo = new ArrayList<CtMotivoGlosa>();
        }
        return this.glosasProtocolo;
    }

    /**
     * Gets the value of the vlGlosaProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlGlosaProtocolo() {
        return vlGlosaProtocolo;
    }

    /**
     * Sets the value of the vlGlosaProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlGlosaProtocolo(BigDecimal value) {
        this.vlGlosaProtocolo = value;
    }

    /**
     * Gets the value of the dadosGuias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosGuias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtGuiaDadosAnexo }
     * 
     * 
     */
    public List<CtGuiaDadosAnexo> getDadosGuias() {
        if (dadosGuias == null) {
            dadosGuias = new ArrayList<CtGuiaDadosAnexo>();
        }
        return this.dadosGuias;
    }

}
