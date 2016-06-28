package br.com.unimederechim.classes;

import br.com.unimederechim.util.conectorBD;

import br.gov.ans.padroes.tiss.schemas.LoteAnexoWS;
import br.gov.ans.padroes.tiss.schemas.LoteGuiasWS;

import br.gov.ans.padroes.tiss.schemas.ProtocoloRecebimentoWS;

import java.io.FileNotFoundException;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Time;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import javax.swing.*;

import java.util.Formatter;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.xml.soap.SOAPException;
import org.apache.commons.lang.StringUtils;

public class Principal {


    public Principal() {
        super();
    }

    public static void main(String[] args) {
        
        Time horaNoBanco01 = Time.valueOf("02:40:21");  
        Time horaNoBanco02 = Time.valueOf("02:40:31");
        
        Time zeroHora = Time.valueOf("00:00:00");
        
        Calendar c1 = Calendar.getInstance();
        c1.setTime(horaNoBanco01);
        long mili1 = c1.getTimeInMillis();
        
        Calendar c2 = Calendar.getInstance();
        c2.setTime(horaNoBanco02);
        long mili2 = c2.getTimeInMillis();
        
        long diferenca = mili2 - mili1;
        System.out.print("em mili " + diferenca);
        
        Calendar zeroHoraCal = Calendar.getInstance();
        zeroHoraCal.setTime(zeroHora);
        
        Calendar difCal = Calendar.getInstance();
        difCal.setTimeInMillis(diferenca + zeroHoraCal.getTimeInMillis());
        String diferencaFormatada = new SimpleDateFormat("HH:mm:ss").format(difCal.getTime());
        
        System.out.print("<br> formatada: " + diferencaFormatada);
        
        /*try{
            
          
        LoteGuiasWS ws = new LoteGuiasWS();
            ProtocoloRecebimentoWS retorno = new ProtocoloRecebimentoWS();
        LoteGuias lote = new LoteGuias(ws);
            
            Date data = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        
        ProtocoloRecebimentoWS prot = new ProtocoloRecebimentoWS();
        
        int teste = 0;
        teste = lote.fauLotes(12, "n", "S", "2014-10-10", 6202);
        System.out.print(teste);
        lote.fauEnvArq(teste, "fsdh", "fsdh", sd.format(data), 12, "S", 152);
                
        prot = lote.retorno(String.valueOf(teste)); 
            retorno = lote.retorno(String.valueOf(teste));
            
        }catch(Exception e){
            
        }*/
        
    }
}

