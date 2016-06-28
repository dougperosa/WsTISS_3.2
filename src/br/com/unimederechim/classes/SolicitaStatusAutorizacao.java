package br.com.unimederechim.classes;

import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CtAutorizacaoDados;
import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtContratadoDados;
import br.gov.ans.padroes.tiss.schemas.CtDadosComplementaresBeneficiario;
import br.gov.ans.padroes.tiss.schemas.CtDadosComplementaresBeneficiarioRadio;
import br.gov.ans.padroes.tiss.schemas.CtDiagnosticoOncologico;
import br.gov.ans.padroes.tiss.schemas.CtDrogasSolicitadas;
import br.gov.ans.padroes.tiss.schemas.CtMotivoGlosa;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoAutorizado;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentoDados;
import br.gov.ans.padroes.tiss.schemas.CtProcedimentosComplementares;
import br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao;
import br.gov.ans.padroes.tiss.schemas.CtmAnexoSolicitante;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoInternacao;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoProrrogacao;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoQuimio;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoRadio;
import br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoServico;
import br.gov.ans.padroes.tiss.schemas.DmSimNao;
import br.gov.ans.padroes.tiss.schemas.SituacaoAutorizacaoWS;

import java.io.FileWriter;
import java.io.IOException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.soap.SOAPException;

public class SolicitaStatusAutorizacao {

    private conectorBD sql;
    private Statement comSQL;

