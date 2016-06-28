
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura da resposta da operadora a um lote de anexos
 * 
 * <p>Java class for ct_anexoLote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_anexoLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="AnexosGuiasTISS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
 *                   &lt;element name="anexoSolicitacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio"/>
 *                   &lt;element name="anexoSolicitacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio"/>
 *                   &lt;element name="anexoSolicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME"/>
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
@XmlType(name = "ct_anexoLote", propOrder = {
    "numeroLote",
    "anexosGuiasTISS"
})
public class CtAnexoLote {

    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(name = "AnexosGuiasTISS", required = true)
    protected CtAnexoLote.AnexosGuiasTISS anexosGuiasTISS;

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
     * Gets the value of the anexosGuiasTISS property.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoLote.AnexosGuiasTISS }
     *     
     */
    public CtAnexoLote.AnexosGuiasTISS getAnexosGuiasTISS() {
        return anexosGuiasTISS;
    }

    /**
     * Sets the value of the anexosGuiasTISS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoLote.AnexosGuiasTISS }
     *     
     */
    public void setAnexosGuiasTISS(CtAnexoLote.AnexosGuiasTISS value) {
        this.anexosGuiasTISS = value;
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
     *         &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_anexoSituacaoInicial" maxOccurs="100"/>
     *         &lt;element name="anexoSolicitacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoRadio"/>
     *         &lt;element name="anexoSolicitacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoQuimio"/>
     *         &lt;element name="anexoSolicitacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitacaoOPME"/>
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
        "anexoSituacaoInicial",
        "anexoSolicitacaoRadio",
        "anexoSolicitacaoQuimio",
        "anexoSolicitacaoOPME"
    })
    public static class AnexosGuiasTISS {

        protected List<CtoAnexoSituacaoInicial> anexoSituacaoInicial;
        protected CtmAnexoSolicitacaoRadio anexoSolicitacaoRadio;
        protected CtmAnexoSolicitacaoQuimio anexoSolicitacaoQuimio;
        protected CtmAnexoSolicitacaoOPME anexoSolicitacaoOPME;

        /**
         * Gets the value of the anexoSituacaoInicial property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anexoSituacaoInicial property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnexoSituacaoInicial().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoAnexoSituacaoInicial }
         * 
         * 
         */
        public List<CtoAnexoSituacaoInicial> getAnexoSituacaoInicial() {
            if (anexoSituacaoInicial == null) {
                anexoSituacaoInicial = new ArrayList<CtoAnexoSituacaoInicial>();
            }
            return this.anexoSituacaoInicial;
        }

        /**
         * Gets the value of the anexoSolicitacaoRadio property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public CtmAnexoSolicitacaoRadio getAnexoSolicitacaoRadio() {
            return anexoSolicitacaoRadio;
        }

        /**
         * Sets the value of the anexoSolicitacaoRadio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoRadio }
         *     
         */
        public void setAnexoSolicitacaoRadio(CtmAnexoSolicitacaoRadio value) {
            this.anexoSolicitacaoRadio = value;
        }

        /**
         * Gets the value of the anexoSolicitacaoQuimio property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public CtmAnexoSolicitacaoQuimio getAnexoSolicitacaoQuimio() {
            return anexoSolicitacaoQuimio;
        }

        /**
         * Sets the value of the anexoSolicitacaoQuimio property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoQuimio }
         *     
         */
        public void setAnexoSolicitacaoQuimio(CtmAnexoSolicitacaoQuimio value) {
            this.anexoSolicitacaoQuimio = value;
        }

        /**
         * Gets the value of the anexoSolicitacaoOPME property.
         * 
         * @return
         *     possible object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public CtmAnexoSolicitacaoOPME getAnexoSolicitacaoOPME() {
            return anexoSolicitacaoOPME;
        }

        /**
         * Sets the value of the anexoSolicitacaoOPME property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAnexoSolicitacaoOPME }
         *     
         */
        public void setAnexoSolicitacaoOPME(CtmAnexoSolicitacaoOPME value) {
            this.anexoSolicitacaoOPME = value;
        }

    }

}
