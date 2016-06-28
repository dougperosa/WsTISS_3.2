package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaDados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaDados.ProcedimentosRealizados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado;
import br.gov.ans.padroes.tiss.schemas.CtLoteStatus;
import br.gov.ans.padroes.tiss.schemas.CtLoteStatus.GuiasTISS.GuiasMedicas;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoDados;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoExecutado;
import br.gov.ans.padroes.tiss.schemas.CtProtocoloStatus;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoProtocolo;
import br.gov.ans.padroes.tiss.schemas.CtValorTotal;
import br.gov.ans.padroes.tiss.schemas.DmSimNao;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloWS;

import java.io.FileWriter;
import java.io.IOException;

import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SolicitacaoStatusProtocolo {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;

    public SolicitacaoStatusProtocolo() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/logando.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public SituacaoProtocoloWS retorno(String protocolo) {
        int status = 1;
        String sql1 =
            "SELECT M.ID_STATUS_LOTE, S.STATUS " + "FROM FAT_LOTES_PRESTADORES LP " + "LEFT JOIN FAT_LOTES_PRESTADORES_ARQUIVOS LPA ON LPA.ID_LOTE_PRESTADOR = LP.ID_LOTE_PRESTADOR " +
            "LEFT JOIN FAU_LOTES L ON L.ID_LOTE = LP.PROTOCOLO_AUTORIZADOR " +
            "LEFT JOIN FAT_MOV_LOTES M ON M.ID_LOTE_PRESTADOR = LP.ID_LOTE_PRESTADOR " +
            "LEFT JOIN FAT_STATUS_LOTES S ON S.ID_STATUS_LOTE = M.ID_STATUS_LOTE " +
            "WHERE LPA.PROTOCOLO_AUTORIZADOR = " + protocolo + " ORDER BY M.DATA_MOV DESC LIMIT 1";

        try {
            resultado = comSQL.executeQuery(sql1);
            if (resultado.next()) {
                if (resultado.getString("STATUS").equals("Concluído")) {
                    status = 3;
                } else {
                    status = 2;
                }
            } else {
                status = 1;
            }
        } catch (SQLException e) {

        }

        SituacaoProtocoloWS retorno = new SituacaoProtocoloWS();
        CtSituacaoProtocolo situacao = new CtSituacaoProtocolo();
        CtProtocoloStatus prot_status = new CtProtocoloStatus();
        CtContratadoDados contratado = new CtContratadoDados();
        CtProtocoloStatus.Lote protLote = new CtProtocoloStatus.Lote();
        CtLoteStatus lote = new CtLoteStatus();
        CtValorTotal valorLote = new CtValorTotal();
        CtLoteStatus.GuiasTISS guiasTiss = new CtLoteStatus.GuiasTISS();

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String prestadorRetorno = null;

        try {
            resultado =
                    comSQL.executeQuery("SELECT UNI_PRESTADORES.CODPRESTADOR, UNI_PRESTADORES.DESCRICAO FROM UNI_PRESTADORES " +
                                        "INNER JOIN FAU_LOTES ON UNI_PRESTADORES.IDPRESTADOR = FAU_LOTES.ID_PRESTADOR " +
                                        "WHERE FAU_LOTES.ID_LOTE = " + protocolo);
            if (resultado.next()) {
                contratado.setCodigoPrestadorNaOperadora(resultado.getString("CODPRESTADOR"));
                contratado.setNomeContratado(resultado.getString("DESCRICAO"));
                prestadorRetorno = resultado.getString("CODPRESTADOR");
            }
        } catch (SQLException e) {

        }

        prot_status.setDadosPrestador(contratado);
        prot_status.setIdentificacaoOperadora("357022");

        if (status != 3) {

            try {
                resultado =
                        comSQL.executeQuery("SELECT * FROM FAU_ENV_ARQ_GUIAS " + "INNER JOIN FAU_ENV_ARQ ON FAU_ENV_ARQ_GUIAS.ID_ARQUIVO = FAU_ENV_ARQ.ID_ARQUIVO " +
                                            "WHERE FAU_ENV_ARQ.ID_LOTE = " + protocolo);

                while (resultado.next()) {
                    GuiasMedicas guiasMedicas = new GuiasMedicas();
                    CtGuiaDados guiasDados = new CtGuiaDados();
                    CtBeneficiarioDados beneficiario = new CtBeneficiarioDados();

                    try {
                        guiasDados.setNumeroGuiaOperadora(resultado.getString("NUMERO_GUIA_PRESTADOR"));
                        guiasDados.setDataRealizacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_REALIZACAO"))));
                    } catch (Exception e) {
                    }

                    beneficiario.setNumeroCarteira(resultado.getString("NUMERO_CARTEIRA"));
                    DmSimNao tipo;

                    if (resultado.getString("ATENDIMENTO_RN").equals("S")) {
                        tipo = DmSimNao.S;
                    } else {
                        tipo = DmSimNao.N;
                    }

                    beneficiario.setAtendimentoRN(tipo);
                    beneficiario.setNomeBeneficiario(resultado.getString("NOME_BENEFICIARIO"));

                    guiasDados.setDadosBeneficiario(beneficiario);

                    guiasMedicas.setGuias(guiasDados);
                    guiasTiss.getGuiasMedicas().add(guiasMedicas);
                    lote.setGuiasTISS(guiasTiss);
                }

            } catch (SQLException e) {

            }

            lote.setStatusProtocolo(String.valueOf(status));
            lote.setNumeroProtocolo(protocolo);

            try {
                resultado = comSQL.executeQuery("SELECT DATA_FECHAMENTO FROM FAU_LOTES WHERE ID_LOTE = " + protocolo);
                if (resultado.next()) {
                    try {
                        lote.setDataEnvioLote(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_FECHAMENTO"))));
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException e) {

            }

            BigDecimal valor = new BigDecimal("0.00");
            valorLote.setValorProcessado(valor);
            valorLote.setValorGlosa(valor);
            valorLote.setValorLiberado(valor);

            lote.setValorTotalLote(valorLote);

            protLote.setDetalheLote(lote);

            prot_status.setLote(protLote);

            situacao.setSituacaoDoProtocolo(prot_status);

            retorno.setSituacaoProtocolo(situacao);

        } else {

            String idLote = null;
            String sql2 =
                "SELECT LP.ID_LOTE_PRESTADOR FROM FAT_LOTES_PRESTADORES LP " + "LEFT JOIN FAT_LOTES_PRESTADORES_ARQUIVOS LPA ON LPA.ID_LOTE_PRESTADOR = LP.ID_LOTE_PRESTADOR " +
                "LEFT JOIN FAU_LOTES L ON L.ID_LOTE = LP.PROTOCOLO_AUTORIZADOR " +
                "LEFT JOIN FAT_MOV_LOTES M ON M.ID_LOTE_PRESTADOR = LP.ID_LOTE_PRESTADOR " +
                "LEFT JOIN FAT_STATUS_LOTES S ON S.ID_STATUS_LOTE = M.ID_STATUS_LOTE " +
                "WHERE LPA.PROTOCOLO_AUTORIZADOR = " + protocolo + " ORDER BY M.DATA_MOV DESC LIMIT 1";
            try {
                resultado = comSQL.executeQuery(sql2);
                if (resultado.next()) {
                    idLote = String.valueOf(resultado.getInt("ID_LOTE_PRESTADOR"));
                }
            } catch (SQLException e) {

            }

            double total;
            String sql3 =
                "SELECT SUM(FAT_PRODUCAO_SERVICOS_VALORES.HM_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.HM_TAXA + FAT_PRODUCAO_SERVICOS_VALORES.CO_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.CO_TAXA + FAT_PRODUCAO_SERVICOS_VALORES.FILME_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.FILME_TAXA) AS TOTAL " +
                "FROM FAT_PRODUCAO_SERVICOS_VALORES " +
                "LEFT JOIN UNI_DOMINIOS_TERMOS_CODIGO AS PAG_COB ON PAG_COB.ID_DOMINIO_TERMO = FAT_PRODUCAO_SERVICOS_VALORES.ID_TIPO " +
                "WHERE (FAT_PRODUCAO_SERVICOS_VALORES.ID_LOTE_PRESTADOR = " + idLote + ") AND (PAG_COB.CODIGO = 'P')";

            try {
                ResultSet rs = comSQL.executeQuery(sql3);
                if (rs.next()) {
                    total = rs.getDouble("TOTAL");
                    BigDecimal valorGlosa = new BigDecimal("0.00");
                    BigDecimal valorProcessado = new BigDecimal(String.valueOf(total));
                    BigDecimal valorLiberado = new BigDecimal(String.valueOf(total));
                    valorLote.setValorProcessado(valorProcessado);
                    valorLote.setValorGlosa(valorGlosa);
                    valorLote.setValorLiberado(valorLiberado);
                }
            } catch (SQLException e) {

            }

            String idLotePrestador = null, idProducao = null;
            String sql4 =
                "SELECT * FROM FAT_PRODUCAO P LEFT JOIN FAT_PRODUCAO_AUX A ON A.ID_PRODUCAO = P.ID " + "WHERE P.ID_LOTE_PRESTADOR = " +
                idLote;

            try {
                resultado = comSQL.executeQuery(sql4);
                while (resultado.next()) {
                    try {
                        GuiasMedicas guiasMedicas = new GuiasMedicas();
                        CtGuiaDados guiasDados = new CtGuiaDados();
                        CtBeneficiarioDados beneficiario = new CtBeneficiarioDados();
                        CtValorTotal valorGuia = new CtValorTotal();
                        ProcedimentosRealizados procedimentos = new ProcedimentosRealizados();
                        ProcedimentoRealizado procedimento = new ProcedimentoRealizado();
                        CtProcedimentoDados procedDados = new CtProcedimentoDados();

                        idLotePrestador = resultado.getString("ID_LOTE_PRESTADOR");
                        idProducao = resultado.getString("ID");

                        guiasDados.setNumeroGuiaPrestador(resultado.getString("NUMERO_GUIA_TISS_PRESTADOR"));
                        guiasDados.setNumeroGuiaOperadora(resultado.getString("NUMERO_GUIA_TISS_OPERADORA"));
                        guiasDados.setDataRealizacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA"))));

                        beneficiario.setNumeroCarteira(resultado.getString("CODIGO_BENEFICIARIO"));
                        DmSimNao tipo;
                        if (resultado.getString("RECEM_NASCIDO") == "S") {
                            tipo = DmSimNao.S;
                        } else {
                            tipo = DmSimNao.N;
                        }
                        beneficiario.setAtendimentoRN(tipo);
                        beneficiario.setNomeBeneficiario(resultado.getString("NOME_BENEFICIARIO"));

                        guiasDados.setDadosBeneficiario(beneficiario);

                        String sql5 =
                            "SELECT (FAT_PRODUCAO_SERVICOS_VALORES.HM_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.HM_TAXA + FAT_PRODUCAO_SERVICOS_VALORES.CO_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.CO_TAXA + FAT_PRODUCAO_SERVICOS_VALORES.FILME_VALOR + FAT_PRODUCAO_SERVICOS_VALORES.FILME_TAXA) AS TOTAL " +
                            "FROM FAT_PRODUCAO_SERVICOS_VALORES " +
                            "LEFT JOIN FAT_PRODUCAO_SERVICOS ON FAT_PRODUCAO_SERVICOS.ID = FAT_PRODUCAO_SERVICOS_VALORES.ID_PRODUCAO_SERVICO " +
                            "LEFT JOIN UNI_DOMINIOS_TERMOS_CODIGO AS PAG_COB ON PAG_COB.ID_DOMINIO_TERMO = FAT_PRODUCAO_SERVICOS_VALORES.ID_TIPO " +
                            "WHERE (FAT_PRODUCAO_SERVICOS.ID_PRODUCAO = " + resultado.getString("ID") + ")" +
                            " AND (PAG_COB.CODIGO = 'P')";

                        try {
                            conectorBD conexao = new conectorBD();
                            Statement comSql2 = conexao.getComandoBD();
                            ResultSet rs = comSql2.executeQuery(sql5);
                            if (rs.next()) {
                                BigDecimal valorGlosa = new BigDecimal("0.00");
                                BigDecimal valorLiberado = new BigDecimal(String.valueOf(rs.getDouble("TOTAL")));
                                BigDecimal valorProcessado = new BigDecimal(String.valueOf(rs.getDouble("TOTAL")));
                                valorGuia.setValorGlosa(valorGlosa);
                                valorGuia.setValorLiberado(valorLiberado);
                                valorGuia.setValorProcessado(valorProcessado);
                                guiasDados.setVlInformadoGuia(valorGuia);
                            }
                            conexao.encerraConexao();
                        } catch (SQLException e) {

                        }

                        String sql6 =
                            "SELECT * FROM FAT_PRODUCAO_SERVICOS_VALORES " + "LEFT JOIN FAT_PRODUCAO_SERVICOS ON FAT_PRODUCAO_SERVICOS.ID = FAT_PRODUCAO_SERVICOS_VALORES.ID_PRODUCAO_SERVICO " +
                            "LEFT JOIN UNI_PROCEDIMENTOS ON UNI_PROCEDIMENTOS.IDPROCEDIMENTO = FAT_PRODUCAO_SERVICOS.ID_SERVICO " +
                            "LEFT JOIN UNI_DOMINIOS_TERMOS_CODIGO AS PAG_COB ON PAG_COB.ID_DOMINIO_TERMO = FAT_PRODUCAO_SERVICOS_VALORES.ID_TIPO " +
                            "WHERE (FAT_PRODUCAO_SERVICOS.ID_PRODUCAO =  " + resultado.getString("ID") + ")" +
                            " AND (PAG_COB.CODIGO = 'P')";

                        try {
                            conectorBD conexao2 = new conectorBD();
                            Statement comSql3 = conexao2.getComandoBD();
                            ResultSet rs2 = comSql3.executeQuery(sql6);
                            if (rs2.next()) {
                                try {
                                    //procedDados.setCodigoTabela(rs2.getString("COD_ANS"));
                                    procedDados.setCodigoProcedimento(rs2.getString("CODPROCEDIMENTO"));
                                    procedDados.setDescricaoProcedimento(rs2.getString("DESCRICAO"));
                                    BigDecimal quant = new BigDecimal(String.valueOf(rs2.getString("QUANTIDADE")));
                                    procedimento.setQuantidadeExecutada(quant);
                                    procedimento.setProcedimento(procedDados);
                                    procedimento.setDataExecucao(DatatypeFactory.newInstance().newXMLGregorianCalendar((sd.format(rs2.getDate("DATA")))));

                                    BigDecimal valorUnitario =
                                        new BigDecimal((rs2.getDouble("HM_VALOR") + rs2.getDouble("HM_TAXA") +
                                                        rs2.getDouble("CO_VALOR") + rs2.getDouble("CO_TAXA") +
                                                        rs2.getDouble("FILME_VALOR") + rs2.getDouble("FILME_TAXA")) /
                                                       rs2.getDouble("QUANTIDADE"));
                                    BigDecimal valorTotal =
                                        new BigDecimal(rs2.getDouble("HM_VALOR") + rs2.getDouble("HM_TAXA") +
                                                       rs2.getDouble("CO_VALOR") + rs2.getDouble("CO_TAXA") +
                                                       rs2.getDouble("FILME_VALOR") + rs2.getDouble("FILME_TAXA"));
                                    procedimento.setValorUnitario(valorUnitario);
                                    procedimento.setValorTotal(valorTotal);
                                    procedimentos.getProcedimentoRealizado().add(procedimento);

                                    guiasDados.setProcedimentosRealizados(procedimentos);
                                } catch (Exception e) {

                                }
                            }
                            conexao2.encerraConexao();
                        } catch (SQLException e) {
                            
                        }

                        guiasMedicas.setGuias(guiasDados);
                        guiasTiss.getGuiasMedicas().add(guiasMedicas);
                        lote.setGuiasTISS(guiasTiss);

                    } catch (Exception e) {

                    }
                }
            } catch (SQLException e) {

            }

            lote.setStatusProtocolo(String.valueOf(status));
            lote.setNumeroProtocolo(protocolo);

            try {
                resultado = comSQL.executeQuery("SELECT DATA_FECHAMENTO FROM FAU_LOTES WHERE ID_LOTE = " + protocolo);
                if (resultado.next()) {
                    try {
                        lote.setDataEnvioLote(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_FECHAMENTO"))));
                    } catch (Exception e) {
                    }
                }
            } catch (SQLException e) {

            }

            lote.setValorTotalLote(valorLote);

            protLote.setDetalheLote(lote);

            prot_status.setLote(protLote);

            situacao.setSituacaoDoProtocolo(prot_status);

            retorno.setSituacaoProtocolo(situacao);

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

}
