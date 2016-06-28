package br.com.unimederechim.classes;

import br.com.unimederechim.util.Utilitarios;
import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.AutorizacaoProcedimentoWS;
import br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao;
import br.gov.ans.padroes.tiss.schemas.CtAutorizacaoDados;
import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtDadosComplementaresBeneficiario;
import br.gov.ans.padroes.tiss.schemas.CtDadosComplementaresBeneficiarioRadio;
import br.gov.ans.padroes.tiss.schemas.CtDiagnosticoOncologico;
import br.gov.ans.padroes.tiss.schemas.CtDrogasSolicitadas;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtPrestadorIdentificacao;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoAutorizado;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoDados;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoExecutado;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentosComplementares;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.CtmAnexoSolicitante;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoInternacao;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoProrrogacao;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoQuimio;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoRadio;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoServico;
import br.gov.ans.padroes.tiss.schemas.CtoAutorizacaoServico;
import br.gov.ans.padroes.tiss.schemas.DmSimNao;
import br.gov.ans.padroes.tiss.schemas.DmTipoTransacao;
import br.gov.ans.padroes.tiss.schemas.SolicitacaoProcedimentoWS;

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
import java.util.Timer;
import java.util.TimerTask;

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

public class AutorizacaoServicos {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;
    private int idEntradasSolicitacao;
    boolean temResposta = false;
    boolean internacao = false, prorrogacao = false, spsadt = false;
    Timer timer;

