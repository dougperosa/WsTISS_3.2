package br.gov.ans.tiss.ws.tipos.tisscomunicacaobeneficiario.v30200;

import br.com.unimederechim.classes.ComunicacaoInternacao;
import br.com.unimederechim.classes.SolicitaStatusAutorizacao;
import br.com.unimederechim.classes.VerificaElegibilidade;
import br.com.unimederechim.classes.VerificaUsuario;

import br.gov.ans.padroes.tiss.schemas.ComunicacaoBeneficiarioWS;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtReciboComunicacao;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ReciboComunicacaoWS;

import br.gov.ans.padroes.tiss.schemas.SituacaoAutorizacaoWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissComunicacaoBeneficiario_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisscomunicacaobeneficiario/v30200",
            serviceName = "tissComunicacaoBeneficiario", portName = "tissComunicacaoBeneficiario_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissComunicacaoBeneficiario.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissComunicacaoBeneficiarioPortTypeImpl {
    public TissComunicacaoBeneficiarioPortTypeImpl() {
    }

    @WebResult(name = "reciboComunicacaoWS", partName = "reciboComunicacao",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissComunicacaoBeneficiario_Operation")
    public ReciboComunicacaoWS tissComunicacaoBeneficiarioOperation(@WebParam(name = "comunicacaoBeneficiarioWS",
                                                                              partName = "comunicacaoBeneficiario",
                                                                              targetNamespace =
                                                                              "http://www.ans.gov.br/padroes/tiss/schemas")
        ComunicacaoBeneficiarioWS comunicacaoBeneficiario) throws TissFault {

        ReciboComunicacaoWS retorno = new ReciboComunicacaoWS();

        boolean usuario;

        try {

            if (comunicacaoBeneficiario.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() ==
                false &&
                comunicacaoBeneficiario.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() ==
                false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(comunicacaoBeneficiario.getCabecalho().getLoginSenhaPrestador(),
                                                        String.valueOf(comunicacaoBeneficiario.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    

                        ComunicacaoInternacao comunicacao = new ComunicacaoInternacao();
                        comunicacao.autComunicacaoInternacao(String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosBeneficiario().getNumeroCarteira()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosBeneficiario().getAtendimentoRN()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosBeneficiario().getNomeBeneficiario()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosBeneficiario().getNumeroCNS()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDataEvento()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getTipoEvento()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosInternacao().getMotivoEncerramento()),
                                                             String.valueOf(comunicacaoBeneficiario.getComunicacaoBeneficiario().getDadosInternacao().getTipoInternacao()));
                        retorno = comunicacao.retorno();

                    

                } else {

                    CtReciboComunicacao recibo = new CtReciboComunicacao();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    recibo.setMensagemErro(motivo);
                    retorno.setReciboComunicacao(recibo);

                }

            } else {

            }

        } catch (Exception e) {

        }

        return retorno;
    }
}
