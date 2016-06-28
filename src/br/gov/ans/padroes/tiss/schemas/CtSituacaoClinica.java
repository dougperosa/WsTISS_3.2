
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_situacaoClinica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoClinica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dentes" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elementoDentario" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                   &lt;element name="condicaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_condicaoClinica"/>
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
@XmlType(name = "ct_situacaoClinica", propOrder = {
    "dentes"
})
public class CtSituacaoClinica {

    @XmlElement(required = true)
    protected List<CtSituacaoClinica.Dentes> dentes;

    /**
     * Gets the value of the dentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtSituacaoClinica.Dentes }
     * 
     * 
     */
    public List<CtSituacaoClinica.Dentes> getDentes() {
        if (dentes == null) {
            dentes = new ArrayList<CtSituacaoClinica.Dentes>();
        }
        return this.dentes;
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
     *         &lt;element name="elementoDentario" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *         &lt;element name="condicaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_condicaoClinica"/>
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
        "elementoDentario",
        "condicaoClinica"
    })
    public static class Dentes {

        @XmlElement(required = true)
        protected String elementoDentario;
        @XmlElement(required = true)
        protected DmCondicaoClinica condicaoClinica;

        /**
         * Gets the value of the elementoDentario property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementoDentario() {
            return elementoDentario;
        }

        /**
         * Sets the value of the elementoDentario property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementoDentario(String value) {
            this.elementoDentario = value;
        }

        /**
         * Gets the value of the condicaoClinica property.
         * 
         * @return
         *     possible object is
         *     {@link DmCondicaoClinica }
         *     
         */
        public DmCondicaoClinica getCondicaoClinica() {
            return condicaoClinica;
        }

        /**
         * Sets the value of the condicaoClinica property.
         * 
         * @param value
         *     allowed object is
         *     {@link DmCondicaoClinica }
         *     
         */
        public void setCondicaoClinica(DmCondicaoClinica value) {
            this.condicaoClinica = value;
        }

    }

}
