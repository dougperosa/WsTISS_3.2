package br.gov.ans.tiss.ws.tipos.tissrecursoglosa.v30200;

import br.com.unimederechim.classes.RecursoGlosa;

import br.com.unimederechim.classes.VerificaElegibilidade;

import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoRecurso;
import br.gov.ans.padroes.tiss.schemas.LoteRecursoGlosaWS;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoRecursoWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissRecursoGlosa_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissrecursoglosa/v30200",
            serviceName = "tissRecursoGlosa", portName = "tissRecursoGlosa_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissRecursoGlosa.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissRecursoGlosaPortTypeImpl {
    public TissRecursoGlosaPortTypeImpl() {
    }

    @WebResult(name = "protocoloRecebimentoRecursoWS", partName = "reciboRecursoGlosa",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissRecursoGlosa_Operation")
    public ProtocoloRecebimentoRecursoWS tissRecursoGlosaOperation(@WebParam(name = "loteRecursoGlosaWS",
                                                                             partName = "recursoGlosa",
                                                                             targetNamespace =
                                                                             "http://www.ans.gov.br/padroes/tiss/schemas")
        LoteRecursoGlosaWS recursoGlosa) throws TissFault {

        ProtocoloRecebimentoRecursoWS retorno = new ProtocoloRecebimentoRecursoWS();

        boolean usuario;

        try {

            if (recursoGlosa.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() == false &&
                recursoGlosa.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() == false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(recursoGlosa.getCabecalho().getLoginSenhaPrestador(), String.valueOf(recursoGlosa.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    RecursoGlosa recurso = new RecursoGlosa();
                    VerificaElegibilidade eleg = new VerificaElegibilidade();

                    int idPrestador =
                        eleg.idPrestador(String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getDadosContratado().getCpfContratado()),
                                         String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getDadosContratado().getCnpjContratado()),
                                         String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getDadosContratado().getCodigoPrestadorNaOperadora()));

                    recurso.fatRecursoGlosa(String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getNumeroGuiaRecGlosaPrestador()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getObjetoRecurso()),
                                            idPrestador,
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getNumeroLote()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getNumeroProtocolo()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getValorTotalRecursado()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getDataRecurso()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoProtocolo().getCodigoGlosaProtocolo()),
                                            String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoProtocolo().getJustificativaProtocolo()));
                    recurso.fatRecursoGlosaItens(String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getDataInicio()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getDataFim()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getProcRecurso().getCodigoTabela()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getProcRecurso().getCodigoProcedimento()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getProcRecurso().getDescricaoProcedimento()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getGrauParticipacao()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getCodGlosaItem()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getValorRecursado()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getOpcaoRecursoGuia().getItensGuia().get(0).getJustificativaItem()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getNumeroGuiaOrigem()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getNumeroGuiaOperadora()),
                                                 String.valueOf(recursoGlosa.getLoteRecurso().getGuiaRecursoGlosa().getOpcaoRecurso().getRecursoGuia().get(0).getSenha()));

                    retorno = recurso.retorno();

                } else {

                    CtRecebimentoRecurso lote = new CtRecebimentoRecurso();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setRecebimentoRecurso(lote);

                }

            } else {

            }

        } catch (Exception e) {

        }

        return retorno;
    }
}
