package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaCancelamentoRecibo;
import br.gov.ans.padroes.tiss.schemas.CtGuiaCancelamentoRecibo.GuiasCanceladas;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtReciboCancelaGuia;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.ReciboCancelaGuiaWS;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;

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

public class CancelaGuia {
    
    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    
    public CancelaGuia() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }
    
    public ReciboCancelaGuiaWS retorno(String protocolo){
        
        ReciboCancelaGuiaWS recibo = new ReciboCancelaGuiaWS();
        CtReciboCancelaGuia ctrecibo = new CtReciboCancelaGuia();
        CtGuiaCancelamentoRecibo guia = new CtGuiaCancelamentoRecibo();
        CtContratadoDados contratado = new CtContratadoDados();
        CtGuiaCancelamentoRecibo.GuiasCanceladas guiasCancelameno = new CtGuiaCancelamentoRecibo.GuiasCanceladas();
        CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia dadosGuia = new CtGuiaCancelamentoRecibo.GuiasCanceladas.DadosGuia();   
        
        guia.setRegistroANS("357022");
        String prestadorRetorno = null;
        
        try {
            resultado =
                    comSQL.executeQuery("SELECT UNI_PRESTADORES.CODPRESTADOR, UNI_PRESTADORES.DESCRICAO FROM UNI_PRESTADORES" +
                        "INNER JOIN FAU_CANCELAMENTO ON UNI_PRESTADORES.IDPRESTADOR = FAU_CANCELAMENTO.ID_PRESTADOR"+
                        "WHERE FAU_CANCELAMENTO.NUMERO_PROTOCOLO = " + protocolo);
            if (resultado.next()) {
                contratado.setCodigoPrestadorNaOperadora(resultado.getString("CODPRESTADOR"));
                contratado.setNomeContratado(resultado.getString("DESCRICAO"));
                prestadorRetorno = resultado.getString("CODPRESTADOR");
            }
        } catch (SQLException e) {

        }
        
        guia.setDadosPrestador(contratado);
        
        try {
            resultado =
                    comSQL.executeQuery("SELECT FAU_CANCELAMENTO_ITENS.NUMERO_GUIA_PRESTADOR, FAU_CANCELAMENTO.TIPO_GUIA FROM FAU_CANCELAMENTO_ITENS" +
                        "INNER JOIN FAU_CANCELAMENTO ON FAU_CANCELAMENTO_ITENS.ID_CANCELAMENTO = FAU_CANCELAMENTO.ID_CANCELAMENTO"+
                        "WHERE FAU_CANCELAMENTO.NUMERO_PROTOCOLO = " + protocolo);
            if (resultado.next()) {
                dadosGuia.setNumeroGuiaPrestador(resultado.getString("NUMERO_GUIA_PRESTADOR"));
                dadosGuia.setTipoGuia(resultado.getString("TIPO_GUIA"));
                dadosGuia.setStatusCancelamento("4");
            }
        } catch (SQLException e) {

        }
        
        guiasCancelameno.getDadosGuia().add(dadosGuia);
        
        guia.setGuiasCanceladas(guiasCancelameno);
        
        ctrecibo.setReciboCancelaGuia(guia);
        
        recibo.setReciboCancelaGuia(ctrecibo);
        
        
        //CABECALHO
        CabecalhoTransacao cabecalhoTransacao = new CabecalhoTransacao();
        CabecalhoTransacao.IdentificacaoTransacao identificacao = new CabecalhoTransacao.IdentificacaoTransacao();
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

            identificacaoPrestadorDestino.setCodigoPrestadorNaOperadora(prestadorRetorno);

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
    
    public void fauCancelamento(int id_prestador, int tipo_guia, String numero_protocolo, String numero_guia_prestador, String numero_guia_operadora) {
        
        String registro = "INSERT INTO FAU_CANCELAMENTO ('ID_PRESTADOR','TIPO_GUIA','NUMERO_PROTOCOLO') " +
            "values ("+id_prestador+","+tipo_guia+","+'"'+numero_protocolo+'"'+")";
        try{
            int resultado = comSQL.executeUpdate(registro);
            
            ResultSet rs = comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID_CANCELAMENTO FROM FAU_CANCELAMENTO LIMIT 1");

            if (rs.next()) {
                try {
                    fauCancelamentoItens(rs.getInt("ID_CANCELAMENTO"), numero_guia_prestador, numero_guia_operadora);
                } catch (Exception e) {
                }
            }            
        }catch(SQLException e){
        }
    }
    
    public void fauCancelamentoItens(int id_cancelamento, String numero_guia_prestador, String numero_guia_operadora){
        
        String registro = "INSERT INTO FAU_CANCELAMENTO_ITENS ('ID_CANCELAMENTO','NUMERO_GUIA_PRESTADOR','NUMERO_GUIA_OPERADORA') " +
            "values ("+id_cancelamento+","+'"'+numero_guia_prestador+'"'+","+'"'+numero_guia_operadora+'"'+")";
        try{
            int resultado = comSQL.executeUpdate(registro);
        }catch(SQLException e){
        }
    }
    
}
