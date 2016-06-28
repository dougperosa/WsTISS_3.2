package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtReciboComunicacao;
import br.gov.ans.padroes.tiss.schemas.CtmBeneficiarioComunicacao;
import br.gov.ans.padroes.tiss.schemas.CtmBeneficiarioComunicacaoRecibo;
import br.gov.ans.padroes.tiss.schemas.DmSimNao;
import br.gov.ans.padroes.tiss.schemas.DmTipoEvento;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.ReciboComunicacaoWS;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

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

public class ComunicacaoInternacao {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    private int idComunicaoInternacao;

    public ComunicacaoInternacao() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public ReciboComunicacaoWS retorno() {

        ReciboComunicacaoWS recibo = new ReciboComunicacaoWS();
        CtReciboComunicacao comunicacao = new CtReciboComunicacao();
        CtmBeneficiarioComunicacaoRecibo comunicacaoRecibo = new CtmBeneficiarioComunicacaoRecibo();
        CtMotivoGlosa glosa = new CtMotivoGlosa();
        CtmBeneficiarioComunicacao beneficiarioComunicacao = new CtmBeneficiarioComunicacao();
        CtBeneficiarioDados beneficiario = new CtBeneficiarioDados();
        CtmBeneficiarioComunicacao.DadosInternacao internacao = new CtmBeneficiarioComunicacao.DadosInternacao();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        try {
            resultado =
                    comSQL.executeQuery("SELECT * FROM AUT_COMUNICACAO_INTERNACAO WHERE ID = " + idComunicaoInternacao);
            if (resultado.next()) {

                try {

                    DmSimNao status;
                    if (resultado.getString("STATUS") == "S") {
                        status = DmSimNao.S;
                    } else {
                        status = DmSimNao.N;
                    }
                    comunicacaoRecibo.setStatusComunicacao(status);

                    beneficiario.setNumeroCarteira(resultado.getString("NUMERO_CARTEIRA"));
                    DmSimNao atendimentoRn;
                    if (resultado.getString("ATENDIMENOT_RN") == "S") {
                        atendimentoRn = DmSimNao.S;
                    } else {
                        atendimentoRn = DmSimNao.N;
                    }
                    beneficiario.setAtendimentoRN(atendimentoRn);
                    beneficiario.setNomeBeneficiario(resultado.getString("NOME_BENEFICIARIO"));
                    beneficiario.setNumeroCNS(resultado.getString("CNS"));

                    beneficiarioComunicacao.setDadosBeneficiario(beneficiario);


                    beneficiarioComunicacao.setDataEvento(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_EVENTO"))));

                    DmTipoEvento tipo;
                    if (resultado.getString("TIPO_EVENTO") == "A") {
                        tipo = DmTipoEvento.A;
                        internacao.setMotivoEncerramento(resultado.getString("MOTIVO_ENCERRAMENTO"));
                        glosa.setCodigoGlosa(resultado.getString("COD_MENSAGEM"));

                        try {
                            ResultSet rs =
                                comSQL.executeQuery("SELECT MENSAGEM FROM AUT_MENSAGENS WHERE ID_MENSAGEM = " +
                                                    resultado.getString("COD_MENSAGEM"));
                            if (resultado.next()) {
                                glosa.setDescricaoGlosa(rs.getString("MENSAGEM"));
                            }
                        } catch (SQLException e) {

                        }

                        comunicacaoRecibo.setMensagemErro(glosa);

                    } else {
                        tipo = DmTipoEvento.I;
                        internacao.setTipoInternacao(resultado.getString("TIPO_INTERNACAO"));
                    }
                    beneficiarioComunicacao.setTipoEvento(tipo);

                    comunicacaoRecibo.setBeneficiarioComunicacao(beneficiarioComunicacao);

                    comunicacao.setReciboComunicacao(comunicacaoRecibo);

                    recibo.setReciboComunicacao(comunicacao);

                } catch (Exception e) {

                }
            }
        } catch (SQLException e) {

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

            //identificacaoPrestadorDestino.setCodigoPrestadorNaOperadora(prestadorRetorno);

            destino.setIdentificacaoPrestador(identificacaoPrestadorDestino);

            cabecalhoTransacao.setDestino(destino);

            recibo.setCabecalho(cabecalhoTransacao);

        } catch (Exception e) {

        }

        //CRIA HASH
        Utilitarios utilitarios = new Utilitarios();
        String xmlData = null;
        try {
            JAXBContext context = JAXBContext.newInstance(recibo.getClass());
            Marshaller marshaller = context.createMarshaller();
            //JAXBElement<ProtocoloRecebimentoWS> element = new ObjectFactory().createCtRecebimentoLote(lote);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(recibo, stringWriter);

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

        recibo.setHash(utilitarios.calculaHash(xmlData));

        return recibo;
    }

    public void autComunicacaoInternacao(String numero_carteira, String atendimento_rn, String nome_beneficiario,
                                         String cns, String data_evento, String tipo_evento,
                                         String motivo_encerramento, String tipo_internacao) {

        String motivoOuTipo, motivoOuTipoValue, status = null, cod_mensagem = null;

        if (tipo_evento == "A") {
            motivoOuTipo = "MOTIVO_ENCERRAMENTO";
            motivoOuTipoValue = motivo_encerramento;
        } else {
            motivoOuTipo = "TIPO_INTERNACAO";
            motivoOuTipoValue = tipo_internacao;
        }

        VerificaElegibilidade eleg = new VerificaElegibilidade();
        String retornoBeneficiario = eleg.verificaBeneficiario(numero_carteira);

        if (retornoBeneficiario == null) {
            status = "S";
        } else {
            status = "N";
            cod_mensagem = retornoBeneficiario;
        }

        String registro =
            "INSERT INTO AUT_COMUNICACAO_INTERNACAO ('NUMERO_CARTEIRA','ATENDIMENTO_RN','NOME_BENEFICIARIO','CNS','DATA_EVENTO','TIPO_EVENTO','" +
            motivoOuTipo + "','STATUS','COD_MENSAGEM') " + "values (" + '"' + numero_carteira + '"' + "," + '"' +
            atendimento_rn + '"' + "," + '"' + nome_beneficiario + '"' + "," + '"' + cns + '"' + "," + '"' +
            data_evento + '"' + "," + '"' + tipo_evento + '"' + "," + '"' + motivoOuTipoValue + '"' + "," + '"' +
            status + '"' + "," + cod_mensagem + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);

            ResultSet rs =
                comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID FROM AUT_COMUNICACAO_INTERNACAO LIMIT 1");

            if (rs.next()) {
                try {
                    idComunicaoInternacao = rs.getInt("ID_SOLICITACAO");
                } catch (Exception e) {
                }
            }
        } catch (SQLException e) {
        }
    }

}
