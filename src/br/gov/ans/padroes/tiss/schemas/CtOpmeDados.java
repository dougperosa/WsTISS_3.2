
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_opmeDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_opmeDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="nomeFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_opmeDados", propOrder = {
    "identificacaoOPME",
    "nomeFabricante"
})
public class CtOpmeDados {

    @XmlElement(required = true)
    protected CtProcedimentoDados identificacaoOPME;
    @XmlElement(required = true)
    protected String nomeFabricante;

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
     * Gets the value of the nomeFabricante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    /**
     * Sets the value of the nomeFabricante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFabricante(String value) {
        this.nomeFabricante = value;
    }

}
