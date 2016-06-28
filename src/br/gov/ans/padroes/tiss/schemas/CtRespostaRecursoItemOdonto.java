
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_respostaRecursoItemOdonto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaRecursoItemOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="recursoProcedimento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="denteRegiao" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                   &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                   &lt;element name="valorAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
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
@XmlType(name = "ct_respostaRecursoItemOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "nomeBeneficiario",
    "recursoProcedimento"
})
public class CtRespostaRecursoItemOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected List<CtRespostaRecursoItemOdonto.RecursoProcedimento> recursoProcedimento;

    /**
     * Gets the value of the numeroGuiaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Sets the value of the numeroGuiaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
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
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
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
     * Gets the value of the recursoProcedimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recursoProcedimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecursoProcedimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtRespostaRecursoItemOdonto.RecursoProcedimento }
     * 
     * 
     */
    public List<CtRespostaRecursoItemOdonto.RecursoProcedimento> getRecursoProcedimento() {
        if (recursoProcedimento == null) {
            recursoProcedimento = new ArrayList<CtRespostaRecursoItemOdonto.RecursoProcedimento>();
        }
        return this.recursoProcedimento;
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
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
     *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *         &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *         &lt;element name="valorAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
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
        "dataRealizacao",
        "denteRegiao",
        "denteFace",
        "quantidade",
        "procRecurso",
        "codGlosaProc",
        "valorRecursado",
        "justificativaPrestador",
        "valorAcatado",
        "justificativaOperadora"
    })
    public static class RecursoProcedimento {

        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRealizacao;
        protected CtRespostaRecursoItemOdonto.RecursoProcedimento.DenteRegiao denteRegiao;
        protected String denteFace;
        @XmlElement(required = true)
        protected BigInteger quantidade;
        @XmlElement(required = true)
        protected CtProcedimentoDados procRecurso;
        @XmlElement(required = true)
        protected String codGlosaProc;
        @XmlElement(required = true)
        protected BigDecimal valorRecursado;
        @XmlElement(required = true)
        protected String justificativaPrestador;
        @XmlElement(required = true)
        protected BigDecimal valorAcatado;
        protected String justificativaOperadora;

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
         * Gets the value of the denteRegiao property.
         * 
         * @return
         *     possible object is
         *     {@link CtRespostaRecursoItemOdonto.RecursoProcedimento.DenteRegiao }
         *     
         */
        public CtRespostaRecursoItemOdonto.RecursoProcedimento.DenteRegiao getDenteRegiao() {
            return denteRegiao;
        }

        /**
         * Sets the value of the denteRegiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtRespostaRecursoItemOdonto.RecursoProcedimento.DenteRegiao }
         *     
         */
        public void setDenteRegiao(CtRespostaRecursoItemOdonto.RecursoProcedimento.DenteRegiao value) {
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
         * Gets the value of the procRecurso property.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public CtProcedimentoDados getProcRecurso() {
            return procRecurso;
        }

        /**
         * Sets the value of the procRecurso property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public void setProcRecurso(CtProcedimentoDados value) {
            this.procRecurso = value;
        }

        /**
         * Gets the value of the codGlosaProc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodGlosaProc() {
            return codGlosaProc;
        }

        /**
         * Sets the value of the codGlosaProc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodGlosaProc(String value) {
            this.codGlosaProc = value;
        }

        /**
         * Gets the value of the valorRecursado property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorRecursado() {
            return valorRecursado;
        }

        /**
         * Sets the value of the valorRecursado property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorRecursado(BigDecimal value) {
            this.valorRecursado = value;
        }

        /**
         * Gets the value of the justificativaPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativaPrestador() {
            return justificativaPrestador;
        }

        /**
         * Sets the value of the justificativaPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativaPrestador(String value) {
            this.justificativaPrestador = value;
        }

        /**
         * Gets the value of the valorAcatado property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorAcatado() {
            return valorAcatado;
        }

        /**
         * Sets the value of the valorAcatado property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorAcatado(BigDecimal value) {
            this.valorAcatado = value;
        }

        /**
         * Gets the value of the justificativaOperadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativaOperadora() {
            return justificativaOperadora;
        }

        /**
         * Sets the value of the justificativaOperadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativaOperadora(String value) {
            this.justificativaOperadora = value;
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

}
