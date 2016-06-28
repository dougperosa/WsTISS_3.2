
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cto_anexoSituacaoInicial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cto_anexoSituacaoInicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaReferenciada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="ct_situacaoInicial">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
 *                   &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
@XmlType(name = "cto_anexoSituacaoInicial", propOrder = {
    "registroANS",
    "numeroGuiaAnexo",
    "numeroGuiaReferenciada",
    "numeroGuiaOperadora",
    "nomeBeneficiario",
    "numeroCarteira",
    "ctSituacaoInicial"
})
public class CtoAnexoSituacaoInicial {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaAnexo;
    @XmlElement(required = true)
    protected String numeroGuiaReferenciada;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(name = "ct_situacaoInicial", required = true)
    protected CtoAnexoSituacaoInicial.CtSituacaoInicial ctSituacaoInicial;

    /**
     * Gets the value of the registroANS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANS() {
        return registroANS;
    }

    /**
     * Sets the value of the registroANS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANS(String value) {
        this.registroANS = value;
    }

    /**
     * Gets the value of the numeroGuiaAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaAnexo() {
        return numeroGuiaAnexo;
    }

    /**
     * Sets the value of the numeroGuiaAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaAnexo(String value) {
        this.numeroGuiaAnexo = value;
    }

    /**
     * Gets the value of the numeroGuiaReferenciada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaReferenciada() {
        return numeroGuiaReferenciada;
    }

    /**
     * Sets the value of the numeroGuiaReferenciada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaReferenciada(String value) {
        this.numeroGuiaReferenciada = value;
    }

    /**
     * Gets the value of the numeroGuiaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Sets the value of the numeroGuiaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Gets the value of the nomeBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    /**
     * Sets the value of the nomeBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBeneficiario(String value) {
        this.nomeBeneficiario = value;
    }

    /**
     * Gets the value of the numeroCarteira property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    /**
     * Sets the value of the numeroCarteira property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarteira(String value) {
        this.numeroCarteira = value;
    }

    /**
     * Gets the value of the ctSituacaoInicial property.
     * 
     * @return
     *     possible object is
     *     {@link CtoAnexoSituacaoInicial.CtSituacaoInicial }
     *     
     */
    public CtoAnexoSituacaoInicial.CtSituacaoInicial getCtSituacaoInicial() {
        return ctSituacaoInicial;
    }

    /**
     * Sets the value of the ctSituacaoInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAnexoSituacaoInicial.CtSituacaoInicial }
     *     
     */
    public void setCtSituacaoInicial(CtoAnexoSituacaoInicial.CtSituacaoInicial value) {
        this.ctSituacaoInicial = value;
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
     *         &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
     *         &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
        "situacaoClinica",
        "doencaPeriodontal",
        "alteracaoTecidoMole",
        "observacao"
    })
    public static class CtSituacaoInicial {

        @XmlElement(required = true)
        protected CtSituacaoClinica situacaoClinica;
        protected boolean doencaPeriodontal;
        protected boolean alteracaoTecidoMole;
        protected String observacao;

        /**
         * Gets the value of the situacaoClinica property.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public CtSituacaoClinica getSituacaoClinica() {
            return situacaoClinica;
        }

        /**
         * Sets the value of the situacaoClinica property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public void setSituacaoClinica(CtSituacaoClinica value) {
            this.situacaoClinica = value;
        }

        /**
         * Gets the value of the doencaPeriodontal property.
         * 
         */
        public boolean isDoencaPeriodontal() {
            return doencaPeriodontal;
        }

        /**
         * Sets the value of the doencaPeriodontal property.
         * 
         */
        public void setDoencaPeriodontal(boolean value) {
            this.doencaPeriodontal = value;
        }

        /**
         * Gets the value of the alteracaoTecidoMole property.
         * 
         */
        public boolean isAlteracaoTecidoMole() {
            return alteracaoTecidoMole;
        }

        /**
         * Sets the value of the alteracaoTecidoMole property.
         * 
         */
        public void setAlteracaoTecidoMole(boolean value) {
            this.alteracaoTecidoMole = value;
        }

        /**
         * Gets the value of the observacao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObservacao() {
            return observacao;
        }

        /**
         * Sets the value of the observacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObservacao(String value) {
            this.observacao = value;
        }

    }

}
