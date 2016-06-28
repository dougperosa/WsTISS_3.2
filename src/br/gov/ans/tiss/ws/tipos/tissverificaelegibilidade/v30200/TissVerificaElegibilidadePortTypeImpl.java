package br.gov.ans.tiss.ws.tipos.tissverificaelegibilidade.v30200;

import br.com.unimederechim.classes.VerificaElegibilidade;

import br.com.unimederechim.classes.VerificaUsuario;

import br.com.unimederechim.util.Utilitarios;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtElegibilidadeRecibo;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtRespostaElegibilidade;
import br.gov.ans.padroes.tiss.schemas.CtRespostaGlosa;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.PedidoElegibilidadeWS;
import br.gov.ans.padroes.tiss.schemas.RespostaElegibilidadeWS;

import br.gov.ans.padroes.tiss.schemas.StTissFault;
import br.gov.ans.padroes.tiss.schemas.TissFaultWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30200.TissFault;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

@WebService(name = "tissVerificaElegibilidade_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30200",
            serviceName = "tissVerificaElegibilidade", portName = "tissVerificaElegibilidade_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissVerificaElegibilidade.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissVerificaElegibilidadePortTypeImpl {

    String retornoBeneficiario, retornoPrestador;
    int idPrestador;

    public TissVerificaElegibilidadePortTypeImpl() {
    }

    @WebResult(name = "respostaElegibilidadeWS", partName = "respostaElegibilidade",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissVerificaElegibilidade_Operation")
    public RespostaElegibilidadeWS tissVerificaElegibilidadeOperation(@WebParam(name = "pedidoElegibilidadeWS",
                                                                                partName = "pedidoElegibilidade",
                                                                                targetNamespace =
                                                                                "http://www.ans.gov.br/padroes/tiss/schemas")
        PedidoElegibilidadeWS pedidoElegibilidade) throws TissFault {

        RespostaElegibilidadeWS elegibilidade = new RespostaElegibilidadeWS();

        boolean usuario;

        try {
            if (pedidoElegibilidade.getCabecalho().getLoginSenhaPrestador().getLoginPrestador().isEmpty() == false &&
                pedidoElegibilidade.getCabecalho().getLoginSenhaPrestador().getSenhaPrestador().isEmpty() == false) {

                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(pedidoElegibilidade.getCabecalho().getLoginSenhaPrestador(), String.valueOf(pedidoElegibilidade.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    VerificaElegibilidade eleg = new VerificaElegibilidade();
                    retornoPrestador =
                            eleg.verificaPrestador(String.valueOf(pedidoElegibilidade.getPedidoElegibilidade().getDadosPrestador().getCpfContratado()),
                                                   String.valueOf(pedidoElegibilidade.getPedidoElegibilidade().getDadosPrestador().getCnpjContratado()),
                                                   String.valueOf(pedidoElegibilidade.getPedidoElegibilidade().getDadosPrestador().getCodigoPrestadorNaOperadora()));

                    if (retornoPrestador == null) {
                        retornoBeneficiario =
                                eleg.verificaBeneficiario(String.valueOf(pedidoElegibilidade.getPedidoElegibilidade().getNumeroCarteira()));

                        if (retornoBeneficiario == null) {

                            eleg.registraElegibilidade(pedidoElegibilidade.getPedidoElegibilidade().getNumeroCarteira(),
                                                       pedidoElegibilidade.getPedidoElegibilidade().getDadosPrestador().getCodigoPrestadorNaOperadora(),
                                                       "", "S");
                        } else {

                            CtRespostaElegibilidade lote = new CtRespostaElegibilidade();
                            CtElegibilidadeRecibo recibo = new CtElegibilidadeRecibo();
                            CtElegibilidadeRecibo.MotivosNegativa negativa =
                                new CtElegibilidadeRecibo.MotivosNegativa();
                            CtMotivoGlosa motivo = new CtMotivoGlosa();
                            motivo.setCodigoGlosa(retornoPrestador);
                            if (retornoBeneficiario == "1001") {
                                motivo.setDescricaoGlosa("NÚMERO DA CARTEIRA INVÁLIDO");
                            } else if (retornoBeneficiario == "1006") {
                                motivo.setDescricaoGlosa("ATENDIMENTO APÓS O DESLIGAMENTO DO BENEFICIÁRIO");
                            }
                            negativa.getMotivoNegativa().add(motivo);
                            recibo.setMotivosNegativa(negativa);
                            lote.setReciboElegibilidade(recibo);
                            elegibilidade.setRespostaElegibilidade(lote);

                        }
                    } else {

                        CtRespostaElegibilidade lote = new CtRespostaElegibilidade();
                        CtMotivoGlosa motivo = new CtMotivoGlosa();
                        motivo.setCodigoGlosa(retornoPrestador);
                        if (retornoPrestador == "1203") {
                            motivo.setDescricaoGlosa("CÓDIGO PRESTADOR INVÁLIDO");
                        } else if (retornoPrestador == "1206") {
                            motivo.setDescricaoGlosa("CPF / CNPJ INVÁLIDO");
                        }
                        lote.setMensagemErro(motivo);
                        elegibilidade.setRespostaElegibilidade(lote);

                    }


                    //CABECALHO
                    CabecalhoTransacao cabecalhoTransacao = new CabecalhoTransacao();
                    CabecalhoTransacao.IdentificacaoTransacao identificacao =
                        new CabecalhoTransacao.IdentificacaoTransacao();
                    CabecalhoTransacao.Origem origem = new CabecalhoTransacao.Origem();
                    CabecalhoTransacao.Destino destino = new CabecalhoTransacao.Destino();
                    CtPrestadorIdentificacao identificacaoPrestadorDestino = new CtPrestadorIdentificacao();
                    Date dataRetorno = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat sdh = new SimpleDateFormat("hh:mm:ss");
                    DmTipoTransacao tipo;

                    try {

                        tipo = DmTipoTransacao.PROTOCOLO_RECEBIMENTO;

                        identificacao.setTipoTransacao(tipo);


                        identificacao.setDataRegistroTransacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(dataRetorno)));
                        identificacao.setHoraRegistroTransacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sdh.format(dataRetorno)));

                        cabecalhoTransacao.setIdentificacaoTransacao(identificacao);

                        origem.setRegistroANS("357022");

                        cabecalhoTransacao.setOrigem(origem);

                        identificacaoPrestadorDestino.setCodigoPrestadorNaOperadora(String.valueOf(pedidoElegibilidade.getPedidoElegibilidade().getDadosPrestador().getCodigoPrestadorNaOperadora()));

                        destino.setIdentificacaoPrestador(identificacaoPrestadorDestino);

                        cabecalhoTransacao.setDestino(destino);

                        elegibilidade.setCabecalho(cabecalhoTransacao);

                    } catch (Exception e) {

                    }

                    //CRIA HASH
                    Utilitarios utilitarios = new Utilitarios();
                    String xmlData = null;
                    try {
                        JAXBContext context = JAXBContext.newInstance(elegibilidade.getClass());
                        Marshaller marshaller = context.createMarshaller();
                        //JAXBElement<ProtocoloRecebimentoWS> element = new ObjectFactory().createCtRecebimentoLote(lote);

                        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        StringWriter stringWriter = new StringWriter();
                        marshaller.marshal(elegibilidade, stringWriter);

                        Document doc = dBuilder.parse(new InputSource(new StringReader(stringWriter.toString())));
                        xmlData = "";
                        NodeList nodeList = doc.getChildNodes();
                        if (nodeList.getLength() > 0) {
                            Node childNode = nodeList.item(0);
                            xmlData = childNode.getTextContent();
                        }
                    } catch (JAXBException e) {
                    } catch (ParserConfigurationException e) {
                    } catch (SAXException e) {
                    } catch (IOException e) {
                    }

                    elegibilidade.setHash(utilitarios.calculaHash(xmlData));

                } else {

                    CtRespostaElegibilidade lote = new CtRespostaElegibilidade();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    elegibilidade.setRespostaElegibilidade(lote);

                }
            } else {

            }

        } catch (Exception e) {

        }

        return elegibilidade;
    }
}
