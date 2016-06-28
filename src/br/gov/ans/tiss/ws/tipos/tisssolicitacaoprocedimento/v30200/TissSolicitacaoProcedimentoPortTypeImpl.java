package br.gov.ans.tiss.ws.tipos.tisssolicitacaoprocedimento.v30200;

import br.com.unimederechim.classes.AutorizacaoServicos;

import br.com.unimederechim.classes.VerificaElegibilidade;
import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.AutorizacaoProcedimentoWS;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoProcedimentoWS;

import java.io.FileWriter;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissSolicitacaoProcedimento_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisssolicitacaoprocedimento/v30200",
            serviceName = "tissSolicitacaoProcedimento", portName = "tissSolicitacaoProcedimento_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissSolicitacaoProcedimento.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissSolicitacaoProcedimentoPortTypeImpl {
    public TissSolicitacaoProcedimentoPortTypeImpl() {
    }

    @WebResult(name = "autorizacaoProcedimentoWS", partName = "autorizacaoProcedimento",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissSolicitacaoProcedimento_Operation")
    public AutorizacaoProcedimentoWS tissSolicitacaoProcedimentoOperation(@WebParam(name = "solicitacaoProcedimentoWS",
                                                                                    partName =
                                                                                    "solicitacaoProcedimento",
                                                                                    targetNamespace =
                                                                                    "http://www.ans.gov.br/padroes/tiss/schemas")
        SolicitacaoProcedimentoWS solicitacaoProcedimento) throws TissFault {

        AutorizacaoProcedimentoWS retorno = new AutorizacaoProcedimentoWS();

        boolean usuario;

        boolean numeroGuiaExiste = false;

        try {

            if (solicitacaoProcedimento.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() ==
                false &&
                solicitacaoProcedimento.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() ==
                false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(solicitacaoProcedimento.getCabecalho().getLoginSenhaPrestador(),
                                                        String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    AutorizacaoServicos servicos = new AutorizacaoServicos();
                    VerificaElegibilidade eleg = new VerificaElegibilidade();

                    int idPrestador =
                        eleg.idPrestador(String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                         String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                         String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));
                    try {
                        if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getCabecalhoSolicitacao().getNumeroGuiaPrestador().isEmpty() ==
                            false) {
                            numeroGuiaExiste =
                                    servicos.validaNumeroGuia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getCabecalhoSolicitacao().getNumeroGuiaPrestador()),
                                                              String.valueOf(idPrestador));
                        }
                    } catch (Exception e) {

                    }

                    try {
                        if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getNumeroGuiaPrestador().isEmpty() ==
                            false) {

                            numeroGuiaExiste =
                                    servicos.validaNumeroGuia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getNumeroGuiaPrestador()),
                                                              String.valueOf(idPrestador));
                        }
                    } catch (Exception e) {

                    }

                    try {
                        if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNumeroGuiaPrestador().isEmpty() ==
                            false) {
                            numeroGuiaExiste =
                                    servicos.validaNumeroGuia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNumeroGuiaPrestador()),
                                                              String.valueOf(idPrestador));
                        }
                    } catch (Exception e) {

                    }

                    if (numeroGuiaExiste) {
                        CtSituacaoAutorizacao lote = new CtSituacaoAutorizacao();
                        CtMotivoGlosa motivo = new CtMotivoGlosa();
                        motivo.setCodigoGlosa("1307");
                        motivo.setDescricaoGlosa("NÚMERO DA GUIA INVÁLIDO");
                        lote.setMensagemErro(motivo);
                        retorno.setAutorizacaoProcedimento(lote);
                    } else {
                        servicos.processa(solicitacaoProcedimento);
                        retorno = servicos.retorno();
                    }

                } else {

                    CtSituacaoAutorizacao lote = new CtSituacaoAutorizacao();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setAutorizacaoProcedimento(lote);

                }

            } else {

            }

        } catch (Exception e) {

        }

        return retorno;
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/testa.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

}
