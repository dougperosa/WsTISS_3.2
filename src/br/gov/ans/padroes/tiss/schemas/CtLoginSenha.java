
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_loginSenha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_loginSenha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="senhaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_loginSenha", propOrder = {
    "loginPrestador",
    "senhaPrestador"
})
public class CtLoginSenha {

    @XmlElement(required = true)
    protected String loginPrestador;
    @XmlElement(required = true)
    protected String senhaPrestador;

    /**
     * Gets the value of the loginPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPrestador() {
        return loginPrestador;
    }

    /**
     * Sets the value of the loginPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPrestador(String value) {
        this.loginPrestador = value;
    }

    /**
     * Gets the value of the senhaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaPrestador() {
        return senhaPrestador;
    }

    /**
     * Sets the value of the senhaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaPrestador(String value) {
        this.senhaPrestador = value;
    }

}
