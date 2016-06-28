
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctm_demonstrativoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_demonstrativoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoCabecalho"/>
 *         &lt;element name="dadosContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pagamentos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pagamentosPorData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
 *                             &lt;element name="dadosResumo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisBrutosPorData">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="debitosCreditosPorData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisLiquidosPorData">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="totaisDemonstrativo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totaisBrutosDemonstrativo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="debitosCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="totaisLiquidosDemonstrativo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
@XmlType(name = "ctm_demonstrativoPagamento", propOrder = {
    "cabecalhoDemonstrativo",
    "dadosContratado",
    "pagamentos",
    "totaisDemonstrativo",
    "observacao"
})
public class CtmDemonstrativoPagamento {

    @XmlElement(required = true)
    protected CtDemonstrativoCabecalho cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.DadosContratado dadosContratado;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.Pagamentos pagamentos;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.TotaisDemonstrativo totaisDemonstrativo;
    protected String observacao;

    /**
     * Gets the value of the cabecalhoDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoCabecalho }
     *     
     */
    public CtDemonstrativoCabecalho getCabecalhoDemonstrativo() {
        return cabecalhoDemonstrativo;
    }

    /**
     * Sets the value of the cabecalhoDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoCabecalho }
     *     
     */
    public void setCabecalhoDemonstrativo(CtDemonstrativoCabecalho value) {
        this.cabecalhoDemonstrativo = value;
    }

