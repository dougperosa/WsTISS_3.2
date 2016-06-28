
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_pagamentoDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_pagamentoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="formaPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_formaPagamento"/>
 *         &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
 *         &lt;element name="nrContaCheque" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_pagamentoDados", propOrder = {
    "dataPagamento",
    "formaPagamento",
    "banco",
    "agencia",
    "nrContaCheque"
})
public class CtPagamentoDados {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataPagamento;
    @XmlElement(required = true)
    protected String formaPagamento;
    protected String banco;
    protected String agencia;
    protected String nrContaCheque;

    /**
     * Gets the value of the dataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Sets the value of the dataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the formaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Sets the value of the formaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagamento(String value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the banco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Sets the value of the banco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Gets the value of the agencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Sets the value of the agencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Gets the value of the nrContaCheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrContaCheque() {
        return nrContaCheque;
    }

    /**
     * Sets the value of the nrContaCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrContaCheque(String value) {
        this.nrContaCheque = value;
    }

}
