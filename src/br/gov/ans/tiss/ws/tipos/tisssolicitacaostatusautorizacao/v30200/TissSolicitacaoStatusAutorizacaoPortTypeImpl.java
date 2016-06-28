package br.gov.ans.tiss.ws.tipos.tisssolicitacaostatusautorizacao.v30200;

import br.com.unimederechim.classes.SolicitaStatusAutorizacao;
import br.com.unimederechim.classes.VerificaElegibilidade;
import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.SituacaoAutorizacaoWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusAutorizacaoWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissSolicitacaoStatusAutorizacao_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisssolicitacaostatusautorizacao/v30200",
            serviceName = "tissSolicitacaoStatusAutorizacao", portName = "tissSolicitacaoStatusAutorizacao_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissSolicitacaoStatusAutorizacao.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissSolicitacaoStatusAutorizacaoPortTypeImpl {
    public TissSolicitacaoStatusAutorizacaoPortTypeImpl() {
    }

    @WebResult(name = "situacaoAutorizacaoWS", partName = "situacaoAutorizacao",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissSolicitacaoStatusAutorizacao_Operation")
    public SituacaoAutorizacaoWS tissSolicitacaoStatusAutorizacaoOperation(@WebParam(name =
                                                                                     "solicitacaoStatusAutorizacaoWS",
                                                                                     partName =
                                                                                     "solicitacaoStatusAutorizacao",
                                                                                     targetNamespace =
                                                                                     "http://www.ans.gov.br/padroes/tiss/schemas")
        SolicitacaoStatusAutorizacaoWS solicitacaoStatusAutorizacao) throws TissFault {

        SituacaoAutorizacaoWS retorno = new SituacaoAutorizacaoWS();

        boolean usuario;

        try {

            if (solicitacaoStatusAutorizacao.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() ==
                false &&
                solicitacaoStatusAutorizacao.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() ==
                false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(solicitacaoStatusAutorizacao.getCabecalho().getLoginSenhaPrestador(),
                                                        String.valueOf(solicitacaoStatusAutorizacao.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    SolicitaStatusAutorizacao statusAutorizacao = new SolicitaStatusAutorizacao();
                    VerificaElegibilidade eleg = new VerificaElegibilidade();

                    int idPrestador =
                        eleg.idPrestador(String.valueOf(solicitacaoStatusAutorizacao.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                         String.valueOf(solicitacaoStatusAutorizacao.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                         String.valueOf(solicitacaoStatusAutorizacao.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                    retorno =
                            statusAutorizacao.retorno(String.valueOf(idPrestador), String.valueOf(solicitacaoStatusAutorizacao.getSolicitacaoStatusAutorizacao().getIdentificacaoSolicitacao().getNumeroGuiaPrestador()),
                                                      String.valueOf(solicitacaoStatusAutorizacao.getSolicitacaoStatusAutorizacao().getDadosBeneficiario().getNumeroCarteira()));

                } else {

                    CtSituacaoAutorizacao lote = new CtSituacaoAutorizacao();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setSituacaoAutorizacao(lote);

                }

            } else {

            }

        } catch (Exception e) {

        }

        return retorno;
    }
    
}
