package br.com.unimederechim.ws;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.Resource;

import javax.security.cert.X509Certificate;

import javax.servlet.http.HttpServletRequest;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

public class Constantes {
    public static final String CODIGO_UNIMED = "0028";
    public static final String CODIGO_ANS_UNIMED = "357022";
    public static final String CNPJ_UNIMED = "87638334000173";
    public static final String RAZAO_SOCIAL = "Unimed Erechim Cooperativa de Servicos de Saude Ltda";
    public static final String DIR_MAP_ARQUIVOS = "/mnt/arquivos";
    public static final String DIR_SERV_ARQUIVOS = "Temp";
    //public static final String DIR_SERV_ARQUIVOS = "C:\\Temp\\XML";
    //public static final String DIR_SEPARADOR = "\\";
    public static final String DIR_SEPARADOR = "/";
    public static final String DIR_SEPARADOR_WINDOWS = "\\";
    public static final String UNIDADE_WINDOWS = "F:";
    
    public static final int ID_USUARIO_BITMED = 1482;
    public static final int ID_USUARIO_AUTORIZADOR = 6202;
    public static final int ID_STATUS_INICIAL_LOTE = 5;
    public static final int ID_UNIMED = 27;
    public static final int ID_SERVIDOR_SEDE = 2;
    public static final String NOME_RESPONSAVEL = "WebService";
    public static final String VERSAO_TISS = "2.02.02";
    
    public static final String EMAIL_SERVIDOR = "mail.unimed-erechim.com.br";
    public static final String EMAIL_DEST_ERRO = "marlos@unimed-erechim.com.br";
    public static final String EMAIL_DEST_FATURAMENTO = "marlos@unimed-erechim.com.br";
    public static final String EMAIL_REMETENTE = "webmaster@unimed-erechim.com.br";
    public static final String EMAIL_USUARIO = "webmaster@unimed-erechim.com.br";
    public static final String EMAIL_SENHA = "uni0028";
    
    public static final int OK = 0;
    public static final int REMETENTE_INVALIDO = 1;
    public static final int DESTINATARIO_INVALIDO = 2;
    
    public static final String TIPO_GUIA_ELEGIBILIDADE = "0";
    public static final String TIPO_GUIA_SADT = "2";
    public static final String AUTORIZADOR_NAO_AVALIADO = "A";
    public static final String AUTORIZADOR_NAO_RESPONDIDO = "N";
    
    public static final int TIMEOUT_AUTORIZADOR = 30;
    public static final String RESPOSTA_AUTORIZADOR_AUTORIZADO = "S";
    public static final String RESPOSTA_AUTORIZADOR_EM_ESTUDO = "E";
    public static final String RESPOSTA_AUTORIZADOR_NEGADO = "N";
    
    public static final String TIPO_ATENDIMENTO_SADT_AUT = "05";
    
    public static enum TipoMensagem {
        LOTE_GUIAS(1), 
        LOTE_ANEXO(2), 
        SOLICITACAO_DEMONSTRATIVO_RETORNO(3), 
        SOLICITACAO_STATUS_PROTOCOLO(4),
        SOLICITACAO_PROCEDIMENTO(5), 
        SOLICITA_STATUS_AUTORIZACAO(6), 
        VERIFICA_ELEGIBILIDADE(7), 
        CANCELA_GUIA(8),
        COMUNICACAO_BENEFICIARIO(9), 
        ROTOCOLO_RECEBIMENTO(10); 
        
        private int tipo;
        
        public int getTipo() {
            return this.tipo;
        }
        
        private TipoMensagem(int tipo) {
            this.tipo = tipo;
        }
    }


    public static enum StatusProtocolo {
        EM_BRANCO(""),
        RECEBIDO("1"),
        EM_ANALISE("2"),
        LIBERADO_PARA_PAGAMENTO("3"),
        ENCERRADO_SEM_PAGAMENTO("4"),
        ANALISADO_E_AGUARDANDO_LIBERACAO_PARA_PAGAMENTO("5"),
        PAGAMENTO_EFETUADO("6"),
        PROTOCOLO_NAO_LOCALIZADO("7");
        
