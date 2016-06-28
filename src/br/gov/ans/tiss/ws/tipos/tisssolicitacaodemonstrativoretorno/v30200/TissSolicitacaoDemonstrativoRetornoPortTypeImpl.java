package br.gov.ans.tiss.ws.tipos.tisssolicitacaodemonstrativoretorno.v30200;

import br.com.unimederechim.classes.SolicitacaoDemostrativoRetorno;

import br.com.unimederechim.classes.VerificaElegibilidade;

import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtDemonstrativoRetorno;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtReciboComunicacao;
import br.gov.ans.padroes.tiss.schemas.DemonstrativoRetornoWS;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoDemonstrativoRetornoWS;

import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissSolicitacaoDemonstrativoRetorno_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisssolicitacaodemonstrativoretorno/v30200",
            serviceName = "tissSolicitacaoDemonstrativoRetorno", portName = "tissSolicitacaoDemonstrativoRetorno_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissSolicitacaoDemonstrativoRetorno.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissSolicitacaoDemonstrativoRetornoPortTypeImpl {
    public TissSolicitacaoDemonstrativoRetornoPortTypeImpl() {
    }

    @WebResult(name = "demonstrativoRetornoWS", partName = "demonstrativoRetorno",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissSolicitacaoDemonstrativoRetorno_Operation")
    public DemonstrativoRetornoWS tissSolicitacaoDemonstrativoRetornoOperation(@WebParam(name =
                                                                                         "solicitacaoDemonstrativoRetornoWS",
                                                                                         partName =
                                                                                         "solicitacaoDemonstrativoRetorno",
                                                                                         targetNamespace =
                                                                                         "http://www.ans.gov.br/padroes/tiss/schemas")
        SolicitacaoDemonstrativoRetornoWS solicitacaoDemonstrativoRetorno) throws TissFault {

        DemonstrativoRetornoWS retorno = new DemonstrativoRetornoWS();
        
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        boolean usuario;
        
        gravaLog(String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getLoginSenhaPrestador().getLoginPrestador()));
        gravaLog(String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador()));
        gravaLog(String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));
        
        gravaLog(String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()));
        gravaLog(String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()));
        
        
        try {

            if (solicitacaoDemonstrativoRetorno.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() ==
                false &&
                solicitacaoDemonstrativoRetorno.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() ==
                false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(solicitacaoDemonstrativoRetorno.getCabecalho().getLoginSenhaPrestador(),
                                                        String.valueOf(solicitacaoDemonstrativoRetorno.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));
                
                if (usuario) {
                
                    SolicitacaoDemostrativoRetorno solicitacao = new SolicitacaoDemostrativoRetorno();
                    VerificaElegibilidade eleg = new VerificaElegibilidade();

                    try {
                        if (solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCodigoPrestadorNaOperadora().isEmpty() ==
                            false ||
                            solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCpfContratado().isEmpty() ==
                            false ||
                            solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCnpjContratado().isEmpty() ==
                            false) {
                            
                            int idPrestador =
                                eleg.idPrestador(String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCpfContratado()),
                                                 String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCnpjContratado()),
                                                 String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoAnalise().getDadosPrestador().getCodigoPrestadorNaOperadora()));
                            solicitacao.fatSolicitacaoDemons(idPrestador, "2", "0000-00-00", "");
                            retorno = solicitacao.retorno("2"); //2 - Demonstrativo de Analise
                        }
                    } catch (Exception e) {
                        
                    }

                    try {
                        if (solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCodigoPrestadorNaOperadora().isEmpty() ==
                            false ||
                            solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCpfContratado().isEmpty() ==
                            false ||
                            solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCnpjContratado().isEmpty() ==
                            false) {
                            int idPrestador =
                                eleg.idPrestador(String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCpfContratado()),
                                                 String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCnpjContratado()),
                                                 String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getDadosPrestador().getCodigoPrestadorNaOperadora()));
                            
                            solicitacao.fatSolicitacaoDemons(idPrestador, "1",
                                                             String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getPeriodo().getDataPagamento()),
                                                             String.valueOf(solicitacaoDemonstrativoRetorno.getSolicitacaoDemonstrativoRetorno().getDemonstrativoPagamento().getPeriodo().getCompetencia()));
                            retorno = solicitacao.retorno("1"); //1 - Demonstrativo de Pagamento
                            
                        }
                    } catch (Exception e) {
                        
                    }

                } else {
                    
                    CtDemonstrativoRetorno recibo = new CtDemonstrativoRetorno();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    recibo.setMensagemErro(motivo);
                    retorno.setDemonstrativoRetorno(recibo);

                }

            } else {

            }

        } catch (Exception e) {
            
        }

        return retorno;
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/log_demonstrativo.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }
}
