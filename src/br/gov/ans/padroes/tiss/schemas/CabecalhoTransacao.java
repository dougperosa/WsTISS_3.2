
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cabecalhoTransacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cabecalhoTransacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoTransacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoTransacao"/>
 *                   &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="falhaNegocio" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" minOccurs="0"/>
 *         &lt;element name="origem">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="identificacaoPrestador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="destino">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="identificacaoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versaoPadrao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_versao"/>
 *         &lt;element name="loginSenhaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loginSenha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabecalhoTransacao", propOrder = {
    "identificacaoTransacao",
    "falhaNegocio",
    "origem",
    "destino",
    "versaoPadrao",
    "loginSenhaPrestador"
})
public class CabecalhoTransacao {

    @XmlElement(required = true)
    protected CabecalhoTransacao.IdentificacaoTransacao identificacaoTransacao;
    protected String falhaNegocio;
    @XmlElement(required = true)
    protected CabecalhoTransacao.Origem origem;
    @XmlElement(required = true)
    protected CabecalhoTransacao.Destino destino;
    @XmlElement(required = true)
    protected String versaoPadrao;
    protected CtLoginSenha loginSenhaPrestador;

    /**
     * Gets the value of the identificacaoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.IdentificacaoTransacao }
     *     
     */
    public CabecalhoTransacao.IdentificacaoTransacao getIdentificacaoTransacao() {
        return identificacaoTransacao;
    }

    /**
     * Sets the value of the identificacaoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.IdentificacaoTransacao }
     *     
     */
    public void setIdentificacaoTransacao(CabecalhoTransacao.IdentificacaoTransacao value) {
        this.identificacaoTransacao = value;
    }

    /**
     * Gets the value of the falhaNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalhaNegocio() {
        return falhaNegocio;
    }

    /**
     * Sets the value of the falhaNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalhaNegocio(String value) {
        this.falhaNegocio = value;
    }

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.Origem }
     *     
     */
    public CabecalhoTransacao.Origem getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.Origem }
     *     
     */
    public void setOrigem(CabecalhoTransacao.Origem value) {
        this.origem = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.Destino }
     *     
     */
    public CabecalhoTransacao.Destino getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.Destino }
     *     
     */
    public void setDestino(CabecalhoTransacao.Destino value) {
        this.destino = value;
    }

    /**
     * Gets the value of the versaoPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoPadrao() {
        return versaoPadrao;
    }

    /**
     * Sets the value of the versaoPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoPadrao(String value) {
        this.versaoPadrao = value;
    }

    /**
     * Gets the value of the loginSenhaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link CtLoginSenha }
     *     
     */
    public CtLoginSenha getLoginSenhaPrestador() {
        return loginSenhaPrestador;
    }

    /**
     * Sets the value of the loginSenhaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoginSenha }
     *     
     */
    public void setLoginSenhaPrestador(CtLoginSenha value) {
        this.loginSenhaPrestador = value;
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
     *         &lt;element name="identificacaoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
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
        "identificacaoPrestador",
        "registroANS"
    })
    public static class Destino {

        protected CtPrestadorIdentificacao identificacaoPrestador;
        protected String registroANS;

        /**
         * Gets the value of the identificacaoPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link CtPrestadorIdentificacao }
         *     
         */
        public CtPrestadorIdentificacao getIdentificacaoPrestador() {
            return identificacaoPrestador;
        }

        /**
         * Sets the value of the identificacaoPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtPrestadorIdentificacao }
         *     
         */
        public void setIdentificacaoPrestador(CtPrestadorIdentificacao value) {
            this.identificacaoPrestador = value;
        }

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
     *         &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoTransacao"/>
     *         &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
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
        "tipoTransacao",
        "sequencialTransacao",
        "dataRegistroTransacao",
        "horaRegistroTransacao"
    })
    public static class IdentificacaoTransacao {

        @XmlElement(required = true)
        protected DmTipoTransacao tipoTransacao;
        @XmlElement(required = true)
        protected String sequencialTransacao;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRegistroTransacao;
        @XmlElement(required = true)
        protected XMLGregorianCalendar horaRegistroTransacao;

        /**
         * Gets the value of the tipoTransacao property.
         * 
         * @return
         *     possible object is
         *     {@link DmTipoTransacao }
         *     
         */
        public DmTipoTransacao getTipoTransacao() {
            return tipoTransacao;
        }

        /**
         * Sets the value of the tipoTransacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmTipoTransacao }
         *     
         */
        public void setTipoTransacao(DmTipoTransacao value) {
            this.tipoTransacao = value;
        }

        /**
         * Gets the value of the sequencialTransacao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequencialTransacao() {
            return sequencialTransacao;
        }

        /**
         * Sets the value of the sequencialTransacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequencialTransacao(String value) {
            this.sequencialTransacao = value;
        }

        /**
         * Gets the value of the dataRegistroTransacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRegistroTransacao() {
            return dataRegistroTransacao;
        }

        /**
         * Sets the value of the dataRegistroTransacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRegistroTransacao(XMLGregorianCalendar value) {
            this.dataRegistroTransacao = value;
        }

        /**
         * Gets the value of the horaRegistroTransacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraRegistroTransacao() {
            return horaRegistroTransacao;
        }

        /**
         * Sets the value of the horaRegistroTransacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraRegistroTransacao(XMLGregorianCalendar value) {
            this.horaRegistroTransacao = value;
        }

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
     *         &lt;element name="identificacaoPrestador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
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
        "identificacaoPrestador",
        "registroANS"
    })
    public static class Origem {

        protected CabecalhoTransacao.Origem.IdentificacaoPrestador identificacaoPrestador;
        protected String registroANS;

        /**
         * Gets the value of the identificacaoPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link CabecalhoTransacao.Origem.IdentificacaoPrestador }
         *     
         */
        public CabecalhoTransacao.Origem.IdentificacaoPrestador getIdentificacaoPrestador() {
            return identificacaoPrestador;
        }

        /**
         * Sets the value of the identificacaoPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabecalhoTransacao.Origem.IdentificacaoPrestador }
         *     
         */
        public void setIdentificacaoPrestador(CabecalhoTransacao.Origem.IdentificacaoPrestador value) {
            this.identificacaoPrestador = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IdentificacaoPrestador
            extends CtPrestadorIdentificacao
        {


        }

    }

}