        private final String status;       

        private StatusProtocolo(String s) {
            status = s;
        }

        public boolean equals(String otherStatus){
            return (otherStatus == null)? false:status.equals(otherStatus);
        }

        public String toString(){
           return status;
        }        
    }

    public static enum TipoDemonstrativo {
        EM_BRANCO(""),
        DEMONSTRATIVO_DE_PAGAMENTO("1"),
        DEMONSTRATIVO_DE_ANALISE_DA_CONTA_MEDICA("2"),
        DEMONSTRATIVO_DE_PAGAMENTO_ODONTOLOGIA("3");
        
        private final String tipo;

        private TipoDemonstrativo(String s) {
            tipo = s;
        }

        public boolean equals(String otherTipo){
            return (otherTipo == null)? false:tipo.equals(otherTipo);
        }

        public String toString(){
           return tipo;
        }        
    }

    public static enum TipoGuia {
        ELEGIBILIDADE("0"),
        CONSULTA("1"),
        SP_SADT("2"),
        INTERNACAO("3"),
        RESUMO_INTERNACAO("4"),
        HONORARIO_INDIVIDUAL("5"),
        OUTRAS_DESPESAS("6"),
        PRORROGACAO_INTERNACAO("7");
        
        private final String tipo;

        private TipoGuia(String s) {
            tipo = s;
        }

        public boolean equals(String otherTipo){
            return (otherTipo == null)? false:tipo.equals(otherTipo);
        }
        
        public static TipoGuia getValue(String s) {
            if (s == "0") {
                return ELEGIBILIDADE;
            }
            else if (s == "1") {
                return CONSULTA;
            }
            else if (s == "2") {
                return SP_SADT;
            }
            else if (s == "3") {
                return INTERNACAO;
            }
            else if (s == "4") {
                return RESUMO_INTERNACAO;
            }
            else if (s == "5") {
                return HONORARIO_INDIVIDUAL;
            }
            else if (s == "6") {
                return OUTRAS_DESPESAS;
            }
            else if (s == "7") {
                return PRORROGACAO_INTERNACAO;
            }
            else {
                return ELEGIBILIDADE;
            }
        }
        
        public String toString(){
           return tipo;
        }        
    }
    
    public static enum StatusSolicitacao {
        AUTORIZADO("1"),
        EM_ANALISE("2"),
        NEGADO("3");
        
        private final String status;

        private StatusSolicitacao(String s) {
            status = s;
        }

        public boolean equals(String otherStatus){
            return (otherStatus == null)? false:status.equals(otherStatus);
        }

        public String toString(){
           return status;
        }        
    }    
    
    public static final void gravaLog(String s) {
        try {
            String filename= "/tmp/log_wstiss.txt";
            FileWriter fw = new FileWriter(filename,true);
            fw.write(s);
            fw.write("\n");
            fw.close();
        }
        catch(IOException ioe){}        
    }
    
    public static final String getIP(WebServiceContext wsContext) { 
      MessageContext mc = wsContext.getMessageContext();
      HttpServletRequest req = (HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST);
      return req.getRemoteAddr(); 
    }     
    
    public static final boolean getCert(WebServiceContext wsContext) {
        MessageContext mc = wsContext.getMessageContext();
        HttpServletRequest req = (HttpServletRequest)mc.get(MessageContext.SERVLET_REQUEST);        
        String x500Prin = "";
        String Serial = "";
        try { 
            X509Certificate[] x509Cert = (X509Certificate[])req.getAttribute("javax.servlet.request.X509Certificate"); 
            x500Prin = x509Cert[0].getIssuerDN().getName();
            Serial = x509Cert[0].getSerialNumber().toString();
        } catch (Exception e) { 
            gravaLog("Erro ao instanciar certificado =======> " + e.getMessage()); 
        } 
        gravaLog("x500Prin: " + x500Prin);
        gravaLog("Serial: " + Serial);
        
        return false;
    }
    
    //public static final String getEnumString()
}