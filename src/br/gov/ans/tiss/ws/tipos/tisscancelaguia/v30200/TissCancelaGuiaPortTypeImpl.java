package br.gov.ans.tiss.ws.tipos.tisscancelaguia.v30200;

import br.com.unimederechim.classes.CancelaGuia;

import br.com.unimederechim.classes.VerificaElegibilidade;
import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.CtReciboCancelaGuia;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ReciboCancelaGuiaWS;

import br.gov.ans.padroes.tiss.schemas.StTissFault;
import br.gov.ans.padroes.tiss.schemas.TissFaultWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30200.TissFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissCancelaGuia_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisscancelaguia/v30200",
            serviceName = "tissCancelaGuia", portName = "tissCancelaGuia_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissCancelaGuia.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissCancelaGuiaPortTypeImpl {
    public TissCancelaGuiaPortTypeImpl() {
    }

    @WebResult(name = "reciboCancelaGuiaWS", partName = "reciboCancelaGuia",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissCancelaGuia_Operation")
    public ReciboCancelaGuiaWS tissCancelaGuiaOperation(@WebParam(name = "cancelaGuiaWS", partName = "cancelaGuia",
                                                                  targetNamespace =
                                                                  "http://www.ans.gov.br/padroes/tiss/schemas")
        br.gov.ans.padroes.tiss.schemas.CancelaGuiaWS cancelaGuia) throws TissFault {

        ReciboCancelaGuiaWS recibo = new ReciboCancelaGuiaWS();

        boolean usuario;

        try {
            if (cancelaGuia.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() == false &&
                cancelaGuia.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() == false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario = verificaUsuario.verificaUsuario(cancelaGuia.getCabecalho().getLoginSenhaPrestador(), String.valueOf(cancelaGuia.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {
                    CancelaGuia cancelar = new CancelaGuia();
                    VerificaElegibilidade eleg = new VerificaElegibilidade();
                    
                    String protocolo = cancelaGuia.getCancelaGuia().getNumeroProtocolo();
                    
                    int idPrestador = eleg.idPrestador(null, null, String.valueOf(cancelaGuia.getCancelaGuia().getDadosPrestador().getCodigoPrestadorNaOperadora()));
                    
                    cancelar.fauCancelamento(idPrestador, Integer.valueOf(cancelaGuia.getCancelaGuia().getTipoGuia()), protocolo, String.valueOf(cancelaGuia.getCancelaGuia().getGuiasCancelamento().get(0).getNumeroGuiaPrestador()), String.valueOf(cancelaGuia.getCancelaGuia().getGuiasCancelamento().get(0).getNumeroGuiaOperadora()));
                    recibo = cancelar.retorno(protocolo);

                } else {

                    CtReciboCancelaGuia lote = new CtReciboCancelaGuia();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    recibo.setReciboCancelaGuia(lote);
                    
                    /*StTissFault tf = StTissFault.LOGIN_INVALIDO;
                    TissFaultWS ws = new TissFaultWS();
                    ws.setTissFault(tf);

                    throw new TissFault("Login Inválido", ws);*/

                }
                
            } else {

            }

        } catch (Exception e) {

        }

        return recibo;
    }
}
