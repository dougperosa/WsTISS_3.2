package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtRespostaGlosa;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.SituacaoProtocoloRecursoWS;

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

public class SolicitacaoStatusRecursoGlosa {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;

    public SolicitacaoStatusRecursoGlosa() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public SituacaoProtocoloRecursoWS retorno(String numeroProtocolo) {

        SituacaoProtocoloRecursoWS retorno = new SituacaoProtocoloRecursoWS();
        CtRespostaGlosa resposta = new CtRespostaGlosa();
        CtRespostaGlosa.ReciboGlosaStatus glosaStatus = new CtRespostaGlosa.ReciboGlosaStatus();
        CtContratadoDados contratado = new CtContratadoDados();
        Date data = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String prestadorRetorno = null;

        try {
            resultado =
                    comSQL.executeQuery("SELECT * FROM FAT_RECURSO_GLOSA WHERE ID_RECURSO_GLOSA = " + numeroProtocolo);
            if (resultado.next()) {
                try {

                    glosaStatus.setNrProtocoloRecursoGlosa(numeroProtocolo);
                    glosaStatus.setDataEnvioRecurso(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_RECURSO"))));
                    glosaStatus.setDataRecebimentoRecurso(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_RECURSO"))));
                    glosaStatus.setNumeroLote(resultado.getString("NUMERO_LOTE"));
                    glosaStatus.setRegistroANS("357022");

                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT CODPRESTADOR, DESCRICAO FROM UNI_PRESTADORES WHERE IDPRESTADOR = " +
                                                resultado.getInt("ID_PRESTADOR"));
                        if (resultado.next()) {
                            contratado.setCodigoPrestadorNaOperadora(rs.getString("CODPRESTADOR"));
                            contratado.setNomeContratado(rs.getString("DESCRICAO"));
                            prestadorRetorno = rs.getString("CODPRESTADOR");
                        }
                    } catch (SQLException e) {

                    }

                    glosaStatus.setDadosPrestador(contratado);
                    glosaStatus.setNrProtocoloSituacaoRecursoGlosa(resultado.getString("NUMERO_PROTOCOLO_PRESTADOR"));
                    glosaStatus.setDataSituacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(data)));
                    glosaStatus.setSituacaoProtocolo("1");

                    resposta.setReciboGlosaStatus(glosaStatus);

                    retorno.setSituacaoProtocoloRecurso(resposta);

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
