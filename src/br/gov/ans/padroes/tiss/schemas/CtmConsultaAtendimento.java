
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctm_consultaAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_consultaAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoConsulta"/>
 *         &lt;element name="procedimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
 *                   &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
 *                   &lt;element name="valorProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
@XmlType(name = "ctm_consultaAtendimento", propOrder = {
    "dataAtendimento",
    "tipoConsulta",
    "procedimento"
})
public class CtmConsultaAtendimento {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataAtendimento;
    @XmlElement(required = true)
    protected String tipoConsulta;
    @XmlElement(required = true)
    protected CtmConsultaAtendimento.Procedimento procedimento;

    /**
     * Gets the value of the dataAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtendimento() {
        return dataAtendimento;
    }

    /**
     * Sets the value of the dataAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtendimento(XMLGregorianCalendar value) {
        this.dataAtendimento = value;
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
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtmConsultaAtendimento.Procedimento }
     *     
     */
    public CtmConsultaAtendimento.Procedimento getProcedimento() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmConsultaAtendimento.Procedimento }
     *     
     */
    public void setProcedimento(CtmConsultaAtendimento.Procedimento value) {
        this.procedimento = value;
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
     *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
     *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
     *         &lt;element name="valorProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
        "codigoTabela",
        "codigoProcedimento",
        "valorProcedimento"
    })
    public static class Procedimento {

        @XmlElement(required = true)
        protected String codigoTabela;
        @XmlElement(required = true)
        protected String codigoProcedimento;
        @XmlElement(required = true)
        protected BigDecimal valorProcedimento;

        /**
         * Gets the value of the codigoTabela property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTabela() {
            return codigoTabela;
        }

        /**
         * Sets the value of the codigoTabela property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTabela(String value) {
            this.codigoTabela = value;
        }

        /**
         * Gets the value of the codigoProcedimento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoProcedimento() {
            return codigoProcedimento;
        }

        /**
         * Sets the value of the codigoProcedimento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoProcedimento(String value) {
            this.codigoProcedimento = value;
        }

        /**
         * Gets the value of the valorProcedimento property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProcedimento() {
            return valorProcedimento;
        }

        /**
         * Sets the value of the valorProcedimento property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProcedimento(BigDecimal value) {
            this.valorProcedimento = value;
        }

    }

}
