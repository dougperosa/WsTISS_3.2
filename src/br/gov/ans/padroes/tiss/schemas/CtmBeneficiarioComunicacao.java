
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctm_beneficiarioComunicacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_beneficiarioComunicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoEvento"/>
 *         &lt;element name="dadosInternacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaida"/>
 *                   &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
 *                 &lt;/choice>
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
@XmlType(name = "ctm_beneficiarioComunicacao", propOrder = {
    "dadosBeneficiario",
    "dataEvento",
    "tipoEvento",
    "dadosInternacao"
})
public class CtmBeneficiarioComunicacao {

    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEvento;
    @XmlElement(required = true)
    protected DmTipoEvento tipoEvento;
    @XmlElement(required = true)
    protected CtmBeneficiarioComunicacao.DadosInternacao dadosInternacao;

    /**
     * Gets the value of the dadosBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Sets the value of the dadosBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Gets the value of the dataEvento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvento() {
        return dataEvento;
    }

    /**
     * Sets the value of the dataEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvento(XMLGregorianCalendar value) {
        this.dataEvento = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipoEvento }
     *     
     */
    public DmTipoEvento getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipoEvento }
     *     
     */
    public void setTipoEvento(DmTipoEvento value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the dadosInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao.DadosInternacao }
     *     
     */
    public CtmBeneficiarioComunicacao.DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Sets the value of the dadosInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao.DadosInternacao }
     *     
     */
    public void setDadosInternacao(CtmBeneficiarioComunicacao.DadosInternacao value) {
        this.dadosInternacao = value;
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
     *         &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaida"/>
     *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
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
        "motivoEncerramento",
        "tipoInternacao"
    })
    public static class DadosInternacao {

        protected String motivoEncerramento;
        protected String tipoInternacao;

        /**
         * Gets the value of the motivoEncerramento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoEncerramento() {
            return motivoEncerramento;
        }

        /**
         * Sets the value of the motivoEncerramento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoEncerramento(String value) {
            this.motivoEncerramento = value;
        }

        /**
         * Gets the value of the tipoInternacao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoInternacao() {
            return tipoInternacao;
        }

        /**
         * Sets the value of the tipoInternacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoInternacao(String value) {
            this.tipoInternacao = value;
        }

    }

}
