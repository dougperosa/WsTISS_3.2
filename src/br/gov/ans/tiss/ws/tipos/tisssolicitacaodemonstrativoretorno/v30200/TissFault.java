
package br.gov.ans.tiss.ws.tipos.tisssolicitacaodemonstrativoretorno.v30200;

import javax.xml.ws.WebFault;
import br.gov.ans.padroes.tiss.schemas.TissFaultWS;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "tissFaultWS", targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
public class TissFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TissFaultWS faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public TissFault(String message, TissFaultWS faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public TissFault(String message, TissFaultWS faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.gov.ans.padroes.tiss.schemas.TissFaultWS
     */
    public TissFaultWS getFaultInfo() {
        return faultInfo;
    }

}
