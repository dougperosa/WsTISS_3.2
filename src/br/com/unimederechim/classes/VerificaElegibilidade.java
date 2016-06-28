package br.com.unimederechim.classes;


import javax.swing.JOptionPane;

import java.sql.*;

import br.com.unimederechim.util.*;

import java.text.SimpleDateFormat;

import javax.xml.soap.SOAPException;


public class VerificaElegibilidade {

    public VerificaElegibilidade() {
        super();
    }

    public int idPrestador(String cpf, String cnpj, String codPrestador) {

        int id = 0;
        String consulta = null;

        try {
            conectorBD conexao = new conectorBD();
            Statement comSQL = conexao.getComandoBD();
            ResultSet resultado = null;

            if (codPrestador != null) {
                consulta = "SELECT IDPRESTADOR FROM UNI_PRESTADORES WHERE CODPRESTADOR = '" + codPrestador + "'";
            } else if (cpf != null) {
                consulta =
                        "SELECT UNI_PRESTADORES.IDPRESTADOR FROM UNI_PRESTADORES " + "INNER JOIN UNI_PESSOAS ON UNI_PRESTADORES.IDPESSOA = UNI_PESSOAS.IDPESSOA " +
                        "WHERE UNI_PESSOAS.CPF = '" + cpf + "'";
            } else if (cnpj != null) {
                consulta =
                        "SELECT UNI_PRESTADORES.IDPRESTADOR FROM UNI_PRESTADORES " + "INNER JOIN UNI_EMPRESAS ON UNI_PRESTADORES.IDEMPRESA = UNI_EMPRESAS.IDEMPRESA " +
                        "WHERE UNI_EMPRESAS.CNPJ = '" + cnpj + "'";
            }

            try {
                resultado = comSQL.executeQuery(consulta);
                if (resultado.next()) {
                    id = resultado.getInt("IDPRESTADOR");
                }
                conexao.encerraConexao();
            } catch (SQLException e) {

            }
        } catch (Exception e) {
        }

        return id;
    }


    public String verificaPrestador(String cpf, String cnpj, String codPrestador) {

        String retorno = null, codMensagem = null;

        conectorBD conexao = null;
        Statement comSQL = null;

        try {
            conexao = new conectorBD();
            comSQL = conexao.getComandoBD();
        } catch (SOAPException e) {
        }
        String consulta = null;

        if (codPrestador != null) {
            consulta = "SELECT IDPRESTADOR FROM UNI_PRESTADORES WHERE CODPRESTADOR = '" + codPrestador + "'";
            codMensagem = "1203";
        } else if (cpf != null) {
            consulta =
                    "SELECT UNI_PRESTADORES.IDPRESTADOR FROM UNI_PRESTADORES " + "INNER JOIN UNI_PESSOAS ON UNI_PRESTADORES.IDPESSOA = UNI_PESSOAS.IDPESSOA " +
                    "WHERE UNI_PESSOAS.CPF = '" + cpf + "'";
            codMensagem = "1206";
        } else if (cnpj != null) {
            consulta =
                    "SELECT UNI_PRESTADORES.IDPRESTADOR FROM UNI_PRESTADORES " + "INNER JOIN UNI_EMPRESAS ON UNI_PRESTADORES.IDEMPRESA = UNI_EMPRESAS.IDEMPRESA " +
                    "WHERE UNI_EMPRESAS.CNPJ = '" + cnpj + "'";
            codMensagem = "1206";
        }

        ResultSet resultado = null;

        try {
            resultado = comSQL.executeQuery(consulta);
            if (resultado.next()) {
            } else {
                retorno = codMensagem;
            }
            conexao.encerraConexao();
        } catch (SQLException e) {
        } catch (SOAPException e) {
        }

        return retorno;
    }


    public String verificaBeneficiario(String beneficiario) {

        String retorno = null;

        conectorBD conexao = null;
        Statement comSQL = null;
        try {
            conexao = new conectorBD();
            comSQL = conexao.getComandoBD();
        } catch (SOAPException e) {
        }
        String consulta = "SELECT * FROM UNI_BENEFICIARIOS WHERE CODUSUARIO = " + beneficiario;
        ResultSet resultado = null;

        try {
            resultado = comSQL.executeQuery(consulta);

            if (resultado.next()) {
                if (resultado.getString("DATACANCELAMENTO") != null) {
                    retorno = "1006";
                }
            } else {
                retorno = "1001";
            }
            conexao.encerraConexao();
        } catch (SQLException e) {
        } catch (SOAPException e) {
        }

        return retorno;
    }

    public void registraElegibilidade(String numero_carteira, String codigo_prestador, String ip, String resposta) {

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date data = new java.util.Date();

        conectorBD conexao = null;
        Statement comSQL = null;
        try {
            conexao = new conectorBD();
            comSQL = conexao.getComandoBD();
        } catch (SOAPException e) {
        }

        String inserirElegibilidade =
            "INSERT INTO AUT_ELEGIBILIDADE (DATA, CODIGO_BENEFICIARIO, ID_PRESTADOR, IP, RESPOSTA) VALUES (" + '"' +
            sd.format(data) + '"' + "," + '"' + numero_carteira + '"' + "," + codigo_prestador + "," + '"' + ip + '"' +
            "," + '"' + resposta + '"' + ')';
        try {
            int resultado = comSQL.executeUpdate(inserirElegibilidade);
            conexao.encerraConexao();
        } catch (SQLException e) {
        } catch (SOAPException e) {
        }
    }
}
