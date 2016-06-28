package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.com.unimederechim.ws.Constantes;
import br.com.unimederechim.util.Utilitarios;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaDados;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtProtocoloDetalhe;
import br.gov.ans.padroes.tiss.schemas.CtProtocoloRecebimento;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoLote;
import br.gov.ans.padroes.tiss.schemas.CtmGuiaLote;
import br.gov.ans.padroes.tiss.schemas.CtmGuiaLote.GuiasTISS;
import br.gov.ans.padroes.tiss.schemas.DmSimNao;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.LoteGuiasWS;
import br.gov.ans.padroes.tiss.schemas.ObjectFactory;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoWS;
import br.gov.ans.tiss.ws.tipos.tissloteguias.v30200.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import java.util.GregorianCalendar;


import javax.swing.JOptionPane;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;

import org.apache.openjpa.util.BigDecimalId;

import org.w3c.dom.Document;
import org.w3c.dom.Entity;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class LoteGuias {

    private String arquivoXML;
    private LoteGuiasWS loteGuias;
    private String ip;
    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    private int idArquivo = 0;

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/log_loteguias.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public LoteGuias(LoteGuiasWS loteGuias) {

        try {
            this.arquivoXML = "";
            this.loteGuias = loteGuias;
            this.setIp("");
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }

    }

    public ProtocoloRecebimentoWS retorno(String idLote) {

        ProtocoloRecebimentoWS retorno = new ProtocoloRecebimentoWS();
        CtRecebimentoLote lote = new CtRecebimentoLote();
        CtProtocoloRecebimento prot = new CtProtocoloRecebimento();
        CtProtocoloDetalhe detalhe = new CtProtocoloDetalhe();
        CtProtocoloDetalhe.DadosGuiasProtocolo guiasProtocolo = new CtProtocoloDetalhe.DadosGuiasProtocolo();
        Utilitarios utilitarios = new Utilitarios();

        CtContratadoDados prestador = new CtContratadoDados();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdh = new SimpleDateFormat("hh:mm:ss");

        String registroANS, numeroLote = null;
        XMLGregorianCalendar dataEnvioLote = null;

        registroANS = "357022";
        String prestadorRetorno = null;

        try {
            resultado =
                    comSQL.executeQuery("SELECT UNI_PRESTADORES.CODPRESTADOR, UNI_PRESTADORES.IDPRESTADOR, UNI_PRESTADORES.DESCRICAO FROM UNI_PRESTADORES INNER JOIN FAU_LOTES ON UNI_PRESTADORES.IDPRESTADOR = FAU_LOTES.ID_PRESTADOR WHERE FAU_LOTES.ID_LOTE = " +
                                        idLote);
            if (resultado.next()) {
                prestador.setCodigoPrestadorNaOperadora(resultado.getString("IDPRESTADOR"));
                prestador.setNomeContratado(resultado.getString("DESCRICAO"));
                prestadorRetorno = resultado.getString("CODPRESTADOR");
            }
        } catch (SQLException e) {

        }
        try {
            resultado =
                    comSQL.executeQuery("SELECT FAU_ENV_ARQ.NUMERO_LOTE_PRESTADOR FROM FAU_ENV_ARQ INNER JOIN FAU_LOTES ON FAU_ENV_ARQ.ID_LOTE = FAU_LOTES.ID_LOTE WHERE FAU_LOTES.ID_LOTE = " +
                                        idLote);
            if (resultado.next()) {
                numeroLote = resultado.getString("NUMERO_LOTE_PRESTADOR");
            }
        } catch (SQLException e) {

        }
        try {
            resultado = comSQL.executeQuery("SELECT DATA_FECHAMENTO FROM FAU_LOTES WHERE ID_LOTE = " + idLote);
            if (resultado.next()) {
                try {
                    dataEnvioLote =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_FECHAMENTO")));
                } catch (Exception e) {
                }
            }
        } catch (SQLException e) {

        }

        String numeroGuiaPrestador = null;
        XMLGregorianCalendar dataRealizacao = null;
        double valor = 0.0;
        BigDecimal valorTotal = null;
        try {
            ResultSet rs = comSQL.executeQuery("SELECT * FROM FAU_ENV_ARQ_GUIAS WHERE ID_ARQUIVO = " + idArquivo);

            while (rs.next()) {
                try {
                    CtGuiaDados guia = new CtGuiaDados();
                    CtBeneficiarioDados beneficiario = new CtBeneficiarioDados();

                    dataRealizacao =
                            DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA_REALIZACAO")));
                    beneficiario.setNumeroCarteira(rs.getString("NUMERO_CARTEIRA"));
                    valor = valor + rs.getDouble("VALOR_TOTAL");
                    DmSimNao tipo;
                    if (rs.getString("ATENDIMENTO_RN").equals("S")) {
                        tipo = DmSimNao.S;
                    } else {
                        tipo = DmSimNao.N;
                    }
                    beneficiario.setAtendimentoRN(tipo);
                    beneficiario.setNomeBeneficiario(rs.getString("NOME_BENEFICIARIO"));

                    guia.setNumeroGuiaPrestador(numeroGuiaPrestador);
                    guia.setDadosBeneficiario(beneficiario);
                    guia.setDataRealizacao(dataRealizacao);

                    guiasProtocolo.getDadosGuias().add(guia);
                } catch (Exception e) {

                }
            }

            valorTotal = BigDecimal.valueOf(valor);

        } catch (SQLException e) {

        }

        detalhe.setDadosGuiasProtocolo(guiasProtocolo);
        detalhe.setNumeroProtocolo(idLote);
        detalhe.setValorTotalProtocolo(valorTotal);

        prot.setRegistroANS(registroANS);
        prot.setDadosPrestador(prestador);
        prot.setNumeroLote(numeroLote);
        prot.setDataEnvioLote(dataEnvioLote);
        prot.setDetalheProtocolo(detalhe);

        lote.setProtocoloRecebimento(prot);

        retorno.setRecebimentoLote(lote);

        //CABECALHO
        CabecalhoTransacao cabecalho = new CabecalhoTransacao();
        CabecalhoTransacao.IdentificacaoTransacao identificacao = new CabecalhoTransacao.IdentificacaoTransacao();
        CabecalhoTransacao.Origem origem = new CabecalhoTransacao.Origem();
        CabecalhoTransacao.Destino destino = new CabecalhoTransacao.Destino();
        CtPrestadorIdentificacao identificacaoPrestadorDestino = new CtPrestadorIdentificacao();
        Date data = new Date();
        DmTipoTransacao tipo;

        try {

            tipo = DmTipoTransacao.PROTOCOLO_RECEBIMENTO;

            identificacao.setTipoTransacao(tipo);


            identificacao.setDataRegistroTransacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(data)));
            identificacao.setHoraRegistroTransacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sdh.format(data)));

            cabecalho.setIdentificacaoTransacao(identificacao);

            origem.setRegistroANS(registroANS);

            cabecalho.setOrigem(origem);

            identificacaoPrestadorDestino.setCodigoPrestadorNaOperadora(prestadorRetorno);

            destino.setIdentificacaoPrestador(identificacaoPrestadorDestino);

            cabecalho.setDestino(destino);

            retorno.setCabecalho(cabecalho);

        } catch (Exception e) {

        }

        //CRIA HASH
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

    public int fauLotes(int id_prestador, String descricao, String fechado, String data_fechamento,
                        int id_usuario_fechamento) {

        int id_lote = 0;
        String registro =
            "INSERT INTO FAU_LOTES (ID_PRESTADOR, DESCRICAO, FECHADO, DATA_FECHAMENTO, ID_USUARIO_FECHAMENTO) values " +
            "(" + id_prestador + "," + '"' + descricao + '"' + "," + '"' + fechado + '"' + "," + '"' +
            data_fechamento + '"' + "," + id_usuario_fechamento + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
            ResultSet rs = comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID_LOTE FROM FAU_LOTES LIMIT 1");
            if (rs.next()) {
                id_lote = rs.getInt("ID_LOTE");
            }
        } catch (SQLException e) {

        }

        return id_lote;

    }

    public void fauEnvArq(int id_lote, String nome_arq_enviado, String nome_arq_fat, String data_envio,
                          int id_prestador, String estado, int numero_lote_prestador) {

        String registro =
            "INSERT INTO FAU_ENV_ARQ (ID_LOTE, NOME_ARQ_ENVIADO, NOME_ARQ_FAT, DATA_ENVIO, ID_PRESTADOR, ESTADO, NUMERO_LOTE_PRESTADOR) values " +
            "(" + id_lote + "," + '"' + nome_arq_enviado + '"' + "," + '"' + nome_arq_fat + '"' + "," + '"' +
            data_envio + '"' + "," + id_prestador + " ," + '"' + estado + '"' + "," + numero_lote_prestador + ")";

        ResultSet rs = null;
        try {
            int resultado = comSQL.executeUpdate(registro);
            rs = comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID_ARQUIVO FROM FAU_ENV_ARQ LIMIT 1");

            if (rs.next()) {
                idArquivo = rs.getInt("ID_ARQUIVO");
            }
        } catch (SQLException e) {

        }

        Date data = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        DadosBeneficiario beneficiario = new DadosBeneficiario();
        TiposDados.SimNao atendimento;
        String guiaPrestador = null;
        double valor = 0.0;

        try {
            if (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(0).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                false) {

                int i = 0;
                while (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                       false) {

                    beneficiario.setNomeBeneficiario(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario());
                    beneficiario.setNumeroCarteira(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNumeroCarteira());
                    if (String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getAtendimentoRN()).equals("S")) {
                        atendimento = TiposDados.SimNao.SIM;
                    } else {
                        atendimento = TiposDados.SimNao.NAO;
                    }

                    beneficiario.setAtendimentoRN(atendimento);
                    guiaPrestador =
                            String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getCabecalhoGuia().getNumeroGuiaPrestador());

                    double valor1 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorDiarias()));
                    double valor2 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorGasesMedicinais()));
                    double valor3 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorMateriais()));
                    double valor4 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorMedicamentos()));
                    double valor5 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorOPME()));
                    double valor6 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorProcedimentos()));
                    double valor7 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorTaxasAlugueis()));
                    double valor8 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getValorTotal().getValorTotalGeral()));

                    valor = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8;

                    fauEnvArqGuias(idArquivo, guiaPrestador, String.valueOf(beneficiario.getNumeroCarteira()),
                                   String.valueOf(beneficiario.getAtendimentoRN()),
                                   String.valueOf(beneficiario.getNomeBeneficiario()), sd.format(data), valor);

                    i++;
                }
            }
        } catch (Exception e) {

        }

        try {
            if (loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(0).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                false) {

                int i = 0;
                while (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                       false) {

                    beneficiario.setNomeBeneficiario(loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(i).getDadosBeneficiario().getNomeBeneficiario());
                    beneficiario.setNumeroCarteira(loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(i).getDadosBeneficiario().getNumeroCarteira());
                    if (String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(i).getDadosBeneficiario().getAtendimentoRN()).equals("S")) {
                        atendimento = TiposDados.SimNao.SIM;
                    } else {
                        atendimento = TiposDados.SimNao.NAO;
                    }
                    beneficiario.setAtendimentoRN(atendimento);
                    guiaPrestador =
                            loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(i).getCabecalhoConsulta().getNumeroGuiaPrestador();

                    valor =
                            verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaConsulta().get(i).getDadosAtendimento().getProcedimento().getValorProcedimento()));

                    fauEnvArqGuias(idArquivo, guiaPrestador, String.valueOf(beneficiario.getNumeroCarteira()),
                                   String.valueOf(beneficiario.getAtendimentoRN()),
                                   String.valueOf(beneficiario.getNomeBeneficiario()), sd.format(data), valor);

                    i++;
                }
            }
        } catch (Exception e) {

        }

        try {
            if (loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(0).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                false) {

                int i = 0;
                while (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                       false) {

                    beneficiario.setNomeBeneficiario(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getDadosBeneficiario().getNomeBeneficiario());
                    beneficiario.setNumeroCarteira(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getDadosBeneficiario().getNumeroCarteira());
                    if (String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getDadosBeneficiario().getAtendimentoRN()).equals("S")) {
                        atendimento = TiposDados.SimNao.SIM;
                    } else {
                        atendimento = TiposDados.SimNao.NAO;
                    }
                    beneficiario.setAtendimentoRN(atendimento);
                    guiaPrestador =
                            loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getCabecalhoGuia().getNumeroGuiaPrestador();

                    double valor1 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorDiarias()));
                    double valor2 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorGasesMedicinais()));
                    double valor3 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorMateriais()));
                    double valor4 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorMedicamentos()));
                    double valor5 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorOPME()));
                    double valor6 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorProcedimentos()));
                    double valor7 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorTaxasAlugueis()));
                    double valor8 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaResumoInternacao().get(i).getValorTotal().getValorTotalGeral()));

                    valor = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8;

                    fauEnvArqGuias(idArquivo, guiaPrestador, String.valueOf(beneficiario.getNumeroCarteira()),
                                   String.valueOf(beneficiario.getAtendimentoRN()),
                                   String.valueOf(beneficiario.getNomeBeneficiario()), sd.format(data), valor);

                    i++;
                }
            }
        } catch (Exception e) {

        }

        try {
            if (loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(0).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                false) {

                int i = 0;
                while (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                       false) {

                    beneficiario.setNomeBeneficiario(loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getDadosBeneficiario().getNomeBeneficiario());
                    beneficiario.setNumeroCarteira(loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getDadosBeneficiario().getNumeroCarteira());
                    if (String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getDadosBeneficiario().getAtendimentoRN()).equals("S")) {
                        atendimento = TiposDados.SimNao.SIM;
                    } else {
                        atendimento = TiposDados.SimNao.NAO;
                    }
                    beneficiario.setAtendimentoRN(atendimento);
                    guiaPrestador =
                            loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getNumeroGuiaPrestador();

                    double valor1 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getValorTotalProc()));
                    double valor2 =
                        verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaOdonto().get(i).getValorTotalFranquia()));

                    valor = valor1 + valor2;

                    fauEnvArqGuias(idArquivo, guiaPrestador, String.valueOf(beneficiario.getNumeroCarteira()),
                                   String.valueOf(beneficiario.getAtendimentoRN()),
                                   String.valueOf(beneficiario.getNomeBeneficiario()), sd.format(data), valor);

                    i++;
                }
            }
        } catch (Exception e) {

        }

        try {
            if (loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(0).getBeneficiario().getNomeBeneficiario().isEmpty() ==
                false) {

                int i = 0;
                while (loteGuias.getLoteGuias().getGuiasTISS().getGuiaSPSADT().get(i).getDadosBeneficiario().getNomeBeneficiario().isEmpty() ==
                       false) {

                    beneficiario.setNomeBeneficiario(loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(i).getBeneficiario().getNomeBeneficiario());
                    beneficiario.setNumeroCarteira(loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(i).getBeneficiario().getNumeroCarteira());
                    if (String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(i).getBeneficiario().getAtendimentoRN()).equals("S")) {
                        atendimento = TiposDados.SimNao.SIM;
                    } else {
                        atendimento = TiposDados.SimNao.NAO;
                    }
                    beneficiario.setAtendimentoRN(atendimento);
                    guiaPrestador =
                            loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(i).getCabecalhoGuia().getNumeroGuiaPrestador();

                    valor =
                            verificaValor(String.valueOf(loteGuias.getLoteGuias().getGuiasTISS().getGuiaHonorarios().get(i).getValorTotalHonorarios()));

                    fauEnvArqGuias(idArquivo, guiaPrestador, String.valueOf(beneficiario.getNumeroCarteira()),
                                   String.valueOf(beneficiario.getAtendimentoRN()),
                                   String.valueOf(beneficiario.getNomeBeneficiario()), sd.format(data), valor);

                    i++;
                }
            }
        } catch (Exception e) {

        }


    }

    public void fauEnvArqGuias(int id_arquivo, String numero_guia_prestador, String numero_carteira,
                               String atendimento_rn, String nome_beneficiario, String data_realizacao,
                               double valorTotal) {

        String registro =
            "INSERT INTO FAU_ENV_ARQ_GUIAS (ID_ARQUIVO, NUMERO_GUIA_PRESTADOR, NUMERO_CARTEIRA, ATENDIMENTO_RN, NOME_BENEFICIARIO, DATA_REALIZACAO, VALOR_TOTAL) values " +
            "(" + id_arquivo + "," + '"' + numero_guia_prestador + '"' + "," + '"' + numero_carteira + '"' + "," +
            '"' + atendimento_rn + '"' + "," + '"' + nome_beneficiario + '"' + "," + '"' + data_realizacao + '"' +
            "," + valorTotal + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public String nomeArquivo() {
        String codigoPrestador, arquivo = null;
        int idPrestador;

        codigoPrestador =
                loteGuias.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora();

        VerificaElegibilidade eleg = new VerificaElegibilidade();
        idPrestador = eleg.idPrestador(null, null, codigoPrestador);

        java.util.Date data = new java.util.Date();

        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        SimpleDateFormat dia = new SimpleDateFormat("dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);

        arquivo =
                codigoPrestador + String.format("%06d", idPrestador) + ano.format(data) + mes.format(data) + dia.format(data) +
                String.valueOf(hora) + String.valueOf(minuto) + String.valueOf(segundo) + ".xml";

        return arquivo;
    }

    public boolean saveXML() {
        try {
            //File file = new File(this.arquivoXML);

            JAXBContext context = JAXBContext.newInstance(this.loteGuias.getClass());
            Marshaller marshaller = context.createMarshaller();
            //JAXBElement<LoteGuiasWS> element = new ObjectFactory().createLoteGuias(this.loteGuias);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(this.loteGuias, stringWriter);
            String xml = stringWriter.toString();

            xml = xml.replace("<loteGuiasWS", "<mensagemTISS");
            xml = xml.replace("</loteGuiasWS>", "</mensagemTISS>");
            xml = xml.replace("<cabecalho>", "<cabecalho>");
            xml = xml.replace("</cabecalho>", "</cabecalho>\n<prestadorParaOperadora>");
            xml = xml.replace("<loteGuias>", "<loteGuias>");
            xml = xml.replace("</loteGuias>", "</loteGuias>\n</prestadorParaOperadora>");
            xml = xml.replace("<hash>", "<epilogo>\n<hash>");
            xml = xml.replace("</hash>", "</hash>\n</epilogo>");
            xml = xml.replace("ns2:", "");
            xml = xml.replace("ns2=", "ans=");
            xml = xml.replace("<", "<ans:");
            xml = xml.replace("ans:/", "/ans:");
            xml = xml.replace("<ans:?xml", "<?xml");

            int posicaoUserInicial = verificaPosicaoString(xml, "<ans:loginSenhaPrestador>");
            int posicaoUserFinal = verificaPosicaoString(xml, "</ans:loginSenhaPrestador>");

            xml = xml.replace(xml.substring(posicaoUserInicial, posicaoUserFinal + 26), "");

            int posicao = verificaPosicaoString(xml, "<ans:cabecalho>");
            xml =
xml.replace(xml.substring(0, posicao), "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<ans:mensagemTISS xmlns:ans=\"http://www.ans.gov.br/padroes/tiss/schemas\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.ans.gov.br/padroes/tiss/schemas http://www.ans.gov.br/padroes/tiss/schemas/tissV3_02_00.xsd\">");

            String nomeArquivo = nomeArquivo();
            FileWriter fw = new FileWriter("/mnt/autorizador/" + nomeArquivo, false);
            fw.write(xml);
            fw.write("\n");
            fw.close();
            //marshaller.marshal(element, file);
            return true;

        } catch (JAXBException e) {
            return false;
        } catch (ParserConfigurationException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public int verificaPosicaoString(String arquivo, String encontrar) {
        int posicao = 0;
        int contador = arquivo.length();
        for (int i = 0; i < contador; i++) {
            if (arquivo.substring(i, i + encontrar.length()).equals(encontrar)) {
                posicao = i;
                break;
            }
        }
        return posicao;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public double verificaValor(String valor) {

        double retorno = 0.0;

        if (valor.equals("null")) {
            gravaLog("1");
            retorno = 0.0;
        } else {
            gravaLog("2");
            retorno = Double.valueOf(valor);
        }

        return retorno;
    }

}
