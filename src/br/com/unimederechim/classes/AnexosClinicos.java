package br.com.unimederechim.classes;

import br.com.unimederechim.util.conectorBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import javax.xml.soap.SOAPException;

public class AnexosClinicos {
    public AnexosClinicos() {
        super();
    }
    
    public void autAnexoOpme(String id_solicitacao, String justificativa_tecnica, String especificacao_material, String numero_guia_prestador, String observacoes) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_OPME (ID_SOLICITACAO, JUSTIFICATIVA_TECNICA, ESPECIFICACAO_MATERIAL, NUMERO_GUIA_PRESTADOR, OBSERVACOES) values" +
            "("+'"'+id_solicitacao+'"'+","+'"'+justificativa_tecnica+'"'+","+'"'+especificacao_material+'"'+","+'"'+numero_guia_prestador+'"'+","+'"'+observacoes+'"'+")";   
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autProcedimentos(String id_solicitacao, String tipo_tabela, String cod_procedimento, String procedimento, String qtde, String qtde_autorizada, String tipo) throws SOAPException {
        
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_PROCEDIMENTOS (ID_SOLICITACAO, TIPO_TABELA, COD_PROCEDIMENTO, PROCEDIMENTO, QTDE, QTDE_AUTORIZADA, TIPO)" +
            "values ("+'"'+id_solicitacao+'"'+","+'"'+tipo_tabela+'"'+","+'"'+cod_procedimento+'"'+","+'"'+procedimento+'"'+","+'"'+qtde+'"'+","+
            '"'+qtde_autorizada+'"'+","+'"'+tipo+'"'+")";
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
        
    } 
    
    public void autAnexoQuimioterapia(String id_solicitacao, String tipo_quimioterapia, String plano_terapeutico, String numero_ciclos, String ciclo_atual, String intervalo_ciclos, String numero_guia_prestador, String observacoes) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_QUIMIOTERAPIA (ID_SOLICITACAO, TIPO_QUIMIOTERAPIA, PLANO_TERAPEUTICO, NUMERO_CICLOS, CICLO_ATUAL, INTERVALO_CICLOS, NUMERO_GUIA_PRESTADOR, OBSERVACAO)" +
            "values ("+'"'+id_solicitacao+'"'+","+'"'+tipo_quimioterapia+'"'+","+'"'+plano_terapeutico+'"'+","+'"'+numero_ciclos+'"'+","+
            '"'+ciclo_atual+'"'+","+'"'+intervalo_ciclos+'"'+","+'"'+numero_guia_prestador+'"'+","+'"'+observacoes+'"'+")";   
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoBeneficiarioDadosAdicionais(String id_solicitacao, String peso, String altura, String superficie_corporal, String idade, String sexo) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_BENEFICIARIO_DADOS_ADICIONAIS (ID_SOLICITACAO, PESO, ALTURA, SUPERFICIE_CORPORAL, IDADE, SEXO) values" +
            "("+'"'+id_solicitacao+'"'+","+'"'+peso+'"'+","+'"'+altura+'"'+","+'"'+superficie_corporal+'"'+","+'"'+idade+'"'+","+'"'+sexo+'"'+")";   
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoSolicitante(String id_solicitacao, String nome_contratado, String telefone_cirurgiao, String email_cirurgiao) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_SOLICITANTE (ID_SOLICITACAO, JUSTIFICATIVA_TECNICA, ESPECIFICACAO_MATERIAL, NUMERO_GUIA_PRESTADOR, OBSERVACOES) values" +
            "("+'"'+id_solicitacao+'"'+","+'"'+nome_contratado+'"'+","+'"'+telefone_cirurgiao+'"'+","+'"'+email_cirurgiao+'"'+")";   
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoDiagnosticoOncologico(String id_solicitacao, String data_diagnostico, String estadiamento, String finalidade_tratamento, String ecog, String diagnostico_hispatologico, String info_relevantes) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO (ID_SOLICITACAO, DATA_DIAGNOSTICO, ESTADIAMENTO, FINALIDADE_TRATAMENTO, ECOG, DIAGNOSTICO_HISPATOLOGICO, INFO_RELEVANTES) values" +
            "("+'"'+id_solicitacao+'"'+","+'"'+data_diagnostico+'"'+","+'"'+estadiamento+'"'+","+'"'+finalidade_tratamento+'"'+","+
            '"'+ecog+'"'+","+'"'+diagnostico_hispatologico+'"'+","+'"'+info_relevantes+'"'+")";
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoDiagnosticoOncologicoCid(String id_solicitacao, String cid) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_DIAGNOSTICO_ONCOLOGICO_CID (ID_SOLICITACAO,CID) values ("+'"'+id_solicitacao+'"'+","+'"'+cid+'"'+")";
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoTratamentosAnteriores(String id_solicitacao, String cirurgia, String data_cirurgia, String area_irradiada, String data_irradiacao) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_TRATAMENTOS_ANTERIORES (ID_SOLICITACAO, CIRURGIA, DATA_CIRURGIA, AREA_IRRADIADA, DATA_IRRADIACAO) values ("+'"'+id_solicitacao+'"'+","+'"'+cirurgia+'"'+","+'"'+data_cirurgia+'"'+","+'"'+area_irradiada+'"'+","+'"'+data_irradiacao+'"'+")";
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
    public void autAnexoRadioterapia(String id_solicitacao, String diagnostico_imagem, String numero_campos, String dose_campo, String dose_total, String nr_dias, String dt_prevista_inicio, String numero_guia_prestador, String observacao) throws SOAPException {
        conectorBD conexao = new conectorBD();
        Statement comSQL = conexao.getComandoBD();
        String registro = "INSERT INTO AUT_ANEXO_RADIOTERAPIA (ID_SOLICITACAO, DIAGNOSTICO_IMAGEM, NUMERO_CAMPOS, DOSE_CAMPO, DOSE_TOTAL, NR_DIAS, DT_PREVISTA_INICIO, NUMERO_GUIA_PRESTADOR, OBSERVACAO) " +
            "values ("+'"'+id_solicitacao+'"'+","+'"'+diagnostico_imagem+'"'+","+'"'+numero_campos+'"'+","+'"'+dose_campo+'"'+","+'"'+dose_total+'"'+","+

            '"'+nr_dias+'"'+","+'"'+dt_prevista_inicio+'"'+","+'"'+numero_guia_prestador+'"'+","+'"'+observacao+'"'+")";
        ResultSet resultado = null;
        try{
            resultado = comSQL.executeQuery(registro);
            conexao.encerraConexao();
        }catch(SQLException e){
            throw new SOAPException(e.getMessage());
        }
    }
    
}
