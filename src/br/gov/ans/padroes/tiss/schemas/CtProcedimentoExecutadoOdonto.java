
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_procedimentoExecutadoOdonto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutadoOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="denteRegiao" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2" minOccurs="0"/>
 *         &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoExecutadoOdonto", propOrder = {
    "procedimento",
    "denteRegiao",
    "denteFace",
    "qtdProc",
    "qtdUS",
    "valorProc",
    "valorFranquia",
    "autorizado",
    "dataRealizacao"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.class
})
public class CtProcedimentoExecutadoOdonto {

    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    protected CtProcedimentoExecutadoOdonto.DenteRegiao denteRegiao;
    protected String denteFace;
    protected BigInteger qtdProc;
    protected BigDecimal qtdUS;
    protected BigDecimal valorProc;
    protected BigDecimal valorFranquia;
    protected DmSimNao autorizado;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRealizacao;

    /**
     * Gets the value of the procedimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcedimento() {
        return procedimento;
    }

    /**
     * Sets the value of the procedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcedimento(CtProcedimentoDados value) {
        this.procedimento = value;
    }

    /**
     * Gets the value of the denteRegiao property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoExecutadoOdonto.DenteRegiao }
     *     
     */
    public CtProcedimentoExecutadoOdonto.DenteRegiao getDenteRegiao() {
        return denteRegiao;
    }

    /**
     * Sets the value of the denteRegiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoExecutadoOdonto.DenteRegiao }
     *     
     */
    public void setDenteRegiao(CtProcedimentoExecutadoOdonto.DenteRegiao value) {
        this.denteRegiao = value;
    }

    /**
     * Gets the value of the denteFace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenteFace() {
        return denteFace;
    }

    /**
     * Sets the value of the denteFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenteFace(String value) {
        this.denteFace = value;
    }

    /**
     * Gets the value of the qtdProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdProc() {
        return qtdProc;
    }

    /**
     * Sets the value of the qtdProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdProc(BigInteger value) {
        this.qtdProc = value;
    }

    /**
     * Gets the value of the qtdUS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdUS() {
        return qtdUS;
    }

    /**
     * Sets the value of the qtdUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdUS(BigDecimal value) {
        this.qtdUS = value;
    }

    /**
     * Gets the value of the valorProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProc() {
        return valorProc;
    }

    /**
     * Sets the value of the valorProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProc(BigDecimal value) {
        this.valorProc = value;
    }

    /**
     * Gets the value of the valorFranquia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFranquia() {
        return valorFranquia;
    }

    /**
     * Sets the value of the valorFranquia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFranquia(BigDecimal value) {
        this.valorFranquia = value;
    }

    /**
     * Gets the value of the autorizado property.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getAutorizado() {
        return autorizado;
    }

    /**
     * Sets the value of the autorizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setAutorizado(DmSimNao value) {
        this.autorizado = value;
    }

    /**
     * Gets the value of the dataRealizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    /**
     * Sets the value of the dataRealizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRealizacao(XMLGregorianCalendar value) {
        this.dataRealizacao = value;
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
     *       &lt;choice>
     *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codDente",
        "codRegiao"
    })
    public static class DenteRegiao {

        protected String codDente;
        protected DmRegiao codRegiao;

        /**
         * Gets the value of the codDente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodDente() {
            return codDente;
        }

        /**
         * Sets the value of the codDente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodDente(String value) {
            this.codDente = value;
        }

        /**
         * Gets the value of the codRegiao property.
         * 
         * @return
         *     possible object is
         *     {@link DmRegiao }
         *     
         */
        public DmRegiao getCodRegiao() {
            return codRegiao;
        }

        /**
         * Sets the value of the codRegiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmRegiao }
         *     
         */
        public void setCodRegiao(DmRegiao value) {
            this.codRegiao = value;
        }

    }

}
