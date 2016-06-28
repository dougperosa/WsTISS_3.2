package br.gov.ans.tiss.ws.tipos.tisssolicitacaostatusprotocolorecurso.v30200;

import br.com.unimederechim.classes.SolicitacaoStatusRecursoGlosa;

import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRespostaGlosa;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoProtocolo;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloRecursoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusRecursoGlosaWS;

import br.gov.ans.padroes.tiss.schemas.StTissFault;
import br.gov.ans.padroes.tiss.schemas.TissFaultWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30200.TissFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissSolicitacaoStatusProtocoloRecurso_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisssolicitacaostatusprotocolorecurso/v30200",
            serviceName = "tissSolicitacaoStatusProtocoloRecurso",
            portName = "tissSolicitacaoStatusProtocoloRecurso_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissSolicitacaoStatusProtocoloRecurso.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissSolicitacaoStatusProtocoloRecursoPortTypeImpl {
    public TissSolicitacaoStatusProtocoloRecursoPortTypeImpl() {
    }

    @WebResult(name = "situacaoProtocoloRecursoWS", partName = "situacaoProtocoloRecurso",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissSolicitacaoStatusProtocoloRecurso_Operation")
    public SituacaoProtocoloRecursoWS tissSolicitacaoStatusProtocoloRecursoOperation(@WebParam(name =
                                                                                               "solicitacaoStatusRecursoGlosaWS",
                                                                                               partName =
                                                                                               "solicitacaoStatusProtocoloRecurso",
                                                                                               targetNamespace =
                                                                                               "http://www.ans.gov.br/padroes/tiss/schemas")
        SolicitacaoStatusRecursoGlosaWS solicitacaoStatusProtocoloRecurso) throws TissFault {

        SituacaoProtocoloRecursoWS situacao = new SituacaoProtocoloRecursoWS();

        boolean usuario;

        try {
            if (solicitacaoStatusProtocoloRecurso.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() ==
                false &&
                solicitacaoStatusProtocoloRecurso.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() ==
                false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(solicitacaoStatusProtocoloRecurso.getCabecalho().getLoginSenhaPrestador(), String.valueOf(solicitacaoStatusProtocoloRecurso.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    SolicitacaoStatusRecursoGlosa solicitacao = new SolicitacaoStatusRecursoGlosa();

                    String protocolo =
                        String.valueOf(solicitacaoStatusProtocoloRecurso.getSolicitacaoStatusProtocoloRecurso().getNumeroProtocolo());

                    situacao = solicitacao.retorno(protocolo);

                } else {
                    
                    CtRespostaGlosa lote = new CtRespostaGlosa();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    situacao.setSituacaoProtocoloRecurso(lote);

                    /*StTissFault tf = StTissFault.LOGIN_INVALIDO;
                    TissFaultWS ws = new TissFaultWS();
                    ws.setTissFault(tf);

                    throw new TissFault("Login Inválido", ws);*/

                }
                
            } else {

            }

        } catch (Exception e) {

        }

        return situacao;
    }
}
