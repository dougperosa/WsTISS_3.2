package br.com.unimederechim.classes;

import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.CtLoginSenha;

import java.io.FileWriter;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.soap.SOAPException;

public class VerificaUsuario {

    private conectorBD sql;
    private Statement comSQL;
    private ResultSet resultado = null;

    public VerificaUsuario() {
        try {
            this.sql = new conectorBD();
            this.comSQL = this.sql.getComandoBD();
        } catch (SOAPException e) {
        }
    }
    
    public static final void gravaLog(String s) {
        try {
            String filename = "/tmp/log_terca.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        } catch (IOException ioe) {
        }
    }

    public boolean verificaUsuario(CtLoginSenha loginSenha, String codPrestador) {

        boolean retorno = false;
                
        try {  
            
            resultado =
                    comSQL.executeQuery("SELECT * FROM siteunimed.sprest WHERE crm = '" + String.valueOf(loginSenha.getLoginPrestador()) +
                                        "' AND senha = MD5('" + String.valueOf(loginSenha.getSenhaPrestador()) + "')" +
                                        " AND codmedico = '" + codPrestador + "'");
            if (resultado.next()) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException e) {

        }

        return retorno;
    }

}
