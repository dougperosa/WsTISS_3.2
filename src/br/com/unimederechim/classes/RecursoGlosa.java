package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtRecebimentoRecurso;
import br.gov.ans.padroes.tiss.schemas.CtRecursoGlosaRecebimento;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoRecursoWS;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import java.math.BigDecimal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;

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

public class RecursoGlosa {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    private int idRecursoGlosa;

    public RecursoGlosa() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public ProtocoloRecebimentoRecursoWS retorno() {

        ProtocoloRecebimentoRecursoWS retorno = new ProtocoloRecebimentoRecursoWS();
        CtRecebimentoRecurso recebimento = new CtRecebimentoRecurso();
        CtRecursoGlosaRecebimento recurcoGlosa = new CtRecursoGlosaRecebimento();
        CtContratadoDados contratado = new CtContratadoDados();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String prestadorRetorno = null;

        try {
            resultado =
                    comSQL.executeQuery("SELECT * FROM FAT_RECURSO_GLOSA WHERE ID_RECURSO_GLOSA = " + idRecursoGlosa);
            if (resultado.next()) {
                try {
                    recurcoGlosa.setNrProtocoloRecursoGlosa(resultado.getString("ID_RECURSO_GLOSA"));
                    recurcoGlosa.setDataEnvioRecurso(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_RECURSO"))));
                    recurcoGlosa.setDataRecebimentoRecurso(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(resultado.getDate("DATA_RECURSO"))));
                    recurcoGlosa.setNumeroLote(resultado.getString("NUMERO_LOTE"));
                    recurcoGlosa.setRegistroANS("357022");
                    
                    try {
                        ResultSet rs =
                                comSQL.executeQuery("SELECT UNI_PRESTADORES.CODPRESTADOR, UNI_PRESTADORES.DESCRICAO FROM UNI_PRESTADORES " +
                                    "WHERE IDPRESTADOR = " + resultado.getString("ID_PRESTADOR"));
                        if (rs.next()) {
                            contratado.setCodigoPrestadorNaOperadora(rs.getString("CODPRESTADOR"));
                            contratado.setNomeContratado(rs.getString("DESCRICAO"));
                            prestadorRetorno = rs.getString("CODPRESTADOR");
                        }
                    } catch (SQLException e) {

                    }
                    
                    recurcoGlosa.setDadosPrestador(contratado);
                    recurcoGlosa.setNrProtocoloRecursado(resultado.getString("NUMERO_PROTOCOLO_PRESTADOR"));
                    
                    BigDecimal valor = new BigDecimal(resultado.getDouble("VALOR_TOTAL_RECURSADO"));
                    
                    recurcoGlosa.setValorTotalRecursado(valor);
                    
                    recebimento.setProtocoloRecebimento(recurcoGlosa);
                    
                    retorno.setRecebimentoRecurso(recebimento);
                    
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

    public void fatRecursoGlosa(String numero_guia_rec_glosa_prestador, String objeto_recurso, int id_prestador,
                                String numero_lote, String numero_protocolo_prestador, String valor_total_recursado,
                                String data_recurso, String codigo_glosa_protocolo, String justificativa_protocolo) {
        String registro =
            "INSERT INTO FAT_RECURSO_GLOSA ('NUMERO_GUIA_REC_GLOSA_PRESTADOR', 'STRING OBJETO_RECURSO', 'STRING ID_PRESTADOR', 'STRING NUMERO_LOTE', 'STRING NUMERO_PROTOCOLO_PRESTADOR', 'STRING VALOR_TOTAL_RECURSADO', 'STRING DATA_RECURSO', 'STRING CODIGO_GLOSA_PROTOCOLO', 'STRING JUSTIFICATIVA_PROTOCOLO') " +
            "values (" + '"' + numero_guia_rec_glosa_prestador + '"' + "," + objeto_recurso + "," + id_prestador +
            "," + '"' + numero_lote + '"' + "," + '"' + numero_protocolo_prestador + '"' + "," +
            valor_total_recursado + "," + '"' + data_recurso + '"' + "," + '"' + codigo_glosa_protocolo + '"' + "," +
            '"' + justificativa_protocolo + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);

            ResultSet rs =
                comSQL.executeQuery("SELECT LAST_INSERT_ID() AS ID_RECURSO_GLOSA FROM FAT_RECURSO_GLOSA LIMIT 1");

            if (rs.next()) {
                try {
                    idRecursoGlosa = rs.getInt("ID_RECURSO_GLOSA");
                } catch (Exception e) {
                }
            }

        } catch (SQLException e) {
        }
    }

    public void fatRecursoGlosaItens(String data_inicio, String data_fim, String tipo_tabela,
                                     String cogido_procedimento, String descricao_procedimento,
                                     String grau_participacao, String cod_glosa_item, String valor_recursado,
                                     String justificativa, String numero_guia_origem_prestador,
                                     String numero_guia_operadora, String senha) {
        String registro =
            "INSERT INTO FAT_RECURSO_GLOSA_ITENS ('ID_RECURSO_GLOSA', 'DATA_INICIO', 'DATA_FIM', 'TIPO_TABELA', 'COGIDO_PROCEDIMENTO', 'DESCRICAO_PROCEDIMENTO', 'GRAU_PARTICIPACAO', 'COD_GLOSA_ITEM', 'VALOR_RECURSADO', 'JUSTIFICATIVA', 'NUMERO_GUIA_ORIGEM_PRESTADOR', 'NUMERO_GUIA_OPERADORA', 'SENHA') " +
            "values (" + idRecursoGlosa + "," + '"' + data_inicio + '"' + "," + '"' + data_fim + '"' + "," + '"' +
            tipo_tabela + '"' + "," + '"' + cogido_procedimento + '"' + "," + '"' + descricao_procedimento + '"' +
            "," + '"' + grau_participacao + '"' + "," + '"' + cod_glosa_item + '"' + "," + valor_recursado + "," +
            '"' + justificativa + '"' + "," + '"' + numero_guia_origem_prestador + '"' + "," + '"' +
            numero_guia_operadora + '"' + "," + '"' + senha + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {
        }
    }

}
