
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_outrasDespesas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_outrasDespesas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="despesa" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_outrasDespesas"/>
 *                   &lt;element name="servicosExecutados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOutras"/>
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
@XmlType(name = "ct_outrasDespesas", propOrder = {
    "despesa"
})
public class CtOutrasDespesas {

    @XmlElement(required = true)
    protected List<CtOutrasDespesas.Despesa> despesa;

    /**
     * Gets the value of the despesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOutrasDespesas.Despesa }
     * 
     * 
     */
    public List<CtOutrasDespesas.Despesa> getDespesa() {
        if (despesa == null) {
            despesa = new ArrayList<CtOutrasDespesas.Despesa>();
        }
        return this.despesa;
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
     *         &lt;element name="codigoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_outrasDespesas"/>
     *         &lt;element name="servicosExecutados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOutras"/>
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
        "codigoDespesa",
        "servicosExecutados"
    })
    public static class Despesa {

        @XmlElement(required = true)
        protected String codigoDespesa;
        @XmlElement(required = true)
        protected CtProcedimentoExecutadoOutras servicosExecutados;

        /**
         * Gets the value of the codigoDespesa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoDespesa() {
            return codigoDespesa;
        }

        /**
         * Sets the value of the codigoDespesa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoDespesa(String value) {
            this.codigoDespesa = value;
        }

        /**
         * Gets the value of the servicosExecutados property.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoExecutadoOutras }
         *     
         */
        public CtProcedimentoExecutadoOutras getServicosExecutados() {
            return servicosExecutados;
        }

        /**
         * Sets the value of the servicosExecutados property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoExecutadoOutras }
         *     
         */
        public void setServicosExecutados(CtProcedimentoExecutadoOutras value) {
            this.servicosExecutados = value;
        }

    }

}
