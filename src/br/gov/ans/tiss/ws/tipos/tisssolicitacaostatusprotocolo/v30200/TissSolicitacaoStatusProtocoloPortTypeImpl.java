package br.gov.ans.tiss.ws.tipos.tisssolicitacaostatusprotocolo.v30200;

import br.com.unimederechim.classes.SolicitacaoStatusProtocolo;

import br.com.unimederechim.classes.VerificaElegibilidade;
import br.com.unimederechim.classes.VerificaUsuario;

import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoProtocolo;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloWS;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoStatusProtocoloWS;

import br.gov.ans.padroes.tiss.schemas.StTissFault;
import br.gov.ans.padroes.tiss.schemas.TissFaultWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30200.TissFault;

import java.io.FileWriter;
import java.io.IOException;

import java.sql.ResultSet;

import java.sql.Statement;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "tissSolicitacaoStatusProtocolo_PortType",
            targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tisssolicitacaostatusprotocolo/v30200",
            serviceName = "tissSolicitacaoStatusProtocolo", portName = "tissSolicitacaoStatusProtocolo_Port",
            wsdlLocation = "/WEB-INF/wsdl/tissSolicitacaoStatusProtocolo.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso( { ObjectFactory.class, org.w3._2000._09.xmldsig_.ObjectFactory.class })
public class TissSolicitacaoStatusProtocoloPortTypeImpl {
    public TissSolicitacaoStatusProtocoloPortTypeImpl() {
    }