    public AutorizacaoServicos() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/testando.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public void tempoEspera(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel();
        }
    }

    public boolean validaNumeroGuia(String numeroGuia, String idPrestador) {

        boolean validador = false;

        try {
            ResultSet rs =
                comSQL.executeQuery("SELECT * FROM AUT_ENTRADAS_SOLICITACAO WHERE NUMERO_GUIA_PRESTADOR = " +
                                    numeroGuia + " AND ID_PRESTADOR_SOLICITADOR = " + idPrestador);
            if (rs.next()) {
                validador = true;
            }
        } catch (Exception e) {

        }

        return validador;
    }

    public void processa(SolicitacaoProcedimentoWS solicitacaoProcedimento) {

        try {
            if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getNumeroGuiaPrincipal().isEmpty() ==
                false) {

                spsadt = true;

                VerificaElegibilidade eleg = new VerificaElegibilidade();
                int idPrestador =
                    eleg.idPrestador(String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                String solicitadoExecutante = null;

                if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getNomeContratado().isEmpty() ==
                    false) {
                    solicitadoExecutante = "S";
                } else {
                    solicitadoExecutante = "N";
                }

                autEntradasSolicitacao("6202", "A", "2", solicitadoExecutante, null,
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getObservacao()),
                                       String.valueOf(idPrestador), "N",
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getCabecalhoSolicitacao().getNumeroGuiaPrestador()),
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getNumeroGuiaPrincipal()));

                String dataValidade = null, via = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT * FROM UNI_BENEFICIARIOS_CARTEIRA WHERE ID_BENEFICIARIO IN (SELECT IDBENEFICIARIO FROM UNI_BENEFICIARIOS WHERE CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getNumeroCarteira()) +
                                                "') ORDER BY ID DESC LIMIT 1");
                    if (resultado.next()) {
                        dataValidade = resultado.getString("DATA_VALIDADE");
                        via = resultado.getString("NUMERO_VIA");
                    }

                } catch (SQLException e) {

                }

                String rg = null, rede = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT P.RG, R.COD_REDE FROM UNI_BENEFICIARIOS B LEFT JOIN UNI_PESSOAS P ON P.IDPESSOA = B.IDPESSOA LEFT JOIN UNI_PLANOS PL ON PL.IDPLANO = B.IDPLANO LEFT JOIN UNI_REDE_REFERENCIADA R ON R.ID = PL.ID_REDE WHERE B.CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getNumeroCarteira()) +
                                                "'");
                    if (resultado.next()) {
                        rg = resultado.getString("RG");
                        rede = resultado.getString("COD_REDE");
                    }

                } catch (SQLException e) {

                }

                autBeneficiario(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getNumeroCarteira()),
                                dataValidade,
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getNomeBeneficiario()),
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getNumeroCNS()),
                                rede, via,
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosBeneficiario().getAtendimentoRN()),
                                rg);

                int idSolicitante =
                    eleg.idPrestador(null, null, String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getCodigonaOperadora()));

                autSolicitante(String.valueOf(idSolicitante),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getContratadoSolicitante().getNomeContratado()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getProfissionalSolicitante().getNomeProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getProfissionalSolicitante().getConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getProfissionalSolicitante().getNumeroConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getProfissionalSolicitante().getUF()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosSolicitante().getProfissionalSolicitante().getCBOS()),
                               "0028");

                if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getCodigonaOperadora().isEmpty() ==
                    false) {
                    autPrestador(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getCodigonaOperadora()),
                                 "0028",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getNomeContratado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDadosExecutante().getCNES()));
                }

                autSADT(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getCaraterAtendimento()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getIndicacaoClinica()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getDataSolicitacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getProcedimentosSolicitados().get(0).getProcedimento().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getProcedimentosSolicitados().get(0).getProcedimento().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getProcedimentosSolicitados().get(0).getProcedimento().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getProcedimentosSolicitados().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getProcedimentosSolicitados().get(0).getQuantidadeSolicitada()),
                                 "P", "0000-00-00", null, null, "", null, null, null, "", null);

                //OPME
                autAnexoOpme(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getJustificativaTecnica()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getEspecificacaoMaterial()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getObservacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 "O", "0000-00-00", null, null,
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getOpcaoFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getRegistroANVISA()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getCodigoRefFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getAutorizacaoFuncionamento()));

                //QUIMIO
                autAnexoQuimioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getTipoQuimioterapia()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getPlanoTerapeutico()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getNumeroCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getCicloAtual()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getIntervaloCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getPeso()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getAltura()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSuperficieCorporal()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoCID()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getQtDoses()),
                                 null, "Q",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getDataProvavel()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getViaAdministracao()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getFrequencia()),
                                 "", null, null, null, "", null);

                //RADIO
                autAnexoRadioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagnosticoImagem()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getNumeroCampos()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDoseCampo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDoseTotal()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getNrDias()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDtPrevistaInicio()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(null, null, null,
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoCID()));

                autAnexoTratamentosAnteriores(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getCirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDatacirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getQuimioterapia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDataQuimioterapia()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getQuantidade()),
                                 null, "R",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoSPSADT().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getDataProvavel()),
                                 null, null, "", null, null, null, "", null);

            }

        } catch (Exception e) {

        }

        try {
            if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getNumeroGuiaPrestador().isEmpty() ==
                false) {

                internacao = true;

                VerificaElegibilidade eleg = new VerificaElegibilidade();
                int idPrestador =
                    eleg.idPrestador(String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                autEntradasSolicitacao("6202", "A", "3", "S", null,
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getObservacao()),
                                       String.valueOf(idPrestador), "N",
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getNumeroGuiaPrestador()),
                                       null);

                String dataValidade = null, via = null;

                try {
                    resultado =
                            comSQL.executeQuery("SELECT * FROM UNI_BENEFICIARIOS_CARTEIRA WHERE ID_BENEFICIARIO IN (SELECT IDBENEFICIARIO FROM UNI_BENEFICIARIOS WHERE CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNumeroCarteira()) +
                                                "') ORDER BY ID DESC LIMIT 1");
                    if (resultado.next()) {
                        dataValidade = resultado.getString("DATA_VALIDADE");
                        via = resultado.getString("NUMERO_VIA");
                    }

                } catch (SQLException e) {

                }

                String rg = null, rede = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT P.RG, R.COD_REDE FROM UNI_BENEFICIARIOS B LEFT JOIN UNI_PESSOAS P ON P.IDPESSOA = B.IDPESSOA LEFT JOIN UNI_PLANOS PL ON PL.IDPLANO = B.IDPLANO LEFT JOIN UNI_REDE_REFERENCIADA R ON R.ID = PL.ID_REDE WHERE B.CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNumeroCarteira()) +
                                                "'");
                    if (resultado.next()) {
                        rg = resultado.getString("RG");
                        rede = resultado.getString("COD_REDE");
                    }

                } catch (SQLException e) {

                }

                autBeneficiario(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNumeroCarteira()),
                                dataValidade,
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNomeBeneficiario()),
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNumeroCNS()),
                                rede, via,
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getAtendimentoRN()),
                                rg);

                int idSolicitante =
                    eleg.idPrestador(null, null, String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosDoContratado().getCodigoPrestadorNaOperadora()));

                autSolicitante(String.valueOf(idSolicitante),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosDoContratado().getNomeContratado()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosProfissionalContratado().getNomeProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosProfissionalContratado().getConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosProfissionalContratado().getNumeroConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosProfissionalContratado().getUF()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getIdentificacaoSolicitante().getDadosProfissionalContratado().getCBOS()),
                               "0028");

                if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getCodigoIndicadonaOperadora().isEmpty() ==
                    false) {
                    autPrestador(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getCodigoIndicadonaOperadora()),
                                 "0028",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getNomeContratadoIndicado()),
                                 null);
                }

                autSADT(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getCaraterAtendimento()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getIndicacaoClinica()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDataSolicitacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getProcedimentosSolicitados().get(0).getProcedimento().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getProcedimentosSolicitados().get(0).getProcedimento().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getProcedimentosSolicitados().get(0).getProcedimento().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getProcedimentosSolicitados().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getProcedimentosSolicitados().get(0).getQuantidadeSolicitada()),
                                 "P", "0000-00-00", null, null, "", null, null, null, "", null);

                String tipoAcomodacaoAutorizada = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT CASE WHEN ACOMODACAO = 'A' THEN '7' WHEN ACOMODACAO = 'P' THEN '42' WHEN ACOMODACAO = 'S' THEN '41' WHEN ACOMODACAO = 'C' THEN '32' END AS ACOMODACAO FROM UNI_BENEFICIARIOS WHERE CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosBeneficiario().getNumeroCarteira()) +
                                                "'");
                    if (resultado.next()) {
                        tipoAcomodacaoAutorizada = resultado.getString("ACOMODACAO");
                    }

                } catch (SQLException e) {

                }

                String cnes = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT CNES FROM UNI_PRESTADORES WHERE CODPRESTADOR = '" + String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getCodigoIndicadonaOperadora()) +
                                                "'");
                    if (resultado.next()) {
                        cnes = resultado.getString("CNES");
                    }

                } catch (SQLException e) {

                }

                autInternacao(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getCodigoIndicadonaOperadora()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getNomeContratadoIndicado()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getCaraterAtendimento()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getTipoInternacao()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getRegimeInternacao()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getQtDiariasSolicitadas()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getQtDiariasSolicitadas()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getIndicacaoClinica()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getHipotesesDiagnosticas().getIndicadorAcidente()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getDataSugeridaInternacao()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosHospitalSolicitado().getDataSugeridaInternacao()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getIndicadorOPME()),
                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getDadosInternacao().getIndicadorQuimio()),
                              tipoAcomodacaoAutorizada, cnes);

                autInternacaoCid(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getHipotesesDiagnosticas().getDiagnosticoCID()));

                //OPME
                autAnexoOpme(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getJustificativaTecnica()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getEspecificacaoMaterial()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getObservacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 "O", "0000-00-00", null, null,
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getOpcaoFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getRegistroANVISA()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getCodigoRefFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getAutorizacaoFuncionamento()));

                //QUIMIO
                autAnexoQuimioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getTipoQuimioterapia()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getPlanoTerapeutico()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getNumeroCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getCicloAtual()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getIntervaloCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getPeso()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getAltura()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSuperficieCorporal()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoCID()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getQtDoses()),
                                 null, "Q",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getDataProvavel()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getViaAdministracao()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getFrequencia()),
                                 "", null, null, null, "", null);

                //RADIO
                autAnexoRadioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagnosticoImagem()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getNumeroCampos()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDoseCampo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDoseTotal()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getNrDias()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDtPrevistaInicio()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(null, null, null,
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoCID()));

                autAnexoTratamentosAnteriores(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getCirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDatacirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getQuimioterapia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDataQuimioterapia()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getQuantidade()),
                                 null, "R",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoInternacao().getAnexoClinico().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getDataProvavel()),
                                 null, null, "", null, null, null, "", null);

            }

        } catch (Exception e) {

        }

        try {
            if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNumeroGuiaPrestador().isEmpty() ==
                false) {

                prorrogacao = true;

                VerificaElegibilidade eleg = new VerificaElegibilidade();
                int idPrestador =
                    eleg.idPrestador(String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCPF()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCNPJ()),
                                     String.valueOf(solicitacaoProcedimento.getCabecalho().getOrigem().getIdentificacaoPrestador().getCodigoPrestadorNaOperadora()));

                autEntradasSolicitacao("6202", "A", "3", "S",
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNrGuiaReferenciada()),
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getObservacao()),
                                       String.valueOf(idPrestador), "N",
                                       String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNumeroGuiaPrestador()),
                                       null);

                String dataValidade = null, via = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT * FROM UNI_BENEFICIARIOS_CARTEIRA WHERE ID_BENEFICIARIO IN (SELECT IDBENEFICIARIO FROM UNI_BENEFICIARIOS WHERE CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosBeneficiario().getNumeroCarteira()) +
                                                "') ORDER BY ID DESC LIMIT 1");
                    if (resultado.next()) {
                        dataValidade = resultado.getString("DATA_VALIDADE");
                        via = resultado.getString("NUMERO_VIA");
                    }

                } catch (SQLException e) {

                }

                String rg = null, rede = null;
                try {
                    resultado =
                            comSQL.executeQuery("SELECT P.RG, R.COD_REDE FROM UNI_BENEFICIARIOS B LEFT JOIN UNI_PESSOAS P ON P.IDPESSOA = B.IDPESSOA LEFT JOIN UNI_PLANOS PL ON PL.IDPLANO = B.IDPLANO LEFT JOIN UNI_REDE_REFERENCIADA R ON R.ID = PL.ID_REDE WHERE B.CODUSUARIO = '" +
                                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosBeneficiario().getNumeroCarteira()) +
                                                "'");
                    if (resultado.next()) {
                        rg = resultado.getString("RG");
                        rede = resultado.getString("COD_REDE");
                    }

                } catch (SQLException e) {

                }

                String rn = null, cns = null;
                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE ID_SOLICITACAO + " + String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNrGuiaReferenciada()));
                    if (rs.next()) {
                        rn = rs.getString("ATENDIMENTO_RN");
                        cns = rs.getString("CNS");
                    }

                } catch (SQLException e) {

                }

                autBeneficiario(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosBeneficiario().getNumeroCarteira()),
                                dataValidade,
                                String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosBeneficiario().getNomeBeneficiario()),
                                cns, rede, via, rn, rg);

                int idSolicitante =
                    eleg.idPrestador(null, null, String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosContratadoSolicitante().getCodigoPrestadorNaOperadora()));

                autSolicitante(String.valueOf(idSolicitante),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosContratadoSolicitante().getNomeContratado()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosProfissionalSolicitante().getNomeProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosProfissionalSolicitante().getConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosProfissionalSolicitante().getNumeroConselhoProfissional()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosProfissionalSolicitante().getUF()),
                               String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosProfissionalSolicitante().getCBOS()),
                               "0028");

                if (solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosContratadoSolicitante().getCodigoPrestadorNaOperadora().isEmpty() ==
                    false) {
                    autPrestador(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosContratadoSolicitante().getCodigoPrestadorNaOperadora()),
                                 "0028",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosContratadoSolicitante().getNomeContratado()),
                                 null);
                }

                autSADT(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getTipoAcomodacaoSolicitada()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getIndicacaoClinica()),
                        String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDataSolicitacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getProcedimentosAdicionais().get(0).getProcedimento().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getProcedimentosAdicionais().get(0).getProcedimento().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getProcedimentosAdicionais().get(0).getProcedimento().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getProcedimentosAdicionais().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getProcedimentosAdicionais().get(0).getQuantidadeSolicitada()),
                                 "P", "0000-00-00", null, null, "", null, null, null, "", null);

                try {
                    resultado =
                            comSQL.executeQuery("SELECT * FROM AUT_INTERNACAO WHERE ID_SOLICITACAO = " + String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getNrGuiaReferenciada()));
                    if (resultado.next()) {

                        autInternacao(resultado.getString("CODIGOPRESTADOR"), resultado.getString("NOMEPRESTADOR"),
                                      resultado.getString("CARATER_INTERNACAO"),
                                      resultado.getString("TIPO_INTERNACAO"), resultado.getString("REGIME_INTERNACAO"),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getQtDiariasAdicionais()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getQtDiariasAdicionais()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getIndicacaoClinica()),
                                      resultado.getString("INDICACAO_ACIDENTE"),
                                      resultado.getString("DATA_PROVAVEL_ADMISSAO"),
                                      resultado.getString("DATA_INTERNACAO_SUGERIDA"),
                                      resultado.getString("PREVISAO_USO_OPME"),
                                      resultado.getString("PREVISAO_USO_QUIMIOTERAPICO"),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getDadosInternacao().getTipoAcomodacaoSolicitada()),
                                      resultado.getString("CNES"));
                    }

                } catch (SQLException e) {

                }

                //OPME
                autAnexoOpme(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getJustificativaTecnica()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getEspecificacaoMaterial()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                             String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getObservacao()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getIdentificacaoOPME().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getQuantidadeSolicitada()),
                                 "O", "0000-00-00", null, null,
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getOpcaoFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getValorSolicitado()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getRegistroANVISA()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getCodigoRefFabricante()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoOPME().getOpmeSolicitadas().getOpmeSolicitada().get(0).getAutorizacaoFuncionamento()));

                //QUIMIO
                autAnexoQuimioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getTipoQuimioterapia()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getPlanoTerapeutico()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getNumeroCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getCicloAtual()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getIntervaloCiclos()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                      String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getPeso()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getAltura()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSuperficieCorporal()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDiagnosticoOncologicoQuimioterapia().getDiagQuimio().getDiagnosticoCID()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getQtDoses()),
                                 null, "Q",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getDataProvavel()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getViaAdministracao()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoQuimioterapia().getDrogasSolicitadas().getDrogaSolicitada().get(0).getFrequencia()),
                                 "", null, null, null, "", null);

                //RADIO
                autAnexoRadioterapia(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagnosticoImagem()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getNumeroCampos()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDoseCampo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDoseTotal()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getNrDias()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDtPrevistaInicio()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getCabecalhoAnexo().getNumeroGuiaAnexo()),
                                     String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getObservacao()));

                autAnexoBeneficiarioDadosAdicionais(null, null, null,
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getIdade()),
                                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDadosComplementaresBeneficiario().getSexo()));

                autAnexoSolicitante(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getMedicoSolicitante().getNomeProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getMedicoSolicitante().getTelefoneProfissional()),
                                    String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getMedicoSolicitante().getEmailProfissional()));

                autAnexoDiagnosticoOncologico(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDataDiagnostico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEstadiamento()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getFinalidade()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getEcog()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoHispatologico()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getInfoRelevantes()));

                autAnexoDiagnosticoOncologicoCID(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getDiagnosticoOncologicoRadio().getDiagRadio().getDiagnosticoCID()));

                autAnexoTratamentosAnteriores(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getTratamentosAnteriores().getCirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDatacirurgia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getTratamentosAnteriores().getQuimioterapia()),
                                              String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getTratamentosAnteriores().getDataQuimioterapia()));

                autProcedimentos(String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoTabela()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getCodigoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getIdentificacao().getDescricaoProcedimento()),
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getQuantidade()),
                                 null, "R",
                                 String.valueOf(solicitacaoProcedimento.getSolicitacaoProcedimento().getSolicitacaoProrrogacao().getAnexoClinicoProrrogacao().getSolicitacaoRadioterapia().getProcedimentosComplementares().getProcedimentoComplementar().get(0).getDataProvavel()),
                                 null, null, "", null, null, null, "", null);

            }


        } catch (Exception e) {

        }

        try {
            comSQL.executeUpdate("UPDATE AUT_ENTRADAS_SOLICITACAO SET RESPONDIDO = 'N' WHERE ID_SOLICITACAO = " +
                                 idEntradasSolicitacao);
            comSQL.execute("COMMIT");
        } catch (Exception e) {

        }

    }

    public AutorizacaoProcedimentoWS retorno() {

        AutorizacaoProcedimentoWS retorno = new AutorizacaoProcedimentoWS();
        CtSituacaoAutorizacao situacao = new CtSituacaoAutorizacao();
        CtmAutorizacaoInternacao autInternacao = new CtmAutorizacaoInternacao();
        CtmAutorizacaoServico servico = new CtmAutorizacaoServico();
        CtmAutorizacaoProrrogacao autProrrogacao = new CtmAutorizacaoProrrogacao();
        CtAutorizacaoDados autorizacao = new CtAutorizacaoDados();
        CtBeneficiarioDados beneficiario = new CtBeneficiarioDados();
        CtmAutorizacaoServico.PrestadorAutorizado prestador = new CtmAutorizacaoServico.PrestadorAutorizado();
        CtContratadoDados contratado = new CtContratadoDados();
        CtmAutorizacaoServico.MotivosNegativa glosa = new CtmAutorizacaoServico.MotivosNegativa();
        CtProcedimentoAutorizado.MotivosNegativa glosaProcedimento = new CtProcedimentoAutorizado.MotivosNegativa();
        CtMotivoGlosa motivo = new CtMotivoGlosa();
        CtMotivoGlosa motivoProcedimento = new CtMotivoGlosa();
        CtmAutorizacaoServico.ServicosAutorizados servicosAutorizados =
            new CtmAutorizacaoServico.ServicosAutorizados();
        CtProcedimentoAutorizado procedimento = new CtProcedimentoAutorizado();
        CtProcedimentoDados procedimentoDados = new CtProcedimentoDados();
        CtmAutorizacaoQuimio.DrogasSolicitadas drogas = new CtmAutorizacaoQuimio.DrogasSolicitadas();

        CtmAutorizacaoQuimio quimio = new CtmAutorizacaoQuimio();
        CtAutorizacaoDados autorizacaoDadosQuimio = new CtAutorizacaoDados();
        CtDadosComplementaresBeneficiario beneComplementoQuimio = new CtDadosComplementaresBeneficiario();
        CtmAnexoSolicitante solicitanteQuimio = new CtmAnexoSolicitante();
        CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia diagnosticoQuimio =
            new CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia();
        CtDiagnosticoOncologico diagnosticoOncologicoQuimio = new CtDiagnosticoOncologico();
        CtmAutorizacaoQuimio.TratamentosAnteriores tratamentosAnterioresQuimio =
            new CtmAutorizacaoQuimio.TratamentosAnteriores();
        CtDrogasSolicitadas drogasSolicitadasQuimio = new CtDrogasSolicitadas();
        CtProcedimentoDados procedimentosDrogaQuimio = new CtProcedimentoDados();

        CtmAutorizacaoRadio radio = new CtmAutorizacaoRadio();
        CtAutorizacaoDados autorizacaoDadosRadio = new CtAutorizacaoDados();
        CtDadosComplementaresBeneficiarioRadio beneComplementoRadio = new CtDadosComplementaresBeneficiarioRadio();
        CtmAnexoSolicitante solicitanteRadio = new CtmAnexoSolicitante();
        CtmAutorizacaoRadio.DiagnosticoOncologicoRadio diagnosticoRadio =
            new CtmAutorizacaoRadio.DiagnosticoOncologicoRadio();
        CtDiagnosticoOncologico diagnosticoOncologicoRadio = new CtDiagnosticoOncologico();
        CtmAutorizacaoRadio.TratamentosAnteriores tratamentosAnterioresRadio =
            new CtmAutorizacaoRadio.TratamentosAnteriores();
        CtDrogasSolicitadas drogasSolicitadasRadio = new CtDrogasSolicitadas();
        CtProcedimentoDados procedimentosDrogaRadio = new CtProcedimentoDados();
        CtmAutorizacaoRadio.ProcedimentosComplementares procedimentosComplementares =
            new CtmAutorizacaoRadio.ProcedimentosComplementares();
        CtProcedimentosComplementares procedComplementares = new CtProcedimentosComplementares();

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String prestadorRetorno = null;
        
        try {

            String resposta = null, observacoes = null, solicitante = null, observacao = null;

            resultado =
                    comSQL.executeQuery("SELECT * FROM AUT_ENTRADAS_SOLICITACAO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
            try {
                if (resultado.next()) {
                    resposta = resultado.getString("RESPOSTA");
                    observacoes = resultado.getString("OBSERVACOES");
                    solicitante = resultado.getString("ID_SOLICITANTE");
                    observacao = resultado.getString("OBSERVACOES");
                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT * FROM AUT_INTERNACAO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);

                        if (rs.next()) {

                            if (internacao) {
                                try {
                                    autInternacao.setDataProvavelAdmissao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA_PROVAVEL_ADMISSAO"))));
                                    autInternacao.setQtdDiariasAutorizadas(BigInteger.valueOf(rs.getInt("QTDE_DIARIAS_AUTORIZADAS")));
                                    autInternacao.setTipoAcomodacaoAutorizada(rs.getString("TIPO_ACOMODACAO_AUTORIZADA"));
                                } catch (Exception e) {

                                }
                            }

                            if (prorrogacao) {
                                try {
                                    autProrrogacao.setJustificativaOperadora(observacoes);
                                    autProrrogacao.setDiariasAutorizadas(BigInteger.valueOf(rs.getInt("QTDE_DIARIAS_AUTORIZADAS")));
                                    autProrrogacao.setAcomodacaoAutorizada(rs.getString("TIPO_ACOMODACAO_AUTORIZADA"));
                                } catch (Exception e) {

                                }
                            }
                        }

                    } catch (SQLException e) {

                    }
                }

                situacao.setAutorizacaoInternacao(autInternacao);
                situacao.setAutorizacaoProrrogacao(autProrrogacao);

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao +
                                            " ORDER BY ID_ORDEM DESC LIMIT 1 ");
                    if (rs.next()) {
                        try {
                            autorizacao.setNumeroGuiaPrestador(rs.getString("NUMERO_GUIA_PRESTADOR"));
                            autorizacao.setNumeroGuiaOperadora("ID_SOLICITACAO");
                            autorizacao.setDataAutorizacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA"))));
                            autorizacao.setSenha(rs.getString("SENHA"));
                            autorizacao.setDataValidadeSenha(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA"))));
                        } catch (Exception e) {

                        }
                    }
                } catch (SQLException e) {

                }
                servico.setDadosAutorizacao(autorizacao);

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                    if (rs.next()) {
                        try {
                            beneficiario.setNumeroCarteira(rs.getString("CODIGO"));
                            DmSimNao atendimentoRN;
                            if (rs.getString("ATENDIMENTO_RN").equals("S")) {
                                atendimentoRN = DmSimNao.S;
                            } else {
                                atendimentoRN = DmSimNao.N;
                            }
                            beneficiario.setAtendimentoRN(atendimentoRN);
                            beneficiario.setNomeBeneficiario(rs.getString("NOME"));
                            beneficiario.setNumeroCNS(rs.getString("CNS"));
                        } catch (Exception e) {

                        }
                    }
                } catch (SQLException e) {

                }
                servico.setDadosBeneficiario(beneficiario);

                if (internacao || prorrogacao) {
                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT * FROM AUT_INTERNACAO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                        if (rs.next()) {
                            try {
                                contratado.setCodigoPrestadorNaOperadora(rs.getString("COD_PRESTADOR_AUTORIZADO"));
                                contratado.setNomeContratado(rs.getString("NOME_PRESTADOR_AUTORIZADO"));
                                prestador.setDadosContratado(contratado);
                                prestador.setCnesContratado(rs.getString("COD_CNES_PRESTADOR_AUTORIZADO"));
                                prestadorRetorno = rs.getString("COD_PRESTADOR_AUTORIZACAO");
                            } catch (Exception e) {

                            }
                        }
                    } catch (SQLException e) {

                    }
                    servico.setPrestadorAutorizado(prestador);
                } else {
                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT * FROM AUT_PRESTADOR" + " INNER JOIN UNI_PRESTADORES ON AUT_PRESTADOR.CODIGO = UNI_PRESTADORES.CODPRESTADOR" +
                                                " INNER JOIN AUT_ENTRADAS_SOLICITACAO ON UNI_PRESTADORES.IDPRESTADOR = AUT_ENTRADAS_SOLICITACAO.ID_SOLICITANTE" +
                                                " WHERE AUT_ENTRADAS_SOLICITACAO.ID_SOLICITANTE = " + solicitante);
                        if (rs.next()) {
                            try {
                                contratado.setCodigoPrestadorNaOperadora(rs.getString("CODIGO"));
                                contratado.setNomeContratado(rs.getString("NOME"));
                                prestador.setDadosContratado(contratado);
                                prestador.setCnesContratado(rs.getString("CNES"));
                            } catch (Exception e) {

                            }
                        }
                    } catch (SQLException e) {

                    }
                    servico.setPrestadorAutorizado(prestador);
                }

                if (resposta == "A") {
                    servico.setStatusSolicitacao("1");
                } else if (resposta == "N") {
                    servico.setStatusSolicitacao("3");
                } else if (resposta == "C") {
                    servico.setStatusSolicitacao("6");
                } else {
                    servico.setStatusSolicitacao("2");
                }

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                    if (rs.next()) {
                        try {
                            ResultSet rsMensagem =
                                comSQL.executeQuery("SELECT * FROM AUT_MENSAGENS WHERE ID_MENSAGEM = " +
                                                    rs.getString("ID_MENSAGEM"));
                            if (rsMensagem.next()) {
                                try {
                                    motivo.setCodigoGlosa(rsMensagem.getString("ID_MENSAGEM"));
                                    motivo.setDescricaoGlosa(rsMensagem.getString("MENSAGEM"));
                                } catch (Exception e) {

                                }
                            }
                        } catch (SQLException e) {

                        }
                    }
                } catch (SQLException e) {

                }
                glosa.getMotivoNegativa().add(motivo);
                servico.setMotivosNegativa(glosa);
                servico.setObservacao(observacao);

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                    if (rs.next()) {
                        if (rs.getString("TIPO").equals("P") || rs.getString("TIPO").equals("O")) {
                            procedimentoDados.setCodigoTabela(rs.getString("TIPO_TABELA"));
                            procedimentoDados.setCodigoProcedimento(rs.getString("COD_PROCEDIMENTO"));
                            procedimentoDados.setDescricaoProcedimento(rs.getString("PROCEDIMENTO"));
                            procedimento.setProcedimento(procedimentoDados);
                            procedimento.setQuantidadeSolicitada(BigInteger.valueOf(rs.getInt("QTDE")));
                            procedimento.setQuantidadeAutorizada(BigInteger.valueOf(rs.getInt("QTDE_AUTORIZADA")));
                            if (rs.getString("TIPO").equals("O")) {
                                procedimento.setValorSolicitado(BigDecimal.valueOf(rs.getDouble("VALOR")));
                                procedimento.setValorAutorizado(BigDecimal.valueOf(rs.getDouble("VALOR_AUTORIZADO")));
                                procedimento.setOpcaoFabricante(rs.getString("OPCAO_FABRICANTE"));
                                procedimento.setRegistroANVISA(rs.getString("REGISTRO_ANVISA"));
                                procedimento.setCodigoRefFabricante(rs.getString("COD_REF_FABRICANTE"));
                                procedimento.setAutorizacaoFuncionamento(rs.getString("AUTORIZACAO_FUNCIONAMENTO"));
                            }
                            try {
                                ResultSet rsMensagem =
                                    comSQL.executeQuery("SELECT * FROM AUT_MENSAGENS WHERE ID_MENSAGEM = " +
                                                        rs.getString("ID_MENSAGEM"));
                                if (rsMensagem.next()) {
                                    try {
                                        motivoProcedimento.setCodigoGlosa(rsMensagem.getString("ID_MENSAGEM"));
                                        motivoProcedimento.setDescricaoGlosa(rsMensagem.getString("MENSAGEM"));
                                    } catch (Exception e) {

                                    }
                                }
                                glosaProcedimento.getMotivoNegativa().add(motivoProcedimento);
                            } catch (SQLException e) {

                            }
                            procedimento.setMotivosNegativa(glosaProcedimento);

                        }
                        servicosAutorizados.getServicoAutorizado().add(procedimento);

                    }
                } catch (SQLException e) {

                }

                servico.setServicosAutorizados(servicosAutorizados);

                //QUIMIO
                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_ANEXO_QUIMIOTERAPIA WHERE ID_SOLICITACAO = " +
                                            idEntradasSolicitacao);
                    if (rs.next()) {
                        try {
                            autorizacaoDadosQuimio.setNumeroGuiaPrestador(rs.getString("NUMERO_GUIA_PRESTADOR"));
                            autorizacaoDadosQuimio.setNumeroGuiaOperadora(rs.getString("ID_SOLICITACAO"));
                            quimio.setNumeroCiclos(BigInteger.valueOf(rs.getInt("NUMERO_CICLOS")));
                            quimio.setCicloAtual(BigInteger.valueOf(rs.getInt("CICLO_ATUAL")));
                            quimio.setIntervaloCiclos(BigInteger.valueOf(rs.getInt("INTERVALO_CICLOS")));

                            try {
                                ResultSet rsAutorizacaoDadosQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsAutorizacaoDadosQuimio.next()) {
                                    autorizacaoDadosQuimio.setDataAutorizacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsAutorizacaoDadosQuimio.getDate("DATA"))));
                                    autorizacaoDadosQuimio.setSenha(rsAutorizacaoDadosQuimio.getString("SENHA"));
                                    autorizacaoDadosQuimio.setDataValidadeSenha(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsAutorizacaoDadosQuimio.getDate("DATA_VALIDADE"))));
                                }
                            } catch (Exception e) {

                            }
                            quimio.setDadosAutorizacao(autorizacaoDadosQuimio);

                            try {
                                ResultSet rsBeneficiariosQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsBeneficiariosQuimio.next()) {
                                    quimio.setNumeroCarteira(rsBeneficiariosQuimio.getString("CODIGO"));
                                    if (resposta == "A") {
                                        quimio.setStatusSolicitacao("1");
                                    } else if (resposta == "N") {
                                        quimio.setStatusSolicitacao("3");
                                    } else if (resposta == "C") {
                                        quimio.setStatusSolicitacao("6");
                                    } else {
                                        quimio.setStatusSolicitacao("2");
                                    }
                                    quimio.setNomeBeneficiario(rsBeneficiariosQuimio.getString("NOME"));
                                    quimio.setNumeroCNS(rsBeneficiariosQuimio.getString("CNS"));
                                }
                            } catch (Exception e) {

                            }

                            try {
                                ResultSet rsBeneComplementoQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_BENEFICIARIO_DADOS_ADICIONAIS WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsBeneComplementoQuimio.next()) {
                                    beneComplementoQuimio.setPeso(BigDecimal.valueOf(rsBeneComplementoQuimio.getInt("PESO")));
                                    beneComplementoQuimio.setAltura(BigDecimal.valueOf(rsBeneComplementoQuimio.getInt("ALTURA")));
                                    beneComplementoQuimio.setSuperficieCorporal(BigDecimal.valueOf(rsBeneComplementoQuimio.getInt("SUPERFICIE_CORPORAL")));
                                    beneComplementoQuimio.setIdade(BigInteger.valueOf(rsBeneComplementoQuimio.getInt("IDADE")));
                                    beneComplementoQuimio.setSexo(rsBeneComplementoQuimio.getString("SEXO"));
                                }
                            } catch (Exception e) {

                            }
                            quimio.setDadosComplementaresBeneficiario(beneComplementoQuimio);

                            try {
                                ResultSet rsSolicitanteQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_SOLICITANTE WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsSolicitanteQuimio.next()) {
                                    solicitanteQuimio.setNomeProfissional(rsSolicitanteQuimio.getString("NOME_CONTRATADO"));
                                    solicitanteQuimio.setTelefoneProfissional(rsSolicitanteQuimio.getString("TELEFONE_CIRURGIAO"));
                                    solicitanteQuimio.setEmailProfissional(rsSolicitanteQuimio.getString("EMAIL_CIRURGIAO"));
                                }
                            } catch (Exception e) {

                            }
                            quimio.setMedicoSolicitante(solicitanteQuimio);

                            try {
                                ResultSet rsDiagnosticoOncologicoQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsDiagnosticoOncologicoQuimio.next()) {
                                    diagnosticoOncologicoQuimio.setDataDiagnostico(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsDiagnosticoOncologicoQuimio.getDate("DATA_DIAGNOSTICO"))));
                                    diagnosticoOncologicoQuimio.setEstadiamento(rsDiagnosticoOncologicoQuimio.getString("ESTADIAMENTO"));
                                    diagnosticoOncologicoQuimio.setFinalidade(rsDiagnosticoOncologicoQuimio.getString("FINALIDADE_TRATAMENTO"));
                                    diagnosticoOncologicoQuimio.setEcog(rsDiagnosticoOncologicoQuimio.getString("ECOG"));
                                    diagnosticoOncologicoQuimio.setDiagnosticoHispatologico(rsDiagnosticoOncologicoQuimio.getString("DIAGNOSTICO_HISPATOLOGICO"));
                                    diagnosticoOncologicoQuimio.setInfoRelevantes(rsDiagnosticoOncologicoQuimio.getString("INFO_RELEVANTES"));
                                }
                                ResultSet rsQuimioterapiaQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_QUIMIOTERAPIA WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsQuimioterapiaQuimio.next()) {
                                    diagnosticoQuimio.setTipoQuimioterapia(rsQuimioterapiaQuimio.getString("TIPO_QUIMIOTERAPIA"));
                                    diagnosticoQuimio.setPlanoTerapeutico(rsQuimioterapiaQuimio.getString("PLANO_TERAPEUTICO"));
                                }
                                ResultSet rsDiagnosticoCIDQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsDiagnosticoCIDQuimio.next()) {
                                    diagnosticoOncologicoQuimio.getDiagnosticoCID().add(rsDiagnosticoCIDQuimio.getString("CID"));
                                }
                            } catch (Exception e) {

                            }
                            diagnosticoQuimio.setDiagQuimio(diagnosticoOncologicoQuimio);

                            quimio.setDiagnosticoOncologicoQuimioterapia(diagnosticoQuimio);

                            try {
                                ResultSet rsTratamentosAnterioresQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_TRATAMENTOS_ANTERIORES WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsTratamentosAnterioresQuimio.next()) {
                                    tratamentosAnterioresQuimio.setCirurgia(rsTratamentosAnterioresQuimio.getString("CIRURGIA"));
                                    tratamentosAnterioresQuimio.setDatacirurgia(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsTratamentosAnterioresQuimio.getDate("DATA_CIRURGIA"))));
                                    tratamentosAnterioresQuimio.setAreaIrradiada(rsTratamentosAnterioresQuimio.getString("AREA_IRRADIADA"));
                                    tratamentosAnterioresQuimio.setDataIrradiacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsTratamentosAnterioresQuimio.getDate("DATA_IRRADIACAO"))));
                                }
                            } catch (Exception e) {

                            }

                            quimio.setTratamentosAnteriores(tratamentosAnterioresQuimio);

                        } catch (Exception e) {

                        }
                    }
                } catch (SQLException e) {

                }

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                    if (rs.next()) {
                        if (rs.getString("TIPO") == "Q") {
                            drogasSolicitadasQuimio.setDataProvavel(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA_PROVAVEL"))));
                            procedimentosDrogaQuimio.setCodigoTabela(rs.getString("TIPO_TABELA"));
                            procedimentosDrogaQuimio.setCodigoProcedimento(rs.getString("COD_PROCEDIMENTO"));
                            procedimentosDrogaQuimio.setDescricaoProcedimento(rs.getString("PROCEDIMENTO"));
                            drogasSolicitadasQuimio.setIdentificacao(procedimentosDrogaQuimio);
                            drogasSolicitadasQuimio.setQtDoses(BigDecimal.valueOf(rs.getDouble("QTDE_ANEXO_AUTORIZADA")));
                            drogasSolicitadasQuimio.setViaAdministracao(rs.getString("VIA_ADMINISTRACAO"));
                            drogasSolicitadasQuimio.setFrequencia(BigInteger.valueOf(rs.getInt("FREQUENCIA")));
                            drogas.getDrogaSolicitada().add(drogasSolicitadasQuimio);
                        }
                    }
                    quimio.setDrogasSolicitadas(drogas);
                } catch (Exception e) {

                }

                servico.setAutorizacaoQuimio(quimio);

                //RADIO
                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_ANEXO_RADIOTERAPIA WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);

                    if (rs.next()) {
                        try {
                            autorizacaoDadosRadio.setNumeroGuiaPrestador(rs.getString("NUMERO_GUIA_PRESTADOR"));
                            autorizacaoDadosRadio.setNumeroGuiaOperadora(rs.getString("ID_SOLICITACAO"));
                            radio.setNumeroCampos(BigInteger.valueOf(rs.getInt("NUMERO_CAMPOS")));
                            radio.setDoseCampo(BigInteger.valueOf(rs.getInt("DOSE_CAMPO")));
                            radio.setDoseTotal(BigInteger.valueOf(rs.getInt("DOSE_TOTAL")));
                            radio.setNrDias(BigInteger.valueOf(rs.getInt("NR_DIAS")));
                            radio.setDtPrevistaInicio(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DT_PREVISTA_INICIO"))));

                            try {
                                ResultSet rsAutorizacaoDadosRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsAutorizacaoDadosRadio.next()) {
                                    autorizacaoDadosRadio.setDataAutorizacao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsAutorizacaoDadosRadio.getDate("DATA"))));
                                    autorizacaoDadosRadio.setSenha(rsAutorizacaoDadosRadio.getString("SENHA"));
                                    autorizacaoDadosRadio.setDataValidadeSenha(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsAutorizacaoDadosRadio.getDate("DATA_VALIDADE"))));
                                }
                            } catch (Exception e) {

                            }
                            radio.setDadosAutorizacao(autorizacaoDadosRadio);

                            try {
                                ResultSet rsBeneficiariosRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsBeneficiariosRadio.next()) {
                                    radio.setNumeroCarteira(rsBeneficiariosRadio.getString("CODIGO"));
                                    if (resposta == "A") {
                                        radio.setStatusSolicitacao("1");
                                    } else if (resposta == "N") {
                                        radio.setStatusSolicitacao("3");
                                    } else if (resposta == "C") {
                                        radio.setStatusSolicitacao("6");
                                    } else {
                                        radio.setStatusSolicitacao("2");
                                    }
                                    radio.setNomeBeneficiario(rsBeneficiariosRadio.getString("NOME"));
                                    radio.setNumeroCNS(rsBeneficiariosRadio.getString("CNS"));
                                }
                            } catch (Exception e) {

                            }

                            try {
                                ResultSet rsBeneComplementoRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_BENEFICIARIO_DADOS_ADICIONAIS WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsBeneComplementoRadio.next()) {
                                    beneComplementoRadio.setIdade(BigInteger.valueOf(rsBeneComplementoRadio.getInt("IDADE")));
                                    beneComplementoRadio.setSexo(rsBeneComplementoRadio.getString("SEXO"));
                                }
                            } catch (Exception e) {

                            }
                            radio.setDadosComplementaresBeneficiario(beneComplementoRadio);

                            try {
                                ResultSet rsSolicitanteRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_SOLICITANTE WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsSolicitanteRadio.next()) {
                                    solicitanteRadio.setNomeProfissional(rsSolicitanteRadio.getString("NOME_CONTRATADO"));
                                    solicitanteRadio.setTelefoneProfissional(rsSolicitanteRadio.getString("TELEFONE_CIRURGIAO"));
                                    solicitanteRadio.setEmailProfissional(rsSolicitanteRadio.getString("EMAIL_CIRURGIAO"));
                                }
                            } catch (Exception e) {

                            }
                            radio.setMedicoSolicitante(solicitanteRadio);

                            try {
                                ResultSet rsDiagnosticoOncologicoRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsDiagnosticoOncologicoRadio.next()) {
                                    diagnosticoOncologicoRadio.setDataDiagnostico(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsDiagnosticoOncologicoRadio.getDate("DATA_DIAGNOSTICO"))));
                                    diagnosticoOncologicoRadio.setEstadiamento(rsDiagnosticoOncologicoRadio.getString("ESTADIAMENTO"));
                                    diagnosticoOncologicoRadio.setFinalidade(rsDiagnosticoOncologicoRadio.getString("FINALIDADE_TRATAMENTO"));
                                    diagnosticoOncologicoRadio.setEcog(rsDiagnosticoOncologicoRadio.getString("ECOG"));
                                    diagnosticoOncologicoRadio.setDiagnosticoHispatologico(rsDiagnosticoOncologicoRadio.getString("DIAGNOSTICO_HISPATOLOGICO"));
                                    diagnosticoOncologicoRadio.setInfoRelevantes(rsDiagnosticoOncologicoRadio.getString("INFO_RELEVANTES"));
                                }
                                ResultSet rsRadioterapiaRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_RADIOTERAPIA WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsRadioterapiaRadio.next()) {
                                    diagnosticoRadio.setDiagnosticoImagem(rsRadioterapiaRadio.getString("DIAGNOSTICO_IMAGEM"));
                                }
                                ResultSet rsDiagnosticoCIDRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsDiagnosticoCIDRadio.next()) {
                                    diagnosticoOncologicoRadio.getDiagnosticoCID().add(rsDiagnosticoCIDRadio.getString("CID"));
                                }
                            } catch (Exception e) {

                            }
                            diagnosticoRadio.setDiagRadio(diagnosticoOncologicoRadio);

                            radio.setDiagnosticoOncologicoRadio(diagnosticoRadio);

                            try {
                                ResultSet rsTratamentosAnterioresRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_TRATAMENTOS_ANTERIORES WHERE ID_SOLICITACAO = " +
                                                        idEntradasSolicitacao);
                                if (rsTratamentosAnterioresRadio.next()) {
                                    tratamentosAnterioresRadio.setCirurgia(rsTratamentosAnterioresRadio.getString("CIRURGIA"));
                                    tratamentosAnterioresRadio.setDatacirurgia(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsTratamentosAnterioresRadio.getDate("DATA_CIRURGIA"))));
                                    tratamentosAnterioresRadio.setQuimioterapia(rsTratamentosAnterioresRadio.getString("AREA_IRRADIADA"));
                                    tratamentosAnterioresRadio.setDataQuimioterapia(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rsTratamentosAnterioresRadio.getDate("DATA_IRRADIACAO"))));
                                }
                            } catch (Exception e) {

                            }

                            radio.setTratamentosAnteriores(tratamentosAnterioresRadio);
                        } catch (Exception e) {

                        }
                    }
                } catch (SQLException e) {

                }

                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradasSolicitacao);
                    if (rs.next()) {
                        if (rs.getString("TIPO") == "Q") {
                            drogasSolicitadasRadio.setDataProvavel(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA_PROVAVEL"))));
                            procedimentosDrogaRadio.setCodigoTabela(rs.getString("TIPO_TABELA"));
                            procedimentosDrogaRadio.setCodigoProcedimento(rs.getString("COD_PROCEDIMENTO"));
                            procedimentosDrogaRadio.setDescricaoProcedimento(rs.getString("PROCEDIMENTO"));
                            drogasSolicitadasRadio.setIdentificacao(procedimentosDrogaRadio);
                            drogasSolicitadasRadio.setQtDoses(BigDecimal.valueOf(rs.getDouble("QTDE_ANEXO_AUTORIZADA")));
                        }
                    }
                    procedComplementares.setIdentificacao(procedimentosDrogaRadio);
                    procedimentosComplementares.getProcedimentoComplementar().add(procedComplementares);
                    radio.setProcedimentosComplementares(procedimentosComplementares);
                } catch (Exception e) {

                }

                servico.setAutorizacaoRadio(radio);

            } catch (SQLException e) {

            }

        } catch (SQLException e) {

        }

        situacao.setAutorizacaoServico(servico);
        retorno.setAutorizacaoProcedimento(situacao);
        
        
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

    public void autEntradasSolicitacao(String id_solicitante, String respondido, String tipoguia,
                                       String solicitado_executante, String id_solicitacao_principal,
                                       String observacoes, String id_prestador_solicitador, String lido,
                                       String numero_guia_prestador, String numero_guia_prestador_referencia) {

        String idSolicitacao = null;
        try {
            int geraId = comSQL.executeUpdate("CALL AUT_GERA_ID_SOLICITACAO(@ID_SOLICITACAO)");
            ResultSet getId = comSQL.executeQuery("SELECT @ID_SOLICITACAO AS ID_SOLICITACAO");
            if (getId.next()) {
                idSolicitacao = getId.getString("ID_SOLICITACAO");
            }
        } catch (SQLException e) {

        }

        String registro =
            "INSERT INTO AUT_ENTRADAS_SOLICITACAO (ID_SOLICITACAO,ID_SOLICITANTE,RESPONDIDO,TIPOGUIA,SOLICITADO_EXECUTANTE," +
            "ID_SOLICITACAO_PRINCIPAL,OBSERVACOES,ID_PRESTADOR_SOLICITADOR,LIDO,NUMERO_GUIA_PRESTADOR,NUMERO_GUIA_PRESTADOR_REFERENCIA) " +
            "values (" + idSolicitacao + "," + id_solicitante + "," + '"' + respondido + '"' + "," + '"' + tipoguia +
            '"' + "," + '"' + solicitado_executante + '"' + "," + id_solicitacao_principal + "," + '"' + observacoes +
            '"' + "," + id_prestador_solicitador + "," + '"' + lido + '"' + "," + '"' + numero_guia_prestador + '"' +
            "," + '"' + numero_guia_prestador_referencia + '"' + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
            idEntradasSolicitacao = Integer.valueOf(idSolicitacao);
        } catch (SQLException e) {

        }
    }

    public void autBeneficiario(String codigo, String data_valid_carteira, String nome, String cns, String rede,
                                String via, String atendimento_rn, String rg) {

        String registro =
            "INSERT INTO AUT_BENEFICIARIO (ID_SOLICITACAO, CODIGO, DATA_VALID_CARTEIRA, NOME, CNS, REDE, VIA, ATENDIMENTO_RN, RG)" +
            "values (" + idEntradasSolicitacao + "," + '"' + codigo + '"' + "," + '"' + data_valid_carteira + '"' +
            "," + '"' + nome + '"' + "," + '"' + cns + '"' + "," + '"' + rede + '"' + "," + '"' + via + '"' + "," +
            '"' + atendimento_rn + '"' + "," + '"' + rg + '"' + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }
    }

    public void autSolicitante(String codigo, String nome, String nome_profissional, String conselho,
                               String num_conselho, String uf_conselho, String cbos, String codunimed) {

        String registro =
            "INSERT INTO AUT_SOLICITANTE (ID_SOLICITACAO, CODIGO, NOME, NOME_PROFISSIONAL, CONSELHO, NUM_CONSELHO, UF_CONSELHO, CBOS, CODUNIMED)" +
            "values (" + idEntradasSolicitacao + "," + '"' + codigo + '"' + "," + '"' + nome + '"' + "," + '"' +
            nome_profissional + '"' + "," + '"' + conselho + '"' + "," + '"' + num_conselho + '"' + "," + '"' +
            uf_conselho + '"' + "," + '"' + cbos + '"' + "," + '"' + codunimed + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autPrestador(String codigo, String codunimed, String nome, String cnes) {

        String registro =
            "INSERT INTO AUT_PRESTADOR (ID_SOLICITACAO, CODIGO, CODUNIMED, NOME, CNES) values (" + idEntradasSolicitacao +
            "," + '"' + codigo + '"' + "," + '"' + codunimed + '"' + "," + '"' + nome + '"' + "," + '"' + cnes + '"' +
            ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autSADT(String carater_solicitacao, String indicacao_clinica, String data_atendimento) {

        String registro =
            "INSERT INTO AUT_SADT (ID_SOLICITACAO, CARATER_SOLICITACAO, INDICACAO_CLINICA, DATA_ATENDIMENTO) values (" +
            idEntradasSolicitacao + "," + '"' + carater_solicitacao + '"' + "," + '"' + indicacao_clinica + '"' + "," +
            '"' + data_atendimento + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autProcedimentos(String tipo_tabela, String cod_procedimento, String procedimento, String qtde,
                                 String qtde_autorizada, String tipo, String dataProvavel, String via,
                                 String frequencia, String opcaoFabricante, String valor, String valorAutorizado,
                                 String registroAnvisa, String codFabricante, String autorizacaoFuncionamento) {

        String registro =
            "INSERT INTO AUT_PROCEDIMENTOS (ID_SOLICITACAO, TIPO_TABELA, COD_PROCEDIMENTO, PROCEDIMENTO, QTDE, QTDE_AUTORIZADA, TIPO, DATA_PROVAVEL, VIA_ADMINISTRACAO, FREQUENCIA, OPCAO_FABRICANTE, VALOR, VALOR_AUTORIZADO, REGISTRO_ANVISA, CODIGO_REF_FABRICANTE, AUTORIZACAO_FUNCIONAMENTO)" +
            "values (" + idEntradasSolicitacao + "," + '"' + tipo_tabela + '"' + "," + '"' + cod_procedimento + '"' +
            "," + '"' + procedimento + '"' + "," + qtde + "," + qtde_autorizada + "," + '"' + tipo + '"' + "," + '"' +
            dataProvavel + '"' + "," + via + "," + frequencia + "," + '"' + opcaoFabricante + '"' + "," + valor + "," +
            valorAutorizado + "," + '"' + registroAnvisa + '"' + "," + '"' + codFabricante + '"' + "," + '"' +
            autorizacaoFuncionamento + '"' + ")";

        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autInternacao(String codigoprestador, String nomeprestador, String carater_internacao,
                              String tipo_internacao, String regime_internacao, String qtde_diarias_solicitadas,
                              String qtde_diarias_autorizadas, String indicacao_clinica, String indicacao_acidente,
                              String data_provavel_admissao, String data_internacao_sugerida, String previsao_uso_opme,
                              String previsao_uso_quimioterapico, String tipo_acomodacao_autorizada, String cnes) {

        String registro =
            "INSERT INTO AUT_INTERNACAO (ID_SOLICITACAO, CODIGOPRESTADOR, NOMEPRESTADOR, CARATER_INTERNACAO, TIPO_INTERNACAO," +
            "REGIME_INTERNACAO, QTDE_DIARIAS_SOLICITADAS, QTDE_DIARIAS_AUTORIZADAS, INDICACAO_CLINICA, INDICACAO_ACIDENTE, DATA_PROVAVEL_ADMISSAO," +
            "DATA_INTERNACAO_SUGERIDA, COD_PRESTADOR_AUTORIZADO, NOME_PRESTADOR_AUTORIZADO, COD_CNES_PRESTADOR_AUTORIZADO) values (" +
            //PREVISAO_USO_OPME, PREVISAO_USO_QUIMIOTERAPICO, TIPO_ACOMODACAO_AUTORIZADA) values (" +
            idEntradasSolicitacao + "," + '"' + codigoprestador + '"' + "," + '"' + nomeprestador + '"' + "," + '"' +
            carater_internacao + '"' + "," + '"' + tipo_internacao + '"' + "," + '"' + regime_internacao + '"' + "," +
            qtde_diarias_solicitadas + "," + qtde_diarias_autorizadas + "," + '"' + indicacao_clinica + '"' + "," +
            '"' + indicacao_acidente + '"' + "," + '"' + data_provavel_admissao + '"' + "," + '"' +
            data_internacao_sugerida + '"' + "," + '"' + codigoprestador + '"' + "," + '"' + nomeprestador + '"' +
            "," + '"' + cnes + '"' + ")";
        /*," + '"' + previsao_uso_opme + '"' + "," + '"' +
            previsao_uso_quimioterapico + '"' + "," +'"' + tipo_acomodacao_autorizada + '"' + ")";*/
        gravaLog(registro);
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {
            gravaLog(e.getMessage() + "PAPAPAP");
        }
    }

    public void autInternacaoCid(String cid) {

        String registro =
            "INSERT INTO AUT_INTERNACAO_CID (ID_SOLICITACAO, CID) values (" + idEntradasSolicitacao + "," + '"' + cid +
            '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoOpme(String justificativa_tecnica, String especificacao_material, String numero_guia_prestador,
                             String observacoes) {

        String registro =
            "INSERT INTO AUT_ANEXO_OPME (ID_SOLICITACAO, JUSTIFICATIVA_TECNICA, ESPECIFICACAO_MATERIAL, NUMERO_GUIA_PRESTADOR, OBSERVACOES) values (" +
            idEntradasSolicitacao + "," + '"' + justificativa_tecnica + '"' + "," + '"' + especificacao_material +
            '"' + "," + '"' + numero_guia_prestador + '"' + "," + '"' + observacoes + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoQuimioterapia(String tipo_quimioterapia, String plano_terapeutico, String numeros_ciclos,
                                      String ciclo_atual, String intervalo_ciclos, String numero_guia_prestador,
                                      String observacao) {

        String registro =
            "INSERT INTO AUT_ANEXO_QUIMIOTERAPIA (ID_SOLICITACAO, TIPO_QUIMIOTERAPIA, PLANO_TERAPEUTICO, NUMERO_CICLOS, CICLO_ATUAL, INTERVALO_CICLOS, NUMERO_GUIA_PRESTADOR, OBSERVACAO) values (" +
            idEntradasSolicitacao + "," + '"' + tipo_quimioterapia + '"' + "," + '"' + plano_terapeutico + '"' + "," +
            numeros_ciclos + "," + ciclo_atual + "," + intervalo_ciclos + "," + '"' + numero_guia_prestador + '"' +
            "," + '"' + observacao + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoBeneficiarioDadosAdicionais(String peso, String altura, String superficie_corporal,
                                                    String idade, String sexo) {

        String registro =
            "INSERT INTO AUT_ANEXO_BENEFICIARIO_DADOS_ADICIONAIS (ID_SOLICITACAO, PESO, ALTURA, SUPERFICIE_CORPORAL, IDADE, SEXO) values (" +
            idEntradasSolicitacao + "," + peso + "," + altura + "," + superficie_corporal + "," + idade + "," + '"' +
            sexo + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoSolicitante(String nome_contratado, String telefone_cirurgiao, String email_cirurgiao) {

        String registro =
            "INSERT INTO AUT_ANEXO_SOLICITANTE (ID_SOLICITACAO, NOME_CONTRATADO, TELEFONE_CIRURGIAO, EMAIL_CIRURGIAO) values (" +
            idEntradasSolicitacao + "," + '"' + nome_contratado + '"' + "," + '"' + telefone_cirurgiao + '"' + "," +
            '"' + email_cirurgiao + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoDiagnosticoOncologico(String data_diagnostico, String estadiamento,
                                              String finalidade_tratamento, String ecog,
                                              String diagnostico_hispatologico, String info_relevantes) {

        String registro =
            "INSERT INTO AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO (ID_SOLICITACAO, DATA_DIAGNOSTICO, ESTADIAMENTO, FINALIDADE_TRATAMENTO, ECOG, DIAGNOSTICO_HISPATOLOGICO, INFO_RELEVANTES) values (" +
            idEntradasSolicitacao + "," + '"' + data_diagnostico + '"' + "," + '"' + estadiamento + '"' + "," + '"' +
            finalidade_tratamento + '"' + "," + '"' + ecog + '"' + "," + '"' + diagnostico_hispatologico + '"' + "," +
            '"' + info_relevantes + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoDiagnosticoOncologicoCID(String cid) {

        String registro =
            "INSERT INTO AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID (ID_SOLICITACAO, CID) values (" + idEntradasSolicitacao +
            "," + '"' + cid + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoTratamentosAnteriores(String cirurgia, String data_cirurgia, String area_irradiada,
                                              String data_irradiada) {

        String registro =
            "INSERT INTO AUT_ANEXO_TRATAMENTOS_ANTERIORES (ID_SOLICITACAO, CIRURGIA, DATA_CIRURGIA, AREA_IRRADIADA, DATA_IRRADIACAO) values (" +
            idEntradasSolicitacao + "," + '"' + cirurgia + '"' + "," + '"' + data_cirurgia + '"' + "," + '"' +
            area_irradiada + '"' + "," + '"' + data_irradiada + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }

    public void autAnexoRadioterapia(String diagnostico_imagem, String numero_campos, String dose_campo,
                                     String dose_total, String nr_dias, String dt_prevista_inicio,
                                     String numero_guia_prestador, String observacao) {

        String registro =
            "INSERT INTO AUT_ANEXO_RADIOTERAPIA (ID_SOLICITACAO, DIAGNOSTICO_IMAGEM, NUMERO_CAMPOS, DOSE_CAMPO, DOSE_TOTAL, NR_DIAS, DT_PREVISTA_INICIO, NUMERO_GUIA_PRESTADOR, OBSERVACAO) values (" +
            idEntradasSolicitacao + "," + '"' + diagnostico_imagem + '"' + "," + '"' + numero_campos + '"' + "," +
            '"' + dose_campo + '"' + "," + '"' + dose_total + '"' + "," + '"' + nr_dias + '"' + "," + '"' +
            dt_prevista_inicio + '"' + "," + '"' + numero_guia_prestador + '"' + "," + '"' + observacao + '"' + ")";
        try {
            int resultado = comSQL.executeUpdate(registro);
        } catch (SQLException e) {

        }

    }


}
