
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_opmUtilizada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_opmUtilizada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPM">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoOPM" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                             &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                             &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotalOPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_opmUtilizada", propOrder = {
    "opm",
    "valorTotalOPM"
})
public class CtOpmUtilizada {

    @XmlElement(name = "OPM", required = true)
    protected CtOpmUtilizada.OPM opm;
    protected BigDecimal valorTotalOPM;

    /**
     * Gets the value of the opm property.
     * 
     * @return
     *     possible object is
     *     {@link CtOpmUtilizada.OPM }
     *     
     */
    public CtOpmUtilizada.OPM getOPM() {
        return opm;
    }

    /**
     * Sets the value of the opm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOpmUtilizada.OPM }
     *     
     */
    public void setOPM(CtOpmUtilizada.OPM value) {
        this.opm = value;
    }

    /**
     * Gets the value of the valorTotalOPM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalOPM() {
        return valorTotalOPM;
    }

    /**
     * Sets the value of the valorTotalOPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalOPM(BigDecimal value) {
        this.valorTotalOPM = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="identificacaoOPM" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *                   &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                   &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identificacaoOPM"
    })
    public static class OPM {

        @XmlElement(required = true)
        protected List<CtOpmUtilizada.OPM.IdentificacaoOPM> identificacaoOPM;

        /**
         * Gets the value of the identificacaoOPM property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificacaoOPM property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificacaoOPM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtOpmUtilizada.OPM.IdentificacaoOPM }
         * 
         * 
         */
        public List<CtOpmUtilizada.OPM.IdentificacaoOPM> getIdentificacaoOPM() {
            if (identificacaoOPM == null) {
                identificacaoOPM = new ArrayList<CtOpmUtilizada.OPM.IdentificacaoOPM>();
            }
            return this.identificacaoOPM;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
         *         &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
         *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identificacaoOPME",
            "quantidade",
            "codigoBarra",
            "valorUnitario",
            "valorTotal"
        })
        public static class IdentificacaoOPM {

            @XmlElement(required = true)
            protected CtProcedimentoDados identificacaoOPME;
            @XmlElement(required = true)
            protected BigInteger quantidade;
            protected String codigoBarra;
            protected BigDecimal valorUnitario;
            protected BigDecimal valorTotal;

            /**
             * Gets the value of the identificacaoOPME property.
             * 
             * @return
             *     possible object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public CtProcedimentoDados getIdentificacaoOPME() {
                return identificacaoOPME;
            }

            /**
             * Sets the value of the identificacaoOPME property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public void setIdentificacaoOPME(CtProcedimentoDados value) {
                this.identificacaoOPME = value;
            }

            /**
             * Gets the value of the quantidade property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantidade() {
                return quantidade;
            }

            /**
             * Sets the value of the quantidade property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantidade(BigInteger value) {
                this.quantidade = value;
            }

            /**
             * Gets the value of the codigoBarra property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoBarra() {
                return codigoBarra;
            }

            /**
             * Sets the value of the codigoBarra property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoBarra(String value) {
                this.codigoBarra = value;
            }

            /**
             * Gets the value of the valorUnitario property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Sets the value of the valorUnitario property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorUnitario(BigDecimal value) {
                this.valorUnitario = value;
            }

            /**
             * Gets the value of the valorTotal property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorTotal() {
                return valorTotal;
            }

            /**
             * Sets the value of the valorTotal property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorTotal(BigDecimal value) {
                this.valorTotal = value;
            }

        }

    }

}
