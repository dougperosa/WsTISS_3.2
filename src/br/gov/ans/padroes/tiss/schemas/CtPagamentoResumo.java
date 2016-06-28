
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_pagamentoResumo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_pagamentoResumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="valorTotalLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_pagamentoResumo", propOrder = {
    "numeroFatura",
    "numeroLote",
    "numeroProtocolo",
    "valorTotalLote"
})
public class CtPagamentoResumo {

    protected String numeroFatura;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected CtValorTotal valorTotalLote;

    /**
     * Gets the value of the numeroFatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFatura() {
        return numeroFatura;
    }

    /**
     * Sets the value of the numeroFatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFatura(String value) {
        this.numeroFatura = value;
    }

    /**
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

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
     * Gets the value of the valorTotalLote property.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getValorTotalLote() {
        return valorTotalLote;
    }

    /**
     * Sets the value of the valorTotalLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setValorTotalLote(CtValorTotal value) {
        this.valorTotalLote = value;
    }

}