    /**
     * Gets the value of the dadosContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.DadosContratado }
     *     
     */
    public CtmDemonstrativoPagamento.DadosContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Sets the value of the dadosContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.DadosContratado }
     *     
     */
    public void setDadosContratado(CtmDemonstrativoPagamento.DadosContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Gets the value of the pagamentos property.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.Pagamentos }
     *     
     */
    public CtmDemonstrativoPagamento.Pagamentos getPagamentos() {
        return pagamentos;
    }

    /**
     * Sets the value of the pagamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.Pagamentos }
     *     
     */
    public void setPagamentos(CtmDemonstrativoPagamento.Pagamentos value) {
        this.pagamentos = value;
    }

    /**
     * Gets the value of the totaisDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo }
     *     
     */
    public CtmDemonstrativoPagamento.TotaisDemonstrativo getTotaisDemonstrativo() {
        return totaisDemonstrativo;
    }

    /**
     * Sets the value of the totaisDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo }
     *     
     */
    public void setTotaisDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo value) {
        this.totaisDemonstrativo = value;
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
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "dadosPrestador",
        "cnes"
    })
    public static class DadosContratado {

        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Gets the value of the dadosPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosPrestador() {
            return dadosPrestador;
        }

        /**
         * Sets the value of the dadosPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosPrestador(CtContratadoDados value) {
            this.dadosPrestador = value;
        }

        /**
         * Gets the value of the cnes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNES() {
            return cnes;
        }

        /**
         * Sets the value of the cnes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNES(String value) {
            this.cnes = value;
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
     *         &lt;element name="pagamentosPorData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
     *                   &lt;element name="dadosResumo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisBrutosPorData">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="debitosCreditosPorData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisLiquidosPorData">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "pagamentosPorData"
    })
    public static class Pagamentos {

        @XmlElement(required = true)
        protected List<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData> pagamentosPorData;

        /**
         * Gets the value of the pagamentosPorData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pagamentosPorData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPagamentosPorData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData }
         * 
         * 
         */
        public List<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData> getPagamentosPorData() {
            if (pagamentosPorData == null) {
                pagamentosPorData = new ArrayList<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData>();
            }
            return this.pagamentosPorData;
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
         *         &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
         *         &lt;element name="dadosResumo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisBrutosPorData">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="debitosCreditosPorData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisLiquidosPorData">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "dadosPagamento",
            "dadosResumo",
            "totaisBrutosPorData",
            "debitosCreditosPorData",
            "totaisLiquidosPorData"
        })
        public static class PagamentosPorData {

            @XmlElement(required = true)
            protected CtPagamentoDados dadosPagamento;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo dadosResumo;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData totaisBrutosPorData;
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData debitosCreditosPorData;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData totaisLiquidosPorData;

            /**
             * Gets the value of the dadosPagamento property.
             * 
             * @return
             *     possible object is
             *     {@link CtPagamentoDados }
             *     
             */
            public CtPagamentoDados getDadosPagamento() {
                return dadosPagamento;
            }

            /**
             * Sets the value of the dadosPagamento property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtPagamentoDados }
             *     
             */
            public void setDadosPagamento(CtPagamentoDados value) {
                this.dadosPagamento = value;
            }

            /**
             * Gets the value of the dadosResumo property.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo getDadosResumo() {
                return dadosResumo;
            }

            /**
             * Sets the value of the dadosResumo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo }
             *     
             */
            public void setDadosResumo(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo value) {
                this.dadosResumo = value;
            }

            /**
             * Gets the value of the totaisBrutosPorData property.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData getTotaisBrutosPorData() {
                return totaisBrutosPorData;
            }

            /**
             * Sets the value of the totaisBrutosPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData }
             *     
             */
            public void setTotaisBrutosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData value) {
                this.totaisBrutosPorData = value;
            }

            /**
             * Gets the value of the debitosCreditosPorData property.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData getDebitosCreditosPorData() {
                return debitosCreditosPorData;
            }

            /**
             * Sets the value of the debitosCreditosPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData }
             *     
             */
            public void setDebitosCreditosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData value) {
                this.debitosCreditosPorData = value;
            }

            /**
             * Gets the value of the totaisLiquidosPorData property.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData getTotaisLiquidosPorData() {
                return totaisLiquidosPorData;
            }

            /**
             * Sets the value of the totaisLiquidosPorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData }
             *     
             */
            public void setTotaisLiquidosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData value) {
                this.totaisLiquidosPorData = value;
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
             *         &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
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
                "relacaoProtocolos"
            })
            public static class DadosResumo {

                @XmlElement(required = true)
                protected List<CtDadosResumoDemonstrativo> relacaoProtocolos;

                /**
                 * Gets the value of the relacaoProtocolos property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the relacaoProtocolos property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRelacaoProtocolos().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtDadosResumoDemonstrativo }
                 * 
                 * 
                 */
                public List<CtDadosResumoDemonstrativo> getRelacaoProtocolos() {
                    if (relacaoProtocolos == null) {
                        relacaoProtocolos = new ArrayList<CtDadosResumoDemonstrativo>();
                    }
                    return this.relacaoProtocolos;
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
             *         &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
                "debitosCreditos"
            })
            public static class DebitosCreditosPorData {

                @XmlElement(required = true)
                protected List<CtDescontos> debitosCreditos;

                /**
                 * Gets the value of the debitosCreditos property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the debitosCreditos property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDebitosCreditos().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtDescontos }
                 * 
                 * 
                 */
                public List<CtDescontos> getDebitosCreditos() {
                    if (debitosCreditos == null) {
                        debitosCreditos = new ArrayList<CtDescontos>();
                    }
                    return this.debitosCreditos;
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
             *         &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "totalInformadoPorData",
                "totalProcessadoPorData",
                "totaLiberadoPorData",
                "totalGlosaPorData"
            })
            public static class TotaisBrutosPorData {

                @XmlElement(required = true)
                protected BigDecimal totalInformadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totalProcessadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totaLiberadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totalGlosaPorData;

                /**
                 * Gets the value of the totalInformadoPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalInformadoPorData() {
                    return totalInformadoPorData;
                }

                /**
                 * Sets the value of the totalInformadoPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalInformadoPorData(BigDecimal value) {
                    this.totalInformadoPorData = value;
                }

                /**
                 * Gets the value of the totalProcessadoPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalProcessadoPorData() {
                    return totalProcessadoPorData;
                }

                /**
                 * Sets the value of the totalProcessadoPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalProcessadoPorData(BigDecimal value) {
                    this.totalProcessadoPorData = value;
                }

                /**
                 * Gets the value of the totaLiberadoPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotaLiberadoPorData() {
                    return totaLiberadoPorData;
                }

                /**
                 * Sets the value of the totaLiberadoPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotaLiberadoPorData(BigDecimal value) {
                    this.totaLiberadoPorData = value;
                }

                /**
                 * Gets the value of the totalGlosaPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalGlosaPorData() {
                    return totalGlosaPorData;
                }

                /**
                 * Sets the value of the totalGlosaPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalGlosaPorData(BigDecimal value) {
                    this.totalGlosaPorData = value;
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
             *         &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "totalDebitosPorData",
                "totalCreditosPorData",
                "liquidoPorData"
            })
            public static class TotaisLiquidosPorData {

                @XmlElement(required = true)
                protected BigDecimal totalDebitosPorData;
                @XmlElement(required = true)
                protected BigDecimal totalCreditosPorData;
                @XmlElement(required = true)
                protected BigDecimal liquidoPorData;

                /**
                 * Gets the value of the totalDebitosPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalDebitosPorData() {
                    return totalDebitosPorData;
                }

                /**
                 * Sets the value of the totalDebitosPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalDebitosPorData(BigDecimal value) {
                    this.totalDebitosPorData = value;
                }

                /**
                 * Gets the value of the totalCreditosPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalCreditosPorData() {
                    return totalCreditosPorData;
                }

                /**
                 * Sets the value of the totalCreditosPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalCreditosPorData(BigDecimal value) {
                    this.totalCreditosPorData = value;
                }

                /**
                 * Gets the value of the liquidoPorData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLiquidoPorData() {
                    return liquidoPorData;
                }

                /**
                 * Sets the value of the liquidoPorData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLiquidoPorData(BigDecimal value) {
                    this.liquidoPorData = value;
                }

            }

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
     *         &lt;element name="totaisBrutosDemonstrativo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="debitosCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="totaisLiquidosDemonstrativo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "totaisBrutosDemonstrativo",
        "debitosCreditosDemonstrativo",
        "totaisLiquidosDemonstrativo"
    })
    public static class TotaisDemonstrativo {

        @XmlElement(required = true)
        protected CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo totaisBrutosDemonstrativo;
        protected List<CtDescontos> debitosCreditosDemonstrativo;
        @XmlElement(required = true)
        protected CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo totaisLiquidosDemonstrativo;

        /**
         * Gets the value of the totaisBrutosDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo }
         *     
         */
        public CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo getTotaisBrutosDemonstrativo() {
            return totaisBrutosDemonstrativo;
        }

        /**
         * Sets the value of the totaisBrutosDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo }
         *     
         */
        public void setTotaisBrutosDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo value) {
            this.totaisBrutosDemonstrativo = value;
        }

        /**
         * Gets the value of the debitosCreditosDemonstrativo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the debitosCreditosDemonstrativo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDebitosCreditosDemonstrativo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontos }
         * 
         * 
         */
        public List<CtDescontos> getDebitosCreditosDemonstrativo() {
            if (debitosCreditosDemonstrativo == null) {
                debitosCreditosDemonstrativo = new ArrayList<CtDescontos>();
            }
            return this.debitosCreditosDemonstrativo;
        }

        /**
         * Gets the value of the totaisLiquidosDemonstrativo property.
         * 
         * @return
         *     possible object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo }
         *     
         */
        public CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo getTotaisLiquidosDemonstrativo() {
            return totaisLiquidosDemonstrativo;
        }

        /**
         * Sets the value of the totaisLiquidosDemonstrativo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo }
         *     
         */
        public void setTotaisLiquidosDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo value) {
            this.totaisLiquidosDemonstrativo = value;
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
         *         &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorInformadoBruto",
            "valorProcessadoBruto",
            "valorLiberadoBruto",
            "valorGlosaBruto"
        })
        public static class TotaisBrutosDemonstrativo {

            @XmlElement(required = true)
            protected BigDecimal valorInformadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorProcessadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorLiberadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorGlosaBruto;

            /**
             * Gets the value of the valorInformadoBruto property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorInformadoBruto() {
                return valorInformadoBruto;
            }

            /**
             * Sets the value of the valorInformadoBruto property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorInformadoBruto(BigDecimal value) {
                this.valorInformadoBruto = value;
            }

            /**
             * Gets the value of the valorProcessadoBruto property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorProcessadoBruto() {
                return valorProcessadoBruto;
            }

            /**
             * Sets the value of the valorProcessadoBruto property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorProcessadoBruto(BigDecimal value) {
                this.valorProcessadoBruto = value;
            }

            /**
             * Gets the value of the valorLiberadoBruto property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorLiberadoBruto() {
                return valorLiberadoBruto;
            }

            /**
             * Sets the value of the valorLiberadoBruto property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorLiberadoBruto(BigDecimal value) {
                this.valorLiberadoBruto = value;
            }

            /**
             * Gets the value of the valorGlosaBruto property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorGlosaBruto() {
                return valorGlosaBruto;
            }

            /**
             * Sets the value of the valorGlosaBruto property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorGlosaBruto(BigDecimal value) {
                this.valorGlosaBruto = value;
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
         *         &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "totalDebitosDemonstrativo",
            "totalCreditosdemonstrativo",
            "valorLiberadoDemonstrativo"
        })
        public static class TotaisLiquidosDemonstrativo {

            @XmlElement(required = true)
            protected BigDecimal totalDebitosDemonstrativo;
            @XmlElement(required = true)
            protected BigDecimal totalCreditosdemonstrativo;
            @XmlElement(required = true)
            protected BigDecimal valorLiberadoDemonstrativo;

            /**
             * Gets the value of the totalDebitosDemonstrativo property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDebitosDemonstrativo() {
                return totalDebitosDemonstrativo;
            }

            /**
             * Sets the value of the totalDebitosDemonstrativo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDebitosDemonstrativo(BigDecimal value) {
                this.totalDebitosDemonstrativo = value;
            }

            /**
             * Gets the value of the totalCreditosdemonstrativo property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalCreditosdemonstrativo() {
                return totalCreditosdemonstrativo;
            }

            /**
             * Sets the value of the totalCreditosdemonstrativo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalCreditosdemonstrativo(BigDecimal value) {
                this.totalCreditosdemonstrativo = value;
            }

            /**
             * Gets the value of the valorLiberadoDemonstrativo property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorLiberadoDemonstrativo() {
                return valorLiberadoDemonstrativo;
            }

            /**
             * Sets the value of the valorLiberadoDemonstrativo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorLiberadoDemonstrativo(BigDecimal value) {
                this.valorLiberadoDemonstrativo = value;
            }

        }

    }

}
