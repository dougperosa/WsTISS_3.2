
package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ctm_autorizacaoInternacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoInternacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacaoDosServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="dataProvavelAdmissao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="qtdDiariasAutorizadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *         &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoInternacao", propOrder = {
    "autorizacaoDosServicos",
    "dataProvavelAdmissao",
    "qtdDiariasAutorizadas",
    "tipoAcomodacaoAutorizada"
})
public class CtmAutorizacaoInternacao {

    @XmlElement(required = true)
    protected CtmAutorizacaoServico autorizacaoDosServicos;
    protected XMLGregorianCalendar dataProvavelAdmissao;
    protected BigInteger qtdDiariasAutorizadas;
    protected String tipoAcomodacaoAutorizada;

    /**
     * Gets the value of the autorizacaoDosServicos property.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoDosServicos() {
        return autorizacaoDosServicos;
    }

    /**
     * Sets the value of the autorizacaoDosServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoDosServicos(CtmAutorizacaoServico value) {
        this.autorizacaoDosServicos = value;
    }

    /**
     * Gets the value of the dataProvavelAdmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavelAdmissao() {
        return dataProvavelAdmissao;
    }

    /**
     * Sets the value of the dataProvavelAdmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavelAdmissao(XMLGregorianCalendar value) {
        this.dataProvavelAdmissao = value;
    }

    /**
     * Gets the value of the qtdDiariasAutorizadas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdDiariasAutorizadas() {
        return qtdDiariasAutorizadas;
    }

    /**
     * Sets the value of the qtdDiariasAutorizadas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdDiariasAutorizadas(BigInteger value) {
        this.qtdDiariasAutorizadas = value;
    }

    /**
     * Gets the value of the tipoAcomodacaoAutorizada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcomodacaoAutorizada() {
        return tipoAcomodacaoAutorizada;
    }

    /**
     * Sets the value of the tipoAcomodacaoAutorizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcomodacaoAutorizada(String value) {
        this.tipoAcomodacaoAutorizada = value;
    }

}
