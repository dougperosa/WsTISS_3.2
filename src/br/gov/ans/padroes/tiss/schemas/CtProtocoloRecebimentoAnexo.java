
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_protocoloRecebimentoAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimentoAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_fontePagadora"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="detalheProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloDetalheAnexo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecebimentoAnexo", propOrder = {
    "numeroProtocolo",
    "identificacaoOperadora",
    "dadosPrestador",
    "numeroLote",
    "dataEnvioLote",
    "detalheProtocolo"
})
public class CtProtocoloRecebimentoAnexo {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected CtFontePagadora identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String dataEnvioLote;
    @XmlElement(required = true)
    protected CtProtocoloDetalheAnexo detalheProtocolo;

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the identificacaoOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link CtFontePagadora }
     *     
     */
    public CtFontePagadora getIdentificacaoOperadora() {
        return identificacaoOperadora;
    }

    /**
     * Sets the value of the identificacaoOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtFontePagadora }
     *     
     */
    public void setIdentificacaoOperadora(CtFontePagadora value) {
        this.identificacaoOperadora = value;
    }

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
     * Gets the value of the dataEnvioLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEnvioLote(String value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the detalheProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloDetalheAnexo }
     *     
     */
    public CtProtocoloDetalheAnexo getDetalheProtocolo() {
        return detalheProtocolo;
    }

    /**
     * Sets the value of the detalheProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloDetalheAnexo }
     *     
     */
    public void setDetalheProtocolo(CtProtocoloDetalheAnexo value) {
        this.detalheProtocolo = value;
    }

}
