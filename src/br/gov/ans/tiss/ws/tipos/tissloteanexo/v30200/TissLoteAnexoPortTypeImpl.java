package br.gov.ans.tiss.ws.tipos.tissloteanexo.v30200;

import br.gov.ans.padroes.tiss.schemas.LoteAnexoWS;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoAnexoWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissLoteAnexo_PortType", targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissloteanexo/v30200", serviceName = "tissLoteAnexo", portName = "tissLoteAnexo_Port", wsdlLocation = "/WEB-INF/wsdl/tissLoteAnexo.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissLoteAnexoPortTypeImpl {
    public TissLoteAnexoPortTypeImpl() {
    }

    @WebResult(name = "protocoloRecebimentoAnexoWS", partName = "protocoloRecebimentoAnexo", targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissLoteAnexo_Operation")
    public ProtocoloRecebimentoAnexoWS tissLoteAnexoOperation(@WebParam(name = "loteAnexoWS", partName = "loteAnexo", targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
        LoteAnexoWS loteAnexo) throws TissFault {
        return null;
    }
}
