package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtDadosResumoDemonstrativo;
import br.gov.ans.padroes.tiss.schemas.CtDemonstrativoCabecalho;
import br.gov.ans.padroes.tiss.schemas.CtDemonstrativoRetorno;
import br.gov.ans.padroes.tiss.schemas.CtDescontos;
import br.gov.ans.padroes.tiss.schemas.CtPagamentoDados;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtmDemonstrativoPagamento;
import br.gov.ans.padroes.tiss.schemas.DemonstrativoRetornoWS;

import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;

import java.io.FileWriter;
import java.io.IOException;

import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;

import org.apache.commons.lang.StringUtils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SolicitacaoDemostrativoRetorno {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    private int idDemonstrativo;

    public SolicitacaoDemostrativoRetorno() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public DemonstrativoRetornoWS retorno(String tipoDemonstrativo) {
        
        DemonstrativoRetornoWS retorno = new DemonstrativoRetornoWS();
        CtDemonstrativoRetorno demRetorno = new CtDemonstrativoRetorno();
        CtmDemonstrativoPagamento demPagamento = new CtmDemonstrativoPagamento();
        CtDemonstrativoCabecalho cabecalho = new CtDemonstrativoCabecalho();
        CtmDemonstrativoPagamento.DadosContratado contratadoPagamento =
            new CtmDemonstrativoPagamento.DadosContratado();
        CtContratadoDados contPagamento = new CtContratadoDados();
        CtmDemonstrativoPagamento.Pagamentos pagamentos = new CtmDemonstrativoPagamento.Pagamentos();
       
        CtmDemonstrativoPagamento.TotaisDemonstrativo totaisDemonstrativo =
            new CtmDemonstrativoPagamento.TotaisDemonstrativo();
        CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno demAnalise =
            new CtDemonstrativoRetorno.SituacaoDemonstrativoRetorno();
        CtContratadoDados contratadoAnalise = new CtContratadoDados();
        Date data = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String prestadorRetorno = null;
        
        if (tipoDemonstrativo == "1") {

            try {
                String idPrestador = null, competencia = null, codPrestador = null, idFolha = null, dataPagamento =
                    null;

                resultado =
                        comSQL.executeQuery("SELECT * FROM FAT_SOLICITACAO_DEMONS WHERE ID_DEMONSTRATIVO = " + idDemonstrativo);

                if (resultado.next()) {
                    try {
                        cabecalho.setRegistroANS("357022");
                        cabecalho.setNumeroDemonstrativo(resultado.getString("ID_DEMONSTRATIVO"));
                        cabecalho.setNomeOperadora("Unimed Erechim Cooperativa de Serviços de Saúde Ltda");
                        cabecalho.setNumeroCNPJ("87.638.3334/0001-73");
                        cabecalho.setDataEmissao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(data)));

                        idPrestador = resultado.getString("ID_PRESTADOR");
                        try{
                            dataPagamento = resultado.getString("DATA_PAGAMENTO");
                        }catch(Exception e){                            
                        }
                        competencia = String.valueOf(resultado.getObject("COMPETENCIA"));

                    } catch (Exception e) {

                    }
                }

                try {
                    ResultSet rsPrestador =
                        comSQL.executeQuery("SELECT * FROM UNI_PRESTADORES " + "WHERE IDPRESTADOR = " + idPrestador);
                    if (rsPrestador.next()) {
                        contPagamento.setCodigoPrestadorNaOperadora(rsPrestador.getString("CODPRESTADOR"));
                        contPagamento.setNomeContratado(rsPrestador.getString("DESCRICAO"));

                        codPrestador = rsPrestador.getString("CODPRESTADOR");
                        prestadorRetorno = rsPrestador.getString("CODPRESTADOR");

                        contratadoPagamento.setCNES(rsPrestador.getString("CNES"));
                    }

                } catch (SQLException e) {

                }

                contratadoPagamento.setDadosPrestador(contPagamento);

                ResultSet rsSiteunimed = null;

                if (competencia.equals("null")) {
                    try {
                        rsSiteunimed =
                                comSQL.executeQuery("SELECT * FROM siteunimed.valprest v INNER JOIN siteunimed.folha f ON f.idfolha = v.idfolha " +
                                                    "WHERE v.codmedico = '" + codPrestador + "' AND f.datapag = '" +
                                                    dataPagamento + "'");
                    } catch (SQLException e) {

                    }
                } else {
                    try {
                        String inverteCompetencia = null;
                        inverteCompetencia = Integer.valueOf(competencia.substring(4, 6)) + competencia.substring(0, 4);//de ano/mes para mes/ano 
                        
                        rsSiteunimed =
                                comSQL.executeQuery("SELECT * FROM siteunimed.valprest v INNER JOIN siteunimed.folha f ON f.idfolha = v.idfolha " +
                                                    "WHERE v.codmedico = '" + codPrestador + "' AND f.mesref = '" +
                                                    inverteCompetencia + "'");
                        
                    } catch (SQLException e) {

                    }
                }

                while (rsSiteunimed.next()) {
                    CtPagamentoDados dadosPagamento = new CtPagamentoDados();
                    CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData totaisLiquidos =
                        new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData();
                    CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo totaisLiquidosDemonstrativo =
                        new CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo();
                    CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData pagamentosDataDm =
                        new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData();
                    
                    try {
                        dadosPagamento.setDataPagamento(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsSiteunimed.getDate("datapag"))));
                        if (rsSiteunimed.getString("contapagto") == null) {
                            dadosPagamento.setFormaPagamento("2");
                        } else {
                            dadosPagamento.setFormaPagamento("1");
                        }
                        dadosPagamento.setBanco(rsSiteunimed.getString("bancopagto"));
                        dadosPagamento.setAgencia(rsSiteunimed.getString("agenciapagto"));
                        dadosPagamento.setNrContaCheque(rsSiteunimed.getString("contapagto"));

                        totaisLiquidos.setTotalDebitosPorData(BigDecimal.valueOf(rsSiteunimed.getDouble("valrend")));
                        totaisLiquidos.setTotalCreditosPorData(BigDecimal.valueOf(rsSiteunimed.getDouble("valdesc")));
                        totaisLiquidos.setLiquidoPorData(BigDecimal.valueOf(rsSiteunimed.getDouble("valpago")));

                        totaisLiquidosDemonstrativo.setTotalDebitosDemonstrativo(BigDecimal.valueOf(rsSiteunimed.getDouble("valrend")));
                        totaisLiquidosDemonstrativo.setTotalCreditosdemonstrativo(BigDecimal.valueOf(rsSiteunimed.getDouble("valdesc")));
                        totaisLiquidosDemonstrativo.setValorLiberadoDemonstrativo(BigDecimal.valueOf(rsSiteunimed.getDouble("valpago")));

                        idFolha = rsSiteunimed.getString("idfolha");

                        totaisDemonstrativo.setTotaisLiquidosDemonstrativo(totaisLiquidosDemonstrativo);
                        
                        pagamentosDataDm.setDadosPagamento(dadosPagamento);
                        
                        pagamentosDataDm.setTotaisLiquidosPorData(totaisLiquidos);

                        pagamentos.getPagamentosPorData().add(pagamentosDataDm);

                    } catch (Exception e) {

                    }
                }

                try {

                    ResultSet rsLotesPrestadores =
                        comSQL.executeQuery("SELECT * FROM FAT_LOTES_PRESTADORES_PAGAMENTOS P" +
                                            " INNER JOIN unimed.FAT_LOTES_PRESTADORES L ON L.ID_LOTE_PRESTADOR = P.ID_LOTE_PRESTADOR" +
                                            " WHERE P.FOLHA_PGTO = '" + rsSiteunimed.getString("idfolha") + "'");

                    while (rsLotesPrestadores.next()) {
                        CtDadosResumoDemonstrativo resumoDemonstrativo = new CtDadosResumoDemonstrativo();
                        CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData totaisBrutos =
                            new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData();
                        CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo totaisBrutosDemonstrativo =
                            new CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo();
                        CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo dadosResumo =
                            new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo();
                        CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData pagamentosDataDem =
                            new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData();
                        
                        try {
                            resumoDemonstrativo.setDataProtocolo(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsLotesPrestadores.getDate("DATA_ENTREGA"))));
                            resumoDemonstrativo.setNumeroProtocolo(rsLotesPrestadores.getString("PROTOCOLO_AUTORIZADOR"));
                            resumoDemonstrativo.setNumeroLote(rsLotesPrestadores.getString("ID_LOTE_PRESTADOR"));
                            double valorInformado =
                                rsLotesPrestadores.getDouble("VAL_CON_PAGO") + rsLotesPrestadores.getDouble("VAL_EXA_PAGO") +
                                rsLotesPrestadores.getDouble("VAL_PROC_PAGO") +
                                rsLotesPrestadores.getDouble("VAL_GLOSA");
                            resumoDemonstrativo.setValorInformado(BigDecimal.valueOf(valorInformado));
                            resumoDemonstrativo.setValorProcessado(BigDecimal.valueOf(valorInformado));
                            double valorLiberado =
                                rsLotesPrestadores.getDouble("VAL_CON_PAGO") + rsLotesPrestadores.getDouble("VAL_EXA_PAGO") +
                                rsLotesPrestadores.getDouble("VAL_PROC_PAGO");
                            resumoDemonstrativo.setValorLiberado(BigDecimal.valueOf(valorLiberado));
                            resumoDemonstrativo.setValorGlosa(BigDecimal.valueOf(rsLotesPrestadores.getDouble("VAL_GLOSA")));

                            totaisBrutos.setTotaLiberadoPorData(BigDecimal.valueOf(valorInformado));
                            totaisBrutos.setTotalProcessadoPorData(BigDecimal.valueOf(valorInformado));
                            totaisBrutos.setTotaLiberadoPorData(BigDecimal.valueOf(valorLiberado));
                            totaisBrutos.setTotalGlosaPorData(BigDecimal.valueOf(rsLotesPrestadores.getDouble("VAL_GLOSA")));

                            totaisBrutosDemonstrativo.setValorInformadoBruto(BigDecimal.valueOf(valorInformado));
                            totaisBrutosDemonstrativo.setValorProcessadoBruto(BigDecimal.valueOf(valorInformado));
                            totaisBrutosDemonstrativo.setValorLiberadoBruto(BigDecimal.valueOf(valorLiberado));
                            totaisBrutosDemonstrativo.setValorGlosaBruto(BigDecimal.valueOf(rsLotesPrestadores.getDouble("VAL_GLOSA")));

                            totaisDemonstrativo.setTotaisBrutosDemonstrativo(totaisBrutosDemonstrativo);

                            dadosResumo.getRelacaoProtocolos().add(resumoDemonstrativo);
                            pagamentosDataDem.setDadosResumo(dadosResumo);
                            pagamentosDataDem.setTotaisBrutosPorData(totaisBrutos);                            

                            pagamentos.getPagamentosPorData().add(pagamentosDataDem);

                        } catch (Exception e) {

                        }

                    }

                } catch (SQLException e) {

                }

                try {
                    
                    ResultSet rsExtrato =
                        comSQL.executeQuery("SELECT * FROM siteunimed.extrato WHERE idfolha = '" + idFolha + "' AND codmedico = '" + codPrestador + "'");

                    while (rsExtrato.next()) {
                        CtDescontos descontos = new CtDescontos();
                        CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData debitosCreditos =
                            new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData();
                        CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData pagamentosDataExt =
                            new CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData();
                        
                        if (rsExtrato.getString("tipo") == "+") {
                            descontos.setIndicador("2");
                        } else {
                            descontos.setIndicador("1");
                        }
                        descontos.setTipoDebitoCredito("07");
                        descontos.setDescricaoDbCr(rsExtrato.getString("descevento"));
                        descontos.setValorDbCr(BigDecimal.valueOf(rsExtrato.getDouble("valor")));
                        
                        debitosCreditos.getDebitosCreditos().add(descontos);
                        
                        pagamentosDataExt.setDebitosCreditosPorData(debitosCreditos);
                        
                        pagamentos.getPagamentosPorData().add(pagamentosDataExt);
                    }                    

                } catch (SQLException e) {

                }                

                demPagamento.setCabecalhoDemonstrativo(cabecalho);
                demPagamento.setDadosContratado(contratadoPagamento);
                demPagamento.setTotaisDemonstrativo(totaisDemonstrativo);
                demPagamento.setPagamentos(pagamentos);

                demRetorno.setDemonstrativoPagamento(demPagamento);

                retorno.setDemonstrativoRetorno(demRetorno);

            } catch (SQLException e) {

            }

        } else {
            try {
                resultado =
                        comSQL.executeQuery("SELECT * FROM FAT_SOLICITACAO_DEMONS WHERE ID_DEMONSTRATIVO = " + idDemonstrativo);
                if (resultado.next()) {
                    try {
                        demAnalise.setIdentificacaoOperadora("357022");
                        demAnalise.setNumeroProtocolo(resultado.getString("ID_DEMONSTRATIVO"));
                        demAnalise.setProtocoloSolicitacaoDemonstrativo(resultado.getString("ID_DEMONSTRATIVO"));

                        try {
                            ResultSet rs =
                                comSQL.executeQuery("SELECT UNI_PRESTADORES.CODPRESTADOR, UNI_PRESTADORES.DESCRICAO FROM UNI_PRESTADORES " +
                                                    "WHERE IDPRESTADOR = " + resultado.getString("ID_PRESTADOR"));

                            if (rs.next()) {
                                contratadoAnalise.setCodigoPrestadorNaOperadora(rs.getString("CODPRESTADOR"));
                                contratadoAnalise.setNomeContratado(rs.getString("DESCRICAO"));
                                prestadorRetorno = rs.getString("CODPRESTADOR");
                            }
                        } catch (SQLException e) {

                        }

                        demAnalise.setDadosPrestador(contratadoAnalise);
                        demAnalise.setTipoDemonstrativo("2");
                        demAnalise.setDataSituacaoDemonstrativo(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(data)));
                        demAnalise.setSituacaoDemonstrativo("2"); // 2 - Em Analise
                        demRetorno.setSituacaoDemonstrativoRetorno(demAnalise);

                        retorno.setDemonstrativoRetorno(demRetorno);
                    } catch (Exception e) {

                    }
                }

            } catch (SQLException e) {

            }

        }
        
        //CABECALHO
        CabecalhoTransacao cabecalhoTransacao = new CabecalhoTransacao();
        CabecalhoTransacao.IdentificacaoTransacao identificacao = new CabecalhoTransacao.IdentificacaoTransacao();
        CabecalhoTransacao.Origem origem = new CabecalhoTransacao.Origem();
        CabecalhoTransacao.Destino destino = new CabecalhoTransacao.Destino();
        CtPrestadorIdentificacao identificacaoPrestadorDestino = new CtPrestadorIdentificacao();
        Date dataRetorno = new Date();
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

            identificacaoPrestadorDestino.setCodigoPrestadorNaOperadora(prestadorRetorno);

            destino.setIdentificacaoPrestador(identificacaoPrestadorDestino);

            cabecalhoTransacao.setDestino(destino);

            retorno.setCabecalho(cabecalhoTransacao);

        } catch (Exception e) {

        }

        //CRIA HASH
        Utilitarios utilitarios = new Utilitarios();
        String xmlData = null;
        try {
            JAXBContext context = JAXBContext.newInstance(retorno.getClass());
            Marshaller marshaller = context.createMarshaller();
            //JAXBElement<ProtocoloRecebimentoWS> element = new ObjectFactory().createCtRecebimentoLote(lote);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(retorno, stringWriter);

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

        retorno.setHash(utilitarios.calculaHash(xmlData));

        return retorno;
    }

    public void fatSolicitacaoDemons(int idPrestador, String tipoDemonstrativo, String dataPagamento,
                                     String competencia) {

        if (dataPagamento.equals("null")) {
            dataPagamento = "0000-00-00";
        }

        String registro =
            "INSERT INTO FAT_SOLICITACAO_DEMONS (ID_PRESTADOR, TIPO_DEMONSTRATIVO, DATA_PAGAMENTO, COMPETENCIA) values (" +
            idPrestador + "," + '"' + tipoDemonstrativo + '"' + "," + '"' + dataPagamento + '"' + "," + '"' +
            competencia + '"' + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
            ResultSet rs =
                comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID_DEMONSTRATIVO FROM FAT_SOLICITACAO_DEMONS LIMIT 1");
            if (rs.next()) {
                try {
                    idDemonstrativo = rs.getInt("ID_DEMONSTRATIVO");
                } catch (Exception e) {

                }
            }

        } catch (SQLException e) {
            
        }
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/retorno.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

}