    public SolicitaStatusAutorizacao() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }

    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/log.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public SituacaoAutorizacaoWS retorno(String codPrestador, String numeroGuiaPrestador, String numBeneficiario) {

        SituacaoAutorizacaoWS retorno = new SituacaoAutorizacaoWS();
        CtSituacaoAutorizacao situacao = new CtSituacaoAutorizacao();
        CtMotivoGlosa glosaRetorno = new CtMotivoGlosa();

        String idEntradaSolicitacao = null;

        try {
            ResultSet rsEntradasSolicitacao =
                comSQL.executeQuery("SELECT * FROM AUT_ENTRADAS_SOLICITACAO WHERE NUMERO_GUIA_PRESTADOR = " +
                                    numeroGuiaPrestador + " AND ID_PRESTADOR_SOLICITADOR = " + codPrestador);
            if (rsEntradasSolicitacao.next()) {
                try {                    
                    idEntradaSolicitacao = rsEntradasSolicitacao.getString("ID_SOLICITACAO");

                    ResultSet rsBeneficiario =
                        comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE CODIGO = '" + numBeneficiario +
                                            "' AND ID_SOLICITACAO = " + rsEntradasSolicitacao.getString("ID_SOLICITACAO"));

                    if (rsBeneficiario.next()) {
                        retorno = processaRetorno(idEntradaSolicitacao);
                    } else {
                        glosaRetorno.setCodigoGlosa("1307");
                        glosaRetorno.setDescricaoGlosa("NÚMERO DA GUIA INVÁLIDO");
                        situacao.setMensagemErro(glosaRetorno);
                        retorno.setSituacaoAutorizacao(situacao);
                    }

                } catch (SQLException e) {

                }
            } else {
                glosaRetorno.setCodigoGlosa("1307");
                glosaRetorno.setDescricaoGlosa("NÚMERO DA GUIA INVÁLIDO");
                situacao.setMensagemErro(glosaRetorno);
                retorno.setSituacaoAutorizacao(situacao);
            }

        } catch (SQLException e) {

        }

        return retorno;
    }

    public SituacaoAutorizacaoWS processaRetorno(String idEntradaSolicitacao) {

        SituacaoAutorizacaoWS retorno = new SituacaoAutorizacaoWS();
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

        try {

            String resposta = null, observacoes = null, solicitante = null, observacao = null, solicitacaoPrincial =
                null, tipoGuia = null;

            ResultSet rsEntradaSolicitacao =
                comSQL.executeQuery("SELECT * FROM AUT_ENTRADAS_SOLICITACAO WHERE ID_SOLICITACAO = " +
                                    idEntradaSolicitacao);
            try {
                if (rsEntradaSolicitacao.next()) {
                    resposta = rsEntradaSolicitacao.getString("RESPOSTA");
                    observacoes = rsEntradaSolicitacao.getString("OBSERVACOES");
                    solicitante = rsEntradaSolicitacao.getString("ID_SOLICITANTE");
                    observacao = rsEntradaSolicitacao.getString("OBSERVACOES");
                    solicitacaoPrincial = rsEntradaSolicitacao.getString("ID_SOLICITACAO_PRINCIPAL");
                    tipoGuia = rsEntradaSolicitacao.getString("TIPOGUIA");
                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT * FROM AUT_INTERNACAO WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
                        if (rs.next()) {

                            if (solicitacaoPrincial == null && tipoGuia.equals("3")) { // INTERNAÇAO
                                try {
                                    autInternacao.setDataProvavelAdmissao(DatatypeFactory.newInstance().newXMLGregorianCalendar(sd.format(rs.getDate("DATA_PROVAVEL_ADMISSAO"))));
                                    autInternacao.setQtdDiariasAutorizadas(BigInteger.valueOf(rs.getInt("QTDE_DIARIAS_AUTORIZADAS")));
                                    autInternacao.setTipoAcomodacaoAutorizada(rs.getString("TIPO_ACOMODACAO_AUTORIZADA"));
                                } catch (Exception e) {
                                    
                                }
                            }
                            
                            if (solicitacaoPrincial != null && tipoGuia.equals("3")) { // PRORROGAÇAO
                                try {
                                    autProrrogacao.setJustificativaOperadora(observacoes);
                                    autProrrogacao.setDiariasAutorizadas(BigInteger.valueOf(rs.getInt("QTDE_DIARIAS_AUTORIZADAS")));
                                    autProrrogacao.setAcomodacaoAutorizada(rs.getString("TIPO_ACOMODACAO_AUTORIZADA"));
                                } catch (Exception e) {
                                    
                                }
                            }

                            situacao.setAutorizacaoInternacao(autInternacao);
                            situacao.setAutorizacaoProrrogacao(autProrrogacao);

                        }

                    } catch (SQLException e) {
                        
                    }
                }
                
                try {
                    ResultSet rs =
                        comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " + idEntradaSolicitacao +
                                            " ORDER BY ID_ORDEM DESC LIMIT 1 ");
                    if (rs.next()) {
                        try {
                            //autorizacao.setNumeroGuiaPrestador(rs.getString("NUMERO_GUIA_PRESTADOR"));
                            autorizacao.setNumeroGuiaOperadora(rs.getString("ID_SOLICITACAO"));
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
                        comSQL.executeQuery("SELECT * FROM AUT_BENEFICIARIO WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
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

                if (tipoGuia.equals("3")) { // INTERNACAO OU PRORROGAÇAO
                    try {
                        ResultSet rs =
                            comSQL.executeQuery("SELECT * FROM AUT_INTERNACAO WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
                        if (rs.next()) {
                            try {
                                contratado.setCodigoPrestadorNaOperadora(rs.getString("COD_PRESTADOR_AUTORIZADO"));
                                contratado.setNomeContratado(rs.getString("NOME_PRESTADOR_AUTORIZADO"));
                                prestador.setDadosContratado(contratado);
                                prestador.setCnesContratado(rs.getString("COD_CNES_PRESTADOR_AUTORIZADO"));
                            } catch (Exception e) {
                                
                            }
                        }
                    } catch (SQLException e) {
                        
                    }
                    servico.setPrestadorAutorizado(prestador);

                } else { // SP/SADT
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
                        comSQL.executeQuery("SELECT * FROM AUT_AUTORIZACAO WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
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
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
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
                                            idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
                                if (rsQuimioterapiaQuimio.next()) {
                                    diagnosticoQuimio.setTipoQuimioterapia(rsQuimioterapiaQuimio.getString("TIPO_QUIMIOTERAPIA"));
                                    diagnosticoQuimio.setPlanoTerapeutico(rsQuimioterapiaQuimio.getString("PLANO_TERAPEUTICO"));
                                }
                                ResultSet rsDiagnosticoCIDQuimio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID WHERE ID_SOLICITACAO = " +
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
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
                        comSQL.executeQuery("SELECT * FROM AUT_ANEXO_RADIOTERAPIA WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);

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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
                                if (rsRadioterapiaRadio.next()) {
                                    diagnosticoRadio.setDiagnosticoImagem(rsRadioterapiaRadio.getString("DIAGNOSTICO_IMAGEM"));
                                }
                                ResultSet rsDiagnosticoCIDRadio =
                                    comSQL.executeQuery("SELECT * FROM AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID WHERE ID_SOLICITACAO = " +
                                                        idEntradaSolicitacao);
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
                                                        idEntradaSolicitacao);
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
                        comSQL.executeQuery("SELECT * FROM AUT_PROCEDIMENTOS WHERE ID_SOLICITACAO = " + idEntradaSolicitacao);
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
        retorno.setSituacaoAutorizacao(situacao);

        return retorno;
    }

}