    @WebResult(name = "situacaoProtocoloWS", partName = "situacaoProtocolo",
               targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas")
    @WebMethod(operationName = "tissSolicitacaoStatusProtocolo_Operation")
    public SituacaoProtocoloWS tissSolicitacaoStatusProtocoloOperation(@WebParam(name = "solicitacaoStatusProtocoloWS",
                                                                                 partName =
                                                                                 "solicitacaoStatusProtocolo",
                                                                                 targetNamespace =
                                                                                 "http://www.ans.gov.br/padroes/tiss/schemas")
        SolicitacaoStatusProtocoloWS solicitacaoStatusProtocolo) throws TissFault {

        SituacaoProtocoloWS retorno = new SituacaoProtocoloWS();


        try {

            conectorBD sql = new conectorBD();
            Statement comSql = sql.getComandoBD();

            VerificaElegibilidade eleg = new VerificaElegibilidade();

            int prestador =
                eleg.idPrestador(String.valueOf(solicitacaoStatusProtocolo.getSolicitacaoStatusProtocolo().getDadosPrestador().getCpfContratado()),
                                 String.valueOf(solicitacaoStatusProtocolo.getSolicitacaoStatusProtocolo().getDadosPrestador().getCnpjContratado()),
                                 String.valueOf(solicitacaoStatusProtocolo.getSolicitacaoStatusProtocolo().getDadosPrestador().getCodigoPrestadorNaOperadora()));

            ResultSet certificado =
                comSql.executeQuery("SELECT * FROM siteunimed.certificado_tiss WHERE IDPRESTADOR = " + prestador +
                                    " ORDER BY DATA DESC LIMIT 1");

            if (certificado.next()) {
                Date data = new Date();
                SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");

                if (sdd.format(data).equals(String.valueOf(certificado.getDate("DATA")))) {
                    Date hora = new Date();
                    SimpleDateFormat sdh = new SimpleDateFormat("hh:mm:ss");

                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(hora);
                    long mili1 = c1.getTimeInMillis();

                    Calendar c2 = Calendar.getInstance();
                    c2.setTime(certificado.getTime("HORA"));
                    long mili2 = c2.getTimeInMillis();

                    long diferenca = mili1 - mili2;

                    if (diferenca <= 10000) {

                        String protocolo =
                            solicitacaoStatusProtocolo.getSolicitacaoStatusProtocolo().getNumeroProtocolo();


                        try {
                            conectorBD sqlLote = new conectorBD();
                            Statement comSqlLote = sqlLote.getComandoBD();

                            ResultSet rsLote =
                                comSqlLote.executeQuery("SELECT * FROM FAU_LOTES WHERE FAU_LOTES.ID_LOTE = " +
                                                        protocolo);

                            if (rsLote.next()) {

                                ResultSet rsPrestador =
                                    comSqlLote.executeQuery("SELECT * FROM FAU_LOTES WHERE FAU_LOTES.ID_LOTE = " +
                                                            protocolo + " AND FAU_LOTES.ID_PRESTADOR = " + prestador);

                                if (rsPrestador.next()) {
                                    SolicitacaoStatusProtocolo solicitacao = new SolicitacaoStatusProtocolo();

                                    retorno = solicitacao.retorno(protocolo);

                                } else {

                                    CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                                    motivo.setCodigoGlosa("1203");
                                    motivo.setDescricaoGlosa("CÓDIGO PRESTADOR INVÁLIDO");
                                    lote.setMensagemErro(motivo);
                                    retorno.setSituacaoProtocolo(lote);

                                }

                            } else {

                                CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                                CtMotivoGlosa motivo = new CtMotivoGlosa();
                                motivo.setCodigoGlosa("7");
                                motivo.setDescricaoGlosa("Não Localizado");
                                lote.setMensagemErro(motivo);
                                retorno.setSituacaoProtocolo(lote);

                            }
                        } catch (Exception e) {

                        }

                    } else {

                        CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                        CtMotivoGlosa motivo = new CtMotivoGlosa();
                        motivo.setCodigoGlosa("5005");
                        motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                        lote.setMensagemErro(motivo);
                        retorno.setSituacaoProtocolo(lote);

                    }

                } else {

                    CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setSituacaoProtocolo(lote);

                }

            } else {

                boolean usuario;
                VerificaUsuario verificaUsuario = new VerificaUsuario();
                usuario =
                        verificaUsuario.verificaUsuario(solicitacaoStatusProtocolo.getCabecalho().getLoginSenhaPrestador(),
                                                        String.valueOf(solicitacaoStatusProtocolo.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                if (usuario) {

                    String protocolo = solicitacaoStatusProtocolo.getSolicitacaoStatusProtocolo().getNumeroProtocolo();


                    try {
                        conectorBD sqlLote = new conectorBD();
                        Statement comSqlLote = sqlLote.getComandoBD();

                        ResultSet rsLote =
                            comSqlLote.executeQuery("SELECT * FROM FAU_LOTES WHERE FAU_LOTES.ID_LOTE = " + protocolo);

                        if (rsLote.next()) {

                            ResultSet rsPrestador =
                                comSql.executeQuery("SELECT * FROM FAU_LOTES WHERE FAU_LOTES.ID_LOTE = " + protocolo +
                                                    " AND FAU_LOTES.ID_PRESTADOR = " + prestador);

                            if (rsPrestador.next()) {
                                SolicitacaoStatusProtocolo solicitacao = new SolicitacaoStatusProtocolo();

                                retorno = solicitacao.retorno(protocolo);

                            } else {

                                CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                                CtMotivoGlosa motivo = new CtMotivoGlosa();
                                motivo.setCodigoGlosa("1203");
                                motivo.setDescricaoGlosa("CÓDIGO PRESTADOR INVÁLIDO");
                                lote.setMensagemErro(motivo);
                                retorno.setSituacaoProtocolo(lote);

                            }

                        } else {

                            CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                            CtMotivoGlosa motivo = new CtMotivoGlosa();
                            motivo.setCodigoGlosa("7");
                            motivo.setDescricaoGlosa("Não Localizado");
                            lote.setMensagemErro(motivo);
                            retorno.setSituacaoProtocolo(lote);

                        }
                    } catch (Exception e) {

                    }

                } else {

                    CtSituacaoProtocolo lote = new CtSituacaoProtocolo();
                    CtMotivoGlosa motivo = new CtMotivoGlosa();
                    motivo.setCodigoGlosa("5005");
                    motivo.setDescricaoGlosa("REMETENTE NÃO IDENTIFICADO");
                    lote.setMensagemErro(motivo);
                    retorno.setSituacaoProtocolo(lote);

                }

            }
        } catch (Exception e) {

        }

        return retorno;
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/2status.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }
}
