
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  estrutura da resposta da operadora a um lote de guias de recurso de glosa de medicina e de odonto
 * 
 * <p>Java class for ct_protocoloRecurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="glosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dadosGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaRecurso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecurso", propOrder = {
    "numeroProtocolo",
    "glosaProtocolo",
    "dadosGuias"
})
public class CtProtocoloRecurso {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    protected List<CtMotivoGlosa> glosaProtocolo;
    protected List<CtGuiaRecurso> dadosGuias;

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
     * Gets the value of the glosaProtocolo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glosaProtocolo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlosaProtocolo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtMotivoGlosa }
     * 
     * 
     */
    public List<CtMotivoGlosa> getGlosaProtocolo() {
        if (glosaProtocolo == null) {
            glosaProtocolo = new ArrayList<CtMotivoGlosa>();
        }
        return this.glosaProtocolo;
    }

    /**
     * Gets the value of the dadosGuias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosGuias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtGuiaRecurso }
     * 
     * 
     */
    public List<CtGuiaRecurso> getDadosGuias() {
        if (dadosGuias == null) {
            dadosGuias = new ArrayList<CtGuiaRecurso>();
        }
        return this.dadosGuias;
    }

}
