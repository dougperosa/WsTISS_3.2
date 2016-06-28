
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
 * <p>Java class for ctm_anexoSolicitacaoOPME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitacaoOPME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitante"/>
 *         &lt;element name="justificativaTecnica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000"/>
 *         &lt;element name="especificacaoMaterial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="opmeSolicitadas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="opmeSolicitada" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante"/>
 *                             &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *                             &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *                             &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *                             &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
 *                             &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
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
 *         &lt;element name="Observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_anexoSolicitacaoOPME", propOrder = {
    "cabecalhoAnexo",
    "dadosBeneficiario",
    "profissionalSolicitante",
    "justificativaTecnica",
    "especificacaoMaterial",
    "opmeSolicitadas",
    "observacao"
})
public class CtmAnexoSolicitacaoOPME {

    @XmlElement(required = true)
    protected CtAnexoCabecalho cabecalhoAnexo;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante profissionalSolicitante;
    @XmlElement(required = true)
    protected String justificativaTecnica;
    protected String especificacaoMaterial;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoOPME.OpmeSolicitadas opmeSolicitadas;
    @XmlElement(name = "Observacao")
    protected String observacao;

    /**
     * Gets the value of the cabecalhoAnexo property.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public CtAnexoCabecalho getCabecalhoAnexo() {
        return cabecalhoAnexo;
    }

    /**
     * Sets the value of the cabecalhoAnexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public void setCabecalhoAnexo(CtAnexoCabecalho value) {
        this.cabecalhoAnexo = value;
    }

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
     * Gets the value of the profissionalSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public CtmAnexoSolicitante getProfissionalSolicitante() {
        return profissionalSolicitante;
    }

    /**
     * Sets the value of the profissionalSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public void setProfissionalSolicitante(CtmAnexoSolicitante value) {
        this.profissionalSolicitante = value;
    }

    /**
     * Gets the value of the justificativaTecnica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaTecnica() {
        return justificativaTecnica;
    }

    /**
     * Sets the value of the justificativaTecnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaTecnica(String value) {
        this.justificativaTecnica = value;
    }

    /**
     * Gets the value of the especificacaoMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecificacaoMaterial() {
        return especificacaoMaterial;
    }

    /**
     * Sets the value of the especificacaoMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecificacaoMaterial(String value) {
        this.especificacaoMaterial = value;
    }

    /**
     * Gets the value of the opmeSolicitadas property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoOPME.OpmeSolicitadas }
     *     
     */
    public CtmAnexoSolicitacaoOPME.OpmeSolicitadas getOpmeSolicitadas() {
        return opmeSolicitadas;
    }

    /**
     * Sets the value of the opmeSolicitadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoOPME.OpmeSolicitadas }
     *     
     */
    public void setOpmeSolicitadas(CtmAnexoSolicitacaoOPME.OpmeSolicitadas value) {
        this.opmeSolicitadas = value;
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
     *         &lt;element name="opmeSolicitada" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante"/>
     *                   &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
     *                   &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
     *                   &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
     *                   &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
     *                   &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
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
        "opmeSolicitada"
    })
    public static class OpmeSolicitadas {

        @XmlElement(required = true)
        protected List<CtmAnexoSolicitacaoOPME.OpmeSolicitadas.OpmeSolicitada> opmeSolicitada;

        /**
         * Gets the value of the opmeSolicitada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the opmeSolicitada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOpmeSolicitada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmAnexoSolicitacaoOPME.OpmeSolicitadas.OpmeSolicitada }
         * 
         * 
         */
        public List<CtmAnexoSolicitacaoOPME.OpmeSolicitadas.OpmeSolicitada> getOpmeSolicitada() {
            if (opmeSolicitada == null) {
                opmeSolicitada = new ArrayList<CtmAnexoSolicitacaoOPME.OpmeSolicitadas.OpmeSolicitada>();
            }
            return this.opmeSolicitada;
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
         *         &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante"/>
         *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
         *         &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
         *         &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
         *         &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
         *         &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
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
            "opcaoFabricante",
            "quantidadeSolicitada",
            "valorSolicitado",
            "registroANVISA",
            "codigoRefFabricante",
            "autorizacaoFuncionamento"
        })
        public static class OpmeSolicitada {

            @XmlElement(required = true)
            protected CtProcedimentoDados identificacaoOPME;
            @XmlElement(required = true)
            protected String opcaoFabricante;
            @XmlElement(required = true)
            protected BigInteger quantidadeSolicitada;
            protected BigDecimal valorSolicitado;
            protected String registroANVISA;
            protected String codigoRefFabricante;
            protected String autorizacaoFuncionamento;

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
             * Gets the value of the opcaoFabricante property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpcaoFabricante() {
                return opcaoFabricante;
            }

            /**
             * Sets the value of the opcaoFabricante property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpcaoFabricante(String value) {
                this.opcaoFabricante = value;
            }

            /**
             * Gets the value of the quantidadeSolicitada property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantidadeSolicitada() {
                return quantidadeSolicitada;
            }

            /**
             * Sets the value of the quantidadeSolicitada property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantidadeSolicitada(BigInteger value) {
                this.quantidadeSolicitada = value;
            }

            /**
             * Gets the value of the valorSolicitado property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorSolicitado() {
                return valorSolicitado;
            }

            /**
             * Sets the value of the valorSolicitado property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorSolicitado(BigDecimal value) {
                this.valorSolicitado = value;
            }

            /**
             * Gets the value of the registroANVISA property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistroANVISA() {
                return registroANVISA;
            }

            /**
             * Sets the value of the registroANVISA property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistroANVISA(String value) {
                this.registroANVISA = value;
            }

            /**
             * Gets the value of the codigoRefFabricante property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoRefFabricante() {
                return codigoRefFabricante;
            }

            /**
             * Sets the value of the codigoRefFabricante property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoRefFabricante(String value) {
                this.codigoRefFabricante = value;
            }

            /**
             * Gets the value of the autorizacaoFuncionamento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAutorizacaoFuncionamento() {
                return autorizacaoFuncionamento;
            }

            /**
             * Sets the value of the autorizacaoFuncionamento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAutorizacaoFuncionamento(String value) {
                this.autorizacaoFuncionamento = value;
            }

        }

    }

}
