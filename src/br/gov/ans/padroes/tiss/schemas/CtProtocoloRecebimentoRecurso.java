
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_protocoloRecebimentoRecurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimentoRecurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_fontePagadora"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="detalheProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloRecurso"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecebimentoRecurso", propOrder = {
    "numeroProtocolo",
    "identificacaoOperadora",
    "dadosPrestador",
    "numeroLote",
    "dataEnvioLote",
    "detalheProtocolo"
})
public class CtProtocoloRecebimentoRecurso {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected CtFontePagadora identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(required = true)
    protected CtProtocoloRecurso detalheProtocolo;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the detalheProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloRecurso }
     *     
     */
    public CtProtocoloRecurso getDetalheProtocolo() {
        return detalheProtocolo;
    }

    /**
     * Sets the value of the detalheProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloRecurso }
     *     
     */
    public void setDetalheProtocolo(CtProtocoloRecurso value) {
        this.detalheProtocolo = value;
    }

}
