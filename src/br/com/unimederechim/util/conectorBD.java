package br.com.unimederechim.util;

import java.sql.*;

import javax.swing.*;

import javax.xml.soap.SOAPException;

public class conectorBD {

    static final String BDDriver = "com.mysql.jdbc.Driver";
    static final String DEFAULT_BDNAME = "jdbc:mysql://192.168.1.8:3306/unimed";
    static final String DEFAULT_BDUSER = "new";
    static final String DEFAULT_BDPASS = "3ds#5fvg";

    private Connection conexao = null;
    private Statement comando = null;

    {
        try {
            Class.forName(BDDriver);
        } catch (ClassNotFoundException e) {
            
        }
    }

    @SuppressWarnings("static-access")
    public conectorBD() throws SOAPException {
        try {
            conexao = DriverManager.getConnection(this.DEFAULT_BDNAME, this.DEFAULT_BDUSER, this.DEFAULT_BDPASS);
        } catch (SQLException e) {
            throw new SOAPException(e.getMessage());
        }
    }

    public Statement getComandoBD() throws SOAPException {
        try {
            comando = conexao.createStatement();
        } catch (SQLException e) {
            throw new SOAPException(e.getMessage());
        } finally {
            if (comando == null) {
                conexao = null;
            }
            return comando;
        }
    }

    public void encerraConexao() throws SOAPException {
        if (comando != null) {
            try {
                comando.close();
                conexao.close();
            } catch (SQLException e) {
                throw new SOAPException(e.getMessage());
            }
        }
    }

    public Connection getConexao() {
        return this.conexao;
    }

}
